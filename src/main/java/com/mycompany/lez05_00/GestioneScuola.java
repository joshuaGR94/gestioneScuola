/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez05_00;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class GestioneScuola extends javax.swing.JFrame {

    // attributi scuola
    // elenco corsi
    ArrayList<Corso> elencoCorsi;
    String nomescuola;
    int idxCorsoCurrent;

    /**
     * Creates new form GestioneEsame
     */
    public GestioneScuola() {
        initComponents();
        elencoCorsi = new ArrayList<Corso>();
        nomescuola = "Ferrucci liceo Torino";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panCorsi = new javax.swing.JPanel();
        lGestioneCorsi = new javax.swing.JLabel();
        bAddCorso = new javax.swing.JButton();
        tnomeCorso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tedizioneCorso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tnumOre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tprigaCorso = new javax.swing.JTextPane();
        panAlunni = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tnomeAlunno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tcognomeAlunno = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tpvisCorso = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        tindexcorso = new javax.swing.JTextField();
        jnomecorso = new javax.swing.JLabel();
        bAddAlunno = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        elencoAlunniCorso = new javax.swing.JTextPane();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestione Scuola");
        setBackground(new java.awt.Color(153, 153, 153));

        panCorsi.setBackground(new java.awt.Color(0, 51, 153));

        lGestioneCorsi.setText("Gestione Corsi");

        bAddCorso.setText("Add corso");
        bAddCorso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddCorsoActionPerformed(evt);
            }
        });

        tnomeCorso.setToolTipText("inserire nome corso");
        tnomeCorso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnomeCorsoActionPerformed(evt);
            }
        });

        jLabel1.setText("inserire nome corso:");

        jLabel2.setText("inserire edizione:");

        tedizioneCorso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tedizioneCorsoActionPerformed(evt);
            }
        });

        jLabel3.setText("numero di ore:");

        tnumOre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnumOreActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(tprigaCorso);

        javax.swing.GroupLayout panCorsiLayout = new javax.swing.GroupLayout(panCorsi);
        panCorsi.setLayout(panCorsiLayout);
        panCorsiLayout.setHorizontalGroup(
            panCorsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCorsiLayout.createSequentialGroup()
                .addGroup(panCorsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bAddCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lGestioneCorsi, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panCorsiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panCorsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panCorsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tnomeCorso)
                                .addComponent(jLabel2)
                                .addComponent(tedizioneCorso)
                                .addComponent(jLabel3)
                                .addComponent(tnumOre, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                            .addComponent(jLabel1))
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)))
                .addGap(83, 83, 83))
        );
        panCorsiLayout.setVerticalGroup(
            panCorsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCorsiLayout.createSequentialGroup()
                .addComponent(lGestioneCorsi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panCorsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCorsiLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)
                        .addComponent(tnomeCorso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(tedizioneCorso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tnumOre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 255, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bAddCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("tab1", panCorsi);

        panAlunni.setBackground(new java.awt.Color(0, 102, 102));

        jLabel4.setText("Gestione Alunno");

        jLabel5.setText("Nome");

        jLabel6.setText("Cognome");

        tcognomeAlunno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcognomeAlunnoActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(tpvisCorso);

        jLabel7.setText("n° corso");

        tindexcorso.setText("0");
        tindexcorso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tindexcorsoActionPerformed(evt);
            }
        });
        tindexcorso.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tindexcorsoPropertyChange(evt);
            }
        });

        jnomecorso.setText("nessun corso");

        bAddAlunno.setText("Add alunno");
        bAddAlunno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddAlunnoActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(elencoAlunniCorso);

        javax.swing.GroupLayout panAlunniLayout = new javax.swing.GroupLayout(panAlunni);
        panAlunni.setLayout(panAlunniLayout);
        panAlunniLayout.setHorizontalGroup(
            panAlunniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAlunniLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(bAddAlunno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panAlunniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAlunniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panAlunniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2)
                        .addComponent(tcognomeAlunno, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                        .addComponent(tnomeAlunno))
                    .addGroup(panAlunniLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tindexcorso, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jnomecorso, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        panAlunniLayout.setVerticalGroup(
            panAlunniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAlunniLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(panAlunniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panAlunniLayout.createSequentialGroup()
                        .addComponent(tnomeAlunno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tcognomeAlunno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panAlunniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tindexcorso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jnomecorso)))
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(bAddAlunno)
                .addGap(21, 21, 21))
        );

        jTabbedPane1.addTab("tab2", panAlunni);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(357, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tedizioneCorsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tedizioneCorsoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tedizioneCorsoActionPerformed

    private void tnumOreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnumOreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnumOreActionPerformed

    private void bAddCorsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddCorsoActionPerformed
        // TODO add your handling code here:
        String nameCorso = tnomeCorso.getText();
        String nameED = tedizioneCorso.getText();
        String no = tnumOre.getText();
        int numO;
        try {
            numO = Integer.parseInt(no);
        } catch (Exception e) {
            numO = 0;
        }
        // tutto pronto per nuovo corso di aggiungere
        // creo nuovop corso
        Corso nCorso = new Corso(nameCorso);
        nCorso.setEdizioneCorso(nameED);
        nCorso.setNumOre(numO);
        // aggiungo il corso all elenco
        elencoCorsi.add(nCorso);
        // aggiorno il tabellone tprigaCorso con la nuova versione
        tprigaCorso.setText(refreshTpElencoCorsi());
        tedizioneCorso.setText("");
        tnomeCorso.setText("");
        tnumOre.setText("0");
        String el = refreshTpElencoCorsi();
        tprigaCorso.setText(el);
        tpvisCorso.setText(el);


    }//GEN-LAST:event_bAddCorsoActionPerformed

    private void tnomeCorsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnomeCorsoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnomeCorsoActionPerformed

    private void tcognomeAlunnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcognomeAlunnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcognomeAlunnoActionPerformed

    private void tindexcorsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tindexcorsoActionPerformed
        // TODO add your handling code here:
        String strindex = tindexcorso.getText();
        int index = 0;
        try {
            index = Integer.parseInt(strindex) - 1;

        } catch (Exception e) {
            strindex = "0";
        }
        Corso c = elencoCorsi.get(index);
        String nc = c.getNome();
        jnomecorso.setText(nc);
        idxCorsoCurrent = index;


    }//GEN-LAST:event_tindexcorsoActionPerformed

    private void tindexcorsoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tindexcorsoPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_tindexcorsoPropertyChange

    private void bAddAlunnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddAlunnoActionPerformed
        // TODO add your handling code here:

        String nomeAlunno = tnomeAlunno.getText();
        String cognomeAlunno = tcognomeAlunno.getText();
        Alunno al1 = new Alunno(nomeAlunno, cognomeAlunno);
        elencoCorsi.get(idxCorsoCurrent).getRegistro().add(al1);
        String tabellone = elencoCorsi.get(idxCorsoCurrent).getrowAlunniCorso();
        elencoAlunniCorso.setText(tabellone);
        tnomeAlunno.setText(" ");
        tcognomeAlunno.setText("");


    }//GEN-LAST:event_bAddAlunnoActionPerformed

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
            java.util.logging.Logger.getLogger(GestioneScuola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestioneScuola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestioneScuola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestioneScuola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestioneScuola().setVisible(true);
            }
        });
    }

    public String refreshTpElencoCorsi() {
        // otput string
        String ris = "";
        //leggo un corso per volta da elencocorsi
        for (int i = 0; i < elencoCorsi.size(); i++) {
            Corso c = elencoCorsi.get(i);
            ris += (1 + i) + " - " + c.getRawCorso();
        }
        return ris;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAddAlunno;
    private javax.swing.JButton bAddCorso;
    private javax.swing.JTextPane elencoAlunniCorso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jnomecorso;
    private javax.swing.JLabel lGestioneCorsi;
    private javax.swing.JPanel panAlunni;
    private javax.swing.JPanel panCorsi;
    private javax.swing.JTextField tcognomeAlunno;
    private javax.swing.JTextField tedizioneCorso;
    private javax.swing.JTextField tindexcorso;
    private javax.swing.JTextField tnomeAlunno;
    private javax.swing.JTextField tnomeCorso;
    private javax.swing.JTextField tnumOre;
    private javax.swing.JTextPane tprigaCorso;
    private javax.swing.JTextPane tpvisCorso;
    // End of variables declaration//GEN-END:variables
}
