package cisseFrequenza;

public class GestoreFrase {
    private String testo;
    private int vocali = 0;
    private int spazi = 0;

    public GestoreFrase(String testo, int vocali, int spazi) {
        this.testo = testo;
        this.vocali = vocali;
        this.spazi = spazi;
    }

    public GestoreFrase() {
    }

    public GestoreFrase(String testo) {
        this.testo = testo;
    }

    public String getTesto() {
        return testo;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public int getVocali() {
        return vocali;
    }

    public void setVocali(int vocali) {
        this.vocali = vocali;
    }

    public int getSpazi() {
        return spazi;
    }

    public void setSpazi(int spazi) {
        this.spazi = spazi;
    }

    public void analizza() {
        testo = testo.toLowerCase();

        for (int i = 0; i < testo.length(); i++) {
            char c = testo.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocali++;
            }
            else if (c == ' ') {
                spazi++;
            }
        }
        System.out.println("numero vocali: "+vocali);
        System.out.println("numero spazi: "+spazi);
    }

    public int getFreqVocali(){
        int freqVocaliSenzaSpazi = (testo.length()-spazi/vocali)*100;
        int freqVocaliConSpazi = vocali*100/testo.length();

        return freqVocaliConSpazi;
    }

    public int getFreqSpazi(){
        int getFreqSpazi = (spazi*100/testo.length());

        return getFreqSpazi;
    }

}

