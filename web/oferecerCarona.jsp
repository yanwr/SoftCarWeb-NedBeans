<%-- 
    Document   : oferecerCarona
    Created on : 26/09/2019, 16:44:11
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel='stylesheet' type='text/css' media='screen' href='Css/oferecerCarona.css'>
    <link rel="shortcut icon" href="img/softcar-blue-icon.png" type="image/x-png">
    <title>SoftCar - Oferecer Carona</title>
</head>
<body>
    <!-- ----------- NavBar ------------- -->
     <%@include file="NavBarLogado.jsp" %>
     <!-- -------- Oferecer Carona ------------ --> 
    <div class="centro">
        <form action="Oferecer" method="post" class="form">
            <h1 class="textos">De onde você vai sair ?</h1>
            <input type="search" class="form-field" id="pSair" name="pSair" placeholder="Bairro / Empresa / Escritório"/>${requestScope.erroPsair}
            <h1 class="textos">Para onde deseja ir ?</h1>
            <input type="search" class="form-field" id="pVai" name="pVai" placeholder="Bairro / Empresa / Escritório"/>${requestScope.erroPvai}
            <h1 class="textos">Horário de saída ?</h1>
            <input type="time" class="form-field" id="hora" name="hora" placeholder="Horário"/>${requestScope.erroHora}
            <h1 class="textos">Dia de saída ?</h1>
            <input type="date" class="form-field" id="dia" name="dia" placeholder="Data"/>${requestScope.erroDia}
            <h1 class="textos">Quantos assentos disponíveis ?</h1>
            <input type="number" id="assentos" name="assentos" min="1" max="6" value="1" class="form-field" placeholder="Assento"/>${requestScope.erroAssentos}
            <h1 class="textos">Taxa(opcional) ?</h1>
            <input type="number" id="taxa" name="taxa" value="0" class="form-field" placeholder="Taxa"/>
            <input type="submit" class="form-button" onclick="" name="ENVIAR" value="ADICIONAR CARONA"/>
        </form>
    </div>
</body>
<script src="js/Verificacao.js"></script>
</html>
