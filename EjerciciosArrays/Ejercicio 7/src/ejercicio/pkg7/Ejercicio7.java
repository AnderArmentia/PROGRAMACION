
package ejercicio.pkg7;

import javax.swing.JOptionPane;


public class Ejercicio7 {
    
   
    public static void main(String[] args) {
        // TODO code application logic here
       int [] codigos = {10, 23, 30, 47, 55, 65, 135, 256, 526, 663};
       int [] cantidades = new int [10];
       int cantidad;
    do {   
    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduce un codigo"));
    int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce una cantidad"));

    }
    while (cantidad >= 10); 
    String continuar = JOptionPane.showInputDialog("quieres continuar?");
        if(continuar.equalsIgnoreCase("si")) {
               int codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduce un codigo"));
               int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce una cantidad")); 
        }  
}
    
}

        