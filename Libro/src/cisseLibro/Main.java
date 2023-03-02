package cisseLibro;

/*Creauna classe chiamata “Libro” con i seguenti attributi: titolo, autore, numero di pagine, genere.
Includi i metodi per impostare e recuperare i valori degli attributi e un metodo per visualizzare
tutte le informazioni del libro. Crea una classe “Biblioteca”che contiene
un array di libri e i metodi per aggiungere, rimuovere e visualizzare tutti i libri presenti nella biblioteca.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        Biblioleteca books = new Biblioleteca();
        int menu;

        System.out.println("Scegliere opzione");
        System.out.println("0_Exit");
        System.out.println("1_Aggiungere nuovo libro nella bibilioteca");
        System.out.println("2_vedere i libri della bibilioteca");
        System.out.println("3_rimuovere libro nella biblioteca");
        menu = tastiera.nextInt();
        do {
            switch (menu){
                case 1:
                    books.aggiungereLibro();
                break;

                case 2:
                    books.vizzualizareLibri();
                break;

                case 3:
                    books.rimuovereLibro();
                break;
            }

            System.out.println("");
            System.out.println("Scegliere opzione");
            System.out.println("0_Exit");
            System.out.println("1_Aggiungere nuovo libro nella bibilioteca");
            System.out.println("2_vedere i libri della bibilioteca");
            System.out.println("3_rimuovere libro nella biblioteca");
            menu = tastiera.nextInt();

        }
        while (menu!=0);




    }
}