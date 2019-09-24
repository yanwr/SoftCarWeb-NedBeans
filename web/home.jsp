
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <link href="Css/home.css" rel="stylesheet">
    <link rel="shortcut icon" href="img/softcar-blue-icon.png" type="image/x-png">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Softcar</title>
</head>
<body>
    
    <header class="cabeça" id="cabeça">
            <input type="checkbox" id="bt-menu">
            <label for="bt-menu">&#9776;</label>
            <nav class="first-nav">
                <ul>
                    <li class="liNav"><a href="login.html">Entrar</a></li>
                    <li class="liNav"><a href="cadastro.html" class="li-nav">Cadastrar</a></li>
                    <li class="liNav"><a href="solicitarCarona.html" class="li-nav">Solicitar Carona</a></li>
                    <li class="liNav"><a href="oferecerCarona.html" class="">Oferecer Carona</a></li>
                </ul>
            </nav>
           <!-- <div class="divLogo">
                <img id="logo" src="img/softcar-blue.png" href="home.html">
            </div> -->
    </header>

    <!-- Banners aparecendo -->
    <section class="first-section" id="first-section">
        <div class="first-divOne">
            <div class="slider"><img src="img/banner1.jpg" width="100%"></div>
            <div class="slider"><img src="img/banner2.jpg" width="100%"></div>
            <div class="slider"><img src="img/banner3.jpg" width="100%"></div>
            <div class="slider"><img src="img/banner4.jpg" width="100%"></div>
        </div>
    </section> 

    <section class="mostrarMais">
        <a  href="#second" class="a-mostrarMais">Veja como usar</a>
    </section>

    <!-- parte de como usar para motoristas -->
    <section class="second-section" id="second">
        <table class="tituloUm">
            <tr>
                <th>Oferecer Carona</th>
            </tr>
        </table>
    </section>
    <section class="trird-section">
            <table class="tabela1">
                <tr class="titulo">
                    <th>1° Passo</th>
                </tr>
                <tr>
                    <td>Click em "Oferecer Carona", na parte superior do site assim você será direcionado para próxima página.</td>
                </tr>
            </table>
            <table class="tabela2">
                <tr class="titulo">
                    <th>2° Passo</th> 
                </tr>
                <tr>
                    <td>Nesta página você irá informar o seu local atual, data, hora, acentos disponivéis,sendo de sua prefêrencia adicionar uma taxa em dinheiro ou não.</td>
                </tr>
            </table>
            <table class="tabela3">
                <tr class="titulo">
                    <th>3° Passo</th>
                </tr>
                <tr>
                    <td>Pronto!Sua carona está no mural. Quando o passageiro fizer o pedido da carona chegará uma mensagem pelo chat do próprio site para o caronista.</td>
                </tr>    
            </table>
    </section>
    <section>
        <div class="maps">
           <div><img src="img/maps2.png" width="100%"></div>
        </div>
    </section>

    <!-- parte de como usar para passageiros -->
    <section class="second-section">
        <table class="tituloDois">
            <tr>
                <th>Solicitar Carona</th>
            </tr>
        </table>
    </section>
    <section class="forth-section">
        <table class="tabela1">
            <tr class="titulo">
                <th>1° Passo</th>
            </tr>
            <tr>
                <td>Click em "Solicitar Carona", na parte superior do site assim ocê será direcionado
                        para próxima página. Nesta página você irá informar o seu local atual e para onde deseja ir.</td>
            </tr>
        </table>
        <table class="tabela2">
            <tr class="titulo">
                <th>2° Passo</th> 
            </tr>
            <tr>
                <td>Agora aparecerá um mural de horários do local onde você está para onde deseja ir,
                        seja ao trabalho ou para casa. Logo após confirmar a solicitação será direcionado para 
                        o bate-papo com o motorista, para marcar o local de encontro</td>
            </tr>
        </table>
        <table class="tabela3">
            <tr class="titulo">
                <th>3° Passo</th>
            </tr>
            <tr>
                <td>E pronto ! Só aguardar o horário da corrida.
                        Lembre-se que o motorista pode cobrar uma taxa pela viajem !</td>
            </tr>    
        </table>
    </section>

    <footer class="finish">
       <!--  <div class="finish-first">   
            <div class="finish-first-divImg1">
               <img src="img/softcar-white.png" style="width:200px; height: 100px;">
            </div>
            <div class="finish-first-divImg2">
                    <img src="img/softcar-white.png" style="width:200px; height: 100px;">
            </div>
            <div class="finish-first-divImg3">
                    <img src="img/logo-senai.fw_.png" style="width:200px; height: 80px;">
            </div>
        </div> -->
        <div class="finish-second">
            <ul>
                <li id="li1">Softcar</li>
                <li>Feito por: Nicolas, Gleice e Yan W.r</li>
            </ul>
        </div>
    </footer>
</body>
</html>
