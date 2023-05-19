package Es1Package;

/*Esercizio facile: Crea un Vector di oggetti Prodotto,
dove Prodotto è una classe
con gli attributi nome e prezzo.
Aggiungi alcuni prodotti al Vector e
calcola il prezzo medio dei prodotti presenti.*/

public class Prodotto{
    private String nome;
    private Double prezzo;

    public Prodotto(String nome, Double prezzo){
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public Prodotto(){}

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public Double getPrezzo(){
        return prezzo;
    }
    public void setPrezzo(Double prezzo){
        this.prezzo = prezzo;
    }

    @Override
    public String toString(){
        return "Nome= " + nome + ", " + "Prezzo= " + prezzo;
    }

}