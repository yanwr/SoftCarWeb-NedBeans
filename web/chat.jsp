
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
                <li class="contato" id="contato">
                    <div class="userPerfil"><!-- Perfil --></div>
                    <div class="nome" id="nome">
                        Yan Weschenfelder
                    </div>
                </li>
                <li class="contato" id="contato">
                    <div class="userPerfil"></div>
                    <div class="nome" id="nome">
                        Nicolas Ouriques
                    </div>
                </li>
                <li class="contato" id="contato">
                    <div class="userPerfil"></div>
                    <div class="nome" id="nome">
                        Max Junior
                    </div>
                </li>
                <li class="contato" id="contato">
                    <div class="userPerfil"></div>
                    <div class="nome" id="nome">
                        Amanda Top
                    </div>
                </li>
                <li class="contato" id="contato">
                    <div class="userPerfil"></div>
                    <div class="nome" id="nome">
                        Luana Top Tambem
                    </div>
                </li>   
                <li class="contato" id="contato">
                    <div class="userPerfil"><!-- Perfil --></div>
                    <div class="nome" id="nome">
                        Yan Weschenfelder
                    </div>
                </li>
                <li class="contato" id="contato">
                    <div class="userPerfil"></div>
                    <div class="nome" id="nome">
                        Nicolas Ouriques
                    </div>
                </li>
                <li class="contato" id="contato">
                    <div class="userPerfil"></div>
                    <div class="nome" id="nome">
                        Max Junior
                    </div>
                </li>
                <li class="contato" id="contato">
                    <div class="userPerfil"></div>
                    <div class="nome" id="nome">
                        Amanda Top
                    </div>
                </li>
                <li class="contato" id="contato">
                    <div class="userPerfil"></div>
                    <div class="nome" id="nome">
                        Luana Top Tambem
                    </div>
                </li> 
                <li class="contato" id="contato">
                    <div class="userPerfil"><!-- Perfil --></div>
                    <div class="nome" id="nome">
                        Yan Weschenfelder
                    </div>
                </li>
                <li class="contato" id="contato">
                    <div class="userPerfil"></div>
                    <div class="nome" id="nome">
                        Nicolas Ouriques
                    </div>
                </li>
                <li class="contato" id="contato">
                    <div class="userPerfil"></div>
                    <div class="nome" id="nome">
                        Max Junior
                    </div>
                </li>
                <li class="contato" id="contato">
                    <div class="userPerfil"></div>
                    <div class="nome" id="nome">
                        Amanda Top
                    </div>
                </li>
                <li class="contato" id="contato">
                    <div class="userPerfil"></div>
                    <div class="nome" id="nome">
                        Luana Top Tambem
                    </div>
                </li>     
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
                        <li class="batePapoLeft">
                            <div class="mensagemDele"><!-- Float left -->
                                Oi tudo bem  asdahiasydfasdfyuasd fyasdgfasduyf asdyfgauisd yasbnn dijoa udauis jknkasd ydgasd jiasd kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk? 
                            </div>
                        </li>
                        <li class="batePapoRight">
                            <div class="mensagemMinha"><!-- Float right -->
                                Sim, Sr, estou otimo d
                            </div>
                        </li>
                        <li class="batePapoLeft">
                            <div class="mensagemDele"><!-- Float left -->
                                Oi tudo bem ? 
                            </div>
                        </li>
                        <li class="batePapoRight">
                            <div class="mensagemMinha"><!-- Float right -->
                                Sim, Sr, estou otimo ! 
                            </div>
                        </li>
                        <li class="batePapoRight">
                            <div class="mensagemMinha"><!-- Float right -->
                                Sim, Sr, estou otimo ! 
                            </div>
                        </li>
                        <li class="batePapoRight">
                            <div class="mensagemMinha"><!-- Float right -->
                                Sim, Sr, estou otimo, top né, weschenfelder Rodrigues, lalallala, asdauisdas
                                    
                            </div>
                        </li>
                    </ul>
                </div>
                <!-- parte para escrever a mensagem -->
                <form class="areaSendMensagem">
                    <textarea name="textArea" id="textArea"  placeholder="Escreva a Mensagem: "></textarea>
                    <!-- Colocar algum icon para arquivos -->
                    <input type="submit" name="ENVIAR" value="ENVIAR" class="btnSend"/>
                </from>
            </div>      
    </div>
</body>
</html>
