<%-- 
    Document   : NavBarLogado
    Created on : 25/09/2019, 14:48:03
    Author     : Aluno
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="DB.connectionDB"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
        <style>
            *{
                margin: 0;
                padding: 0;
            }
            /* icons */
            i{
                padding-right: 8px;
            }
            /* Css da nav bar */
            .cabeça{
                width: 100%;
                height: 10.5%;
                background: rgb(255, 255, 255);
                font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;
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
                margin-top:-3px;
            }
            .first-nav ul li {
                list-style: none;
                position: relative;
                width: 280px;
                float: right;
                text-align: right;
            }

            .first-nav ul ul{
                position: absolute;
                visibility: hidden;
            }
            .first-nav ul ul li{
                border-bottom: solid 1px rgb(202, 202, 202);
                float:none; 
            }
            .aNav{
                border: none;
                text-decoration: none;
                color: #069;
                text-align: center;
            }
            #aNavUm{
                padding-right: 20px;
            }
            .AMaior{
                padding-left: 35px;
                padding-bottom: 10px;
                display: block;
            }
            .nameUser{
                display: inline-block;
                vertical-align: middle;
                margin: 0;
                color:#069;
                font-weight: normal;
                line-height: normal;
                font-size: 16px;
                padding-left:20px;
                margin-top: -75px;
            }
            .aMenu{
                padding: 12px;
                display: block;
                text-decoration: none;
                text-align: left;
                color: #069;
                font-size: 15px;
            }
            .first-nav ul li:hover ul{
                transition: all .4s;
                visibility: visible;
            }
            .first-nav ul ul li a{
                border-left: solid 1px rgb(202, 202, 202);
                background-color:#f9f9f9;
            }
            .first-nav ul ul li a:hover{
                background-color: #f1f0f0;
            }
            .first-nav ul li ul{
                margin-top: 18.4px;
            }
            .liNav{
                margin-top:30px;
                padding-bottom: 20px;
            }
            .ImgPerfil {
                width: 50px;
                height: 50px;
                display: inline-block;
                vertical-align: middle;
                border-radius:50%;
                background-size: cover;
                margin-left: -30px;
                margin-top: 20px;
                float: left;
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
            @media(max-width: 1200px){
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
                    padding-top: 0px;
                    margin-top: 3px;
                }
                .first-nav ul li{
                    text-align: center;
                    float: none;
                    background: white;
                }
                #aNavUm{
                    padding-right: 0px;
                }
                .aNav{
                    color:coral;
                    font-weight: normal;
                    line-height: normal;
                    padding: 0px;
                }
                .first-nav ul ul li a{
                    background-color: #f9f9f9;
                    border: solid 1px rgb(217, 237, 247);
                    color: #069;
                }
                .first-nav ul ul{
                    padding: 0px;
                    position: static;
                    overflow: hidden;
                    max-height: 0;
                    transition: all .4s;
                    width: 100%;
                }
                .first-nav ul li:hover ul{
                    visibility: visible;
                    height: auto;
                    max-height: 500px;
                }
                .liNav{
                    padding-top: 10px;
                    padding-bottom: 10px;
                    margin-top: 0px;
                    border-top: solid 1px rgb(217, 237, 247);
                }
                .divlogo{
                    margin-left: 30%;
                 }
            }
            @media(max-width: 511px){
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
                    padding-top: 0px;
                    margin-top: -33px;
                }
                .first-nav ul li{
                    text-align: center;
                    float: none;
                    background: white;
                }
                #aNavUm{
                    padding-right: 0px;
                }
                .aNav{
                    color:coral;
                    font-weight: normal;
                    line-height: normal;
                    padding: 0px;
                }
                .first-nav ul ul li a{
                    background-color: #f9f9f9;
                    border: solid 1px rgb(217, 237, 247);
                    color: #069;
                }
                .first-nav ul ul{
                    padding: 0px;
                    position: static;
                    overflow: hidden;
                    max-height: 0;
                    transition: all .4s;
                    width: 100%;
                }
                .first-nav ul li:hover ul{
                    visibility: visible;
                    height: auto;
                    max-height: 500px;
                }
                .liNav{
                    padding-top: 10px;
                    padding-bottom: 10px;
                    margin-top: 0px;
                    border-top: solid 1px rgb(217, 237, 247);
                }
                .divlogo{
                    margin-left: 30%;
                 }
            }
            
        </style>

    </head>
    <body>
        
      
     <!-- --------------- NavBarLOgado ---------- -->
    <header class="cabeça" id="cabeça">
        <div class="divLogo" ><a href="homeDepoisDeLogar.jsp"><img class="logo" src="img/softcar-blue.png" alt=""></a></div>
            <input type="checkbox" id="bt-menu">
            <label for="bt-menu">&#9776;</label>
            
            <nav class="first-nav">
                <ul>       
                    <li class="liNav"><a class="aNav" id="aNavUm" >${sessionScope.usuario.nomeUser}<i class="fas fa-angle-double-down" style="padding-left: 8px;"></i></a>
                        <ul class="ulPerfil">
                            <li><a href="homeDepoisDeLogar.jsp" id="liUm" class="aMenu"><i class="fas fa-home"></i>Home</a></li>
                            <li><a href="perfil.jsp" class="aMenu"><i class="fas fa-user-cog"></i>Perfil</a></li>
                            <li><a href="chat.jsp" class="aMenu" ><i class="far fa-comment-dots"></i>Chat</a></li>
                            <li><a href="#" class="aMenu" ><i class="fas fa-question-circle"></i></i>Ajuda</a></li>
                            <li><a href="#" class="aMenu" ><i class="fas fa-power-off"></i>Sair</a></li>
                        </ul>
                    </li>
                    
                    <li class="liNav"><a href="solicitarCarona.jsp" class="aNav"><i class="fas fa-search"></i>Solicitar Carona</a></li>
                    <li class="liNav"><a href="oferecerCarona.jsp" class="aNav"><i class="fas fa-plus-circle"></i>Oferecer Carona</a></li>
                </ul>
            </nav>
    </header>

    </body>
     <script src="https://kit.fontawesome.com/7136158624.js" crossorigin="anonymous"></script>
</html>
