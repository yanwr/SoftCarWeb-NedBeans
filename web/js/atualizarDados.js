var nome, prof, desde, contato, id, fotoPerfil, file;

function comecar(){
    mandaDados();
}

function mandaDados(){
    nome =$('#nome').text();
    prof =$('#prof').text();
    desde =$('#desde').text();
    contato = $('#contato').text();
    id = $('#id').val();
    alert(id);
    
    
    fotoPerfil = document.getElementById('trocaFoto');
    file = fotoPerfil.files[0];
    
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
          enctype: 'multipart/form-data',
          success: function(){
              alert("Deu boa");
          }
       });
}