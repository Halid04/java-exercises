package cisseFrequenza;

import java.util.Scanner;

public class GestoreFraseDriver {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        String stringa;

        System.out.println("Inserisci il stringa");
        stringa = tastiera.nextLine();

        GestoreFrase stringa2 = new GestoreFrase(stringa);

        stringa2.analizza();

        System.out.println("");
        System.out.println("frequenza spazi:");
        System.out.println(stringa2.getFreqSpazi());

        System.out.println("");
        System.out.println("frequenza vocali:");
        System.out.println(stringa2.getFreqVocali());

    }

}
