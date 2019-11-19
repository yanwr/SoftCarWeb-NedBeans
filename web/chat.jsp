
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
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.js"></script>
    <script type="text/javascript" src="js/pegarMsg.js"></script>
</head>
<body>
    <%@include file="NavBarLogado.jsp" %>
    <div class="container">
        <div class="containerDeContatos" id="containerDeContatos">
            <div class="procurarContatos" id="procurarContatos">
                <input type="text" class="barraProcura" id="barraProcura" placeholder="Procurar">
                <!--Icon de procura -->
            </div>
            <ul class="lista">
                <%
                    List<Usuario> listCont = new ArrayList();
                    listCont = (List) request.getAttribute("contatos");
                    
                    for(Usuario u : listCont){
                        out.println("<a href='Mensagem?ENVIAR=MENSAGEM&Cod="+u.getId()+"' style='text-decoration: none;'>");
                            out.println("<li class='contato' id='contato' >");
                                out.println("<div class='userPerfil'>");
                                    out.println(""+u.getFotoPerfil()+"");
                                out.println("</div>");
      
                                out.println("<div class='nome' id='nome'>");
                                    out.println(""+u.getNomeUser()+"");
                                out.println("</div>");
                            out.println("</li>");
                        out.println("</a>");
                    }
                %>
                
            </ul>
        </div>

        <div class="containerPrincipal">
                <div class="chatHeader">
                    <div class="headerConf">
                        <div class="imgUser"></div>
                        <div class="chatCom">
                            <p id="pChatCom">Yan Weschenfelder</p>    
                        </div>
                    </div>
                </div>
            
            
                <!-- Mensagens do chat -->
                <div class="chatPapo" id="chatPapo">
                  
                </div>
                
                
                <!-- parte para escrever a mensagem -->
                <form action="Mensagem" method="post" class="areaSendMensagem" id="form1"> 
                    <textarea type="text" name="textArea" id="textArea"  placeholder="Escreva a Mensagem: "></textarea>
                    <!-- Colocar algum icon para arquivos -->
                    <input type="submit" class="btnSend" name="ENVIAR" value="ENVIAR" id="enviar"/>
                </from>
            </div>      
    </div>
</body>
</html>
