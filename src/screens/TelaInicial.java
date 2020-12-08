package screens;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     * @throws java.io.IOException
     */
    public TelaInicial() throws IOException {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMouseClickInicial = new javax.swing.JLabel();
        txtMouseClickClose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/university_cap_icon_32.png")).getImage());
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/university_cap_icon_256.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Calculadora de Ira");

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        jLabel3.setText("Rafael Nogalha - 190036966");

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 0, 24)); // NOI18N
        jLabel4.setText("Gustavo Tomas - 190014148 ");

        txtMouseClickInicial.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        txtMouseClickInicial.setForeground(new java.awt.Color(0, 0, 255));
        txtMouseClickInicial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMouseClickInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save_icon_32.png"))); // NOI18N
        txtMouseClickInicial.setText("CLIQUE AQUI PARA COMEÇAR!");
        txtMouseClickInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtMouseClickInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMouseClickInicialMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtMouseClickInicialMouseEntered(evt);
            }
        });

        txtMouseClickClose.setFont(new java.awt.Font("Yu Gothic Medium", 0, 14)); // NOI18N
        txtMouseClickClose.setForeground(new java.awt.Color(255, 0, 0));
        txtMouseClickClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMouseClickClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout_icon_32.png"))); // NOI18N
        txtMouseClickClose.setText("CLIQUE AQUI PARA SAIR!");
        txtMouseClickClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMouseClickCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMouseClickInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMouseClickClose, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(38, 38, 38)
                        .addComponent(txtMouseClickInicial)
                        .addGap(18, 18, 18)
                        .addComponent(txtMouseClickClose)))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
    }//GEN-LAST:event_formKeyPressed

    // Caso a mensagem de inicio seja selecionada, vai para tela de login
    private void txtMouseClickInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMouseClickInicialMouseClicked
        setVisible(false);
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setVisible(true);
    }//GEN-LAST:event_txtMouseClickInicialMouseClicked
    
    // Encerra o programa
    private void txtMouseClickCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMouseClickCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtMouseClickCloseMouseClicked

    private void txtMouseClickInicialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMouseClickInicialMouseEntered
    }//GEN-LAST:event_txtMouseClickInicialMouseEntered

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaInicial().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel txtMouseClickClose;
    private javax.swing.JLabel txtMouseClickInicial;
    // End of variables declaration//GEN-END:variables
}