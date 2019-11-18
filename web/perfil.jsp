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
            
            function atualizarDados(){
                var nome=$('#nome').text();
                var prof=$('#prof').text();
                var desde=$('#desde').text();
                var contato=$('#contato').text();
                var id =$('#id').val();

                var jsonDataObject=new Object();
                jsonDataObject.nomeUser=nome;
                jsonDataObject.profissao=prof;
                jsonDataObject.tempoTrampo=desde;
                jsonDataObject.telefone=contato;
                jsonDataObject.fotoPerfil="TESTE";                
                jsonDataObject.id=id;
                
                var jsonString= JSON.stringify(jsonDataObject);

                

                $.ajax({

                    type:"POST",

                    url:"http://localhost:8088/SoftCarWeb/webresources/softcarweb/perfil",

                    dataType:"json",
                    data:jsonDataObject
                    
                    
                });
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
                input.size = Math.max(text.length / 4 * 3, 4);
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
                  <input type='file' id="trocaFoto" onchange="readURL(this);">
              </div>
             </div>
      
            <div id="container" class="container">
              <div class="dadosUser">
                  <input type="hidden" id="id" value="${sessionScope.usuario.id}">
                  <h1 class="textosMain">SoftPlayer</h1>
                  <p class="textosSeg" id="nome">${sessionScope.usuario.nomeUser}</p>
              </div>
                <div id="btnEditUser" class="btns">
                    <a onclick=""><i class="fas fa-edit" style="color:coral;"></i></a>
              </div>
      
              <div class="dadosProf">
                  <h1 class="textosMain">Profissão</h1>
                  <p class="textosSeg" id="prof">${sessionScope.usuario.profissao}</p>
              </div>
              <div id="btnEditProf" class="btns">
                      <a onclick=""><i class="fas fa-edit" style="color:coral;"></i></a>
              </div>
      
              <div class="dadosTempo">
                      <h1 class="textosMain">SoftPlayer desde:</h1>
                      <p class="textosSeg" id="desde">${sessionScope.usuario.tempoTrampo}</p>
              </div>
              <div id="btnEditTemp" class="btns">
                      <a onclick=""><i class="fas fa-edit" style="color:coral;"></i></a>
              </div>
      
              <div class="dadosCont">
                  <h1 class="textosMain">Contato</h1>
                  <p class="textosSeg" id="contato">${sessionScope.usuario.telefone}</p>
              </div>
              <div id="btnEditCont" class="btns">
                 <a onclick=""><i class="fas fa-edit" style="color:coral;"></i></a>
              </div>
              <button onclick="atualizarDados()">Atualizar</button>
            </div>
        </div>
   
    </div>
    </body>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
</html>
