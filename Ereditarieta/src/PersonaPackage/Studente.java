package PersonaPackage;

public class Studente extends Persona{
    private int matricola;

    public Studente(String nome, String cognome ,int matricola){
        super(nome, cognome);
        this.matricola = matricola;
    }

    public int getMatricola(){
        return matricola;
    }
    public void setMatricola(int matricola){
        this.matricola = matricola;
    }

    public void stampaDati(){
        System.out.println("nome= "+ getNome() + ", cognome= " + getNome() + ", matricola= " + matricola);
    }

}