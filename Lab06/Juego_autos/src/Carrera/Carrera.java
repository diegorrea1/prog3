/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carrera_1;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import static java.lang.Thread.sleep;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Carrera extends Thread{
     
    
     private JLabel etiqueta;
     private Carrera auto;

    public Carrera(JLabel etiqueta, Carrera auto) {
        this.etiqueta = etiqueta;
        this.auto = auto;
    }
    
    @Override
    public void run(){
        
        int auto1 = 0;
        int auto2 = 0;
        
         while(true){
             try{
                 
                  sleep((int)(Math.random() * 1000));
                  auto1 = auto.getPrimerAuto().getLocation().x;
                  auto2 = auto.getSegundoAuto().getLocation().x;
                  auto3 = auto.getTercerAuto().getLocation().x;
                  auto4 = auto.getCuartoAuto().getLocation().x;
                  if(auto1 < auto.getBarrera().getLocation().x - 125 && auto2 < auto.getBarrera().getLocation().x - 125){
                      etiqueta.setLocation(etiqueta.getLocation().x + 10,etiqueta.getLocation().y);
                      auto.repaint();
                  }else{
                      break;
                  }
                  
             }catch(InterruptedException e){
                 System.out.println(e);
             }
            
             if(etiqueta.getLocation().x >= auto.getBarrera().getLocation().x - 125){
                  if (auto1 >= barrera) {
                System.out.println("¡Auto 1 ha ganado la carrera!");
            } else if (auto2 >= barrera) {
                System.out.println("¡Auto 2 ha ganado la carrera!");
            } else if (auto3 >= barrera) {
                System.out.println("¡Auto 3 ha ganado la carrera!");
            } else if (auto4 >= barrera) {
                System.out.println("¡Auto 4 ha ganado la carrera!");
                  else{
                      JOptionPane.showMessageDialog(null,"Empate");
                  }
             }
                   
        } 
    }
}
