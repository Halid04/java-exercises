package cisseCerchi;

import java.util.Scanner;

public class CerchioArrotDrive {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        double raggioCerchio1 = 0.0;
        double raggioCerchio2 = 0.0;
        double area = 0.0;

        CerchioArrot cerchio1 = new CerchioArrot(raggioCerchio1);
        CerchioArrot cerchio2 = new CerchioArrot(raggioCerchio2);

        System.out.println("Inserisci raggio primo cerchio");
        raggioCerchio1 = tastiera.nextDouble();

        System.out.println("");
        System.out.println("Inserisci raggio secondo cerchio");
        raggioCerchio2 = tastiera.nextDouble();

        System.out.println("area primo cerchio:");
        System.out.println(cerchio1.area(raggioCerchio1));

        area=  cerchio1.area(raggioCerchio1);

        System.out.println("misura circonferenza primo cerchio:");
        System.out.println(cerchio1.circonferenza(raggioCerchio1));

        System.out.println("area primo cerchio:");
        System.out.println(cerchio1.area(area));

        System.out.println("area secondo cerchio:");
        System.out.println(cerchio2.area(raggioCerchio2));

        System.out.println("misura circonferenza secondo cerchio: ");
        System.out.println(cerchio2.circonferenza(raggioCerchio2));

    }

}

