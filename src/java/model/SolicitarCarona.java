
package model;

public class SolicitarCarona {
    
    private int codViagem;
    private String motorista;
    private String destino;
    private String saida;
    private String ftPerfil;
    private String dataPostagem;
    private String horaPostagem;
    private String dataSaida;
    private String horaSaida;
    private int assentos;
    private float taxa;

    public SolicitarCarona() {
    }

    public SolicitarCarona(int codViagem,String motorista, String destino, String saida, String ftPerfil, String dataPostagem, String horaPostagem, String dataSaida, String horaSaida, int assentos, float taxa) {
        this.codViagem = codViagem;
        this.motorista = motorista;
        this.destino = destino;
        this.saida = saida;
        this.ftPerfil = ftPerfil;
        this.dataPostagem = dataPostagem;
        this.horaPostagem = horaPostagem;
        this.dataSaida = dataSaida;
        this.horaSaida = horaSaida;
        this.assentos = assentos;
        this.taxa = taxa;
    }

    public int getCodViagem() {
        return codViagem;
    }

    public void setCodViagem(int codViagem) {
        this.codViagem = codViagem;
    }
    

    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
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

    public String getFtPerfil() {
        return ftPerfil;
    }

    public void setFtPerfil(String ftPerfil) {
        this.ftPerfil = ftPerfil;
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
        return "SolicitarCarona{" + "codViagem=" + codViagem + ", motorista=" + motorista + ", destino=" + destino + ", saida=" + saida + ", ftPerfil=" + ftPerfil + ", dataPostagem=" + dataPostagem + ", horaPostagem=" + horaPostagem + ", dataSaida=" + dataSaida + ", horaSaida=" + horaSaida + ", assentos=" + assentos + ", taxa=" + taxa + '}';
    }

   

    
  }
