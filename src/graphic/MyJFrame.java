package graphic;


import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author work
 */
public class MyJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MyJFrame
     */
    GridLayout experimentLayout;
    public MyJFrame() {
        initComponents();
        /* javax.swing.JButton jButton2 = new javax.swing.JButton();
         jButton2.setText("cazzo1");
         java.awt.GridBagConstraints gridBagConstraints = new java.awt.GridBagConstraints();
         gridBagConstraints.gridx = 0;
         gridBagConstraints.gridy = 0;
        // jPanel2.add(jButton2,gridBagConstraints);
         
         javax.swing.JButton jButton3 = new javax.swing.JButton();
         jButton3.setText("cazzo2");
         gridBagConstraints.gridx = 0;
         gridBagConstraints.gridy = 4;
        jPanel2.add(jButton3,gridBagConstraints);
        
        javax.swing.JButton jButton4 = new javax.swing.JButton();
         jButton4.setText("cazzo4");
         gridBagConstraints.gridx = 4;
         gridBagConstraints.gridy = 2;
        jPanel2.add(jButton4,gridBagConstraints);
        
        javax.swing.JPanel jPanel3 = new javax.swing.JPanel();
        jPanel3.setSize(212, 100);
        jPanel3.setBackground(Color.red);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
         //jPanel3.add(jButton2);
         
          javax.swing.JLabel silvio = new javax.swing.JLabel();
          silvio.setIcon(new ImageIcon("imgs/silvio.jpeg"));
          jPanel3.add(silvio);
          
         jPanel2.add(jPanel3,gridBagConstraints);
                 
         javax.swing.JPanel jPanel4 = new javax.swing.JPanel();

        jPanel4.setSize(212, 100);
        jPanel4.setBackground(Color.red);
         gridBagConstraints.gridx = 2;
         gridBagConstraints.gridy = 0;
         javax.swing.JLabel silvioce = new javax.swing.JLabel();
          silvioce.setIcon(new ImageIcon("imgs/silvio.jpeg"));
          jPanel4.add(silvioce);
         jPanel2.add(jPanel4,gridBagConstraints);
        

        */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Zizzo Panizzo Farmacia");

        jLabel2.setText("Total:");

        jPanel2.setLayout(new java.awt.GridLayout(0, 3));
        jScrollPane1.setViewportView(jPanel2);

        jButton1.setText("aggiungi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(245, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        javax.swing.JPanel jPanel = new javax.swing.JPanel();
        jPanel.setLayout(new javax.swing.BoxLayout(jPanel,javax.swing.BoxLayout.PAGE_AXIS));
        javax.swing.JLabel silvio = new javax.swing.JLabel();
        silvio.setIcon(new ImageIcon("imgs/silvio.jpeg"));
        javax.swing.JLabel price = new javax.swing.JLabel();
        price.setText("0.00$");
        javax.swing.JLabel title = new javax.swing.JLabel();
        title.setText("Silvio");
        javax.swing.JButton cartButton = new javax.swing.JButton();
        cartButton.setText("aggiungi");
        
        jPanel.add(silvio);
        jPanel.add(title);
        jPanel.add(price);
        jPanel.add(cartButton);
        
        jPanel2.add(jPanel);
        
        revalidate();
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyJFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
