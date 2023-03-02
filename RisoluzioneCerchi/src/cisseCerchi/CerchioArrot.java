package cisseCerchi;

public class CerchioArrot {
    private double raggio;

    private double area;

    private double circonferenza;

    private double pigreco = 3.14;

    public CerchioArrot(double raggio, double area, double circonferenza, double pigreco) {
        this.raggio = raggio;
        this.area = area;
        this.circonferenza = circonferenza;
        this.pigreco = pigreco;
    }

    public CerchioArrot() {
    }

    public CerchioArrot(double raggio) {
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    public double area(double raggio){
        area = raggio*raggio*pigreco;

        return area;
    }
    public double circonferenza(double raggio){
        circonferenza = 2*pigreco*raggio;

        return circonferenza;
    }

}
