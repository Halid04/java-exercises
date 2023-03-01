package CissePersona;

public class Studente extends Persona {
    private int matricola;

    public Studente(String nome, int eta, String sesso, int matricola) {
        super(nome, eta, sesso);
        this.matricola = matricola;
    }

    public Studente(int matricola) {
        this.matricola = matricola;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }



    @Override
    public String toString() {
        return "Studente{" +
                "nome=" + getNome() +
                ", eta=" + getEta() +
                ", sesso="+ getSesso() +
                ", matricola=" + matricola +
                '}';
    }
}
