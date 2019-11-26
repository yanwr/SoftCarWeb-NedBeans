var nome, prof, desde, contato, id, fotoPerfil, file, formData;

function comecar(){
    mandaDados();
}

function mandaDados(){
    nome =$('#nome').text();
    prof =$('#prof').text();
    desde =$('#desde').text();
    contato = $('#contato').text();
    id = $('#id').val();
    
    fotoPerfil = document.getElementById('trocaFoto');
    console.log(fotoPerfil);
    file = fotoPerfil.files[0];
    console.log(file);
    
    formData = new FormData();
    formData.append("foto", file);
    formData.append("prof", prof);
    formData.append("nome", nome);
    formData.append("desde", desde);
    formData.append("tel", contato);
    formData.append("idUser", id);
    
    console.log(formData);
    
    $.ajax({
          url:'Perfil?ENVIAR=Atualizar',
          type: 'POST',
//          data:{
//              nome: nome,
//              prof: prof,
//              desde: desde,
//              tel: contato,
//              foto: file,
//              idUser: id
//          },
          data: formData,
          cache:false,
          processData: false,
          contentType: false,
          enctype: 'multipart/form-data',
          success: function(){
              alert("Deu boa");
          }
       });
}