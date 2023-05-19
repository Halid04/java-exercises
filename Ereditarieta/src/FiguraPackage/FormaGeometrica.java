package FiguraPackage;

/*Crea una classe FormaGeometrica
con un metodo calcolaArea() astratto.
Crea due classi, Rettangolo e Cerchio,
che estendono FormaGeometrica e
implementano il metodo calcolaArea().
Crea oggetti Rettangolo e Cerchio e
calcola le loro aree.*/

public abstract class FormaGeometrica{
    private Double lunghezza;
    private Double larghezza;

    public FormaGeometrica(Double lunghezza, Double larghezza){
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
    }

    public Double getLunghezza(){
        return lunghezza;
    }
    public void setLunghezza(Double lunghezza){
        this.lunghezza = lunghezza;
    }

    public Double getLarghezza() {
        return larghezza;
    }
    public void setLarghezza(Double larghezza) {
        this.larghezza = larghezza;
    }

    public abstract Double calcolaArea();
    public abstract Double calcolaPerimetro();

}