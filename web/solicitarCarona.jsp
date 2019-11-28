
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="model.SolicitarCarona"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.io.PrintWriter"%>
<%-- 
    Document   : solicitarCarona
    Created on : 26/09/2019, 17:02:30
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="shortcut icon" href="img/softcar-blue-icon.png" type="image/x-png">
    <link rel='stylesheet' type='text/css' media='screen' href='Css/solicitarCarona.css'>
    <title>SoftCar - Solicitar Carona</title>
</head>
<body>
     <!-- ----------- NavBar ------------- -->
     <%@include file="NavBarLogado.jsp" %>
     <!-- -------- Solicitar Carona ------------ --> 
    <div class="wrap" id="wrap">
        
        <form action="Solicitar" method="post" class="search">
            <h1 class="textos">Para onde você vai ?</h1>
            <input type="search" name="Pvai"  placeholder="Bairro / Empresa / Escritório" />
            <h1 class="textos">De onde você sai ?</h1>
            <input type="search"  name="Psai" placeholder="Bairro / Empresa / Escritório" />
            <input type="submit" class="btnBuscar" value="Buscar" name="ENVIAR"/>
           
        </form>
        
        <div class="top">
          
        </div>      
        
        <main>
            <%
             List<SolicitarCarona> listE = (List) request.getAttribute("TCEspecifica");
             
             if(listE != null && !listE.isEmpty()){
                 
                 for( SolicitarCarona w : listE){
                     out.println("<div  class='card'>");
                          out.println("<input type='hidden' id='idUser' name='codViagem' value="+w.getCodViagem()+" />");
                          out.println("<div class='hrPost'>"+w.getDataPostagem()+" "+w.getHoraPostagem()+"</div>");


                          out.println("<div class='perfilUser'>");
                              out.println("<div class='nomeUser'>");
                                 out.println("<div class='imgPerfil' onclick='comeca("+w.getCodViagem()+")' id='imgPerfil' style=' background-image: url(img/"+w.getFtPerfil()+");margin-top: -25px;'></div>");
                                 out.println("<p id='nameUser'>"+w.getMotorista()+"</p>");
                              out.println("</div>");
                          out.println("</div>");

                          out.println("<a href='Mensagem?ENVIAR=MENSAGEM&Cod="+w.getCodUser()+"' class='dadosCorrida'>");
                              out.println("<ul class='dCorrida'>");
                                  out.println("<li class='saida'>");
                                      out.println("Saida: <p id='nomeSaida'>"+w.getSaida()+"</p>");
                                  out.println("</li>");
                                  out.println("<li class='para'>");
                                      out.println("Para: <p id='nomePara'>"+w.getDestino()+"</p>");
                                  out.println("</li>");
                              out.println("</ul>");

                              out.println("<ul class='dCorrida2'>");
                                  out.println("<li class='data'>");
                                      out.println("Data: <p id='dataCorrida'>"+w.getDataSaida()+"</p>");
                                  out.println("</li>");
                                  out.println("<li class='hora'>");
                                      out.println("Hora: <p id='horaCorrida'>"+w.getHoraSaida()+"</p>");
                                  out.println("</li>");
                              out.println("</ul>");

                              out.println("<ul class='dCorrida3'>");
                                  out.println("<li class='assentos'>");
                                      out.println("Assentos: <p id='assentosCorrida'>"+w.getAssentos()+"</p>");
                                  out.println("</li>");
                                  out.println("<li class='taxa'>");
                                      out.println("Taxa: <p id='taxaCorrida'>"+w.getTaxa()+"</p>");
                                  out.println("</li>");
                              out.println("</ul>");

                          out.println("</a>");
                      out.println("</div>");
                 }  
             }else{
                
                List<SolicitarCarona> list = (List) request.getAttribute("TC");
              
                for( SolicitarCarona w : list){
                       
                        out.println("<div  class='card'>");
                          out.println("<input type='hidden' id='idUser' name='codViagem' value="+w.getCodViagem()+" />");
                          out.println("<div class='hrPost'>"+w.getDataPostagem()+" "+w.getHoraPostagem()+"</div>");


                          out.println("<div class='perfilUser'>");
                              out.println("<div class='nomeUser'>");
                                 out.println("<div class='imgPerfil' onclick='comeca("+w.getCodViagem()+")' id='imgPerfil' style=' background-image: url(img/"+w.getFtPerfil()+");margin-top: -25px;'></div>");
                                 out.println("<p id='nameUser'>"+w.getMotorista()+"</p>");
                              out.println("</div>");
                          out.println("</div>");
                          
                            List<Integer> cods = new ArrayList();
                            cods.add(w.getCodUser());
                            cods.add(w.getCodViagem());
                            int d; int n;
                            d= w.getCodUser();
                            n = w.getCodViagem();
                            
                          out.println("<div onclick='vericacao("+d+","+n+")' class='dadosCorrida'>");
                              out.println("<ul class='dCorrida'>");
                                  out.println("<li class='saida'>");
                                      out.println("Saida: <p id='nomeSaida'>"+w.getSaida()+"</p>");
                                  out.println("</li>");
                                  out.println("<li class='para'>");
                                      out.println("Para: <p id='nomePara'>"+w.getDestino()+"</p>");
                                  out.println("</li>");
                              out.println("</ul>");

                              out.println("<ul class='dCorrida2'>");
                                  out.println("<li class='data'>");
                                      out.println("Data: <p id='dataCorrida'>"+w.getDataSaida()+"</p>");
                                  out.println("</li>");
                                  out.println("<li class='hora'>");
                                      out.println("Hora: <p id='horaCorrida'>"+w.getHoraSaida()+"</p>");
                                  out.println("</li>");
                              out.println("</ul>");

                              out.println("<ul class='dCorrida3'>");
                                  out.println("<li class='assentos'>");
                                      out.println("Assentos: <p id='assentosCorrida'>"+w.getAssentos()+"</p>");
                                  out.println("</li>");
                                  out.println("<li class='taxa'>");
                                      out.println("Taxa: <p id='taxaCorrida'>"+w.getTaxa()+"</p>");
                                  out.println("</li>");
                              out.println("</ul>");

                          out.println("</div>");
                      out.println("</div>");
                 }  
             }

                
    
    %>      
        </main>
      </div>
      
      <div id="modal-wrapper" class="modal" style="display: none;">
        
      </div>
        
      <div id="verifica" class="verificaCarona" style="display: none;">
            
      </div>
    
</body>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script type="text/javascript" src="js/visualizarPerfil.js"></script>
</html>