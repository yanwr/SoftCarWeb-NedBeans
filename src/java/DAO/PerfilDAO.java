/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DB.connectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Usuario;

/**
 *
 * @author Aluno
 */
public class PerfilDAO {

    Connection con;
    Usuario usuario = new Usuario();
    Usuario usuario1;

    public PerfilDAO() {
        con = connectionDB.getConnection();

    }

    //Atualizar os dados da session
    public Usuario getDados(Usuario user) throws SQLException {

        String sql = "select*from usuario where cod_user='" + user.getId() + "'";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery(sql);
        //

        // variaveis para pegar os dados do banco
        String s = null;
        int id = 0;
        String nomeUser = null;
        String profissao = null;
        String tempoTrampo = null;
        String tel = null;
        String fotoPerfil = null;
        //

        while (rs.next()) {

            id = rs.getInt("cod_user");
            s = rs.getString("senha");
            nomeUser = rs.getString("nome");
            profissao = rs.getString("profissao");
            tempoTrampo = arrumarData(rs.getString("tempo_trabalho"));
            tel = rs.getString("numero_cel");
            fotoPerfil = rs.getString("foto_perfil");

        }

        usuario1 = new Usuario(id, nomeUser, profissao, tempoTrampo, tel, fotoPerfil);

        rs.close();
        ps.close();
        con.close();

        return usuario1;

    }

    private String arrumarData(String string) {
        String[] items = string.split("-");
        String data = "";
        for (int i = items.length - 1; i >= 0; i--) {
            if (i == 0) {
                data += items[i];
            } else {
                data += items[i] + "-";
            }
        }
        return data;
    }

    public String setDados(Usuario user) {
        try {

            String sql = "update usuario set nome = '" + user.getNomeUser() + "', profissao = '" + user.getProfissao() + "', tempo_trabalho = '" + user.getTempoTrampo() + "'"
                    + ", numero_cel = '" + user.getTelefone() + "', foto_perfil = '" + user.getFotoPerfil() + "'"
                    + " where cod_user = '" + user.getId() + "'";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.executeUpdate();
            ps.close();
            con.close();
            return user.toString();

        } catch (SQLException e) {
            System.out.println(e);
            return e.getMessage();
        }
    }

    public Usuario verOutroUser(int idViagem) {
        try {
            String sql = "select u.nome as nome, u.profissao as profissao, u.tempo_trabalho as tempo_trabalho, "
                    + "u.numero_cel as numero_cel, u.foto_perfil as foto_perfil from viagem v INNER JOIN usuario u ON "
                    + "u.cod_user = v.cod_motorista where cod_viagem = '" + idViagem + "'";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            //

            // variaveis para pegar os dados do banco
            String nomeUser = null;
            String profissao = null;
            String tempoTrampo = null;
            String tel = null;
            String fotoPerfil = null;
            //

            while (rs.next()) {

                nomeUser = rs.getString("nome");
                profissao = rs.getString("profissao");
                tempoTrampo = rs.getString("tempo_trabalho");
                tel = rs.getString("numero_cel");
                fotoPerfil = rs.getString("foto_perfil");

            }

            usuario = new Usuario(nomeUser, profissao, tempoTrampo, tel, fotoPerfil);

            rs.close();
            ps.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }

        return usuario;
    }
}
