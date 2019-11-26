
package control;


import DAO.LocalDAO;
import DAO.OferecerCorridaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.OferecerCorrida;
import model.Usuario;

public class Oferecer extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String envio = request.getParameter("ENVIAR");
       switch(envio){
           case "ADICIONAR": this.addCarona(request, response);
       }
    }
    
     private void addCarona(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
          try (PrintWriter out = response.getWriter()) {
              // Session
                HttpSession session = request.getSession();
              //
              
              // pegando dados da session
                Usuario user = new Usuario();
                user = (Usuario) session.getAttribute("usuario");
              //
              
              // pegando dados da pag
              String pSair = request.getParameter("pSair");
              String pVai = request.getParameter("pVai");
              String hora = request.getParameter("hora");
              String dia = request.getParameter("dia");
              int assentos = Integer.parseInt(request.getParameter("assentos"));
              float taxa = Float.parseFloat(request.getParameter("taxa"));
              //
              
              //fazer data e hora que a corrida foi postada
                LocalDateTime minhaData = LocalDateTime.now();
                DateTimeFormatter minhaDataFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                String dt = minhaData.format(minhaDataFormatter);

                LocalDateTime minhaHora = LocalDateTime.now();
                DateTimeFormatter minhaHoraFormatter = DateTimeFormatter.ofPattern("HH:mm");
                String hr = minhaHora.format(minhaHoraFormatter);
                    
              //
              
              
              // ver se os campos estao vazios
              if(pSair.isEmpty()){
                  request.setAttribute("erroPsair", "<i class=\"fas fa-exclamation-circle\"></i>" );
              }
              if(pVai.isEmpty()){
                  request.setAttribute("erroPvai", "<i class=\"fas fa-exclamation-circle\"></i>" );
              }
              if(hora.isEmpty()){
                  request.setAttribute("erroHora", "<i class=\"fas fa-exclamation-circle\"></i>" );
              }
              if(dia.isEmpty()){
                  request.setAttribute("erroDia", "<i class=\"fas fa-exclamation-circle\"></i>" );
                  request.getRequestDispatcher("/oferecerCarona.jsp").forward(request, response);
              }
              //
              
              // obj das sua devida classe para mandar para o banco
                OferecerCorrida pc;
                LocalDAO saida = new LocalDAO();
                LocalDAO destino = new LocalDAO();
               //

            //saida
                saida.pegarIdLocal(pSair);
           
            //
            //destino
                destino.pegarIdLocal(pVai);
              
            //

            // mandar para add ao banco 
                pc = new OferecerCorrida(user.getId(), dt, hr, hora, dia, destino.getId(), saida.getId(), assentos, taxa);
                OferecerCorridaDAO pcDAO = new OferecerCorridaDAO();
                pcDAO.addCorrida(pc);
                out.println("<script type=\"text/javascript\">");
                out.println("alert(' Sua carona agora está no mural de horários, fique ligado no seu chat ! ')");
                out.println("location='/SoftCarWeb/oferecerCarona.jsp';");
                out.println("</script>");

            //
     
          }
     }
    
    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
