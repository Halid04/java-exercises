package PersonaPackage;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Persona> persone = new ArrayList<Persona>();
        Studente s1 = new Studente("halid", "cisse", 11);
        Professore p1 = new Professore("silvia", "Molfese", "italiano");

        persone.add(s1);
        persone.add(p1);

        for(int i=0; i<persone.size(); i++){
            persone.get(i).stampaDati();
        }
    }
}
