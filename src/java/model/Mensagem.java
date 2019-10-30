
package model;

public class Mensagem {
    
    private int codChat; 
    private int codViagem;
    private String msg;
    private int userQueEnviou;

    public Mensagem(int codChat, int codViagem, String msg, int userQueEnviou) {
        this.codChat = codChat;
        this.codViagem = codViagem;
        this.msg = msg;
        this.userQueEnviou = userQueEnviou;
    }

    public Mensagem(int codViagem, String msg, int userQueEnviou) {
        this.codViagem = codViagem;
        this.msg = msg;
        this.userQueEnviou = userQueEnviou;
    }

    public Mensagem() {
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
        return "Mensagem{" + "codChat=" + codChat + ", codViagem=" + codViagem + ", msg=" + msg + ", userQueEnviou=" + userQueEnviou + '}';
    }
}
