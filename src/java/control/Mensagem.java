
package control;

import DAO.DadosBatePapoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DadosBatePapo;
import model.Usuario;

public class Mensagem extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String envio = request.getParameter("ENVIAR");
        switch(envio){
            case "MENSAGEM": this.criarBatePapo(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String envio = request.getParameter("ENVIAR");   
        switch(envio){
            case "ENVIAR": this.mandarMensagem(request, response);      
        }
    }
    
    private void criarBatePapo(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
          try (PrintWriter out = response.getWriter()) {
              // session 
                HttpSession session = request.getSession();
              //
                // pegar codViagem do get vindo da pag solicitarCarona
                    int codUser = Integer.parseInt(request.getParameter("Cod"));
                    session.setAttribute("codUser", codUser);
                //
              
                 // pegar cod do user que esta logado  
                  Usuario user = new Usuario();
                  user = (Usuario) session.getAttribute("usuario");
                //
                
                // criar contatos 
                    DadosBatePapoDAO cont = new  DadosBatePapoDAO();
                    List<Usuario> listCont = new ArrayList(); 
                    listCont = cont.contatos(codUser, user.getId());
                    
                    request.setAttribute("contatos", listCont);
                //
                  
              /////////// pegando mensagens ////////////// 
                // dar select nas mensagens pelo codViagem 
                DadosBatePapoDAO dbDAO = new DadosBatePapoDAO();
                 List<DadosBatePapo> msg = new ArrayList();
                 msg = dbDAO.getMsg(codUser);
                //
                // mandar para request e manipular na pag chat.
                  request.setAttribute("msg", msg);
                //
              //
             // mandar para pag chat
                request.getRequestDispatcher("/chat.jsp").forward(request, response);  
          }
    }
    
     private void mandarMensagem(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
          try (PrintWriter out = response.getWriter()) {
              
              //////////// mandando mensagem ////////////////
                // session 
                  HttpSession session = request.getSession();
                //
                // pegar codViagem do request

                  int codUser = (int) session.getAttribute("codUser");
                //  
                // pegar cod do user que esta logado  
                  Usuario user = new Usuario();
                  user = (Usuario) session.getAttribute("usuario");
                //
                // dar insert com as mensagem 
                  String mensagem = request.getParameter("textArea");

                  DadosBatePapo dbp = new DadosBatePapo(codUser, mensagem, user.getId());

                  DadosBatePapoDAO dbpDAO = new DadosBatePapoDAO();
                  dbpDAO.setMsg(dbp);
                  //
              //  
              
              /////////// pegando mensagens ////////////// 
                // dar select nas mensagens pelo codViagem 
                DadosBatePapoDAO dbDAO = new DadosBatePapoDAO();
                 List<DadosBatePapo> msg = new ArrayList();
                 msg = dbDAO.getMsg(codUser);
                //
                // mandar para request e manipular na pag chat.
                  request.setAttribute("msg", msg);
                //
              //
             // mandar para pag chat
                request.getRequestDispatcher("/chat.jsp").forward(request, response);
          }
    } 
     
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
