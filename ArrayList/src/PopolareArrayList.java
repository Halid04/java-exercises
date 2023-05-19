/*Crea un ArrayList di interi e aggiungi i numeri da 1 a 10.
Stampa l'intero ArrayList usando un ciclo for.*/


import java.util.ArrayList;

public class PopolareArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);
        num.add(8);
        num.add(9);
        num.add(10);

        for(int i=0; i<num.size(); i++){
            System.out.println("num= " + num.get(i));
        }
    }
}