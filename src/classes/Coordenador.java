package classes;

public class Coordenador extends Professor{

    private Ira ira;
    private String disciplina;
    
    // Construtores
    public Coordenador(){
    }
    
    public Coordenador(String nome, int siap){
        super(nome, siap);
    }
    
    // Getters e Setters
    public Ira getIra() {
        return ira;
    }

    public void setIra(Ira ira) {
        this.ira = ira;
    }

    @Override
    public String getDisciplina() {
        return disciplina;
    }

    @Override
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    // toString para debug
    @Override
    public String toString() {
        return "Coordenador{" + "ira=" + ira + '}';
    }
}