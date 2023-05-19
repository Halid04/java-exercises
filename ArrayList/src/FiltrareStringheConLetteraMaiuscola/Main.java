package FiltrareStringheConLetteraMaiuscola;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<String>();
        FiltrareStringheConLetteraMaiuscola obj = new FiltrareStringheConLetteraMaiuscola();

        arrayList.add("niente");
        arrayList.add("Mamma");
        arrayList.add("Arco");
        arrayList.add("parco");
        arrayList.add("Minestra");

        arrayList.remove("Arco");



        System.out.println(obj.letteraMaiuscula(arrayList));


    }
}