
package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Mensagem extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String envio = request.getParameter("ENVIAR");
        switch(envio){
            case "MENSAGEM": this.mensagem(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }
    
    private void mensagem(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
          try (PrintWriter out = response.getWriter()) {
                
                int cod = Integer.parseInt(request.getParameter("Cod"));
                
                
                
          }
    }      

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
