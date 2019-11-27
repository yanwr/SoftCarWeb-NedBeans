package control;

import DAO.LoginDAO;
import java.io.IOException;
import java.io.PrintWriter;
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
        String envio = request.getParameter("Deslogar");
        switch (envio) {
            case "Sair":
                this.loginOut(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String envio = request.getParameter("ENVIAR");
        switch (envio) {
            case "LOGAR":
                this.login(request, response);
        }
    }

    private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            try {
                // Session 
                HttpSession session = request.getSession();
                //
                // pegar dados da pagina 
                String email = request.getParameter("login");
                String senhaLogin = request.getParameter("senhaLogin");
                //

                // mandar para o banco de dados 
                Usuario user = new Usuario(email, senhaLogin);
                LoginDAO l = new LoginDAO();
                Usuario u = l.logar(user);
                //
                String manipulacao = arrumarData(u.getTempoTrampo());
                u.setTempoTrampo(manipulacao);
                //
                if (u.isLogado()) {
                    // Mandar usuario para session 
                    session.setAttribute("usuario", u);

                    // mandar para homeLogado 
                    request.getRequestDispatcher("/homeDepoisDeLogar.jsp").forward(request, response);
                } else {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Senha incorreta ou Softplayer não cadastrado !! ')");
                    out.println("location='/SoftCarWeb/login.jsp';");
                    out.println("</script>");
                }

            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }

    private void loginOut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            //Session
            HttpSession session = request.getSession();
            //
            // deslogar invalidando a session do usuario  
            session.invalidate();
            request.getRequestDispatcher("/home.jsp").forward(request, response);
            //

        }
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

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
