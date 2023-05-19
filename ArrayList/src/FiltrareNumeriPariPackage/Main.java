package FiltrareNumeriPariPackage;

import java.util.ArrayList;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        FiltrareNumeriPari obj = new FiltrareNumeriPari();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Random randomNum = new Random();


        arrayList.add(randomNum.nextInt(100-1)+1);
        arrayList.add(randomNum.nextInt(100-1)+1);
        arrayList.add(randomNum.nextInt(100-1)+1);
        arrayList.add(randomNum.nextInt(100-1)+1);
        arrayList.add(randomNum.nextInt(100-1)+1);
        arrayList.add(randomNum.nextInt(100-1)+1);
        arrayList.add(randomNum.nextInt(100-1)+1);

        System.out.println(obj.filtraArratList(arrayList));


    }
}
