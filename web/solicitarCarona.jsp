
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
            <input type="search" name="Pvai" placeholder="Bairro / Empresa / Escritório" />
            <h1 class="textos">De onde você sai ?</h1>
            <input type="search" name="Psai" placeholder="Bairro / Empresa / Escritório" />
            <input type="submit" value="BUSCAR" name="ENVIAR"/>
        </form>
        
        <div class="top">
          
        </div>
       
        
        
        
        <main>
            <div class="card">
                <div class="hrPost">20/20/2000 21:00</div>
                <div class="perfilUser">
                    <div class="nomeUser">
                        <div class="imgPerfil" id="imgPerfil" style=" background-image: url(img/1.png);margin-top: -25px;"></div>
                        <p id="nameUser">Yan Weschenfelder Rodrigues</p>
                    </div>
                </div>
                <div class="dadosCorrida">
                    <ul class="dCorrida">
                        <li class="saida">
                            Saida: <p id="nomeSaida">Vargem Grande</p>
                        </li>
                        <li class="para">
                            Para: <p id="nomePara">Empresa</p>
                        </li>
                    </ul>
                    <ul class="dCorrida2">
                        <li class="data">
                            Data: <p id="dataCorrida">12/12/2019</p>
                        </li>
                        <li class="hora">
                            Hora: <p id="horaCorrida">21:22</p>
                        </li>
                    </ul>
                    <ul class="dCorrida3">
                        <li class="assentos">
                            Assentos: <p id="assentosCorrida">6</p>
                        </li>    
                        <li class="assentos">
                                Taxa: <p id="taxaCorrida">6</p>
                        </li>  
                    </ul>
                </div>
            </div>
            <%

                out.println("<div class='card'>");
                    out.println("<div class='hrPost'>20/20/2000 22:00</div>");

                    out.println("<div class='perfilUser'>");
                        out.println("<div class='nomeUser'>");
                           out.println("<div class='imgPerfil' id='imgPerfil' style=' background-image: url(img/1.png);margin-top: -25px;'></div>");
                           out.println("<p id='nameUser'>Yan Weschenfelder Rodrigues</p>");
                        out.println("</div>");
                    out.println("</div>");

                    out.println("<div class='dadosCorrida'>");
                        out.println("<ul class='dCorrida'>");
                            out.println("<li class='saida'>");
                                out.println("Saida: <p id='nomeSaida'>Vargem Grande</p>");
                            out.println("</li>");
                            out.println("<li class='para'>");
                                out.println("Para: <p id='nomePara'>Grande</p>");
                            out.println("</li>");
                        out.println("</ul>");
                        
                        out.println("<ul class='dCorrida2'>");
                            out.println("<li class='data'>");
                                out.println("Data: <p id='dataCorrida'>20/20/2000</p>");
                            out.println("</li>");
                            out.println("<li class='hora'>");
                                out.println("Hora: <p id='horaCorrida'>20:00</p>");
                            out.println("</li>");
                        out.println("</ul>");
                        
                        out.println("<ul class='dCorrida3'>");
                            out.println("<li class='assentos'>");
                                out.println("Assentos: <p id='assentosCorrida'>7</p>");
                            out.println("</li>");
                            out.println("<li class='taxa'>");
                                out.println("Taxa: <p id='taxaCorrida'>6</p>");
                            out.println("</li>");
                        out.println("</ul>");
                        
                    out.println("</div>");
                out.println("</div>");
          

                
    
    %>
        </main>
        
      </div>
</body>
</html>