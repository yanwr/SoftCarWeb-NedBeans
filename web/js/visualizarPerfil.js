var idUser;
function comeca(){
    idUser = $('#idUser').val();
    mostrarPerfil();
}

function mostrarPerfil(){
     //alert('teste');
    $.ajax({
            url:'Perfil?ENVIAR=teste',
            type: 'POST',
            data: {idUser: idUser},
            success: function(textS){
                alert(textS)
                $('#modal-wrapper').html(textS); 
            } 
        });
}