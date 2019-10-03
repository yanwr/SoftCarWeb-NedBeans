
package control;

import DAO.cadastroDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;


@WebServlet(name = "cadastro", urlPatterns = {"/cadastro"})
public class cadastro extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            // pegando dados que o usuario digitar no site
            String email = request.getParameter("email");
            String senha = request.getParameter("senha");
            String confsenha = request.getParameter("confsenha");
            // end pegando
            
            // comparar se a senha e o confirmar senha são iguais 
            if(senha.equals(confsenha)){
                Usuario user = new Usuario(email, senha);
                cadastroDAO c = new cadastroDAO();
                c.cadUser(user);
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>deu</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Servlet NewServlet at " +"Deu certo"+ "</h1>");
                out.println("</body>");
                out.println("</html>");
            }
            // end comparar senhas 
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
