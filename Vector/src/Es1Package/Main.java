package Es1Package;

import java.util.Vector;

public class Main{
    public static void main(String[] args){
        Vector<Prodotto> prodotti = new Vector<Prodotto>();
        Prodotto p1 = new Prodotto();
        Prodotto p2 = new Prodotto();
        Prodotto p3 = new Prodotto();
        Prodotto p4 = new Prodotto();
        Double somma = 0.0;
        Double media = 0.0;

        p1.setNome("acqua");
        p1.setPrezzo(1.5);

        p2.setNome("carta igienica");
        p2.setPrezzo(5.0);

        p3.setNome("succo");
        p3.setPrezzo((7.90));

        p4.setNome("pizza");
        p4.setPrezzo(19.50);

        prodotti.addElement(p1);
        prodotti.addElement(p2);
        prodotti.addElement(p3);
        prodotti.addElement(p4);

        for(int i=0; i<prodotti.size(); i++){
            somma += prodotti.elementAt(i).getPrezzo();
            System.out.println(prodotti.elementAt(i));
        }

        media = somma/prodotti.size();
        System.out.println("Media prezzi prodotti= " + media);




    }
}