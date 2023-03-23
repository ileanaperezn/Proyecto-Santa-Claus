/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santa;

import javax.swing.ImageIcon;

/**
 *
 * @author Aylín Aldana
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    
    /*Variables*/
    int contador_duendes = 0;
    int contador_renos = 0;
    private Santa santa = new Santa();
    
    public main() {
        initComponents();
        this.setTitle("Programa de Santa Claus");
        this.setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(santaImage, "src/images/santaSleep.gif");
        rsscalelabel.RSScaleLabel.setScaleLabel(renoImage, "src/images/reno-navidad.gif");
        rsscalelabel.RSScaleLabel.setScaleLabel(duendeImage, "src/images/duende.gif");
        santa.setMain(this);
        new Thread((Runnable) santa).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
                                             

    public void aumentarduendes(){
        contador_duendes++;
        lblDuendes.setText("Duendes: " + contador_duendes);
    }
    
    public void aumentarenos(){
        contador_renos++;
        lblRenos.setText("Renos: " + contador_renos);
    }
    
         
    public void reparteregalos(){
        rsscalelabel.RSScaleLabel.setScaleLabel(santaImage, "src/images/trineo.gif");  
        contador_renos=0;
        lblRenos.setText("Renos: " + contador_renos);
    }
    
    public void santadormido()
    {
        rsscalelabel.RSScaleLabel.setScaleLabel(santaImage, "src/images/santaSleep.gif");  
    }
     public void ayudaduendes()
     {
        rsscalelabel.RSScaleLabel.setScaleLabel(santaImage, "src/images/regalos.jpg");  
        contador_duendes = 0;
        lblDuendes.setText("Duendes : " + contador_duendes);
     }
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSanta = new javax.swing.JPanel();
        renoImage = new javax.swing.JLabel();
        santaImage = new javax.swing.JLabel();
        duendeImage = new javax.swing.JLabel();
        lblRenos = new javax.swing.JLabel();
        btnAddRenos = new javax.swing.JButton();
        lblDuendes = new javax.swing.JLabel();
        btnAddDuendes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelSanta.setBackground(new java.awt.Color(255, 255, 255));

        renoImage.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        santaImage.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        duendeImage.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblRenos.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        lblRenos.setText("Renos: 0");

        btnAddRenos.setBackground(new java.awt.Color(93, 213, 251));
        btnAddRenos.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        btnAddRenos.setText("Añadir renos");
        btnAddRenos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddRenos.setBorderPainted(false);
        btnAddRenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRenosActionPerformed(evt);
            }
        });

        lblDuendes.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 24)); // NOI18N
        lblDuendes.setText("Duendes: 0");

        btnAddDuendes.setBackground(new java.awt.Color(93, 213, 251));
        btnAddDuendes.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        btnAddDuendes.setText("Añadir duendes");
        btnAddDuendes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddDuendes.setBorderPainted(false);
        btnAddDuendes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDuendesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSantaLayout = new javax.swing.GroupLayout(panelSanta);
        panelSanta.setLayout(panelSantaLayout);
        panelSantaLayout.setHorizontalGroup(
            panelSantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSantaLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(renoImage, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(santaImage, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(duendeImage, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSantaLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(btnAddRenos, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddDuendes, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSantaLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(lblRenos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDuendes)
                .addGap(95, 95, 95))
        );
        panelSantaLayout.setVerticalGroup(
            panelSantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSantaLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(panelSantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(renoImage, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(duendeImage, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(santaImage, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(panelSantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRenos)
                    .addComponent(lblDuendes))
                .addGap(18, 18, 18)
                .addGroup(panelSantaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddDuendes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddRenos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelSanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSanta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddRenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRenosActionPerformed
        aumentarenos();
    }//GEN-LAST:event_btnAddRenosActionPerformed

    private void btnAddDuendesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDuendesActionPerformed
        aumentarduendes();
    }//GEN-LAST:event_btnAddDuendesActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDuendes;
    private javax.swing.JButton btnAddRenos;
    private javax.swing.JLabel duendeImage;
    private javax.swing.JLabel lblDuendes;
    private javax.swing.JLabel lblRenos;
    private javax.swing.JPanel panelSanta;
    private javax.swing.JLabel renoImage;
    private javax.swing.JLabel santaImage;
    // End of variables declaration//GEN-END:variables
}
