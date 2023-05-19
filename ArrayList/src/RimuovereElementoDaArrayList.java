/*Crea un ArrayList di stringhe e aggiungi alcune parole.
Rimuovi una parola dall'ArrayList utilizzando il suo indice.
Stampa l'ArrayList risultante.*/


import java.util.ArrayList;

public class RimuovereElementoDaArrayList{
    public static void main (String[] args){
        ArrayList<String> parole = new ArrayList<String>();

        parole.add("classe");
        parole.add("java");
        parole.add("cancellato");
        parole.add("tapiro");

        parole.remove(2);

        for (int i=0; i<parole.size(); i++){
            System.out.println(parole.get(i));
        }

    }

}