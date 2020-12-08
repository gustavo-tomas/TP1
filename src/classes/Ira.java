package classes;

import java.util.Arrays;

public class Ira {

    // dtb = num. disc. obrg. trancadas
    // dtp = num. disc. opt. trancadas    
    // dc = num. disc. matriculadas   
    // pi = peso da menção
    // pei = periodo que disciplina foi cursada {6,...}  
    // cri = num. de creditos de uma disciplina
    
    private int dtb, dtp, dc;
    private int[] pi = new int[100], cri = new int[100], pei = new int[100];
    private Aluno aluno;
    private Coordenador coordenador;
    
    // Construtores 
    public Ira(int dtb, int dtp, int dc) {
        this.dtb = dtb;
        this.dtp = dtp;
        this.dc = dc;
    }
    
    public Ira() {
    }

    // Parte de dados trancados da equação
    public double parteTrancada(){
        
        double valor = 1.0 - (0.6 * dtb + 0.4 * dtp)/dc;
        return valor;
    }
    
    // Parte superior da equação   
    public int parteSuperior(){
        
        int soma = 0;
        for(int i=0; i<dc; i++){
            int prod = pi[i] * cri[i] * pei[i];
            soma += prod; 
        }
        return soma;
    }
    
    // Parte inferior da equação    
    public int parteInferior(){
        
        int soma=0;
        for(int i=0; i<dc; i++){
            int prod = cri[i] * pei[i];
            soma += prod;
        }
        return soma;
    }
    
    // Conta final    
    public double calculaIra(){
        
        int somaSuperior = parteSuperior(), somaInferior = parteInferior();
        double somaTotal=0, somaTrancada = parteTrancada();
            
        somaTotal = somaTrancada * somaSuperior/somaInferior;
        return somaTotal;
    }
    
    // Getters e Setters    
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Coordenador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }
    
    public int[] getPi() {
        for(int i=0; i<dc; i++){
            System.out.println(pi[i]);
        }
        return pi;
    }
    
    public void setPi(int[] pi) {
        this.pi = pi;
    }

    public int[] getCri() {
        for(int i=0; i<dc; i++){
            System.out.println(cri[i]);
        }
        return cri;
    }

    public void setCri(int[] cri) {
        this.cri = cri;
    }

    public int getDtb() {
        return dtb;
    }

    public void setDtb(int dtb) {
        this.dtb = dtb;
    }

    public int getDtp() {
        return dtp;
    }

    public void setDtp(int dtp) {
        this.dtp = dtp;
    }

    public int getDc() {
        return dc;
    }

    public void setDc(int dc) {
        this.dc = dc;
    }

    public int[] getPei() {
        for(int i=0; i<dc; i++){
            System.out.println(pei[i]);
        }
        return pei;
    }

    public void setPei(int[] pei) {
        this.pei = pei;
    }

    // toString para debug
    @Override
    public String toString() {
        return "Ira{" + "dtb=" + dtb + ", dtp=" + dtp + ", dc=" + dc + ", pei="
                + Arrays.toString(pei) + ", pi=" + Arrays.toString(pi) + ", cri=" + Arrays.toString(cri)
                + '}';
    }
}