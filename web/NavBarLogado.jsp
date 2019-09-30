<%-- 
    Document   : NavBarLogado
    Created on : 25/09/2019, 14:48:03
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://kit.fontawesome.com/7136158624.js" crossorigin="anonymous"></script>
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
            /* --------------- Perfil -----------------*/
            .s {
                background-color: #4CAF50;
                color: white;
                padding: 14px 20px;
                margin: 10px 10px 0px 0px;
                border: none;
                cursor: pointer;
                width: 10%;
                font-size:20px;
            }
            .btns{
                margin: 0px 0px 0px 60%; 
                margin-top: -20px; 
            }
            .btnEditImg{
                margin: 0px 0px 0px 25%; 
                margin-top: -20px; 

            }
            .dadosUser, .dadosProf, .dadosTempo, .dadosCont{
                margin-top: 10px;
            }
            .textosMain{

                font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;
                font-size: 25px;
                color: coral;
            }
            .textosSeg{

                font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;
                font-size: 20px;
                color: #069;
                margin-top: 10px;
            }
            .imgcontainer {
                text-align: center;
                margin: 24px 0 12px 0;
                position: relative;
            }
            #trocaFoto{
                display: none;
            }
            #fotoUser[for="trocaFoto"]{
                display: block;
            }
            .avatar {
                background-size: cover;
                margin-top: -70px;
                margin-left: 42%;
                width: 100px;
                height:100px;
                border-radius: 50%;
            }
            .modal {
                margin-top: 70px;
                text-align: center;
                display:none;
                position: fixed;
                z-index: 1;
                left: 0;
                top: 0;
                width: 100%;
                min-width: 200px;
                overflow: auto;
                background-color: rgba(0,0,0,0.4);
            }
            .modal-content {
                background-color: #fefefe;
                margin: 4% auto 15% auto;
                border: 1px solid #888;
                width: 40%; 
                min-width: 200px;
                padding-bottom: 30px;
            }
            .close {
                position: absolute;
                right: 8px;
                margin-top: 40px;
                color: #000;
                font-size: 35px;
                font-weight: bold;
            }
            .close:hover,.close:focus {
                color: red;
                cursor: pointer;
            }
            .animate {
                animation: zoom 0.6s
            }
            @keyframes zoom {
                from {transform: scale(0)} 
                to {transform: scale(1)}
            }

            @media(max-width: 1200px){
                .avatar{
                    margin-left: 40%;
                }
                .btns{
                    margin: 0px 0px 0px 60%; 
                    margin-top: -20px; 
                }
                .btnEditImg{
                    margin: 0px 0px 0px 30%; 
                    margin-top: -20px; 
                }
            }

            @media(max-width: 820px){
                .avatar{
                    margin-left: 35%;
                }
                .btns{
                    margin: 0px 0px 0px 0%; 
                    margin-top: 10px; 
                }
                .btnEditImg{
                    margin: 0px 0px 0px 40%; 
                    margin-top: -20px; 
                }
            }

            @media(max-width: 730px){
                .avatar{
                    margin-left: 30%;
                }
                .btns{
                    margin: 0px 0px 0px 0%; 
                    margin-top: 10px; 
                }
                .btnEditImg{
                    margin: 0px 0px 0px 40%; 
                    margin-top: -20px; 
                }
            }

            @media(max-width: 600px){
                .avatar{
                    margin-left: 25%;
                }
                .btns{
                    margin: 0px 0px 0px 0%; 
                    margin-top: 10px; 
                }
                .btnEditImg{
                    margin: 0px 0px 0px 40%; 
                    margin-top: -20px; 
                }
            }


            @media(max-width: 485px){
                .avatar{
                    margin-left: 20%;
                }
                .btns{
                    margin: 0px 0px 0px 0%; 
                    margin-top: 10px; 
                }
                .btnEditImg{
                    margin: 0px 0px 0px 50%; 
                    margin-top: -20px; 
                }
            }
        </style>
        <script>
            function lala(){
                alert("Dasdasd");
            }
            </script>
    </head>
    <body>
     <!-- --------------- NavBarLOgado ---------- -->
    <header class="cabeça" id="cabeça">
            <div class="divLogo" ><img class="logo" src="img/softcar-blue.png" alt=""></div>
            <input type="checkbox" id="bt-menu">
            <label for="bt-menu">&#9776;</label>
            
            <nav class="first-nav">
                <ul>
                    <li class="liNav"><a class="aNav" id="aNavUm" >Nome do User<i class="fas fa-angle-double-down" style="padding-left: 8px;"></i></a>
                        <ul class="ulPerfil">
                            <li>
                                <a class="AMaior" href="#">
                                    <div class="ImgPerfil" style="background-image: url(img/1.png)"></div>
                                    <h3 class="nameUser">Joao Victor da Silva Rodrigues</h3>
                                </a>
                            </li>
                            <li><a href="homeDepoisDeLogar.jsp" id="liUm" class="aMenu"><i class="fas fa-home"></i>Home</a></li>
                            <li><a class="aMenu" onclick="document.getElementById('modal-wrapper').style.display='block'" ><i class="fas fa-user-cog"></i>Perfil</a></li>
                            <li><a href="chat.jsp" class="aMenu" ><i class="far fa-comment-dots"></i>Chat</a></li>
                            <li><a href="#" class="aMenu" ><i class="fas fa-power-off"></i>Sair</a></li>
                        </ul>
                    </li>
                    
                    <li class="liNav"><a href="solicitarCarona.jsp" class="aNav"><i class="fas fa-search"></i>Solicitar Carona</a></li>
                    <li class="liNav"><a href="oferecerCarona.jsp" class="aNav"><i class="fas fa-plus-circle"></i>Oferecer Carona</a></li>
                </ul>
            </nav>
    </header>

<!-- ----------- Perfil -------------- -->
    <div id="modal-wrapper" class="modal">
        <form class="modal-content animate" action="/action_page.php">
            <div class="imgcontainer">
              <span onclick="document.getElementById('modal-wrapper').style.display='none'" class="close" title="Close PopUp">&times;</span>
              <div  class="avatar" id="" style="background-image: url(img/1.png)"></div>
              <div id="btnEditImg" class="btnEditImg">
                  <label id="fotoUser" for="trocaFoto"><i class="fas fa-edit" style="color:coral;"></i></label>
                  <input type="file" id="trocaFoto">
              </div>
             </div>
      
            <div class="container">
              <div class="dadosUser">
                  <h1 class="textosMain">SoftPlayer</h1>
                  <p id="nomeUser" class="textosSeg">Yan Weschenfelder</p>
              </div>
                <div id="btnEditUser" class="btns">
                    <a onclick="lala()"><i class="fas fa-edit" style="color:coral;"></i></a>
              </div>
      
              <div class="dadosProf">
                  <h1 class="textosMain">Profissão</h1>
                  <p id="nomeProf" class="textosSeg">Programador</p>
              </div>
              <div id="btnEditProf" class="btns">
                      <a onclick="lala()"><i class="fas fa-edit" style="color:coral;"></i></a>
              </div>
      
              <div class="dadosTempo">
                      <h1 class="textosMain">Tempo na SoftPlan</h1>
                      <p id="nomeTempo" class="textosSeg">2 anos</p>
              </div>
              <div id="btnEditTemp" class="btns">
                      <a onclick="lala()"><i class="fas fa-edit" style="color:coral;"></i></a>
              </div>
      
              <div class="dadosCont">
                  <h1 class="textosMain">Contato</h1>
                  <p id="nomeCont" class="textosSeg">(48)996894386</p>
              </div>
              <div id="btnEditCont" class="btns">
                 <a onclick="lala()"><i class="fas fa-edit" style="color:coral;"></i></a>
              </div>
            </div>
        </form>
    </div>
      
    </body>
</html>
