
package control;

import DAO.LoginDAO;
import DAO.PerfilDAO;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import model.Usuario;

@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2,
        maxFileSize = 1024 * 1024 * 10,
        maxRequestSize = 1024 * 1024 * 50)

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
           case "teste": this.teste(request, response);
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
                String tempoTrampo = arrumarData(request.getParameter("desde"));
                String tel = request.getParameter("tel");
                int idUser = Integer.parseInt(request.getParameter("idUser"));
                
                
                
                Part img = request.getPart("foto");
                String nomeft = extractFileName(img);
                String local = request.getServletContext().getRealPath("img") + File.separator + nomeft;
                File salvarft = new File(local);
                if(!nomeft.isEmpty() ){
                    img.write(local);
                }
                Usuario attSession = new Usuario();
                attSession = (Usuario) session.getAttribute("usuario");
                String fotoAtual = attSession.getFotoPerfil();
                
                attSession.setNomeUser(nome);
                if(!nomeft.isEmpty()){
                    attSession.setFotoPerfil(nomeft);
                }
                attSession.setProfissao(prof);
                attSession.setTelefone(tel);
                attSession.setTempoTrampo(tempoTrampo);
                
                session.setAttribute("usuario", attSession);
              //
              // criar objeto de user e dar update no banco com os novos dados
                Usuario newUser;
                if(nomeft == null || nomeft.isEmpty()){
                    newUser = new Usuario(idUser, nome, prof, tempoTrampo, tel, fotoAtual);
                }else{
                    newUser = new Usuario(idUser, nome, prof, tempoTrampo, tel, nomeft);
                }
                
                
                
                PerfilDAO pfDao = new PerfilDAO();
                pfDao.setDados(newUser);
                
                LoginDAO l = new LoginDAO();
                
                Usuario novao = new Usuario();
                novao = l.logar(newUser);
                
               
              
              } catch(SQLException e){
                  System.out.println(e);
              }
          }
    }
    
    private String extractFileName(Part part){
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for(String s : items){
            System.out.println("file img  " + s);
            if(s.trim().startsWith("filename")){
                return s.substring(s.indexOf("=") + 2, s.length() - 1);
            } 
        }
        return "";
    }
    
    private void teste(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
          try (PrintWriter out = response.getWriter()) {
              response.setContentType("text/html;charset=UTF-8");
              request.setCharacterEncoding("UTF-8");
              // pegar idUser e fazer um obj Usuario
              int idUser = Integer.parseInt(request.getParameter("codV"));
              //
              // realizando select dos dados do user
              Usuario novoU;
              PerfilDAO pfDAO = new PerfilDAO();
              novoU = pfDAO.verOutroUser(idUser);
              //
              // fazer o popUp e mandar para pagina de solicitarCarona para visualizacao
              out.println("<div class='modal-content animate'>");
                out.println("<div class='imgcontainer'>");
                    out.println("<span onclick=\"document.getElementById('modal-wrapper').style.display='none'\" class=\"close\" title=\"Close PopUp\">&times;</span>");
                    if(novoU.getFotoPerfil().isEmpty() || novoU.getFotoPerfil() == null){
                        out.println("<div class='avatar' ><img id='avatar' style='background-size:cover; border: solid 3px coral;' src='img/1.png'></div>");
                    }else{
                         out.println("<div class='avatar' ><img id='avatar' style='background-size:cover;  border: solid 3px coral;' src='img/"+novoU.getFotoPerfil()+"'></div>");
                    }
                out.println("</div>");
                
                out.println("<div id=\"container\" class=\"container\">");
                    out.println("<div class=\"dadosUser\">");
                        out.println("<input type=\"hidden\" id=\"id\" value='"+novoU.getId()+"'>");
                        out.println("<h1 class=\"textosMain\">SoftPlayer</h1>");
                        out.println("<p class=\"textosSeg\" id=\"nome\">"+novoU.getNomeUser()+"</p>");
                    out.println("</div>");
                    
                    out.println("<div class=\"dadosProf\">");
                        out.println("<h1 class=\"textosMain\">Profissão</h1>");
                        out.println("<p class=\"textosSeg\" id=\"prof\">"+novoU.getProfissao()+"</p>");
                    out.println("</div>");
                    
                    out.println(" <div class=\"dadosTempo\">");
                        out.println("<h1 class=\"textosMain\">SoftPlayer desde</h1>");
                        out.println("<p class=\"textosSeg\" id=\"desde\">"+novoU.getTempoTrampo()+"</p>");
                    out.println("</div>");
                    
                    out.println("<div class=\"dadosCont\">");
                        out.println("<h1 class=\"textosMain\">Contato</h1>");
                        out.println("<p class=\"textosSeg\" id=\"contato\">"+novoU.getTelefone()+"</p>");
                    out.println("</div>");
                    
                out.println("</div>");
              out.println("</div>");
              
              
              //
          }
    }     
    private String arrumarData(String string){
       String[] items = string.split("-");
       String data = "";
       for(int i = items.length - 1; i >= 0; i--){
           if(i == 0){
               data += items[i];
           }else{
               data += items[i]+"-";
           }
       }
       return data;
   }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
