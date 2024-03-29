package screens;

import classes.Coordenador;
import classes.Disciplina;
import classes.Ira;
import classes.Professor;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.*;

public class TelaIRA extends javax.swing.JFrame {

    // Listas dinamicas auxiliares
    ArrayList<Ira> listaIra = new ArrayList();
    ArrayList<Disciplina> listaDisciplina = new ArrayList();
    ArrayList<Coordenador> listaCoordenador = new ArrayList();
    
    private int[] periodo = new int[100]; 
    private int[] peso = new int[100];
    private int[] creditos = new int[100];
    int i=0, contDisciplinas = 0;
    boolean keep = true;
    Ira ira = new Ira();
    
    /**
     * Creates new form TelaIRA
     */
    public TelaIRA() {
        initComponents();
        setLocationRelativeTo(null);
        txfPesoIRA.setEnabled(false);
        txfCreditosIRA.setEnabled(false);
        txfPeriodoIRA.setEnabled(false);
        txfNomeDisciplinaIRA.setEnabled(false);
        btnAvancarIRA.setEnabled(false);
        btnConcluirIRA.setEnabled(false);
    }
    
    // Funcao que transforma o valor em inteiro para string
    public String pesoParaString(int pes){
        
        switch(pes){
            case (5): return "SS";
            case (4): return "MS";
            case (3): return "MM";
            case (2): return "MI";
            case (1): return "II";
            case (0): return "SR";
            default: return "SR";
        }
    }
    
    // Salva os dados na tabela
    public void carregarNaTabela(){
        
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Nome da Disciplina", "Nºcréditos","Peso mensão","Período cursado"},0);
        for(int j=0;j<listaDisciplina.size();j++){
            
            int[] cri = listaIra.get(j).getCri();
            int[] pi = listaIra.get(j).getPi();
            String pe = pesoParaString(pi[j]);
            int[] pei = listaIra.get(j).getPei();
            Disciplina disciplina = new Disciplina();
            JTable table = new JTable();
            
            Object linha[] = new Object[]{listaCoordenador.get(j).getDisciplina(),
                                          cri[j],
                                          pe,
                                          listaDisciplina.get(j).getPeriodo()};
            modelo.addRow(linha);
        }
        
        // tabela recebe modelo
        jTable1.setModel(modelo);
    }
    
    // Verifica se os campos foram preenchidos
    private boolean checkField(){
        return !txfObrigatoriasIRA.getText().equals("") && !txfMatriculadasIRA.getText().equals("") && !txfOptativasIRA.getText().equals("");
    }

    // Verifica se os campos foram preenchidos
    private boolean checkFieldPCP(){
        return !txfPesoIRA.getText().equals("") && !txfCreditosIRA.getText().equals("") && !txfPeriodoIRA.getText().equals("")&&!txfNomeDisciplinaIRA.getText().equals("");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloIRA = new javax.swing.JLabel();
        lblObrigatoriasIRA = new javax.swing.JLabel();
        lblOptativasIRA = new javax.swing.JLabel();
        lblCreditosIRA = new javax.swing.JLabel();
        lblPesoIRA = new javax.swing.JLabel();
        lblPeriodoIRA = new javax.swing.JLabel();
        lblNomeDisciplinaIRA = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txfObrigatoriasIRA = new javax.swing.JTextField();
        txfOptativasIRA = new javax.swing.JTextField();
        txfMatriculadasIRA = new javax.swing.JTextField();
        txfCreditosIRA = new javax.swing.JTextField();
        txfPesoIRA = new javax.swing.JTextField();
        txfPeriodoIRA = new javax.swing.JTextField();
        txfNomeDisciplinaIRA = new javax.swing.JTextField();
        btnAvancarIRA = new javax.swing.JButton();
        btnVoltarLogin = new javax.swing.JButton();
        btnConcluirIRA = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/university_cap_icon_32.png")).getImage());
        setResizable(false);

        lblTituloIRA.setFont(new java.awt.Font("Yu Gothic Medium", 1, 24)); // NOI18N
        lblTituloIRA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloIRA.setText("IRA");

        lblObrigatoriasIRA.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        lblObrigatoriasIRA.setText("Número de disciplinas obrigatórias Trancadas");

        lblOptativasIRA.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        lblOptativasIRA.setText("Número de disciplinas optativas Trancadas");

        lblCreditosIRA.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        lblCreditosIRA.setText("Número de créditos da disciplina");

        lblPesoIRA.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        lblPesoIRA.setText("Peso da mensão (SS, MS, MM , MI , II , SR )");

        lblPeriodoIRA.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        lblPeriodoIRA.setText("Período em que a disciplina foi cursada (primeiro, segundo, ...)");

        lblNomeDisciplinaIRA.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        lblNomeDisciplinaIRA.setText("Nome da disciplina");

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        jLabel1.setText("Número de disciplinas matriculadas (incluindo as trancadas)");

        txfObrigatoriasIRA.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        txfObrigatoriasIRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfObrigatoriasIRAActionPerformed(evt);
            }
        });
        txfObrigatoriasIRA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfObrigatoriasIRAKeyPressed(evt);
            }
        });

        txfOptativasIRA.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        txfOptativasIRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfOptativasIRAActionPerformed(evt);
            }
        });

        txfMatriculadasIRA.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        txfMatriculadasIRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfMatriculadasIRAActionPerformed(evt);
            }
        });

        txfCreditosIRA.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        txfCreditosIRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCreditosIRAActionPerformed(evt);
            }
        });

        txfPesoIRA.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        txfPesoIRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfPesoIRAActionPerformed(evt);
            }
        });

        txfPeriodoIRA.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        txfPeriodoIRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfPeriodoIRAActionPerformed(evt);
            }
        });

        txfNomeDisciplinaIRA.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        txfNomeDisciplinaIRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNomeDisciplinaIRAActionPerformed(evt);
            }
        });

        btnAvancarIRA.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        btnAvancarIRA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/seta_direita_icon_32.png"))); // NOI18N
        btnAvancarIRA.setText("Avançar");
        btnAvancarIRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarIRAActionPerformed(evt);
            }
        });

        btnVoltarLogin.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        btnVoltarLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/seta_esquerda_icon_32.png"))); // NOI18N
        btnVoltarLogin.setText("Voltar");
        btnVoltarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarLoginActionPerformed(evt);
            }
        });

        btnConcluirIRA.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        btnConcluirIRA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/university_cap_icon_32.png"))); // NOI18N
        btnConcluirIRA.setText("Concluir");
        btnConcluirIRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirIRAActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(lblTituloIRA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(133, 133, 133))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfObrigatoriasIRA)
                    .addComponent(txfOptativasIRA)
                    .addComponent(lblObrigatoriasIRA)
                    .addComponent(lblOptativasIRA)
                    .addComponent(txfPeriodoIRA)
                    .addComponent(txfPesoIRA)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txfCreditosIRA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                            .addComponent(txfNomeDisciplinaIRA, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeDisciplinaIRA, javax.swing.GroupLayout.Alignment.LEADING))
                        .addComponent(lblCreditosIRA)
                        .addComponent(lblPesoIRA)
                        .addComponent(lblPeriodoIRA))
                    .addComponent(jLabel1)
                    .addComponent(txfMatriculadasIRA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltarLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAvancarIRA)
                .addGap(3, 3, 3)
                .addComponent(btnConcluirIRA)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloIRA, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfMatriculadasIRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblObrigatoriasIRA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfObrigatoriasIRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOptativasIRA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfOptativasIRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomeDisciplinaIRA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfNomeDisciplinaIRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCreditosIRA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfCreditosIRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPesoIRA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfPesoIRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPeriodoIRA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfPeriodoIRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAvancarIRA)
                    .addComponent(btnVoltarLogin)
                    .addComponent(btnConcluirIRA))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Controle dos botoes
    private void txfObrigatoriasIRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfObrigatoriasIRAActionPerformed

        if(checkField() == true){
            txfObrigatoriasIRA.setEnabled(false);
            txfMatriculadasIRA.setEnabled(false);
            txfOptativasIRA.setEnabled(false);
            txfPesoIRA.setEnabled(true);
            txfCreditosIRA.setEnabled(true);
            txfPeriodoIRA.setEnabled(true);
            txfNomeDisciplinaIRA.setEnabled(true);
            btnAvancarIRA.setEnabled(true);
        }
    }//GEN-LAST:event_txfObrigatoriasIRAActionPerformed

    private void txfMatriculadasIRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfMatriculadasIRAActionPerformed
        
        if(checkField() == true){
            txfPesoIRA.setEnabled(true);
            txfCreditosIRA.setEnabled(true);
            txfPeriodoIRA.setEnabled(true);
            btnAvancarIRA.setEnabled(true);
            txfNomeDisciplinaIRA.setEnabled(true);
            txfObrigatoriasIRA.setEnabled(false);
            txfMatriculadasIRA.setEnabled(false);
            txfOptativasIRA.setEnabled(false);
        }
    }//GEN-LAST:event_txfMatriculadasIRAActionPerformed

    private void txfOptativasIRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfOptativasIRAActionPerformed
        
        if(checkField() == true){
            txfPesoIRA.setEnabled(true);
            txfCreditosIRA.setEnabled(true);
            txfPeriodoIRA.setEnabled(true);
            btnAvancarIRA.setEnabled(true);
            txfNomeDisciplinaIRA.setEnabled(true);
            txfObrigatoriasIRA.setEnabled(false);
            txfMatriculadasIRA.setEnabled(false);
            txfOptativasIRA.setEnabled(false);
        }
    }//GEN-LAST:event_txfOptativasIRAActionPerformed

    private void txfPesoIRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfPesoIRAActionPerformed
    }//GEN-LAST:event_txfPesoIRAActionPerformed

    private void txfCreditosIRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCreditosIRAActionPerformed
    }//GEN-LAST:event_txfCreditosIRAActionPerformed

    private void txfPeriodoIRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfPeriodoIRAActionPerformed
    }//GEN-LAST:event_txfPeriodoIRAActionPerformed

    // Botao avançar salva os dados inseridos
    private void btnAvancarIRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarIRAActionPerformed
 
        if(checkFieldPCP() == true){
            String nomeDisciplina = txfNomeDisciplinaIRA.getText().toUpperCase();
            String peri = txfPeriodoIRA.getText().toUpperCase();
            Disciplina disciplina = new Disciplina(peri);
            Coordenador coordenador = new Coordenador();
            Professor professor = new Professor();
            String pp = txfPesoIRA.getText().toUpperCase();
            coordenador.setDisciplina(nomeDisciplina);
            
            professor.setMencaoDoAluno(pp);
            peso[i] = professor.mencaoParaInt();
            System.out.println(peso[i]);
            creditos[i] = Integer.parseInt(txfCreditosIRA.getText());
            periodo[i] = disciplina.periodoParaInt();
            System.out.println(periodo[i]);
            ira.setPi(peso);
            ira.setPei(periodo);
            ira.setCri(creditos);  
            txfPesoIRA.setText("");
            txfCreditosIRA.setText("");
            txfPeriodoIRA.setText("");
            txfNomeDisciplinaIRA.setText("");
            i++;
            contDisciplinas++;
            listaIra.add(ira);
            listaDisciplina.add(disciplina);
            listaCoordenador.add(coordenador);
            
            carregarNaTabela();
            
            if(contDisciplinas == Integer.parseInt(txfMatriculadasIRA.getText())){
                btnAvancarIRA.setEnabled(false);
                btnConcluirIRA.setEnabled(true);
            }
            
        // Caso os dados sejam inseridos incorretamente, mostra erro   
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de continuar");
        }

    }//GEN-LAST:event_btnAvancarIRAActionPerformed

    private void txfObrigatoriasIRAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfObrigatoriasIRAKeyPressed
    }//GEN-LAST:event_txfObrigatoriasIRAKeyPressed

    // Salva o resultado num arquivo de texto 
    private void btnConcluirIRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirIRAActionPerformed

        ira.setPi(peso);
        ira.setPei(periodo);
        ira.setCri(creditos);   
        
        ira.setDtb(Integer.parseInt(txfObrigatoriasIRA.getText()));
        ira.setDtp(Integer.parseInt(txfOptativasIRA.getText()));
        ira.setDc(Integer.parseInt(txfMatriculadasIRA.getText())); 
        
        try {
            FileWriter fw2 = new FileWriter("files/ira.txt");
            
            try(PrintWriter pw = new PrintWriter(fw2)){
                pw.println(ira.calculaIra());
            }

        } catch (IOException ex) {
            Logger.getLogger(TelaIRA.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(ira.calculaIra());
        
        TelaResultado telaResultado = new TelaResultado();
        telaResultado.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnConcluirIRAActionPerformed

    private void btnVoltarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarLoginActionPerformed
        txfObrigatoriasIRA.setEnabled(true);
        txfMatriculadasIRA.setEnabled(true);
        txfOptativasIRA.setEnabled(true);
        txfPesoIRA.setEnabled(false);
        txfCreditosIRA.setEnabled(false);
        txfPeriodoIRA.setEnabled(false);
        btnAvancarIRA.setEnabled(false);
        txfNomeDisciplinaIRA.setEnabled(false);
    }//GEN-LAST:event_btnVoltarLoginActionPerformed

    private void txfNomeDisciplinaIRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNomeDisciplinaIRAActionPerformed
    }//GEN-LAST:event_txfNomeDisciplinaIRAActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaIRA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaIRA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaIRA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaIRA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaIRA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvancarIRA;
    private javax.swing.JButton btnConcluirIRA;
    private javax.swing.JButton btnVoltarLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCreditosIRA;
    private javax.swing.JLabel lblNomeDisciplinaIRA;
    private javax.swing.JLabel lblObrigatoriasIRA;
    private javax.swing.JLabel lblOptativasIRA;
    private javax.swing.JLabel lblPeriodoIRA;
    private javax.swing.JLabel lblPesoIRA;
    private javax.swing.JLabel lblTituloIRA;
    private javax.swing.JTextField txfCreditosIRA;
    private javax.swing.JTextField txfMatriculadasIRA;
    private javax.swing.JTextField txfNomeDisciplinaIRA;
    private javax.swing.JTextField txfObrigatoriasIRA;
    private javax.swing.JTextField txfOptativasIRA;
    private javax.swing.JTextField txfPeriodoIRA;
    private javax.swing.JTextField txfPesoIRA;
    // End of variables declaration//GEN-END:variables
}