
package control;

import DAO.LocalDAO;
import DAO.SolicitarCaronaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.SolicitarCarona;

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
              
              // Session 
                HttpSession session = request.getSession();
              //
            
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
              
              // pegar dados do banco de TODAS caronas
                SolicitarCaronaDAO scTodos = new SolicitarCaronaDAO();
                scTodos.pegarTodasCaronas();
                
                // madar para session
                session.setAttribute("TC", scTodos.pegarTodasCaronas());
                //
                List<SolicitarCarona> lista = new ArrayList();
                lista = scTodos.pegarTodasCaronas();
                
                 out.println("<script type=\"text/javascript\">");
                out.println("console.log("+scTodos.toString()+")");
                out.println("location='/SoftCarWeb/socilitarCarona.jsp';");
                out.println("</script>");
                
              //
          }
   }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
