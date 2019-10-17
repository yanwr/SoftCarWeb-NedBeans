package control;

import DAO.cadastroDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;

public class Cadastro extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String envio = request.getParameter("ENVIAR");
        switch(envio){
            case "CADASTRAR": this.cadastroUser(request, response);
        }
    }

     private void cadastroUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
          try (PrintWriter out = response.getWriter()) {
              
            // pegando dados que o usuario digitar no site
            String email = request.getParameter("email");
            String nomeUser = request.getParameter("nomeUser");
            String senha = request.getParameter("senha");
            String confsenha = request.getParameter("confsenha");
            // end pegando
            
            // comparar se tem algo vazio
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
            //
            // se a senha é igual o confsenha
            if(senha.equals(confsenha)){
                // obj das suas devidas classes para mandar ao banco 
                Usuario user = new Usuario(email, senha, nomeUser);
                cadastroDAO c = new cadastroDAO();
                c.inserirUser(user);
                //
                // aviso se foi realizado ou nao com sucesss
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Sucesso ! ')");
                out.println("location='/SoftCarWeb/homeDepoisDeLogar.jsp';");
                out.println("</script>");
                //
                // mandar para pagina Home com o user logado
                request.getRequestDispatcher("/homeDepoisDeLogar.jsp").forward(request, response);
                //
            }else{
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Senha e Confirmar Senha não estão iguals !')");
                out.println("location='/SoftCarWeb/cadastro.jsp';");
                out.println("</script>");
            }
            // end comparar senhas 
            
        }
     }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
