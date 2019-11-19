var nome, prof, desde, contato, id, fotoPerfil, file;

function comeca(){
    mandaDados();
}

function mandaDados(){
    nome =$('#nome').text();
    prof =$('#prof').text();
    desde =$('#desde').text();
    contato = $('#contato').text();
    fotoPerfil = document.getElementById('file');
    file = fotoPerfil.files[0];
    id = $('#id').val();
    
    formData = new FormData();
    formData.append("image", file);
    
    $.ajax({
          url:'Perfil?ENVIAR=Atualizar',
          type: 'POST',
          data:{
              nome: nome,
              prof: prof,
              desde: desde,
              tel: contato,
              foto: formData,
              idUser: id
          },
          processData: false,
          contentType: false,
          success: function(){
              alert("Deu boa");
          }
       });
}