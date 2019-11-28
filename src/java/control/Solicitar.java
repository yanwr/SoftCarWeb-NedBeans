
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
           //case "verificacao": this.verificacao(request, response);
       }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String envio = request.getParameter("ENVIAR");
       switch(envio){
           case "Buscar": this.buscarEspecifica(request, response);
           case "verificacao": this.verificacao(request, response);
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
    private void verificacao(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
          try (PrintWriter out = response.getWriter()) {
              response.setContentType("text/html;charset=UTF-8");
              request.setCharacterEncoding("UTF-8");
              int codU = Integer.parseInt(request.getParameter("codU"));
              int codVi = Integer.parseInt(request.getParameter("codVi"));
              // fazer o popUp e mandar para pagina de solicitarCarona para verificar se o usuario quer mesmo aquela carona
                out.println("<div class='modal-content animate'>");
                    out.println("<div class='container'>");
                      out.println("<div class='dadosUser'>");
                          out.println("<p id='nomeUser' class='textosSeg'>Realmente deseja pegar essa carona ?</p>");
                      out.println("</div>");

                      out.println("<div id='btnEditUser' class='btnIcons'>");
                            out.println("<a href='Mensagem?ENVIAR=MENSAGEM&Cod="+codU+"'><i class='fas fa-check-circle' style='color: forestgreen;'></i></a>");
                      out.println("</div>");

                      out.println("<div id='btnEditProf' class='btnIcons'>");
                              out.println("<a href='Solicitar?ENVIAR=Solicitar'><i class='fas fa-times-circle' style='color: red;'></i></a>");
                      out.println("</div>");
                      
                    out.println("</div>");
                out.println("</div>"); 
          }
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
