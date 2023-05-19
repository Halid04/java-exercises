package FiltrareEStampareOggettiDaUnArrayListPackage;

import java.util.ArrayList;

public class FiltrareEStampareOggettiDaUnArrayList{
    public static void main(String[] args){
        ArrayList<Persona> persone = new ArrayList<Persona>();
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();

        System.out.println("persona 1");
        p1.createPersona();

        System.out.println(" ");

        System.out.println("persona 2");
        p2.createPersona();

        System.out.println(" ");

        System.out.println("persona 3");
        p3.createPersona();

        System.out.println(" ");

        System.out.println("persona 4");
        p4.createPersona();

        persone.add(p1);
        persone.add(p2);
        persone.add(p3);
        persone.add(p4);

        for (int i=0; i<persone.size(); i++){
            if(persone.get(i).getEta() > 30){
                System.out.println(persone.get(i).toString());
            }
        }


    }
}