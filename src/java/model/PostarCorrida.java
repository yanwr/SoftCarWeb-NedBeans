
package model;

public class PostarCorrida {
    private Usuario motorista;
    private String hrSaida;
    private String hrPostada;
    private String destino;
    private String saida;
    private int lugares;
    private float taxa;

    public PostarCorrida(Usuario motorista, String hrSaida, String hrPostada, String destino, String saida, int lugares, float taxa) {
        this.motorista = motorista;
        this.hrSaida = hrSaida;
        this.hrPostada = hrPostada;
        this.destino = destino;
        this.saida = saida;
        this.lugares = lugares;
        this.taxa = taxa;
    }

    public PostarCorrida() {
    }
   
    public String getHrSaida() {
        return hrSaida;
    }

    public void setHrSaida(String hrSaida) {
        this.hrSaida = hrSaida;
    }

    public String getHrPostada() {
        return hrPostada;
    }

    public void setHrPostada(String hrPostada) {
        this.hrPostada = hrPostada;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }

    public int getLugares() {
        return lugares;
    }

    public void setLugares(int lugares) {
        this.lugares = lugares;
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }

    public Usuario getMotorista() {
        return motorista;
    }

    public void setMotorista(Usuario motorista) {
        this.motorista = motorista;
    }

    @Override
    public String toString() {
        return "PostarCorrida{" + "motorista=" + motorista + ", hrSaida=" + hrSaida + ", hrPostada=" + hrPostada + ", destino=" + destino + ", saida=" + saida + ", lugares=" + lugares + ", taxa=" + taxa + '}';
    }
    
}
