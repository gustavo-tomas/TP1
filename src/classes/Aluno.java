package classes;

public class Aluno {

    private int matricula;
    private String nome;
    private String senha;
    private Ira ira;
    private Professor professor;
    
    // Construtores
    public Aluno(String nome, int matricula, String senha) {
        this.nome = nome;
        this.matricula = matricula;
        this.senha = senha;
    }
    
    // Getters e Setters
    public Ira getIra() {
        return ira;
    }

    public void setIra(Ira ira) {
        this.ira = ira;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getSenha() {
        return senha;
    }

    // toString para debug
    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", nome=" + nome
                + ", senha=" + senha + '}';
    }
}