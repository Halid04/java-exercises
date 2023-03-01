package CissePersona;

/*Crea una classe chiamata “Persona” con i seguenti attributi: nome, età, sesso.
Includi i metodi per impostare e recuperare i valori degli attributi e un metodo
per visualizzare tutte le informazioni della persona. Crea poi una classe chiamata
“Studente” che estende la classe “Persona” e aggiunge un attributo “matricola” e
un metodo per visualizzare il numero di matricola.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        Persona p1 = new Persona();

        System.out.println("Inserire nome:");
        p1.setNome(tastiera.next());

        System.out.println("Inserire eta:");
        p1.setEta(tastiera.nextInt());

        System.out.println("Inserire sesso:");
        p1.setSesso(tastiera.next());

        System.out.println("Inserire matricola:");
        Studente p2 = new Studente("marco", 17, "maschio", 14);

        System.out.println("");
        System.out.println("I tuoi dati sono:");
        System.out.println(p1.toString());
        System.out.println(p2.toString());

    }
}