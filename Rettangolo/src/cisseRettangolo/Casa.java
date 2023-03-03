package cisseRettangolo;

import java.util.Scanner;
import java.util.Vector;

public class Casa {
    Vector<Rettangolo> rettangoli = new Vector<Rettangolo>();
    Scanner input = new Scanner(System.in);

    public void aggiungereRettangolo(){
        double b;
        double h;

        System.out.println("");
        do {
            System.out.println("Inserire lunghezza(altezza)");
            h = input.nextDouble();
        }while (h<=0);

        System.out.println("");
        do{
            System.out.println("Inserire larghezza(base)");
            b = input.nextDouble();
        }while (b<=0);

        Rettangolo nuovoRettangolo = new Rettangolo(h,b);
        nuovoRettangolo.calcoloArea();
        rettangoli.addElement(nuovoRettangolo);
        System.out.println(nuovoRettangolo);
    }

    public void visuallizareRettangolo(){
        if (rettangoli.size()>=1){
            for (int i=0; i<rettangoli.size();i++){
                System.out.println("");
                System.out.println("rettangolo "+i);
                System.out.println(rettangoli.elementAt(i));
            }
        }else {
            System.out.println("non c'è nessun rettangolo");
        }

    }

    public void rimuovereRettangolo(){
        if (rettangoli.size()>=1){
            int index;
            System.out.println("");
            System.out.println("Ecco tutti i rettangoli:");
            for (int i=0; i<rettangoli.size();i++){
                System.out.println("");
                System.out.println("rettangolo "+i);
                System.out.println(rettangoli.elementAt(i));
            }

            do {
                System.out.println("");
                System.out.println("Inserire posizone rettangolo da cancellare (da 0 a n)");
                index = input.nextInt();
            }while(index<0 || index>rettangoli.size());
            rettangoli.removeElementAt(index);

            System.out.println("");
            System.out.println("Tabella aggiornata:");
            for (int i=0; i<rettangoli.size();i++){
                System.out.println("");
                System.out.println("rettangolo "+i);
                System.out.println(rettangoli.elementAt(i));
            }
        }else {
            System.out.println("non c'è nessun rettangolo");
        }
    }


}
