package classes;

public class Disciplina {

    private String periodo;
    private Professor professor;
    private Coordenador coordenador;
    
    // Construtores
    public Disciplina(String periodo){
        this.periodo = periodo;
    }
    
    public Disciplina(){
    }
    
    // Retorna o valor do período (min 6, max 17)
    public int periodoParaInt(){
        
        switch(periodo){
            
            case ("PRIMEIRO"): return 6;
            case ("SEGUNDO"): return 7;
            case ("TERCEIRO"): return 8;
            case ("QUARTO"): return 9;
            case ("QUINTO"): return 10;
            case ("SEXTO"): return 11;
            case ("SÉTIMO"): return 12;
            case ("OITAVO"): return 13;
            case ("NONO"): return 14;
            case ("DÉCIMO"): return 15;
            case ("DÉCIMO-PRIMEIRO"): return 16;
            case ("DÉCIMO-SEGUNDO"): return 17;
            default: return 0;
        }
    }

    // Getters e Setters

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Coordenador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }
    
    public void setPeriodo(String periodo){
        this.periodo = periodo;
    }
    
    public String getPeriodo() {
        return periodo;
    }

    // toString para debug
    @Override
    public String toString() {
        return "Disciplina{" + ", periodo=" + periodo
                + '}';
    }
}