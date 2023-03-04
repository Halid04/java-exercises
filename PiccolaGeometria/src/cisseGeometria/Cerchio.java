package cisseGeometria;

public class Cerchio extends FiguraGeometrica{
    private double raggio;

    public Cerchio(double raggio) {
        this.raggio = raggio;
    }

    public Cerchio() {
    }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    double area;

    @Override
    public double calcolaArea() {
        area = (raggio*raggio)*3.14;
        return area;
    }

    @Override
    public String toString() {
        return "Cerchio{" +
                "raggio=" + raggio +
                ", area=" + area +
                '}';
    }
}
