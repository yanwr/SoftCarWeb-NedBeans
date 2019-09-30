 function conferirCad(){
    var filter = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
    if(document.getElementById("email").value == ""){
        document.getElementById("email").focus();
        document.getElementById("email").style.border = "1px solid #ef3c59";
        document.getElementById("textinho").innerHTML='<p class="blocoErro" style="color:#ef3c59;font-size:12px;margin-top:7px;margin-bottom:0px;">E-mail inválido</p>';
    }
    if(document.getElementById("senha").value == ""){
        document.getElementById("senha").focus();
        document.getElementById("senha").style.border = "1px solid #ef3c59";
        document.getElementById("textinho1").innerHTML='<p class="blocoErro" style="color:#ef3c59;font-size:12px;margin-top:7px;margin-bottom:0px;">Senha inválida</p>';
    }
    if(document.getElementById("confsenha").value != document.getElementById("senha").value){
        document.getElementById("confsenha").focus();
        document.getElementById("confsenha").style.border = "1px solid #ef3c59";
        document.getElementById("textinho2").innerHTML='<p class="blocoErro" style="color:#ef3c59;font-size:12px;margin-top:7px;margin-bottom:0px;">Campos não coincidem</p>';
    } 
}   

 function conferirLog(){
    
     if(document.getElementById("Login").value == ""){
        document.getElementById("Login").focus();
        document.getElementById("Login").style.border = "1px solid #ef3c59";
        document.getElementById("erroLogin").innerHTML='<p class="blocoErro" style="color:#ef3c59;font-size:12px;margin-top:7px;margin-bottom:0px;">E-mail inválido</p>';
    }
    if(document.getElementById("senha").value == ""){
        document.getElementById("senha").focus();
        document.getElementById("senha").style.border = "1px solid #ef3c59";
        document.getElementById("erroSenha").innerHTML='<p class="blocoErro" style="color:#ef3c59;font-size:12px;margin-top:7px;margin-bottom:0px;">Senha inválida</p>';
    }
}

function conferirOC(){
    
    if(document.getElementById("pSair").value == ""){
        document.getElementById("pSair").focus();
        document.getElementById("pSair").style.border = "1px solid #ef3c59";
        document.getElementById("erroPsair").innerHTML='<p class="blocoErro" style="color:#ef3c59;font-size:15px;margin-top:-22px;margin-left: 40vh;"><i class="fas fa-exclamation-circle"></i></p>';
    }
    if(document.getElementById("pVai").value == ""){
        document.getElementById("pVai").focus();
        document.getElementById("pVai").style.border = "1px solid #ef3c59";
        document.getElementById("erroPvai").innerHTML='<p class="blocoErro" style="color:#ef3c59;font-size:15px;margin-top:-22px;margin-left: 40vh;"><i class="fas fa-exclamation-circle"></i></p>';
    }
    if(document.getElementById("hora").value == ""){
        document.getElementById("hora").focus();
        document.getElementById("hora").style.border = "1px solid #ef3c59";
        document.getElementById("erroHora").innerHTML='<p class="blocoErro" style="color:#ef3c59;font-size:15px;margin-top:-22px;margin-left: 40vh;"><i class="fas fa-exclamation-circle"></i></p>';
    }
    if(document.getElementById("dia").value == ""){
        document.getElementById("dia").focus();
        document.getElementById("dia").style.border = "1px solid #ef3c59";
        document.getElementById("erroDia").innerHTML='<p class="blocoErro" style="color:#ef3c59;font-size:15px;margin-top:-22px;margin-left: 40vh;"><i class="fas fa-exclamation-circle"></i></p>';
    }
}

