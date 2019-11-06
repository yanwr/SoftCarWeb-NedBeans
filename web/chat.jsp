
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
            <ul class="lista">
                <a href="">
                    <li class="contato" id="contato">
                        <div class="userPerfil"><!-- Perfil --></div>
                        <div class="nome" id="nome">
                            Yan Weschenfelder
                        </div>
                    </li>
                </a>
                <%
                    List<Usuario> listCont = new ArrayList();
                    listCont = (List) request.getAttribute("contatos");
                    
                    for(Usuario u : listCont){
                        out.println("<a href='Mensagem?ENVIAR=MENSAGEM&Cod="+u.getId()+"'>");
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
                <div class="chatPapo">
                   <ul>
                       <%
                       // pegar cod do user que esta logado  
                        Usuario user = new Usuario();
                        user = (Usuario) session.getAttribute("usuario");
                       //
                       List<DadosBatePapo> msg = new ArrayList();
                       msg = (List) request.getAttribute("msg");
                     if(msg != null && !msg.isEmpty() ){  
                       for(DadosBatePapo w : msg){
                           if(w.getUserQueEnviou() == user.getId() ){
                               out.println("<li class='batePapoRight'>");
                                out.println("<div class='mensagemMinha'>");
                                 out.println(""+w.getMsg()+"");
                                out.println("</div>");
                               out.println("</li>");
                           }else{
                               out.println("<li class='batePapoLeft'>");
                                out.println("<div class='mensagemDele'>");
                                 out.println(""+w.getMsg()+"");
                                out.println("</div>");
                               out.println("</li>");
                           }
                       }
                     }else{
                         out.println("<li class='batePapoRight'>");
                            out.println("<div class='mensagemMinha'>");
                                 out.println("Não há mensagens");
                            out.println("</div>");
                         out.println("</li>");
                     }
                         %>
                    </ul>
                </div>
                <!-- parte para escrever a mensagem -->
                <form action="Mensagem" method="post" class="areaSendMensagem">
                    <textarea name="textArea" id="textArea"  placeholder="Escreva a Mensagem: "></textarea>
                    <!-- Colocar algum icon para arquivos -->
                    <input type="submit" class="btnSend" name="ENVIAR" value="ENVIAR" />
                </from>
            </div>      
    </div>
</body>
</html>
