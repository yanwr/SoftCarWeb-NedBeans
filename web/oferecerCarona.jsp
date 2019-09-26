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
        <div class="form">
            <input type="text" class="form-field" placeholder="De onde sai"/>
            <input type="text" class="form-field" placeholder="Para onde vai"/>
            <input type="time" class="form-field" placeholder="Horário"/>
            <input type="number" class="form-field" placeholder="Assento"/>
            <input type="number" class="form-field" placeholder="Taxa(opcional)"/>
            <input type="button" class="form-button" value="Enviar"/>
        </div>
    </div>
</body>
</html>
