// DEBUG ------------------------------------------------------------------------------
//// Gustavo Tomas de Paula - 190014148
//
//package classes;
//
//import java.util.*;
//
//public class Main {
//
//    public static void main() {
//        
//        Ira ira1 = new Ira(0, 0, 6); //obrg trnc, opt trnc, tot mat
//        Ira ira2 = new Ira(0, 0, 7);
//        
//        Aluno aluno1 = new Aluno("PINO", 190014148, "SENHA"); // nome, matr, senha
//        Aluno aluno2 = new Aluno("VINCENT", 929292929, "MUDAMUDA");
//        
////        Disciplina disciplina1 = new Disciplina("APC","primeiro", false, 6, false);
////        Disciplina disciplina2 = new Disciplina("ED","segundo", false, 7, true);
//        
//        Professor professor = new Professor("RERU", 777777777, "SS"); //nome, siap, mencao
//        Coordenador coordenador = new Coordenador("PROXY", 121314156); //nome, siap
//        
//        Disciplina[] disciplina = new Disciplina[2]; // per, opt, cred, tranc
//        
////        disciplina[0] = disciplina1;
////        disciplina[1] = disciplina2;
//        
//        Aluno[] aluno = new Aluno[2];
//        
//        aluno[0] = aluno1;
//        aluno[1] = aluno2;
//        
//        ira1.setAluno(aluno1);
//        ira1.setCoordenador(coordenador);
//        
//        ira2.setAluno(aluno2);
//        ira2.setCoordenador(coordenador);
//        
//        aluno[0].setIra(ira1);
//        aluno[0].setProfessor(professor);
//        
//        aluno1.setProfessor(professor);
//        aluno2.setProfessor(professor);
//        
//        professor.setAluno(aluno);
//        professor.setDisciplina(disciplina);
//    
//        coordenador.setIra(ira1);
//        coordenador.setDisciplina(disciplina);
//        
////        disciplina1.setCoordenador(coordenador);
////        disciplina1.setProfessor(professor);
//        
////        disciplina2.setCoordenador(coordenador);
////        disciplina2.setProfessor(professor);
//        
////        System.out.println(ira.toString());
////        System.out.println(Arrays.toString(aluno));
////        System.out.println(coordenador.toString());
////        System.out.println(Arrays.toString(disciplina));
////        System.out.println(professor.toString());
//    
//        System.out.println("");
//        System.out.println(ira1.getAluno().getNome());
//        System.out.println(ira2.getAluno().getNome());
//        
//        System.out.println(aluno1.getProfessor().getNome());
//        System.out.println(aluno2.getProfessor().getNome());
//    }
//}