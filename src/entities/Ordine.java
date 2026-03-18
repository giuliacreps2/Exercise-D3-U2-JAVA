package entities;

import java.time.LocalDate;
import java.util.List;

public class Ordine {
    private long idOrdine;
    private String statusOrdine;
    private LocalDate dataRicezioneOrdine;
    private LocalDate dataSpedizioneOrdine;
    private List<Prodotto> listaProdotti;
    private Cliente cliente;

    public Ordine(long idOrdine, String statusOrdine, LocalDate dataRicezioneOrdine, LocalDate dataSpedizioneOrdine, List<Prodotto> listaProdotti, Cliente cliente) {
        this.idOrdine = idOrdine;
        this.statusOrdine = statusOrdine;
        this.dataRicezioneOrdine = dataRicezioneOrdine;
        this.dataSpedizioneOrdine = dataSpedizioneOrdine;
        this.listaProdotti = listaProdotti;
        this.cliente = cliente;

    }

    public Ordine(long idOrdine, String statusOrdine, LocalDate dataRicezioneOrdine, List<Prodotto> listaProdotti, Cliente cliente) {
        this.idOrdine = idOrdine;
        this.statusOrdine = statusOrdine;
        this.dataRicezioneOrdine = dataRicezioneOrdine;
        this.listaProdotti = listaProdotti;
        this.cliente = cliente;
    }

    public long getIdOrdine() {
        return idOrdine;
    }

    public String getStatusOrdine() {
        return statusOrdine;
    }

    public LocalDate getDataRicezioneOrdine() {
        return dataRicezioneOrdine;
    }

    public LocalDate getDataSpedizioneOrdine() {
        return dataSpedizioneOrdine;
    }

    public List<Prodotto> getListaProdotti() {
        return listaProdotti;
    }

    public void setListaProdotti(List<Prodotto> listaProdotto) {
        this.listaProdotti = listaProdotti;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setClienti(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "idOrdine=" + idOrdine +
                ", statusOrdine='" + statusOrdine + '\'' +
                ", dataRicezioneOrdine=" + dataRicezioneOrdine +
                ", dataSpedizioneOrdine=" + dataSpedizioneOrdine +
                ", listaProdotto=" + listaProdotti +
                ", cliente=" + cliente +
                '}';
    }
}
