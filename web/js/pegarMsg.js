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
    function enviarMsg(){
        txt = document.getElementById("textArea").value;
        $.ajax({
            url:'Mensagem?ENVIAR=ENVIAR',
            type: 'POST',
            data: {texto: txt},
            success: function(textStatus){
                //alert(textStatus)
                $('#chatPapo').html(textStatus); 
            } 
        });
        // limpar campo da textarea
      txt = document.getElementById("textArea").value = "";
    }
       
    function lista(){
        $.ajax({
            url:'Mensagem?ENVIAR=Atualizar',
            type: 'POST',
            success: function(textStatus){
                //alert(textStatus)
                $('#chatPapo').html(textStatus); 
            } 
        });
        timeI = setTimeout("lista()", 10000); // tempo de espera para atualizar
        timeR = true; 
    }

    