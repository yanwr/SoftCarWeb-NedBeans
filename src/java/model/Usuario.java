package model;

public class Usuario {
    private String nome;
    private String senha;
    private String confSenha;

    public Usuario() {
    }

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public Usuario(String nome, String senha, String confSenha) {
        this.nome = nome;
        this.senha = senha;
        this.confSenha = confSenha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        return "Usuario{" + "nome=" + nome + ", senha=" + senha + ", confSenha=" + confSenha + '}';
    }
    
    
}
