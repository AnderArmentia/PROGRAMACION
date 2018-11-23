/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg6;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Ander
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] codigos = new int [5];
        int [] dias = new int [5];
        int [] faltas = new int [5];
   
        
        /*String valor = menu(dias, codigos, faltas); 
        JOptionPane.showMessageDialog(null, valor);  */
        
    for (int x=0; x < dias.length; x++){
        
        String codigo = JOptionPane.showInputDialog(null, "Introduce un codigo");
        int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un dia"));
        int falta = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la cantidad de faltas"));
        
        if( !Arrays.toString(codigos).contains(codigo)){
            codigos[x] = Integer.parseInt(codigo);
            dias[x] = dia;
            faltas[x] = falta;
        
    }
    
        
    
}


    }
     public static String menu(int[] dias, int[] codigos, int[] faltas){
        String valor = "";
        for(int x = 0; x < codigos.length; x++){
            valor += "Codigo: " + codigos[x] + "  Día: " + dias[x] + "  Faltas: " + faltas[x] +"\n";
        }
        return valor;
}
}     