package Es2Package;

/*Esercizio medio: Crea due Vector di stringhe e
verifica se contengono gli stessi elementi,
indipendentemente dall'ordine.*/

import java.util.Vector;

public class CheckVectorUguali{
    public CheckVectorUguali(){}

    public Boolean check(Vector<String> vec1, Vector<String> vec2){
        if(vec1.size() == vec2.size() && vec1.equals(vec2) ){
           return true;
        }else {
            return false;
        }
    }
}