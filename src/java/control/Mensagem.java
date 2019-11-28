package control;

import DAO.DadosBatePapoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        switch (envio) {
            case "MENSAGEM":
                this.criarBatePapo(request, response);
           case "DaHome":
                this.dahome(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String envio = request.getParameter("ENVIAR");
        switch (envio) {
            case "ENVIAR":
                this.mandarMensagem(request, response);
            case "Atualizar":
                this.getMessage(request, response);
        }
    }

    private void criarBatePapo(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

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
        DadosBatePapoDAO cont = new DadosBatePapoDAO();
        List<Usuario> listCont = new ArrayList();
        listCont = cont.contatos(user.getId());

        request.setAttribute("contatos", listCont);
        //

        /////////// pegando mensagens ////////////// 
        // dar select nas mensagens pelo codViagem 
        DadosBatePapoDAO dbDAO = new DadosBatePapoDAO();
        List<DadosBatePapo> msg = new ArrayList();
        msg = dbDAO.getMsg(codUser, user.getId());
        //
        // mandar para request e manipular na pag chat.
        request.setAttribute("msg", msg);
        //
        //
        // mandar para pag chat
        request.getRequestDispatcher("/chat.jsp").forward(request, response);

    }
    private void dahome(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        // session 
        HttpSession session = request.getSession();
        //
       

        // pegar cod do user que esta logado  
        Usuario user = new Usuario();
        user = (Usuario) session.getAttribute("usuario");
        //

        // criar contatos 
        DadosBatePapoDAO cont = new DadosBatePapoDAO();
        List<Usuario> listCont = new ArrayList();
        listCont = cont.contatos(user.getId());

        request.setAttribute("contatos", listCont);
        //

        // mandar para pag chat
        request.getRequestDispatcher("/chat.jsp").forward(request, response);

    }
    private void mandarMensagem(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

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
        // criar contatos 
        DadosBatePapoDAO cont = new DadosBatePapoDAO();
        List<Usuario> listCont = new ArrayList();
        listCont = cont.contatos(user.getId());

        request.setAttribute("contatos", listCont);
        //
        // dar insert com as mensagem 
        String mensagem = request.getParameter("texto");

        DadosBatePapo dbp = new DadosBatePapo(codUser, mensagem, user.getId());

        DadosBatePapoDAO dbpDAO = new DadosBatePapoDAO();
        dbpDAO.setMsg(dbp);

        //
        //  
        this.getMessage(request, response);
////              

       // request.getRequestDispatcher("/chat.jsp").forward(request, response);

    }
    
    private void getMessage(HttpServletRequest request, HttpServletResponse response) {

        HttpSession session = request.getSession();

        int codUser = (int) session.getAttribute("codUser");
        //  
        // pegar cod do user que esta logado  
        Usuario user = new Usuario();
        user = (Usuario) session.getAttribute("usuario");
        //
        /////////// pegando mensagens ////////////// 
        // dar select nas mensagens pelo codViagem 
        DadosBatePapoDAO dbDAO = new DadosBatePapoDAO();
        List<DadosBatePapo> msg = new ArrayList();
        msg = dbDAO.getMsg(codUser, user.getId());
        //
        // mandar para request e manipular na pag chat.
        request.setAttribute("msg", msg);
        //
        
        // mandar para pag chat
            
        try (PrintWriter out = response.getWriter()) {
            out.println("<ul>");
            if (msg != null && !msg.isEmpty()) {

                for (DadosBatePapo w : msg) {
                    if (w.getUserQueEnviou() == user.getId()) {

                        out.println("<li class='batePapoRight'>");
                        out.println("<div class='mensagemMinha'>");
                        out.println("" + w.getMsg() + "");
                        out.println("</div>");
                        out.println("</li>");

                    } else {

                        out.println("<li class='batePapoLeft'>");
                        out.println("<div class='mensagemDele'>");
                        out.println("" + w.getMsg() + "");
                        out.println("</div>");
                        out.println("</li>");

                    }
                }
            } else {
                out.println("<li class='batePapoRight'>");
                out.println("<div class='mensagemMinha'>");
                out.println("Não há mensagens");
                out.println("</div>");
                out.println("</li>");

            }
            out.println("</ul>");
            
        } catch (IOException ex) {
            Logger.getLogger(Mensagem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    
}
