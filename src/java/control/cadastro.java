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
            String nomeUser = request.getParameter("nomeUser");
            String senha = request.getParameter("senha");
            String confsenha = request.getParameter("confsenha");
            // end pegando
            
            // comparar se a senha e o confirmar senha são iguais 
            if(email.isEmpty() || email == null){
                request.setAttribute("msgErroUm", "Campo Email obrigatório ou está invalido !");
                request.getRequestDispatcher("/cadastro.jsp").forward(request, response);
                return;
            }
             else if(nomeUser.isEmpty() || nomeUser == null){
                request.setAttribute("msgErroDois", "Campo Nome é obrigatório !");
                request.getRequestDispatcher("/cadastro.jsp").forward(request, response);
                return;
            }
            else if(senha.isEmpty() || senha == null){
                request.setAttribute("msgErroTres", "Campo Senha é obrigatório !");
                request.getRequestDispatcher("/cadastro.jsp").forward(request, response);
                return;
            }
            else if(confsenha.isEmpty() || confsenha == null){
                request.setAttribute("msgErroQuatro", "Campo Confirmar Senha é obrigatório ou está invalido !");
                request.getRequestDispatcher("/cadastro.jsp").forward(request, response);
                return;
            }
            
            if(senha.equals(confsenha)){

                Usuario user = new Usuario(email, senha, nomeUser);
                cadastroDAO c = new cadastroDAO();
                c.inserirUser(user);

                out.println("<script type=\"text/javascript\">");
                out.println("alert('Sucesso ! ')");
                out.println("location='/SoftCarWeb/homeDepoisDeLogar.jsp';");
                out.println("</script>");
                
                request.getRequestDispatcher("/homeDepoisDeLogar.jsp").forward(request, response);
                
            }
            // end comparar senhas 
            
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
