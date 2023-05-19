package PersonaPackage;

public class Professore extends Persona{
    private String materia;

    public Professore(String nome, String cognome ,String materia){
        super(nome, cognome);
        this.materia = materia;
    }

    public String getMateria(){
        return materia;
    }
    public void setMateria(String materia){
        this.materia = materia;
    }

    public void stampaDati(){
        System.out.println("nome= "+ getNome() + ", cognome= " + getNome() + ", materia= " + materia);
    }
}
