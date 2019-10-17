
package control;

import DB.connectionDB;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Usuario;

public class Login extends HttpServlet {
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        String envio = request.getParameter("ENVIAR");
        switch(envio){
            case "LOGAR": this.verificacao(request, response);
        }
    }  
     private void verificacao(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        try (PrintWriter out = response.getWriter()) {
            try {
                   // Session 
                     HttpSession session = request.getSession();
                   //
                   // pegar dados da pagina 
                   String email = request.getParameter("login");
                   String senhaLogin = request.getParameter("senhaLogin");
 
                   //
                   
                   // conexao banco
                   Connection con;
                   con = connectionDB.getConnection();
                 
                   String sql = "select*from usuario where email='"+email+"'";
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
                   
                   while(rs.next()){
                       
                    id = rs.getInt("cod_user");
                    s = rs.getString("senha");
                    nomeUser = rs.getString("nome");
                    profissao = rs.getString("profissao");
                    tempoTrampo = rs.getString("tempo_trabalho");
                    tel = rs.getString("numero_cel");
                    fotoPerfil = rs.getString("foto_perfil");
                     
                   if(s.equals(senhaLogin)){
                       // Mandar usuario para session 
                       Usuario user = new Usuario(id, nomeUser, profissao, tempoTrampo, tel, fotoPerfil);
                        session.setAttribute("usuario", user);

                        // mandar para homeLogado 
                       request.getRequestDispatcher("/homeDepoisDeLogar.jsp").forward(request, response);
                       
                        
                   }else{
                            out.println("<script type=\"text/javascript\">");
                            out.println("alert('Senha incorreta ou Softplayer não cadastrado !! ')");
                            out.println("location='/SoftCarWeb/login.jsp';");
                            out.println("</script>");
                     }
                  }
                   // fechando connection 
                   ps.close();
                   rs.close();
                   con.close();
                   //
               } catch (SQLException ex) {
                   System.out.println(ex);
               }
        }
        
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
