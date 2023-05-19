package FiltrareStringheConLetteraMaiuscola;

/*Esercizio avanzato: Scrivi un metodo che accetti
un ArrayList di stringhe e restituisca
un nuovo ArrayList contenente solo
le stringhe che iniziano con una lettera maiuscola.*/

import java.util.ArrayList;

public class FiltrareStringheConLetteraMaiuscola {
    public FiltrareStringheConLetteraMaiuscola(){}

    public ArrayList<String> letteraMaiuscula (ArrayList<String> arrayList){
        ArrayList<String> newArrayList = new ArrayList<String>();
        for(int i=0; i<arrayList.size(); i++){
            char primaLettera = arrayList.get(i).charAt(0);
            if(Character.isUpperCase(primaLettera)){
                newArrayList.add(arrayList.get(i));
            }

        }

        return newArrayList;
    }
}