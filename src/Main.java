import entities.Cliente;
import entities.Ordine;
import entities.Prodotto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Oggetti Prodotto
        Prodotto book1 = new Prodotto(1, "Le avventure di Tom", "Libri", 12.50);
        Prodotto book2 = new Prodotto(2, "Le avventure di Sam", "Libri", 120.50);
        Prodotto book3 = new Prodotto(3, "Le avventure di Mark", "Libri", 134.50);
        Prodotto baby1 = new Prodotto(4, "Fiocco Nascita", "Baby", 34.50);
        Prodotto baby2 = new Prodotto(5, "Bavaglino", "Baby", 15.50);
        Prodotto baby3 = new Prodotto(6, "Tovaglietta", "Baby", 14.50);
        Prodotto toy1 = new Prodotto(7, "Arpione", "Boys", 12.50);
        Prodotto toy2 = new Prodotto(8, "Fionda", "Boys", 15.50);

        //Oggetti Cliente
        Cliente cliente1 = new Cliente(1, "Giampiero", 1);
        Cliente cliente2 = new Cliente(2, "Piero", 2);
        Cliente cliente3 = new Cliente(3, "Paolo", 3);
        Cliente cliente4 = new Cliente(4, "Giovanna", 2);
        Cliente cliente5 = new Cliente(5, "Anna", 2);


        //Prodotti aggiunti a listaMagazzino
        List<Prodotto> listaMagazzino = new ArrayList<>();
        listaMagazzino.add(book1);
        listaMagazzino.add(book2);
        listaMagazzino.add(book3);
        listaMagazzino.add(baby1);
        listaMagazzino.add(baby2);
        listaMagazzino.add(baby3);
        listaMagazzino.add(toy1);
        listaMagazzino.add(toy2);

        //Clienti aggiunti a listaClienti
        List<Cliente> listaClienti = new ArrayList<>();
        listaClienti.add(cliente1);
        listaClienti.add(cliente2);
        listaClienti.add(cliente3);
        listaClienti.add(cliente4);
        listaClienti.add(cliente5);

        //Lista prodotti per ordine singolo
        List<Prodotto> prodottiOrdine1 = new ArrayList<>();
        prodottiOrdine1.add(book1);
        prodottiOrdine1.add(toy1);

        List<Prodotto> prodottiOrdine2 = new ArrayList<>();
        prodottiOrdine2.add(baby1);
        prodottiOrdine2.add(baby2);

        List<Prodotto> prodottiOrdine3 = new ArrayList<>();
        prodottiOrdine3.add(book2);
        prodottiOrdine3.add(toy2);

        //Oggetti Ordine
        Ordine ordine1 = new Ordine(1, "evaso", LocalDate.of(2021, 3, 15), prodottiOrdine1, cliente1);
        Ordine ordine2 = new Ordine(2, "evaso", LocalDate.of(2021, 3, 1), prodottiOrdine2, cliente2);
        Ordine ordine3 = new Ordine(3, "evaso", LocalDate.of(2021, 2, 1), prodottiOrdine3, cliente4);


        //Ordini aggiunti a listaOrdini
        List<Ordine> listaOrdini = new ArrayList<>();
        listaOrdini.add(ordine1);
        listaOrdini.add(ordine2);
        listaOrdini.add(ordine3);


        //Ex1
        //ottenere tutti i prodotti "libro e ottenere tutti quelli > 100
        //ottenere la lista .toList()
        List<Prodotto> listaLibri = listaMagazzino.stream()
                .filter(prodotto -> prodotto.getCategoriaProdotto().equals("Libri") && prodotto.getPrezzo() > 100).toList();
        //listaLibri.forEach(prodotto -> System.out.println("Lista libri: " + prodotto));

        //Ex2
        //Ottenere una lista di prodotti che appartengono alla categoria «Baby»
        List<Prodotto> listaBaby = listaMagazzino.stream()
                .filter(prodotto -> prodotto.getCategoriaProdotto().equals("Baby")).toList();
        //listaBaby.forEach(prodotto -> System.out.println("Lista Baby: " + prodotto));

        //Ex2.1
        //Ottenere una lista di ordine con prodotti che appartengono alla categoria «Baby»
        List<Ordine> listaOrdiniFiltrati = listaOrdini.stream().filter(ordine -> ordine.getListaProdotti().stream()
                .anyMatch(prodotto -> prodotto.getCategoriaProdotto().equals("Baby"))).toList();
        //listaOrdiniFiltrati.forEach(ordine -> System.out.println("Lista ordini filtrati: " + ordine));


        //Ex3
        //Ottenere una lista di prodotti che appartengono alla categoria «Boys» ed applicare 10% di sconto al loro prezzo
        List<Prodotto> listaBoys = listaMagazzino.stream()
                .filter(prodotto -> prodotto.getCategoriaProdotto().equals("Boys")).toList();
        //listaBoys.forEach(prodotto -> System.out.println("Lista Boys: " + prodotto));
        listaBoys.forEach(prodotto ->
                {
                    double prezzoOriginale = prodotto.getPrezzo();
                    double prezzoScontato = prezzoOriginale * 0.90;
                    prodotto.setPrezzo(prezzoScontato);
                }

        );

        //Esercizio #4
        //Ottenere una lista di prodotti ordinati da clienti di livello (tier) 2 tra l’01-Feb-2021 e l’01-Apr-2021
        List<Ordine> listaFiltrataClientiFascia = listaOrdini.stream()
                .filter(ordine -> ordine.getCliente()
                        .getFasciaCliente() == 2)
                .filter(ordine -> ordine.getDataRicezioneOrdine().isAfter(LocalDate.of(2021, 2, 1))
                        && ordine.getDataRicezioneOrdine().isBefore(LocalDate.of(2021, 4, 1)))
                .toList();

        //listaFiltrataClientiFascia.forEach(cliente -> System.out.println());
        listaFiltrataClientiFascia.forEach(ordine -> System.out.println("Ex4: " + ordine));
    }


}

