import entities.Prodotto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Prodotto book1 = new Prodotto(1, "Le avventure di Tom", "Libri", 12.50);
        Prodotto book2 = new Prodotto(2, "Le avventure di Sam", "Libri", 120.50);
        Prodotto book3 = new Prodotto(3, "Le avventure di Mark", "Libri", 134.50);
        Prodotto baby1 = new Prodotto(4, "Fiocco Nascita", "Baby", 34.50);
        Prodotto baby2 = new Prodotto(5, "Bavaglino", "Baby", 15.50);
        Prodotto baby3 = new Prodotto(6, "Tovaglietta", "Libri", 14.50);
        Prodotto toy1 = new Prodotto(7, "Arpione", "Boys", 12.50);
        Prodotto toy2 = new Prodotto(8, "Fionda", "Boys", 12.50);

//Aggiungere a listaMagazzino
        List<Prodotto> listaMagazzino = new ArrayList<>();
        listaMagazzino.add(book1);
        listaMagazzino.add(book2);
        listaMagazzino.add(book3);
        listaMagazzino.add(baby1);
        listaMagazzino.add(baby2);
        listaMagazzino.add(baby3);
        listaMagazzino.add(toy1);
        listaMagazzino.add(toy2);


        //Ex1
        //ottenere tutti i prodotti "libro e ottenere tutti quelli > 100
        //ottenere la lista .toList()

        List<Prodotto> listaLibri = listaMagazzino.stream()
                .filter(prodotto -> prodotto.getCategoriaProdotto().equals("Libri") && prodotto.getPrezzo() > 100).toList();
        listaLibri.forEach(prodotto -> System.out.println("Lista libri: " + prodotto));

        //Ex2
        //Ottenere una lista di ordini con prodotti che appartengono alla categoria «Baby»
        List<Prodotto> listaBaby = listaMagazzino.stream()
                .filter(prodotto -> prodotto.getCategoriaProdotto().equals("Baby")).toList();
        listaBaby.forEach(prodotto -> System.out.println("Lista Baby: " + prodotto));

        //Ex3
        //Ottenere una lista di prodotti che appartengono alla categoria «Boys» ed applicare 10% di sconto al loro prezzo
        List<Prodotto> listaBoys = listaMagazzino.stream()
                .filter(prodotto -> prodotto.getCategoriaProdotto().equals("Boys")).toList();
        listaBoys.forEach(prodotto -> System.out.println("Lista Boys: " + prodotto));

        listaBoys.forEach(prodotto -> );
    }


}

