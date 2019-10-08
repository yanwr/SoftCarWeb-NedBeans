package model;

public class Usuario {
    private String email;
    private String senha;
    private String confSenha;

    public Usuario() {
    }

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public Usuario(String email, String senha, String confSenha) {
        this.email = email;
        this.senha = senha;
        this.confSenha = confSenha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfSenha() {
        return confSenha;
    }

    public void setConfSenha(String confSenha) {
        this.confSenha = confSenha;
    }

    @Override
    public String toString() {
        return "Usuario{" + "email=" + email + ", senha=" + senha + ", confSenha=" + confSenha + '}';
    }
    
    
}
