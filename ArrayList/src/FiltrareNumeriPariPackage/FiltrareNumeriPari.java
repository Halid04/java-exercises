package FiltrareNumeriPariPackage;
/*Scrivi un metodo che accetti un ArrayList di interi e
restituisca un nuovo ArrayList contenente solo i numeri pari presenti nell'originale.*/

import java.util.ArrayList;

public class FiltrareNumeriPari{
    public FiltrareNumeriPari(){}
    public ArrayList<Integer> filtraArratList(ArrayList<Integer> arrayList){
        ArrayList<Integer> newArrayList = new ArrayList<Integer>();

        for(int i=0; i<arrayList.size(); i++){
            if(arrayList.get(i)%2==0){
                newArrayList.add(arrayList.get(i));
            }
        }

        return newArrayList;
    }

}