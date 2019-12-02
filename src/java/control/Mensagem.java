package control;

import DAO.AssentosDAO;
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

        if (envio.equals("MENSAGEM")) {
            this.criarBatePapo(request, response);
        } else if (envio.equals("DAHOME")) {
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
            case "cc":
                this.contatos(request, response);
        }
    }

    private void criarBatePapo(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
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
        // Diminuir assentos 
        int codViagem = Integer.parseInt(request.getParameter("CodVi"));
        // fazer a busca de todos os assentos disponiveis daquela carona, se for > 0 entao -1, se nao, carona excluida do mural
        AssentosDAO asDao = new AssentosDAO();
        AssentosDAO assenDao = new AssentosDAO();
        int assentos = asDao.buscarBanco(codViagem);
        if (assentos != 0) {
            assenDao.menosBanco(codViagem);
        }
        //

        //
        //
        // mandar para pag chat
        request.getRequestDispatcher("/chat.jsp").forward(request, response);

    }

    private void dahome(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        // session 
        HttpSession session = request.getSession();
        //
        // passar um codUser padrao para sempre acessar sem mensagem nenhuma 
        int codUser = 0;
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

      
        request.getRequestDispatcher("/chat.jsp").forward(request, response);

    }

    private void mandarMensagem(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
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
        // request.getRequestDispatcher("/chat.jsp").forward(request, response);
    }

    private void getMessage(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html;charset=UTF-8");
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
                out.println("<div class='msgN'>");
                    out.println("Não há mensagens");
                out.println("</div>");
                out.println("</li>");

            }
            out.println("</ul>");

        } catch (IOException ex) {
            Logger.getLogger(Mensagem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void contatos(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try (PrintWriter out = response.getWriter()) {
            response.setContentType("text/html;charset=UTF-8");
            request.setCharacterEncoding("UTF-8");
            HttpSession session = request.getSession();
            // pegar cod do user que esta logado  
            Usuario user = new Usuario();
            user = (Usuario) session.getAttribute("usuario");
            //
            // criar contatos 
            DadosBatePapoDAO cont = new DadosBatePapoDAO();
            List<Usuario> listCont = new ArrayList();
            listCont = cont.contatos(user.getId());

            request.setAttribute("contatos", listCont);

            for (Usuario u : listCont) {
                out.println("<a href='Mensagem?ENVIAR=MENSAGEM&Cod=" + u.getId() + "&CodVi=0' style='text-decoration: none;'>");
                out.println("<li class='contato' id='contato' >");
                out.println("<div class='userPerfil' style='background-image:url(img/" + u.getFotoPerfil() + ");'></div>");
                out.println("<div class='nome' id='nome'>");
                out.println("" + u.getNomeUser() + "");
                out.println("</div>");
                out.println("</li>");
                out.println("</a>");
            }
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
