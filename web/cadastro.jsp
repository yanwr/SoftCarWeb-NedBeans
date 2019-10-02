<%-- 
    Document   : cadastro
    Created on : 24/09/2019, 14:38:04
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>SoftCar - Cadastro</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='Css/cadastro.css'>
    <link rel="shortcut icon" href="img/softcar-blue-icon.png" type="image/x-png">
</head>
<body>
        <div class="container">
            <div class="right"></div>
            <div class="leftlog">
              <div class="header">
                <h2 class="animation a1">Cadastre-se</h2>
                <h4 class="animation a2">Cadastre-se usando e-mail e senha</h4>
              </div>
              <form action=" " class="form">
                <input type="email" id="email" name="email" class="form-field animation a3" placeholder="Email">
                <span id="textinho"></span>
                <input type="password" id="senha" name="senha" class="form-field animation a4" placeholder="Senha">
                <span id="textinho1"></span>
                <input type="password" id="confsenha" name="confsenha" class="form-field animation a5" placeholder="Confirmar Senha">
                <span id="textinho2"></span>
                <br>
                <button class="animation a6" onclick="return conferirCad()">CADASTRAR-SE</button>
              </form>
            </div>
        </div>
</body>
<script src="js/Verificacao.js"></script>
</html>
