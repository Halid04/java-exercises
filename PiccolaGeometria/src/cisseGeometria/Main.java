package cisseGeometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        Rettangolo rettangolo = new Rettangolo();
        Cerchio cerchio = new Cerchio();

        System.out.println("Rettangolo");
        System.out.println("inserire base:");
        rettangolo.setBase(tastiera.nextDouble());

        System.out.println("");
        System.out.println("Inserire Altezza:");
        rettangolo.setAltezza(tastiera.nextDouble());

        System.out.println("");
        System.out.println("Cerchio:");
        System.out.println("Inserire raggio");
        cerchio.setRaggio(tastiera.nextDouble());

        rettangolo.calcolaArea();
        cerchio.calcolaArea();

        System.out.println("");
        System.out.println(rettangolo.toString());
        System.out.println("");
        System.out.println(cerchio.toString());
    }
}