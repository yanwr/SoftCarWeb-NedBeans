<%-- 
    Document   : perfil
    Created on : 15/10/2019, 19:21:24
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="img/softcar-blue-icon.png" type="image/x-png">
        <link rel='stylesheet' type='text/css' media='screen' href='Css/perfil.css'>
        <title>SoftCar - Perfil</title>
        <script>
            
            function readURL(input) {
                var avatar = document.getElementById("avatar");
                
                if (input.files && input.files[0]) {
                    var reader = new FileReader();

                    reader.onload = function (e) {
                        avatar.src = e.target.result;
                    };

                    reader.readAsDataURL(input.files[0]);
                }
            }
            
            window.onload = function() {

            document.getElementById('container').onclick = function(event) {
              var p, input, text;

              // Pegando o evento
              event = event || window.event;

              // Get the root element of the event (handle MS difference)
              p = event.target || event.srcElement;

              // Se e um <P>
              if (p && p.tagName.toUpperCase() === "P") {
                // Esconder
                p.style.display = "none";

                // Pegando o texto
                text = p.innerHTML;

                // Criando o input
                input = document.createElement("input");
                input.type = "text";
                input.value = text;
                input.size = Math.max(text.length / 4 * 3, 4);
                p.parentNode.insertBefore(input, p);

                // Dar o foco, e quando clicar fora sumir
                input.focus();
                input.onblur = function() {
                  // Removendo o input
                  p.parentNode.removeChild(input);

                  // Update no texto
                  p.innerHTML = input.value;

                  // Mostrando o texto dnv
                  p.style.display = "";
                };
              }
            };
          };
            
            
            
        </script>
    </head>
    <body>
        
         <%@include file="NavBarLogado.jsp" %>
<!-- ----------- Perfil -------------- -->
    <div id="modal-wrapper" class="modal">
        <form class="modal-content animate" action="">
            <div class="imgcontainer">
                    
              <div class="avatar" ><img id="avatar" src="img/1.png"></div>
              <div id="btnEditImg" class="btnEditImg">
                  <label id="fotoUser" for="trocaFoto"><i class="fas fa-edit" style="color:coral;"></i></label>
                  <input type='file' id="trocaFoto" onchange="readURL(this);">
              </div>
             </div>
      
            <div id="container" class="container">
              <div class="dadosUser">
                  <h1 class="textosMain">SoftPlayer</h1>
                  <p id="nomeUser" class="textosSeg" name="nom">${sessionScope.usuario.nomeUser}</p>
              </div>
                <div id="btnEditUser" class="btns">
                    <a onclick=""><i class="fas fa-edit" style="color:coral;"></i></a>
              </div>
      
              <div class="dadosProf">
                  <h1 class="textosMain">Profissão</h1>
                  <p id="nomeProf" class="textosSeg">${sessionScope.usuario.profissao}</p>
              </div>
              <div id="btnEditProf" class="btns">
                      <a onclick=""><i class="fas fa-edit" style="color:coral;"></i></a>
              </div>
      
              <div class="dadosTempo">
                      <h1 class="textosMain">SoftPlayer desde:</h1>
                      <p id="nomeTempo" class="textosSeg">${sessionScope.usuario.tempoTrampo}</p>
              </div>
              <div id="btnEditTemp" class="btns">
                      <a onclick=""><i class="fas fa-edit" style="color:coral;"></i></a>
              </div>
      
              <div class="dadosCont">
                  <h1 class="textosMain">Contato</h1>
                  <p id="nomeCont" class="textosSeg">${sessionScope.usuario.telefone}</p>
              </div>
              <div id="btnEditCont" class="btns">
                 <a onclick=""><i class="fas fa-edit" style="color:coral;"></i></a>
              </div>
            </div>
        </form>
    </div>
    </body>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js">
</html>
