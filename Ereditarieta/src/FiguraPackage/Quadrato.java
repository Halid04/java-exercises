package FiguraPackage;

public class Quadrato extends FormaGeometrica{
    private Double lunghezza;
    public Quadrato(Double lunghezza){
        super(lunghezza, lunghezza);
        this.lunghezza = lunghezza;
    }

    public Double getLunghezza(){
        return lunghezza;
    }
    public void setLunghezza(Double lunghezza){
        this.lunghezza = lunghezza;
    }

    public Double calcolaArea(){
        return lunghezza*lunghezza;
    }

    public Double calcolaPerimetro(){
        return lunghezza*4;
    }
}
