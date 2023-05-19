package FiguraPackage;

public class Cerchio extends FormaGeometrica{
    private Double raggio;

    public Cerchio(Double raggio){
        super(raggio, raggio);
        this.raggio = raggio;
    }

    public Double calcolaArea(){
        return 3.14*raggio*raggio;
    }

    public Double calcolaPerimetro(){
        return 3.14*3.14*raggio;
    }
}