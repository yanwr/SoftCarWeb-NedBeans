
<%@page import="model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <link href="Css/home.css" rel="stylesheet">
    <link rel="shortcut icon" href="img/softcar-blue-icon.png" type="image/x-png">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.11.2/css/all.css">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>SoftCar - Home</title>
</head>
<body>
    
        <%//menu
           Usuario user = new Usuario();
           user = (Usuario) session.getAttribute("usuario");
     
   
           if (user != null && user.isLogado()) {%>
               <%@include file="NavBarLogado.jsp"%>
         <%  } else {%>
               <%@include file="NavBar.jsp"%><%
           }
        %>

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

    <footer class="oneFooter">
        <div class="pDiv">
            <div class="container">
                <ul class="list" >
                    <h6 class="text">Feito por</h6>
                    <hr class="linha" style="width: 100px;">
                    <li class="item">
                        <a class="btn-item" href="linkedin.com/in/yan-weschenfelder-169475181"
                            title="Yan Weschenfelder"  style="background-color: blueviolet;">
                            <i class="fab fa-linkedin-in btn-i"> </i>
                        </a>
                    </li>
                    <li class="item">
                        <a class="btn-item" href="linkedin.com/in/gleice-gonçalves-844675178 "
                            title="Gleice Gonçalves" style="background-color: yellowgreen;">
                            <i class="fab fa-linkedin-in btn-i" > </i>
                        </a>
                    </li>
                    <li class="item">
                        <a class="btn-item" href="" title="Nicolas Ouriques"style="background-color: royalblue;">
                            <i class="fab fa-linkedin-in btn-i" > </i>
                        </a>
                    </li>
                </ul>
            </div>
            <div class="container dois">
                <ul class="list">
                    <h6 class="text">Contato</h6>
                    <hr class="linha" style="width: 100px;">
                    <li class="item">
                        <a href="" style="color: white; text-decoration: none;">
                            <p style="font-family: 'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif; font-size: 15px;">
                                www.softcarweb.suporte.com
                            </p>
                        </a>
                    </li>
                    <hr class=" linha" style="width: 100px; background-color: #263238; border-top: 0px solid;">
                </ul>
            </div>
            <div class="container">
                <ul class="list" >
                    <h6 class="text">Parceria</h6>
                    <hr class="linha" style="width: 100px;">
                    <li class="item">
                        <a>
                            <img src="https://www.softplan.com.br/wp-content/themes/softplan-2019/imagens/logo-softplan.svg">
                        </a>
                    </li>
                    <hr class=" linha" style="width: 100px; background-color: #263238; border-top: 0px solid;">
                    <li class="item">
                        <a>
                            <img src="https://www.sc.senai.br/cursos/images/logos/logo-rodape.png">
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="twoFooter">Copyright © SoftCarWeb</div>
    </footer>
</body>
</html>
