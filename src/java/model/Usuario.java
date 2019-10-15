package model;

public class Usuario {
    //cadastro
    private String email;
    private String senha;
    private String nomeUser;
    private String confSenha;
    //
    // perfil
    private String profissao;
    private String tempoTrablho;
    private String telefone;
    private String fotoPerfil;
    

    public Usuario() {
    }
    
    // para cadastro
    public Usuario(String email, String senha, String nomeUser) {
        this.email = email;
        this.senha = senha;
        this.nomeUser = nomeUser;
    }
    //
    // para perfil
    public Usuario(String nomeUser, String profissao, String tempoTrablho, String telefone, String fotoPerfil) {
        this.nomeUser = nomeUser;
        this.profissao = profissao;
        this.tempoTrablho = tempoTrablho;
        this.telefone = telefone;
        this.fotoPerfil = fotoPerfil;
    }
    //
 
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

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public String getConfSenha() {
        return confSenha;
    }

    public void setConfSenha(String confSenha) {
        this.confSenha = confSenha;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getTempoTrablho() {
        return tempoTrablho;
    }

    public void setTempoTrablho(String tempoTrablho) {
        this.tempoTrablho = tempoTrablho;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFotoPerfil() {
        return fotoPerfil;
    }

    public void setFotoPerfil(String fotoPerfil) {
        this.fotoPerfil = fotoPerfil;
    }

    
    
}
