/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Joao
 */
public class JogoWeb2P extends javax.swing.JFrame {

    public JogoWeb2P() {
        initComponents();
        setTitle("Jogo da Velha");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnljogo = new javax.swing.JPanel();
        btjogo1 = new javax.swing.JButton();
        btjogo2 = new javax.swing.JButton();
        btjogo3 = new javax.swing.JButton();
        btjogo4 = new javax.swing.JButton();
        btjogo5 = new javax.swing.JButton();
        btjogo6 = new javax.swing.JButton();
        btjogo7 = new javax.swing.JButton();
        btjogo8 = new javax.swing.JButton();
        btjogo9 = new javax.swing.JButton();
        pnljogadores = new javax.swing.JPanel();
        lblmenujogadores = new javax.swing.JLabel();
        lbljogador1 = new javax.swing.JLabel();
        lbljogador2 = new javax.swing.JLabel();
        variaveljogador1 = new javax.swing.JLabel();
        variaveljogador2 = new javax.swing.JLabel();
        pnlcontrolejogo = new javax.swing.JPanel();
        btjogovoltar = new javax.swing.JButton();
        btnovojogo = new javax.swing.JButton();
        lblnomejogador1 = new javax.swing.JLabel();
        lblnomejogador2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnljogo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btjogo1.setMaximumSize(new java.awt.Dimension(70, 20));
        btjogo1.setMinimumSize(new java.awt.Dimension(70, 20));
        btjogo1.setPreferredSize(new java.awt.Dimension(70, 20));
        btjogo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btjogo1ActionPerformed(evt);
            }
        });

        btjogo2.setPreferredSize(new java.awt.Dimension(70, 20));
        btjogo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btjogo2ActionPerformed(evt);
            }
        });

        btjogo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btjogo3ActionPerformed(evt);
            }
        });

        btjogo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btjogo4ActionPerformed(evt);
            }
        });

        btjogo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btjogo5ActionPerformed(evt);
            }
        });

        btjogo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btjogo6ActionPerformed(evt);
            }
        });

        btjogo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btjogo7ActionPerformed(evt);
            }
        });

        btjogo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btjogo8ActionPerformed(evt);
            }
        });

        btjogo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btjogo9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnljogoLayout = new javax.swing.GroupLayout(pnljogo);
        pnljogo.setLayout(pnljogoLayout);
        pnljogoLayout.setHorizontalGroup(
            pnljogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnljogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnljogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btjogo7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btjogo4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btjogo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnljogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btjogo2, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(btjogo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btjogo8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnljogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btjogo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btjogo6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btjogo9, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnljogoLayout.setVerticalGroup(
            pnljogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnljogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnljogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btjogo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btjogo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btjogo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnljogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btjogo4, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(btjogo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btjogo6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnljogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btjogo7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(btjogo8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btjogo9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnljogadores.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu de Jogadores"));

        lblmenujogadores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblmenujogadores.setText("Jogadores");

        lbljogador1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbljogador1.setText("Jogador 1:");

        lbljogador2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbljogador2.setText("Jogador 2:");

        variaveljogador1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        variaveljogador1.setText("X");

        variaveljogador2.setText("O");

        pnlcontrolejogo.setBorder(javax.swing.BorderFactory.createTitledBorder("Controle de Jogo"));

        btjogovoltar.setText("Voltar");
        btjogovoltar.setAlignmentY(0.0F);
        btjogovoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btjogovoltarActionPerformed(evt);
            }
        });

        btnovojogo.setText("Novo");
        btnovojogo.setAlignmentY(0.0F);
        btnovojogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnovojogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlcontrolejogoLayout = new javax.swing.GroupLayout(pnlcontrolejogo);
        pnlcontrolejogo.setLayout(pnlcontrolejogoLayout);
        pnlcontrolejogoLayout.setHorizontalGroup(
            pnlcontrolejogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlcontrolejogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlcontrolejogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnovojogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btjogovoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlcontrolejogoLayout.setVerticalGroup(
            pnlcontrolejogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlcontrolejogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnovojogo)
                .addGap(18, 18, 18)
                .addComponent(btjogovoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblnomejogador1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblnomejogador1.setText("Humano");

        lblnomejogador2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblnomejogador2.setText("Humano");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Chat"));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jButton1.setText("Enviar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnljogadoresLayout = new javax.swing.GroupLayout(pnljogadores);
        pnljogadores.setLayout(pnljogadoresLayout);
        pnljogadoresLayout.setHorizontalGroup(
            pnljogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnljogadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnljogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnljogadoresLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnljogadoresLayout.createSequentialGroup()
                        .addGroup(pnljogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnomejogador2)
                            .addComponent(lblnomejogador1)
                            .addGroup(pnljogadoresLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(lblmenujogadores))
                            .addGroup(pnljogadoresLayout.createSequentialGroup()
                                .addComponent(lbljogador2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(variaveljogador2))
                            .addGroup(pnljogadoresLayout.createSequentialGroup()
                                .addComponent(lbljogador1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(variaveljogador1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlcontrolejogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnljogadoresLayout.setVerticalGroup(
            pnljogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnljogadoresLayout.createSequentialGroup()
                .addGroup(pnljogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnljogadoresLayout.createSequentialGroup()
                        .addComponent(lblmenujogadores)
                        .addGap(5, 5, 5)
                        .addComponent(lblnomejogador1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnljogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(variaveljogador1)
                            .addComponent(lbljogador1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblnomejogador2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnljogadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbljogador2)
                            .addComponent(variaveljogador2)))
                    .addComponent(pnlcontrolejogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnljogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnljogadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnljogadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnljogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnovojogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovojogoActionPerformed
        btjogo1.setText(null);
        btjogo2.setText(null);
        btjogo3.setText(null);
        btjogo4.setText(null);
        btjogo5.setText(null);
        btjogo6.setText(null);
        btjogo7.setText(null);
        btjogo8.setText(null);
        btjogo9.setText(null);
    }//GEN-LAST:event_btnovojogoActionPerformed

    private void btjogovoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogovoltarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btjogovoltarActionPerformed

    private void btjogo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogo1ActionPerformed
        btjogo1.setFont(new java.awt.Font("Tahoma", 0, 55));
        if (btjogo1.getText() == "X") {
            btjogo1.setText("O");
        } else {
            btjogo1.setText("X");
        }
    }//GEN-LAST:event_btjogo1ActionPerformed

    private void btjogo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogo2ActionPerformed
        btjogo2.setFont(new java.awt.Font("Tahoma", 0, 55));
        if (btjogo2.getText() == "X") {
            btjogo2.setText("O");
        } else {
            btjogo2.setText("X");
        }
    }//GEN-LAST:event_btjogo2ActionPerformed

    private void btjogo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogo3ActionPerformed
        btjogo3.setFont(new java.awt.Font("Tahoma", 0, 55));
        if (btjogo3.getText() == "X") {
            btjogo3.setText("O");
        } else {
            btjogo3.setText("X");
        }
    }//GEN-LAST:event_btjogo3ActionPerformed

    private void btjogo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogo4ActionPerformed
        btjogo4.setFont(new java.awt.Font("Tahoma", 0, 55));
        if (btjogo4.getText() == "X") {
            btjogo4.setText("O");
        } else {
            btjogo4.setText("X");
        }
    }//GEN-LAST:event_btjogo4ActionPerformed

    private void btjogo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogo5ActionPerformed
        btjogo5.setFont(new java.awt.Font("Tahoma", 0, 55));
        if (btjogo5.getText() == "X") {
            btjogo5.setText("O");
        } else {
            btjogo5.setText("X");
        }
    }//GEN-LAST:event_btjogo5ActionPerformed

    private void btjogo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogo6ActionPerformed
        btjogo6.setFont(new java.awt.Font("Tahoma", 0, 55));
        if (btjogo6.getText() == "X") {
            btjogo6.setText("O");
        } else {
            btjogo6.setText("X");
        }
    }//GEN-LAST:event_btjogo6ActionPerformed

    private void btjogo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogo7ActionPerformed
        btjogo7.setFont(new java.awt.Font("Tahoma", 0, 55));
        if (btjogo7.getText() == "X") {
            btjogo7.setText("O");
        } else {
            btjogo7.setText("X");
        }
    }//GEN-LAST:event_btjogo7ActionPerformed

    private void btjogo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogo8ActionPerformed
        btjogo8.setFont(new java.awt.Font("Tahoma", 0, 55));
        if (btjogo8.getText() == "X") {
            btjogo8.setText("O");
        } else {
            btjogo8.setText("X");
        }
    }//GEN-LAST:event_btjogo8ActionPerformed

    private void btjogo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btjogo9ActionPerformed
        btjogo9.setFont(new java.awt.Font("Tahoma", 0, 55));
        if (btjogo9.getText() == "X") {
            btjogo9.setText("O");
        } else {
            btjogo9.setText("X");
        }
    }//GEN-LAST:event_btjogo9ActionPerformed

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
            java.util.logging.Logger.getLogger(JogoWeb2P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoWeb2P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoWeb2P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoWeb2P.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoWeb2P().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btjogo1;
    private javax.swing.JButton btjogo2;
    private javax.swing.JButton btjogo3;
    private javax.swing.JButton btjogo4;
    private javax.swing.JButton btjogo5;
    private javax.swing.JButton btjogo6;
    private javax.swing.JButton btjogo7;
    private javax.swing.JButton btjogo8;
    private javax.swing.JButton btjogo9;
    private javax.swing.JButton btjogovoltar;
    private javax.swing.JButton btnovojogo;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lbljogador1;
    private javax.swing.JLabel lbljogador2;
    private javax.swing.JLabel lblmenujogadores;
    private javax.swing.JLabel lblnomejogador1;
    private javax.swing.JLabel lblnomejogador2;
    private javax.swing.JPanel pnlcontrolejogo;
    private javax.swing.JPanel pnljogadores;
    private javax.swing.JPanel pnljogo;
    private javax.swing.JLabel variaveljogador1;
    private javax.swing.JLabel variaveljogador2;
    // End of variables declaration//GEN-END:variables

}
