var idUser, d;
function comeca(){
    idUser = $('#idUser').val();
    mostrarPerfil();
}

function mostrarPerfil(){
     //alert('teste');
    $.ajax({
            url:'Perfil?ENVIAR=teste',
            type: 'POST',
            data: {codV: idUser},
            success: function(textS){
                alert(textS);
                $('#modal-wrapper').html(textS); 
                d = document.getElementById("modal-wrapper").style.display = "block";
            } 
        });
}