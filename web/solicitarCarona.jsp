
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
        
        <form action="" method="post" class="search">
            <h1 class="textos">Para onde você vai ?</h1>
            <input type="search" name="Pvai" placeholder="Bairro / Empresa / Escritório" />
            <h1 class="textos">De onde você sai ?</h1>
            <input type="search" name="Psai" placeholder="Bairro / Empresa / Escritório" />
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
        </main>
        
      </div>
</body>
</html>