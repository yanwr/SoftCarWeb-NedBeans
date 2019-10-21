package model;

public class Usuario {
    //cadastro
    private int id;
    private String email;
    private String senha;
    private String nomeUser;
    private String confSenha;
    //
    // perfil
    private String profissao;
    private String tempoTrampo;
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
    public Usuario(String nomeUser){
        this.nomeUser = nomeUser;
    }
    //
    // para perfil
    public Usuario(int id, String nomeUser, String profissao, String tempoTrampo, String telefone, String fotoPerfil) {
        this.id = id;
        this.nomeUser = nomeUser;
        this.profissao = profissao;
        this.tempoTrampo = tempoTrampo;
        this.telefone = telefone;
        this.fotoPerfil = fotoPerfil;
    }
    //

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getTempoTrampo() {
        return tempoTrampo;
    }

    public void setTempoTrampo(String tempoTrampo) {
        this.tempoTrampo = tempoTrampo;
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
