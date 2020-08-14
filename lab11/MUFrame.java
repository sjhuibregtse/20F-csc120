/* CSC 120 Lab # 11
 * Samantha Student
 * Today's Date
 *
 * Acknowledgements:
 * 
 */

import java.awt.*;
import javax.swing.*;

public class MUFrame extends javax.swing.JFrame {

    
    // declare private data here
    
    
    
    
    
    
    
    
    // constructor method
    public MUFrame() {
        setName("CSC 120 Lab 11 written by Samantha Student");
        initComponents();
        
        
        
        
    } // end of constructor
    
    // declare other methods here
    
    
    
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        processInputButton = new javax.swing.JButton();
        clearInputButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setBackground(new Color(/*0x59, 0xc4, 0xc5*/0x78, 0xc0, 0xa8));
        jInternalFrame1.setTitle("CSC 120 Lab 11");
        jInternalFrame1.setVisible(true);

        inputArea.setColumns(20);
        inputArea.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        inputArea.setRows(5);
        jScrollPane1.setViewportView(inputArea);

        outputArea.setBackground(new Color(220, 220, 220));
        outputArea.setColumns(20);
        outputArea.setEditable(false);
        outputArea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        outputArea.setRows(5);
        jScrollPane2.setViewportView(outputArea);

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel1.setText("Input Area:");

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel2.setText("Output Area:");

        processInputButton.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N
        processInputButton.setText("Process the Input");
        processInputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processInputButtonActionPerformed(evt);
            }
        });

        clearInputButton.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N
        clearInputButton.setText("Clear Input Area");
        clearInputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearInputButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                        .addComponent(processInputButton)
                        .addGap(38, 38, 38)
                        .addComponent(clearInputButton)
                        .addGap(39, 39, 39)))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel2))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(processInputButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clearInputButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void processInputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processInputButtonActionPerformed

        String theInput = inputArea.getText();
        outputArea.setText("");  // initially empty
        
        outputArea.append( theInput + "\n" );
        
    }//GEN-LAST:event_processInputButtonActionPerformed

    private void clearInputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearInputButtonActionPerformed
        
        inputArea.setText("");
        
    }//GEN-LAST:event_clearInputButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MUFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea inputArea;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JButton processInputButton;
    private javax.swing.JButton clearInputButton;
    // End of variables declaration//GEN-END:variables
}
