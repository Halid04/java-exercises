package PersonaPackage;

/*Crea una classe Persona con attributi come nome,
cognome e età. Crea una classe Studente
che estende Persona e aggiunge un attributo matricola.
Crea una classe Professore che estende Persona
e aggiunge un attributo materia.
Crea un ArrayList di oggetti Persona e
aggiungi alcune istanze di Studente e Professore.
Stampa le informazioni di ciascuna persona
nell'ArrayList.*/

public abstract class Persona{
    private String nome;
    private String cognome;

    public Persona(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public abstract void stampaDati();
}