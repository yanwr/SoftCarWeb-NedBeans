
package model;

public class Perfil {
    
    private String nomecompleto;
    private String profissao;
    private String tempoTrabalhado;
    private String nmrcel;
    private String foto;
    private int idade;

    public Perfil(String nomecompleto, String profissao, String tempoTrabalhado, String nmrcel, String foto, int idade) {
        this.nomecompleto = nomecompleto;
        this.profissao = profissao;
        this.tempoTrabalhado = tempoTrabalhado;
        this.nmrcel = nmrcel;
        this.foto = foto;
        this.idade = idade;
    }

    public Perfil() {
    }

    public String getNomecompleto() {
        return nomecompleto;
    }

    public void setNomecompleto(String nomecompleto) {
        this.nomecompleto = nomecompleto;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getTempoTrabalhado() {
        return tempoTrabalhado;
    }

    public void setTempoTrabalhado(String tempoTrabalhado) {
        this.tempoTrabalhado = tempoTrabalhado;
    }

    public String getNmrcel() {
        return nmrcel;
    }

    public void setNmrcel(String nmrcel) {
        this.nmrcel = nmrcel;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nomecompleto=" + nomecompleto + ", profissao=" + profissao + ", tempoTrabalhado=" + tempoTrabalhado + ", nmrcel=" + nmrcel + ", foto=" + foto + ", idade=" + idade + '}';
    }
    
    
}
