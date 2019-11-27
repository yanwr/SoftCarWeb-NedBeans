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
        <script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.js"></script>
        <script type="text/javascript" src="js/atualizarDados.js"></script>
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
            
            function atualizar(Campo){
              var p, input, text;
              
              if(Campo == 'nome'){
                  p = document.getElementById('nome');
              }else if(Campo == 'prof'){
                  p = document.getElementById('prof');
              }else if(Campo == 'desde'){
                  p = document.getElementById('desde');
              }else if(Campo == 'contato'){
                  p = document.getElementById('contato');
              }
              
              text = p.innerHTML;
              
              p.style.display = 'none';
              
              input = document.createElement('input');
              input.type = 'text';
              input.value = text;
              input.id = 'input';
              input.size = Math.max(text.length / 4 * 3, 4);
              p.parentNode.insertBefore(input, p);
              
              var enter = document.getElementById('input');
                enter.onkeyup = function(e){
                    if(e.keyCode == 13){
                        // Removendo o input
                        p.parentNode.removeChild(input);

                        // Update no texto
                        p.innerHTML = input.value;
                        
                        // Mostrando o texto dnv
                        p.style.display = "";
                    }   
                }
                input.onblur = function() {
                  // Removendo o input
                  p.parentNode.removeChild(input);

                  // Update no texto
                  p.innerHTML = input.value;

                  // Mostrando o texto dnv
                  p.style.display = "";
                };
            }
            
            window.onload = function() {

            document.getElementById('container').onclick = function(event) {
              var p, input, text;

              // Pegando o evento
              event = event || window.event;

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
                input.id = 'input';
                input.size = Math.max(text.length / 3 * 3, 4);
                p.parentNode.insertBefore(input, p);

                // Dar o foco, e quando clicar fora sumir
                input.focus();
                
                var enter = document.getElementById('input');
                enter.onkeyup = function(e){
                    if(e.keyCode == 13){
                        // Removendo o input
                        p.parentNode.removeChild(input);

                        // Update no texto
                        p.innerHTML = input.value;
                        
                        // Mostrando o texto dnv
                        p.style.display = "";     
                    }   
                }
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
        <div class="modal-content animate">
            <div class="imgcontainer">
                    
              <div class="avatar" ><img id="avatar" src="img/1.png"></div>
              <div id="btnEditImg" class="btnEditImg">
                  <label id="fotoUser" for="trocaFoto"><i class="fas fa-edit" style="color:coral;"></i></label>
                  <input type='file' name="file" id="trocaFoto" onchange="readURL(this);">
              </div>
             </div>
      
            <div id="container" class="container">
              <div class="dadosUser">
                  <input type="hidden" id="id" value="${sessionScope.usuario.id}">
                  <h1 class="textosMain">SoftPlayer</h1>
                  <p class="textosSeg" id="nome">${sessionScope.usuario.nomeUser}</p>
              </div>
                <div id="btnEditUser" class="btns">
                    <button class="btnIcon" value="nome" onclick="atualizar('nome')"><i class="fas fa-edit" style="color:coral;"></i></button>
              </div>
      
              <div class="dadosProf">
                  <h1 class="textosMain">Profissão</h1>
                  <p class="textosSeg" id="prof">${sessionScope.usuario.profissao}</p>
              </div>
              <div id="btnEditProf" class="btns">
                      <button class="btnIcon" onclick="atualizar('prof')"><i class="fas fa-edit" style="color:coral;"></i></button>
              </div>
      
              <div class="dadosTempo">
                      <h1 class="textosMain">SoftPlayer desde</h1>
                      <p class="textosSeg" id="desde">${sessionScope.usuario.tempoTrampo}</p>
              </div>
              <div id="btnEditTemp" class="btns">
                      <button class="btnIcon" onclick="atualizar('desde')"><i class="fas fa-edit" style="color:coral;"></i></button>
              </div>
      
              <div class="dadosCont">
                  <h1 class="textosMain">Contato</h1>
                  <p class="textosSeg" id="contato">${sessionScope.usuario.telefone}</p>
              </div>
              <div id="btnEditCont" class="btns">
                 <button class="btnIcon" onclick="atualizar('contato')"><i class="fas fa-edit" style="color:coral;"></i></button>
              </div>
              <input type="submit" id="btnA" name="ENVIAR" value="Atualizar"  onclick="comecar()"/>
            </div>
        </div>
   
    </div>
    </body>
<!--   <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>-->
</html>
