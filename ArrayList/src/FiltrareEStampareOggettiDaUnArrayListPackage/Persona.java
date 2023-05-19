package FiltrareEStampareOggettiDaUnArrayListPackage;

/*Esercizio medio: Crea un ArrayList di oggetti Persona,
dove Persona è una classe con gli attributi nome e età.
Aggiungi alcune persone all'ArrayList e stampa solo le persone con un'età superiore a 30.*/

import java.util.Scanner;

public class Persona{
    Scanner tastiera = new Scanner(System.in);
    private String nome;
    private int eta;

    public Persona(String nome, int eta){
        this.nome = nome;
        this.eta = eta;
    }

    public Persona(){}

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta(){
        return eta;
    }
    public void setEta(int eta){
        this.eta = eta;
    }

    public void createPersona(){
        System.out.println("Inserisci nome:");
        setNome(tastiera.next());

        System.out.println("Inserisci eta:");
        setEta(tastiera.nextInt());
    }

    @Override
    public String toString(){
        return "nome= " + nome + ", " + "età= " + eta;

    }
}