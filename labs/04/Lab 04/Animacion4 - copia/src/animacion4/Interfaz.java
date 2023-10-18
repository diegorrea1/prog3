package animacion4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.ImageIcon; 



public class Interfaz extends javax.swing.JFrame {
static int contador = 0;
int x=35;
int a;
    Timer tiempo = new Timer(100, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            metodo();
          }
    });
  
    
    public void metodo(){
     a++;
    jLabel3.setText(String.valueOf(a));
        ImageIcon imagen = new ImageIcon();
        switch(contador){
            case 0: 
                contador = 1; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 1: 
                contador = 2; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("2.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 2: 
                contador = 3; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("3.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 3: 
                contador = 4; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("4.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 4: 
                contador = 5; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("5.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 5: 
                contador = 6; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 6: 
                contador = 7; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("2.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 7: 
                contador = 8; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("3.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 8: 
                contador = 9; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("4.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 9: 
                contador = 10; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("5.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 10: 
                contador = 11; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 11: 
                contador = 12; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("2.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 12: 
                contador = 13; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("3.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 13: 
                contador = 14; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("4.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 14: 
                contador = 15; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("5.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 15: 
                contador = 16; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 16: 
                contador = 17; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("2.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 17: 
                contador = 18; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("3.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 18: 
                contador = 19; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("4.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 19: 
                contador = 20; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("5.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 20: 
                contador = 21; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 21: 
                contador = 22; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("2.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 22: 
                contador = 23; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("3.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 23: 
                contador = 24; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("4.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 24: 
                contador = 25; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("5.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 25: 
                contador = 26; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 26: 
                contador = 27; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("2.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 27: 
                contador = 28; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("3.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 28: 
                contador = 29; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("4.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 29: 
                contador = 30; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("5.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 30: 
                contador = x; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 31: 
                contador = 32; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("2.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 32: 
                contador = 33; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("3.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 33: 
                contador = 34; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("4.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 34: 
                contador = 35; 
                imagen= new ImageIcon ("rojo.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("5.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 35: 
                contador = 36; 
                imagen= new ImageIcon ("ama.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 36: 
                contador = 37;
                imagen= new ImageIcon ("ama.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 37: 
                contador = 38; 
                imagen= new ImageIcon ("ama.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 38: 
                contador = 39; 
                imagen= new ImageIcon ("ama.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 39: 
                contador = 40; 
                imagen= new ImageIcon ("ama.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 40: 
                contador = 41; 
                imagen= new ImageIcon ("verde.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 41: 
                contador = 42; 
                imagen= new ImageIcon ("verde.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 42: 
                contador = 43; 
                imagen= new ImageIcon ("verde.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 43: 
                contador = 44; 
                imagen= new ImageIcon ("verde.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 44: 
                contador = 45; 
                imagen= new ImageIcon ("verde.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 45: 
                contador = 46; 
                imagen= new ImageIcon ("verde.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 46: 
                contador = 47; 
                imagen= new ImageIcon ("verde.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 47: 
                contador = 48; 
                imagen= new ImageIcon ("verde.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 48: 
                contador = 49; 
                imagen= new ImageIcon ("verde.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 49: 
                contador = 50; 
                imagen= new ImageIcon ("verde.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 50: 
                contador = 51; 
                imagen= new ImageIcon ("verde.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 51: 
                contador = 52; 
                imagen= new ImageIcon ("verde.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 52: 
                contador = 53; 
                imagen= new ImageIcon ("verde.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 53: 
                contador = 54; 
                imagen= new ImageIcon ("verde.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 54: 
                contador = 55; 
                imagen= new ImageIcon ("verde.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 55: 
                contador = 56; 
                imagen= new ImageIcon ("verde.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 56: 
                contador = 57; 
                imagen= new ImageIcon ("verde.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 57: 
                contador = 58; 
                imagen= new ImageIcon ("verde.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 58: 
                contador = 59; 
                imagen= new ImageIcon ("verde.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 59: 
                contador = 60; 
                imagen= new ImageIcon ("verde.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 60: 
                contador = 61; 
                imagen= new ImageIcon ("verde.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 61: 
                contador = 62; 
                imagen= new ImageIcon ("verde.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 62: 
                contador = 63; 
                imagen= new ImageIcon ("verde.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 63: 
                contador = 64; 
                imagen= new ImageIcon ("verde.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
            case 64: 
                contador = 0;
                imagen= new ImageIcon ("verde.jpg");
                jLabel1.setIcon (imagen);
                imagen= new ImageIcon ("1.jpg");
                jLabel2.setIcon (imagen);
                break; 
        }
    }
    public Interfaz() {
        initComponents();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(51, 204, 0));
        jButton1.setText("INICIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setText("PARE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jSlider1.setBackground(new java.awt.Color(102, 0, 204));
        jSlider1.setMajorTickSpacing(25);
        jSlider1.setMinorTickSpacing(5);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 51, 153));
        jButton3.setText("prioridad peaton");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel4)))
                                .addGap(27, 27, 27))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(0, 7, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(35, 35, 35))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(34, 34, 34)
                        .addComponent(jButton3)))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tiempo.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tiempo.stop();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
         int f =jSlider1.getValue();
         jLabel4.setText(String.valueOf(f));
        tiempo.setDelay(f*50);
    }//GEN-LAST:event_jSlider1StateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        x=x-4;
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables

    private String String(int value) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
