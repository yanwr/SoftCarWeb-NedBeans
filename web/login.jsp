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
                <h2 class="animation a1">Bem Vindo</h2>
                <h4 class="animation a2">Logue na sua conta usando e-mail e senha</h4>
              </div>
              <div class="form">
                <input type="email" id="login"class="form-field animation a3" placeholder="Email">
                <input type="password" id="senha" class="form-field animation a4" placeholder="Senha">
                <p class="animation a5"><a href="#">Esqueceu a senha</a></p>
                <button class="animation a6" onclick="lala();">LOGIN</button> 
              </div>
            </div>
          <div class="right"></div>
        </div>
</body>
</html>