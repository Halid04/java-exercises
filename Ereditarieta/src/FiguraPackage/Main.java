package FiguraPackage;

public class Main {
    public static void main(String[] Args){
        Quadrato q1 = new Quadrato(5.0);
        Cerchio c1 = new Cerchio(2.6);

        System.out.println(q1.calcolaArea());
        System.out.println(q1.calcolaPerimetro());

        System.out.println(c1.calcolaArea());
        System.out.println(c1.calcolaPerimetro());
    }
}
