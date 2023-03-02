package cisseLibro;

public class Libro {
    private String titolo;
    private String autore;
    private int numPagine;
    private String genere;

    public Libro(String titolo, String autore, int numPagine, String genere) {
        this.titolo = titolo;
        this.autore = autore;
        this.numPagine = numPagine;
        this.genere = genere;
    }

    public Libro() {
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getNumPagine() {
        return numPagine;
    }

    public void setNumPagine(int numPagine) {
        this.numPagine = numPagine;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", numPagine=" + numPagine +
                ", genere='" + genere + '\'' +
                '}';
    }
}
