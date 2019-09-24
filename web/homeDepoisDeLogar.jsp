
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <link href="Css/homeDepoisLogar.css" rel="stylesheet">
    <link rel="shortcut icon" href="img/softcar-blue-icon.png" type="image/x-png">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Softcar</title>
    <script src="https://kit.fontawesome.com/7136158624.js" crossorigin="anonymous"></script>
  </head>
    <script>
        // If user clicks anywhere outside of the modal, Modal will close
        
        var modal = document.getElementById('modal-wrapper');
        window.onclick = function(event) {
            if (event.target == modal) {
                modal.style.display = "none";
            }
        }
        
        var inputAddphoto = '<div class="avatar"></div>',
            inputphoto = $('#trocaFoto');
        
        inputphoto.before(inputAddphoto);
        
        $('.avatar').on('click', function() {
            $(this).siblings('#trocaFoto').trigger('click');
        });
        
        inputphoto.on('change', function(){
            var input = $(this),    reader = new FileReader();
        
            reader.onload = function (e) {
                input.siblings('
                reader = new FileReader();
        
            reader.onload = function (e) {
                input.siblings('.avatar').css('background-image', 'url(' + e.target.result + ')');
            };
        
            reader.readAsDataURL(this.files[0]);
        });
        
        </script>
    
</head>
<body>
    
    <header class="cabeça" id="cabeça">
            <div class="divLogo" ><img class="logo" src="img/softcar-blue.png" alt=""></div>
            <input type="checkbox" id="bt-menu">
            <label for="bt-menu">&#9776;</label>
            
            <nav class="first-nav">
                <ul>
                    <li class="liNav"><a class="aNav" id="aNavUm" >Nome do User<i class="fas fa-angle-double-down" style="padding-left: 8px;"></i></a>
                        <ul class="ulPerfil">
                            <li>
                                <a class="AMaior" href="#">
                                    <div class="ImgPerfil" style="background-image: url(img/1.png)"></div>
                                    <h3 class="nameUser">Joao Victor da Silva Rodrigues</h3>
                                </a>
                            </li>
                            <li><a href="#" id="liUm" class="aMenu"><i class="fas fa-home"></i>Home</a></li>
                            <li><a class="aMenu" onclick="document.getElementById('modal-wrapper').style.display='block'" ><i class="fas fa-user-cog"></i>Perfil</a></li>
                            <li><a href="chat.jsp" class="aMenu" ><i class="far fa-comment-dots"></i>Chat</a></li>
                            <li><a href="#" class="aMenu" ><i class="fas fa-power-off"></i>Sair</a></li>
                        </ul>
                    </li>
                    
                    <li class="liNav"><a href="solicitarCarona.html" class="aNav"><i class="fas fa-search"></i>Solicitar Carona</a></li>
                    <li class="liNav"><a href="oferecerCarona.html" class="aNav"><i class="fas fa-plus-circle"></i>Oferecer Carona</a></li>
                </ul>
            </nav>
    </header>

<!-- ----------- Perfil -------------- -->
    <div id="modal-wrapper" class="modal">
        <form class="modal-content animate" action="/action_page.php">
            <div class="imgcontainer">
              <span onclick="document.getElementById('modal-wrapper').style.display='none'" class="close" title="Close PopUp">&times;</span>
              <div  class="avatar" id="" style="background-image: url(img/1.png)"></div>
              <div id="btnEditImg" class="btnEditImg">
                  <label id="fotoUser" for="trocaFoto"><img  src="img/icons8-editar-20.png "></label>
                  <input type="file" id="trocaFoto">
              </div>
             </div>
      
            <div class="container">
              <div class="dadosUser">
                  <h1 class="textosMain">SoftPlayer</h1>
                  <p id="nomeUser" class="textosSeg">Yan Weschenfelder</p>
              </div>
              <div id="btnEditUser" class="btns">
                      <img src="img/icons8-editar-20.png " >
              </div>
      
              <div class="dadosProf">
                  <h1 class="textosMain">Profissão</h1>
                  <p id="nomeProf" class="textosSeg">Programador</p>
              </div>
              <div id="btnEditProf" class="btns">
                      <img src="img/icons8-editar-20.png " >
              </div>
      
              <div class="dadosTempo">
                      <h1 class="textosMain">Tempo na SoftPlan</h1>
                      <p id="nomeTempo" class="textosSeg">2 anos</p>
              </div>
              <div id="btnEditTemp" class="btns">
                      <img src="img/icons8-editar-20.png " >
              </div>
      
              <div class="dadosCont">
                  <h1 class="textosMain">Contato</h1>
                  <p id="nomeCont" class="textosSeg">(48)996894386</p>
              </div>
              <div id="btnEditCont" class="btns">
                  <img src="img/icons8-editar-20.png " >
              </div>
            </div>
        </form>
    </div>
      
     
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