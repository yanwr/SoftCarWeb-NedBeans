
package control;

import DAO.LoginDAO;
import DAO.PerfilDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Usuario;

public class Perfil extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String envio = request.getParameter("ENVIAR");
       switch(envio){
           case "Atualizar": this.trocaDados(request, response);
       }
    }
    
    private void trocaDados(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
          try (PrintWriter out = response.getWriter()) {
              try{
              // Session
                HttpSession session = request.getSession();
              //
              //pegando dados do request 
                String nome = request.getParameter("nome");
                String prof = request.getParameter("prof");
                String tempoTrampo = request.getParameter("desde");
                String tel = request.getParameter("tel");
                String foto = request.getParameter("foto");
                int idUser = Integer.parseInt(request.getParameter("idUser"));
              //
              // criar objeto de user e dar update no banco com os novos dados
                Usuario newUser = new Usuario(idUser, nome, prof, tempoTrampo, tel, foto);
                
                PerfilDAO pfDao = new PerfilDAO();
                pfDao.setDados(newUser);
                
                LoginDAO l = new LoginDAO();
                
                Usuario novao = new Usuario();
                novao = l.logar(newUser);
              //
              // zerar session de usuario para sempre aparecer ao user os novos dados 
              
              } catch(SQLException e){
                  System.out.println(e);
              }
          }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
