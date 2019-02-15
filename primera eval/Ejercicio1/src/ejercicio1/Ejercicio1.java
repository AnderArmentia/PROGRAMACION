/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw02
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
    String sPalabra = JOptionPane.showInputDialog("Introduce el texto");
     int vocales=0;
        for(int x=0;x<sPalabra.length();x++) {
  if ((sPalabra.charAt(x)=='a') || (sPalabra.charAt(x)=='e') || (sPalabra.charAt(x)=='i')
  || (sPalabra.charAt(x)=='o') || (sPalabra.charAt(x)=='u')) vocales++;
      
}
        JOptionPane.showMessageDialog(null, vocales);
    }
    
}
