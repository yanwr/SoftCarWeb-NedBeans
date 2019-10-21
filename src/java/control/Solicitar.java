
package control;

import DAO.LocalDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Solicitar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String envio = request.getParameter("ENVIAR");
       switch(envio){
           case "BUSCAR": this.buscar(request, response);
       }
    }

   private void buscar(HttpServletRequest request, HttpServletResponse response) throws IOException{
          try (PrintWriter out = response.getWriter()) {
            
              //pegando dados da pagina
                String Pvai = request.getParameter("Pvai");
                String Psai = request.getParameter("Psai");
              //
              
              // obj local para ter o cod_local do destino e saida
              LocalDAO destino = new LocalDAO();
              LocalDAO saida = new LocalDAO();
              
              destino.pegarIdLocal(Pvai);
              saida.pegarIdLocal(Psai);
              //
              
              
              
              
              
              
          }
   }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
