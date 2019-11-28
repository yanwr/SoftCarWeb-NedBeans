
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

function vericacao(codUser, codVi){
     $.ajax({
            url:'Solicitar?ENVIAR=verificacao',
            type: 'POST',
            data: {
                codU: codUser,
                codVi: codVi
            },
            success: function(textS){
                $('#verifica').html(textS); 
                d = document.getElementById("verifica").style.display = "block";
            } 
        });
}