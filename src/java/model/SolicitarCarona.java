
package model;

public class SolicitarCarona {
    
    private int motorista;
    private int destino;
    private int saida;
    private String dataPostagem;
    private String horaPostagem;
    private String dataSaida;
    private String horaSaida;
    private int assentos;
    private float taxa;

    public SolicitarCarona() {
        
    }

    public SolicitarCarona(int motorista, int destino, int saida, String dataPostagem, String horaPostagem, String dataSaida, String horaSaida, int assentos, float taxa) {
        this.motorista = motorista;
        this.destino = destino;
        this.saida = saida;
        this.dataPostagem = dataPostagem;
        this.horaPostagem = horaPostagem;
        this.dataSaida = dataSaida;
        this.horaSaida = horaSaida;
        this.assentos = assentos;
        this.taxa = taxa;
    }

    public int getMotorista() {
        return motorista;
    }

    public void setMotorista(int motorista) {
        this.motorista = motorista;
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

    public String getDataPostagem() {
        return dataPostagem;
    }

    public void setDataPostagem(String dataPostagem) {
        this.dataPostagem = dataPostagem;
    }

    public String getHoraPostagem() {
        return horaPostagem;
    }

    public void setHoraPostagem(String horaPostagem) {
        this.horaPostagem = horaPostagem;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
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

    @Override
    public String toString() {
        return "SolicitarCarona{" + "motorista=" + motorista + ", destino=" + destino + ", saida=" + saida + ", dataPostagem=" + dataPostagem + ", horaPostagem=" + horaPostagem + ", dataSaida=" + dataSaida + ", horaSaida=" + horaSaida + ", assentos=" + assentos + ", taxa=" + taxa + '}';
    }
}
