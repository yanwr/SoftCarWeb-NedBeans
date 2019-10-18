<%-- 
    Document   : login
    Created on : 24/09/2019, 14:31:20
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>SoftCar - Login</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='Css/login.css'>
    <link rel="shortcut icon" href="img/softcar-blue-icon.png" type="image/x-png">
</head>
<body>
        <div class="container">
            <div class="leftlog" id="login">
              <div class="header">
                <h2 class="animation a1">Bem Vindo ao SoftCar</h2>
                <h4 class="animation a2">Logue na sua conta usando e-mail e senha</h4>
              </div>
              <form class="form" action="Login" method="post" >
                <input type="text" id="Login" name="login" class="form-field animation a3" placeholder="Email">
                <span id="erroLogin"></span>
                <input type="password" id="senha" name="senhaLogin" class="form-field animation a4" placeholder="Senha">
                <span id="erroSenha"></span>
                <p class="animation a5"><a href="#">Esqueceu a senha</a></p>
                <input type="submit" class="btnEnviar animation a6" name="ENVIAR" value="LOGAR"> 
              </form>
            </div>
          <div class="right"></div>
        </div>
</body>
<script src="js/Verificacao.js"></script>

</html>