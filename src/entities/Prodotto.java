package entities;

public class Prodotto {
    private long idProdotto;
    private String nomeProdotto;
    private String categoriaProdotto;
    private double prezzo;

    public Prodotto(long idProdotto, String nomeProdotto, String categoriaProdotto, double prezzo) {
        this.idProdotto = idProdotto;
        this.nomeProdotto = nomeProdotto;
        this.categoriaProdotto = categoriaProdotto;
        this.prezzo = prezzo;
    }


    public long getIdProdotto() {
        return idProdotto;
    }

    public String getNomeProdotto() {
        return nomeProdotto;
    }

    public String getCategoriaProdotto() {
        return categoriaProdotto;
    }

    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "idProdotto=" + idProdotto +
                ", nomeProdotto='" + nomeProdotto + '\'' +
                ", categoriaProdotto='" + categoriaProdotto + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
