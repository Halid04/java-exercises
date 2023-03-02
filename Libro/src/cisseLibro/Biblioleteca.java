package cisseLibro;

import java.util.Scanner;
import java.util.Vector;

public class Biblioleteca {
    private Vector<Libro> libri = new Vector<>();
    Scanner input = new Scanner(System.in);

    public void aggiungereLibro(){
        Libro libro = new Libro();

        System.out.println("");
        System.out.println("Inserire titolo:");
        libro.setTitolo(input.next());

        System.out.println("Inserire autore:");
        libro.setAutore(input.next());

        System.out.println("Inserire il numero di pagine:");
        libro.setNumPagine(input.nextInt());

        System.out.println("Inserire genere:");
        libro.setGenere(input.next());
        libri.add(libro);
    }

    public void vizzualizareLibri(){
        for (int i=0; i<libri.size(); i++){
            System.out.println(libri.elementAt(i));
        }
    }

    public void rimuovereLibro(){
        System.out.println("");
        System.out.println("Inserire posizione libro (da 0 a n):");
        int pos = input.nextInt();

        libri.removeElementAt(pos);

        System.out.println("");
        System.out.println("Aggiornamento bibliotecca");
        for (int i=0; i<libri.size(); i++){
            System.out.println(libri.elementAt(i));
        }
    }


}
