
package model;

public class PostarCorrida {
    private Usuario motorista;
    private String dataCorrida;
    private String horaCorrida;
    private String hrSaida;
    private String dtSaida;
    private String destino;
    private String saida;
    private int assentos;
    private float taxa;

    public PostarCorrida() {
    }

    public PostarCorrida(Usuario motorista, String dataCorrida, String horaCorrida, String hrSaida, String dtSaida, String destino, String saida, int assentos, float taxa) {
        this.motorista = motorista;
        this.dataCorrida = dataCorrida;
        this.horaCorrida = horaCorrida;
        this.hrSaida = hrSaida;
        this.dtSaida = dtSaida;
        this.destino = destino;
        this.saida = saida;
        this.assentos = assentos;
        this.taxa = taxa;
    }

    public Usuario getMotorista() {
        return motorista;
    }

    public void setMotorista(Usuario motorista) {
        this.motorista = motorista;
    }

    public String getDataCorrida() {
        return dataCorrida;
    }

    public void setDataCorrida(String dataCorrida) {
        this.dataCorrida = dataCorrida;
    }

    public String getHoraCorrida() {
        return horaCorrida;
    }

    public void setHoraCorrida(String horaCorrida) {
        this.horaCorrida = horaCorrida;
    }

    public String getHrSaida() {
        return hrSaida;
    }

    public void setHrSaida(String hrSaida) {
        this.hrSaida = hrSaida;
    }

    public String getDtSaida() {
        return dtSaida;
    }

    public void setDtSaida(String dtSaida) {
        this.dtSaida = dtSaida;
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

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }

    
    
    
}
