  $(document).ready(function(){
        comeca();
    });
            
    var timeI = null;
    var timeR = false;

    function comeca(){
        para();
        lista();
    }
    
    function para(){
        if(timeR)
            clearTimeout(timeI);
            timeR = false;
    }
    
    var txt;
    $('#enviar').on('click', function(){
        txt = document.getElementById("textArea").value;
    })
       
    function lista(){
        $.ajax({
            url:'Mensagem?ENVIAR=ENVIAR',
            type: 'POST',
            data:{textArea: txt},
            success: function(textStatus){
                $('#chatPapo').html(textStatus); 
            } 
        });
        timeI = setTimeout("lista()", 2000); // tempo de espera para atualizar
        timeR = true; 
    }
