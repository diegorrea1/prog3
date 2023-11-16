/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author USER
 */
public class Bicicleta extends javax.swing.JPanel {

     Timer timer;
 TimerTask timertask;
 Boolean funcionando = false;
    public Bicicleta() {
        initComponents();
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pedal1 = new javax.swing.JButton();
        pedal2 = new javax.swing.JButton();
        automatico = new java.awt.Checkbox();
        manual = new java.awt.Checkbox();
        jLabel1 = new javax.swing.JLabel();
        ver = new javax.swing.JTextField();

        pedal1.setAction(pedal1.getAction());
        pedal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pedal2.png"))); // NOI18N
        pedal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedal1ActionPerformed(evt);
            }
        });

        pedal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pedal1.png"))); // NOI18N

        automatico.setLabel("automatico");

        manual.setLabel("manual");

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PEDALAZOS");

        ver.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(pedal1)
                        .addGap(18, 18, 18)
                        .addComponent(pedal2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(automatico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ver, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ver, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pedal2)
                            .addComponent(pedal1))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(automatico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(manual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pedal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedal1ActionPerformed
        if (pedal1.isEnabled()) {
    pedal1.setEnabled(true);
} else {
    pedal1.setEnabled(false);
}
    }//GEN-LAST:event_pedal1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Checkbox automatico;
    private javax.swing.JLabel jLabel1;
    private java.awt.Checkbox manual;
    private javax.swing.JButton pedal1;
    private javax.swing.JButton pedal2;
    private javax.swing.JTextField ver;
    // End of variables declaration//GEN-END:variables
}
