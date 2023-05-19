package Es2Package;

import java.util.Vector;

public class Main{
    public static void main(String[] args){
        CheckVectorUguali obj = new CheckVectorUguali();
        Vector<String> vec1 = new Vector<String>();
        Vector<String> vec2 = new Vector<String>();

        vec1.addElement("mamma");
        vec1.addElement("papa");
        vec1.addElement("figli");

        vec2.addElement("mamma");
        vec2.addElement("papa");
        vec2.addElement("figli");

        System.out.println(obj.check(vec1, vec2));


    }
}