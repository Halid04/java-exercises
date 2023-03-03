package cisseRettangolo;

public class Rettangolo {
    private double lunghezza;
    private double larghezza;

    public Rettangolo(double lunghezza, double larghezza) {
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
    }

    public Rettangolo() {
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(double lunghezza) {
        this.lunghezza = lunghezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }

    double area;

    public double calcoloArea(){
        area = lunghezza*larghezza;
        return area;
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "lunghezza=" + lunghezza +
                ", larghezza=" + larghezza +
                ", area="+ area+
                '}';
    }
}
