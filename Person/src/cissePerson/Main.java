package cissePerson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Definire una classe "Person" con gli attributi "name" e "age".
        Definire una classe "Employee" che estende "Person" e
        ha un attributo "salary". Definire una classe "Manager" che
        estende "Employee" e ha un attributo "bonus". Sovrascrivere
        il metodo "toString" per restituire una stringa che
        rappresenta l'oggetto in modo leggibile.*/

        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserire nome");
        String nome = tastiera.next();

        System.out.println("");
        System.out.println("Inserire eta");
        int eta = tastiera.nextInt();

        System.out.println("");
        System.out.println("Inserire salario");
        double salario = tastiera.nextDouble();

        System.out.println("");
        System.out.println("Inserire bonus");
        double bonus = tastiera.nextDouble();

        Manager manager = new Manager(nome, eta, salario,bonus);
        System.out.println(manager.toString());
    }
}