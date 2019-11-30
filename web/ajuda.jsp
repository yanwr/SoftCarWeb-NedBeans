<%-- 
    Document   : ajuda
    Created on : 29/11/2019, 23:54:59
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="Css/ajuda.css" rel="stylesheet">
          <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.11.2/css/all.css">
            <link rel="shortcut icon" href="img/softcar-blue-icon.png" type="image/x-png">
        <title>SoftCar - Ajuda</title>
    </head>
    <body>
         
   
      <%@include file="NavBarLogado.jsp" %>

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
<!--    <section>
        <div class="maps">
           <div><img src="img/maps2.png" width="100%"></div>
        </div>
    </section>-->

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
    
    <section class="second-section">
        <table class="tituloDois">
            <tr>
                <th>Como ver/atualizar Perfil</th>
            </tr>
        </table>
    </section>
    <section class="forth-section">
        <table class="tabela1">
            <tr class="titulo">
                <th>1° Passo</th>
            </tr>
            <tr>
                <td>Passe o mouse por cima do seu nome na navbar. Depois clique em "Perfil". Seus dados iram estar disponíveis nessa página.</td>
            </tr>
        </table>
        <table class="tabela2">
            <tr class="titulo">
                <th>2° Passo</th> 
            </tr>
            <tr>
                <td>Se não estiverem, basta clicar nos icones de editar ao lado esquerdo da tela de perfil e ir adicionando cada campo com suas devidas informações.</td>
            </tr>
        </table>
        <table class="tabela3">
            <tr class="titulo">
                <th>3° Passo</th>
            </tr>
            <tr>
                <td>E pronto ! Agora seus dados podem ser visto por todos usuários !</td>
            </tr>    
        </table>
    </section>
    <%@include file="rodape.jsp" %>
    </body>
</html>
