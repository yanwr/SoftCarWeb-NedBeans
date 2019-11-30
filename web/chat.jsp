
<%@page import="model.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="model.DadosBatePapo"%>
<%-- 
    Document   : chat
    Created on : 24/09/2019, 14:28:20
    Author     : Aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="Css/chat.css" rel="stylesheet">
    <link rel="shortcut icon" href="img/softcar-blue-icon.png" type="image/x-png">
    <title>SoftCar - Chat</title>
    
</head>
<body>
    <%@include file="NavBarLogado.jsp" %>
    <div class="container">
        <div class="containerDeContatos" id="containerDeContatos">
            <div class="procurarContatos" id="procurarContatos">
                <input type="text" class="barraProcura" id="barraProcura" placeholder="Procurar">
                <!--Icon de procura -->
            </div>
            <ul id ="ulCtt" class="lista">
                
                
            </ul>
        </div>

        <div class="containerPrincipal">
                <div class="chatHeader">
                    <div class="headerConf">
                        <%
                            List<Usuario> list = new ArrayList();
                            list = (List) request.getAttribute("contatos");
                            int codUser = (int) session.getAttribute("codUser");
                            
                            for(Usuario w : list){
                                if(w.getId() == codUser){
                                     out.println("<div class='imgUser' style='background-image:url(img/"+w.getFotoPerfil()+");'></div>");
                                    out.println("<div class='chatCom'>");
                                        out.println("<p class='pChatCom'>"+w.getNomeUser()+"</p>");
                                    out.println("</div>");
                                }
                            }
                        %>
                    </div>
                </div>
            
            
                <!-- Mensagens do chat -->
                <div class="chatPapo" id="chatPapo">
                   
                </div>
                
                
                <!-- parte para escrever a mensagem -->
                <div class="areaSendMensagem" id="form1"> 
                    <textarea type="text" name="textArea" id="textArea"  placeholder="Escreva a Mensagem: "></textarea>
                    <!-- Colocar algum icon para arquivos -->
                    <input type="button" class="btnSend" onclick="enviarMsg()" name="ENVIAR" value="ENVIAR" id="enviar"/>
                </div>
            </div>      
    </div>
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.js"></script>
    <script type="text/javascript" src="js/pegarMsg.js"></script>
</body>
</html>
