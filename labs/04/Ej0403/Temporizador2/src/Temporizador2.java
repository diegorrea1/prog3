
import java.util.Timer;
import java.util.TimerTask;

public class Temporizador2 extends javax.swing.JPanel {

   Timer timer;
 TimerTask timertask;
 Boolean funcionando = false;
 public Temporizador2() {
 initComponents();
 }

    @SuppressWarnings("unchecked")
    private void initComponents() {
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Texto con movimineto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addContainerGap(59, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!funcionando) {
 timer = new Timer();
 timertask = new TimerTask() {
 int i = 5;

     @Override
   public void run() {
 jLabel1.setLocation(i, 19); //Ubica el jLabel1 en las
 i++; //coordenadas (i,19)
 }
 };
 timer.scheduleAtFixedRate(timertask, 0, 100);
 funcionando = true;
 jButton1.setText("Detener");
 } else {
 timer.cancel(); //Cancela el Timer
 funcionando = false;
 jButton1.setText("Iniciar");
 }
 }
public static void main(String args[]) {
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

