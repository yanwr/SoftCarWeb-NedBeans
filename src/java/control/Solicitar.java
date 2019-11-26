
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
       String envio = request.getParameter("ENVIAR");
       switch(envio){
           case "Solicitar": this.buscarTodas(request, response);
       }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String envio = request.getParameter("ENVIAR");
       switch(envio){
           case "Buscar": this.buscarEspecifica(request, response);
       }
    }

   private void buscarTodas(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
          try (PrintWriter out = response.getWriter()) {

              // pegar dados do banco de TODAS caronas
                SolicitarCaronaDAO scTodos = new SolicitarCaronaDAO();
              //
              
              //criar o obj de todas caronas como uma lista
                List<SolicitarCarona> lista = new ArrayList();
                lista = scTodos.pegarTodasCaronas();
              //

              // madar para request
                request.setAttribute("TC", lista);
                request.getRequestDispatcher("/solicitarCarona.jsp").forward(request, response);
              //
          }
   }
   
   private void buscarEspecifica(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
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
              
              // pegar dados do banco de TODAS caronas
                SolicitarCaronaDAO scTodosE = new SolicitarCaronaDAO();
              //
              
              //criar o obj de todas caronas como uma lista
                List<SolicitarCarona> listaE = new ArrayList();
                listaE = scTodosE.pegarTodasCaronasEspecificas(destino.getId(), saida.getId());
              //
                
              // madar para pg por request
                request.setAttribute("TCEspecifica", listaE);
                request.getRequestDispatcher("/solicitarCarona.jsp").forward(request, response);
              //    
          }
    }
   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
