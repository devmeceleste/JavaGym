
package view;

import javax.swing.JDesktopPane;


public class TelaFuncionario extends javax.swing.JFrame {
    
    private JDesktopPane desktopPane;
    
    
    
    public TelaFuncionario() {
        initComponents(); 
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        Sair = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        abrirCadastroAlunos = new javax.swing.JMenuItem();
        abrirAlterarCadastro = new javax.swing.JMenuItem();
        abrirExcluirCadastro = new javax.swing.JMenuItem();
        abrirListaAlunos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 533, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon23.png"))); // NOI18N

        Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/door_out.png"))); // NOI18N
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        jMenu3.add(Sair);

        jMenuBar3.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/group.png"))); // NOI18N
        jMenu4.setText("Alunos");

        abrirCadastroAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_add.png"))); // NOI18N
        abrirCadastroAlunos.setText("Cadastrar");
        abrirCadastroAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirCadastroAlunosActionPerformed(evt);
            }
        });
        jMenu4.add(abrirCadastroAlunos);

        abrirAlterarCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_edit.png"))); // NOI18N
        abrirAlterarCadastro.setText("Alterar");
        abrirAlterarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirAlterarCadastroActionPerformed(evt);
            }
        });
        jMenu4.add(abrirAlterarCadastro);

        abrirExcluirCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_delete.png"))); // NOI18N
        abrirExcluirCadastro.setText("Excluir");
        abrirExcluirCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirExcluirCadastroActionPerformed(evt);
            }
        });
        jMenu4.add(abrirExcluirCadastro);

        abrirListaAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/page_edit.png"))); // NOI18N
        abrirListaAlunos.setText("Lista de Alunos");
        abrirListaAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirListaAlunosActionPerformed(evt);
            }
        });
        jMenu4.add(abrirListaAlunos);

        jMenuBar3.add(jMenu4);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void abrirExcluirCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirExcluirCadastroActionPerformed
        
    }//GEN-LAST:event_abrirExcluirCadastroActionPerformed

    private void abrirCadastroAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirCadastroAlunosActionPerformed
        CadastroAlunos cadastroAlunos = new CadastroAlunos(this);
        JDesktopPane desktopPane = jDesktopPane1;
    desktopPane.add(cadastroAlunos);
    cadastroAlunos.setVisible(true);
    }//GEN-LAST:event_abrirCadastroAlunosActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        dispose();
        new TelaInicio().setVisible(true);
    }//GEN-LAST:event_SairActionPerformed

    private void abrirAlterarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirAlterarCadastroActionPerformed
        
    }//GEN-LAST:event_abrirAlterarCadastroActionPerformed

    private void abrirListaAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirListaAlunosActionPerformed
        
    }//GEN-LAST:event_abrirListaAlunosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Sair;
    private javax.swing.JMenuItem abrirAlterarCadastro;
    private javax.swing.JMenuItem abrirCadastroAlunos;
    private javax.swing.JMenuItem abrirExcluirCadastro;
    private javax.swing.JMenuItem abrirListaAlunos;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
