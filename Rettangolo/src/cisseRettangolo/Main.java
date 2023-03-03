package cisseRettangolo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        Casa rettangolo = new Casa();
        int opzione;

        System.out.println("");
        System.out.println("Inserire scelta");
        System.out.println("0_exit");
        System.out.println("1_aggiungere rettangolo");
        System.out.println("2_visualizzare tutti i rettangoli");
        System.out.println("3_cancellare rettangolo");
        opzione = tastiera.nextInt();
        while(opzione>=1 && opzione<=3) {
            switch (opzione){
                case 1:
                    rettangolo.aggiungereRettangolo();
                break;

                case 2:
                    rettangolo.visuallizareRettangolo();
                break;

                case 3:
                    rettangolo.rimuovereRettangolo();
                break;

            }

            System.out.println("");
            System.out.println("Inserire scelta");
            System.out.println("0_exit");
            System.out.println("1_aggiungere rettangolo");
            System.out.println("2_visualizzare tutti i rettangoli");
            System.out.println("3_cancellare rettangolo");
            opzione = tastiera.nextInt();
        }
    }
}