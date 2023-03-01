package CissePersona;

public class Persona {
    private String nome;
    private int eta;
    private String sesso;

    public Persona(String nome, int eta, String sesso) {
        this.nome = nome;
        this.eta = eta;
        this.sesso = sesso;
    }

    public Persona() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                ", sesso='" + sesso + '\'' +
                '}';
    }
}
