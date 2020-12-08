package classes;

public class Professor {

    private String nome;
    private String mencaoDoAluno;
    private String disciplina;
    private Aluno[] aluno;

    // Construtores
    public Professor(String nome, int siap) {
        this.mencaoDoAluno = mencaoDoAluno;
    }
    
    public Professor (){
    }
    
    public Professor(String nome, int siap, String mencaoDoAluno){
        this.nome = nome;
        this.mencaoDoAluno = mencaoDoAluno;
    }
    
    // Retorna o peso da mencao (min 0, max 5)
    public int mencaoParaInt(){
        switch(mencaoDoAluno){
            case("SR"): return 0;
            case("II"): return 1;
            case("MI"): return 2;
            case("MM"): return 3;
            case("MS"): return 4;
            case("SS"): return 5;
            default: return 0;
        } 
    }

    // Getters e Setters
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public void setMencaoDoAluno(String mencaoDoAluno) {
        this.mencaoDoAluno = mencaoDoAluno;
    }
    
    public String getMencaoDoAluno() {
        return mencaoDoAluno;
    }

    public String getNome() {
        return nome;
    }

    // toString para debug
    @Override
    public String toString() {
        return "Professor{" + ", nome=" + nome
                + ", mencaoDoAluno=" + mencaoDoAluno
                + '}';
    }
}