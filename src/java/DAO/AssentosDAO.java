package DAO;

import DB.connectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AssentosDAO {

    Connection com;
    int assentos;

    public AssentosDAO() {
        com = connectionDB.getConnection();
    }

    public void menosBanco(int codViagem) {

        try {
            String sql = "update viagem set assentos = assentos - 1 where cod_viagem = '" + codViagem + "';";
            PreparedStatement ps = com.prepareStatement(sql);

            ps.executeUpdate();
            ps.close();
            com.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public int buscarBanco(int codViagem) {

        try {
            String sql = "select assentos from viagem where cod_viagem = '" + codViagem + "';";
            PreparedStatement ps = com.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);

            while (rs.next()) {
                assentos = rs.getInt("assentos");
            }

            rs.close();
            ps.close();
            com.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
        return assentos;
    }
}
