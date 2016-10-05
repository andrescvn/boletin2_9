/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_9;

import javax.swing.JOptionPane;

/**
 *
 * @author acomesanavila
 */
public class Boletin2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float billetes100;
        float billetes20;
        float billetes5;
        float monedas;
        float cantidad;
        
        billetes100=Float.parseFloat(JOptionPane.showInputDialog("billetes100"));
        billetes20=Float.parseFloat(JOptionPane.showInputDialog("billetes20"));
        billetes5=Float.parseFloat(JOptionPane.showInputDialog("billetes5"));
        monedas=Float.parseFloat(JOptionPane.showInputDialog("monedas"));
        
        cantidad= billetes100*100 +billetes20*20 +billetes5*5+ monedas;
        
        JOptionPane.showMessageDialog(null, ("cantidad =") + cantidad);
      
               
    }
    
}
