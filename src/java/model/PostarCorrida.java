
package model;

public class PostarCorrida {
    private int motorista;
    private String dataCorrida;
    private String horaCorrida;
    private String hrSaida;
    private String dtSaida;
    private int destino;
    private int saida;
    private int assentos;
    private float taxa;

    public PostarCorrida() {
    }

    public PostarCorrida(int motorista, String dataCorrida, String horaCorrida, String hrSaida, String dtSaida, int destino, int saida, int assentos, float taxa) {
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

    public int getMotorista() {
        return motorista;
    }

    public void setMotorista(int motorista) {
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

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    public int getSaida() {
        return saida;
    }

    public void setSaida(int saida) {
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
