
function comeca(codViagem){
     $.ajax({
            url:'Perfil?ENVIAR=teste',
            type: 'POST',
            data: {codV: codViagem},
            success: function(textS){
                $('#modal-wrapper').html(textS); 
                d = document.getElementById("modal-wrapper").style.display = "block";
            } 
        });
}