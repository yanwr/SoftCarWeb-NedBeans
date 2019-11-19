var nome;
var prof;
var desde;
var contato;
var id;
var fotoPerfil;

function comeca(){
    mandaDados();
}

function mandaDados(){
    nome =$('#nome').text();
    prof =$('#prof').text();
    desde =$('#desde').text();
    contato = $('#contato').text();
    fotoPerfil = "nicolasFazAsFotos.jsg" ;
    id = $('#id').val();
    
    $.ajax({
          url:'Perfil?ENVIAR=Atualizar',
          type: 'POST',
          data:{
              nome: nome,
              prof: prof,
              desde: desde,
              tel: contato,
              foto: fotoPerfil,
              idUser: id
          },
          success: function(){
              alert("Deu boa");
          }
       });
}