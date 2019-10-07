package control;

import DAO.cadastroDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;

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
            if(email.isEmpty() || email == null){
                request.setAttribute("msgErroUm", "Campo Email obrigatório ou está invalido !");
                request.getRequestDispatcher("/cadastro.jsp").forward(request, response);
                return;
            }
            else if(senha.isEmpty() || senha == null){
                request.setAttribute("msgErroDois", "Campo Senha é obrigatório !");
                request.getRequestDispatcher("/cadastro.jsp").forward(request, response);
                return;
            }
            else if(confsenha.isEmpty() || confsenha == null){
                request.setAttribute("msgErroTres", "Campo Confirmar Senha é obrigatório ou está invalido !");
                request.getRequestDispatcher("/cadastro.jsp").forward(request, response);
                return;
            }
            
            if(senha.equals(confsenha)){

                Usuario user = new Usuario(email, senha);
                cadastroDAO c = new cadastroDAO();
                c.inserirUser(user);

                out.println("<script type=\"text/javascript\">");
                out.println("alert('Sucesso ! ')");
                out.println("location='/SoftCarWeb/homeDepoisDeLogar.jsp';");
                out.println("</script>");
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
