
package control;

import DAO.DadosBatePapoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DadosBatePapo;


public class Mensagem extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String envio = request.getParameter("ENVIAR");
        switch(envio){
            case "MENSAGEM": this.criarBatePapo(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }
    
    private void criarBatePapo(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
          try (PrintWriter out = response.getWriter()) {
              
                // pegar codViagem do get vindo da pag solicitarCarona
                    int codViagem = Integer.parseInt(request.getParameter("Cod"));
                //
                
                //  mandar para tela de Chat ja com os dados do user do mural
                   DadosBatePapoDAO dbpDAO = new DadosBatePapoDAO();
                   // dbpDAO.getDadosMotorista(codViagem);
                   //System.out.println(dbpDAO);                    
                //
                
                DadosBatePapo dbp = new DadosBatePapo();
                dbp.setCodViagem(codViagem);
                dbpDAO.setMsg(dbp);
                
                request.getRequestDispatcher("/chat.jsp").forward(request, response);
                
                
          }
    }      

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
