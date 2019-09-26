<%-- 
    Document   : NavBar
    Created on : 25/09/2019, 17:21:40
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://kit.fontawesome.com/7136158624.js" crossorigin="anonymous"></script>
        <style>
            *{margin:0; padding: 0;}
            /* ----- icons -------*/
                i{
                    padding-right: 8px;
                }

            /* Css da nav bar */
            .cabeça{
                width: 100%;
                height: 10.5%;
                background: rgb(255, 255, 255);
                font-family: sans-serif;
                font-size: 18px;
                box-shadow: 0px 0px 7px rgb(216, 215, 215);
                position: fixed;
                z-index: 2;
            }
            .divLogo{
                float: left;
                margin-left: 15px;  
                margin-top: -20px;  
            }
            .logo{
                width:200px;
                background-size: cover;
            }
            .first-nav{
                list-style: none;
                position: relative;
                float: right;
                z-index: 1;
            }
            .first-nav ul{
                list-style-type: none;
                position: relative;
            }
            .first-nav ul li {
                list-style: none;
                position: relative;
                width: 200px;
                float: right;
            }
            .first-nav a{
                padding-top: 15px;
                padding-bottom: 15px;
                display: block;
                text-decoration: none;
                text-align: center;
                color: #069;
                font-size: 16px;
                font-weight: bold;
            }
            .first-nav ul ul{
                position: absolute;
                visibility: hidden;
            }
            .first-nav ul ul li{
                float:none; 
            }
            #liUm{
                margin-top: 2px;
            }
            .first-nav ul ul li a{
                background-color: rgb(255, 255, 255);
                box-shadow: 0px 0px 2px rgb(216, 215, 215);
            }
            .first-nav ul li:hover ul{
                visibility: visible;
            }
            .first-nav a:hover{
                font-size: 15px;
            }
            .first-nav ul ul li a:hover{
                background-color: #f4f4f4;
            }
            .liNav{
                padding: 20.5px 0px 0px 0px;
            }
            label[for="bt-menu"]{
                padding-right: 15px;
                font-family: Arial;
                text-align: right;
                font-size: 24px;
                cursor: pointer;
                height: 50px;
                display: none;
            }
            #bt-menu{
                display: none;
            }
            @media(max-width: 1000px){
                label[for="bt-menu"]{
                    display: block;
                    margin-top: 15px;
                }
                #bt-menu:checked ~ .first-nav{
                    margin-right: 0; 
                }
                .first-nav{
                    margin-right: -100%;
                    transition: all .4s;
                    padding-top: 2px;
                }
                .first-nav ul li{
                    float: none;
                    background: #069;
                }
                .first-nav a{
                    color: white;
                    box-shadow: 0px 0px 1px rgb(216, 215, 215);
                }
                .first-nav ul ul li a{
                    background-color: rgb(255, 255, 255);
                    color: #069;
                }
                .first-nav ul ul{
                    position: static;
                    overflow: hidden;
                    max-height: 0;
                    transition: all .4s;
                    width: 100%;
                }
                .first-nav ul li:hover ul{
                    height: auto;
                    max-height: 200px;
                }
                .liNav{
                    padding: 0px 0px 0px 0px;
                }
                .divlogo{
                    margin-left: 30%;
                 }
                }
        </style>
    </head>
    <body>
         <header class="cabeça" id="cabeça">
         <div class="divLogo" ><img class="logo" src="img/softcar-blue.png" alt=""></div>
            <input type="checkbox" id="bt-menu">
            <label for="bt-menu">&#9776;</label>
            <nav class="first-nav">
                <ul>
                    <li class="liNav"><a><i class="fas fa-sign-in-alt"></i>Entrar</a></li>
                    <li class="liNav"><a><i class="fas fa-user-plus"></i>Cadastrar</a></li>
                    <li class="liNav"><a href="solicitarCarona.html"><i class="fas fa-search"></i>Solicitar Carona</a></li>
                    <li class="liNav"><a href="oferecerCarona.html"><i class="fas fa-plus-circle"></i>Oferecer Carona</a></li>
                </ul>
            </nav>
        </header>
    </body>
</html>
