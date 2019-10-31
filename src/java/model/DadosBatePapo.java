
package model;

public class DadosBatePapo {
    // para chat 
        private int codChat; 
        private int codViagem;
        private String msg;
        private int userQueEnviou;
    //
    // para os contatos 
        private String nomeMotorista;
        private String fotoPerfil;
        private int codMotorista;
    //  

        public DadosBatePapo() {}

    // chat    
        public DadosBatePapo(int codChat, int codViagem, String msg, int userQueEnviou) {
            this.codChat = codChat;
            this.codViagem = codViagem;
            this.msg = msg;
            this.userQueEnviou = userQueEnviou;
        }

        public DadosBatePapo(int codViagem, String msg, int userQueEnviou) {
            this.codViagem = codViagem;
            this.msg = msg;
            this.userQueEnviou = userQueEnviou;
        }
    //
    
    // contatos 
        public DadosBatePapo(int codChat, int codViagem, String nomeMotorista, String fotoPerfil) {
            this.codChat = codChat;
            this.codViagem = codViagem;
            this.nomeMotorista = nomeMotorista;
            this.fotoPerfil = fotoPerfil;
        }

    public DadosBatePapo(int codViagem, String nomeMotorista, String fotoPerfil, int codMotorista) {
        this.codViagem = codViagem;
        this.nomeMotorista = nomeMotorista;
        this.fotoPerfil = fotoPerfil;
        this.codMotorista = codMotorista;
    }
        
    //

    public int getCodMotorista() {
        return codMotorista;
    }

    public void setCodMotorista(int codMotorista) {
        this.codMotorista = codMotorista;
    }
        
    
    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }
        
    public int getCodChat() {
        return codChat;
    }

    public void setCodChat(int codChat) {
        this.codChat = codChat;
    }

    public int getCodViagem() {
        return codViagem;
    }

    public void setCodViagem(int codViagem) {
        this.codViagem = codViagem;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getUserQueEnviou() {
        return userQueEnviou;
    }

    public void setUserQueEnviou(int userQueEnviou) {
        this.userQueEnviou = userQueEnviou;
    }

    @Override
    public String toString() {
        return "DadosBatePapo{" + "codChat=" + codChat + ", codViagem=" + codViagem + ", msg=" + msg + ", userQueEnviou=" + userQueEnviou + ", nomeMotorista=" + nomeMotorista + ", fotoPerfil=" + fotoPerfil + ", codMotorista=" + codMotorista + '}';
    }

    
}
