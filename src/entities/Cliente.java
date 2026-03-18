package entities;

public class Cliente {
    private long idCliente;
    private String nomeCliente;
    private int fasciaCliente;

    public Cliente(long idCliente, String nomeCliente, int fasciaCliente) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.fasciaCliente = fasciaCliente;

    }

    public long getIdCliente() {
        return idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setFasciaCliente(int fasciaCliente) {
        this.fasciaCliente = fasciaCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", fasciaCliente=" + fasciaCliente +
                '}';
    }
}
