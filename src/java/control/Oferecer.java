
package control;

import DAO.BairroDAO;
import DAO.EmpresaDAO;
import DAO.PostarCorridaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Bairro;
import model.Empresa;
import model.PostarCorrida;
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
           case "ADICIONAR CARONA": this.addCarona(request, response);
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
                DateTimeFormatter minhaDataFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
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
                PostarCorrida pc;
                Bairro br;
                Empresa em;
                EmpresaDAO empresa = new EmpresaDAO();
                BairroDAO bairro = new BairroDAO();
               //
               
               
                // verificar se as variaveis sao obj Empresa
                if(pSair.equals("SoftPlan") || pSair.equals("Escritorio")){
                    
                    // empresa
                        empresa.pegarIdEmpresa(pSair);
                    //
                    
                    //bairros
                        bairro.pegarIdBairro(pVai);
                    //
                    
                    // mandar para o banco o dados se a SAIDA for de EMPRESA
                        pc = new PostarCorrida(user.getId(), dt, hr, hora, dia, bairro.getId(), empresa.getId(), assentos, taxa);
                        PostarCorridaDAO pcDAO = new PostarCorridaDAO();
                        pcDAO.addCorridaSaidandoEmpresa(pc);

                    //
                }else{
                    
                    // empresa
                        empresa.pegarIdEmpresa(pVai);
                    //
                    
                    //bairros
                        bairro.pegarIdBairro(pSair);
                    //
                    
                    // mandar para o banco o dados se a SAIDA for de BAIRRO
                        pc = new PostarCorrida(user.getId(), dt, hr, hora, dia, empresa.getId(), bairro.getId(), assentos, taxa);
                        PostarCorridaDAO pcDAO = new PostarCorridaDAO();
                        pcDAO.addCorridaSaidandoBairro(pc);
                }
          }
     }
    
    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
