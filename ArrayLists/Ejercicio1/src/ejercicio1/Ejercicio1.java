
package ejercicio1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio1 {

    public static void main(String[] args) {
        menu();
        
           
    }          
    public static void menu(){
            int opcion = 0;
        do {
        
         opcion = Integer.parseInt(JOptionPane.showInputDialog(
                 "1. Visualizar el valor maximo y el minimo. \n" 
               + "2. Solicitar un numero y buscarlo. Muestra un mensaje indicando si lo has encontrado o no. \n"
               + "3. Solicitar un numero, buscarlo y borrarlo. Sino se encuentra muestra un mensaje de error. \n"
               + "4. Convertir el arrayList en un array. \n"
               + "5. Si no esta vacio, mostrar el numero de elementos que contiene. \n"
               + "6. Insertar un nuevo elemento por el final. \n"
               + "7. Insertar un nuevo elemento en la posicion que te indique el usuario.\n"
               + "8. Borrar un elemento de una posicion concreta. \n"
               + "9. Calcular la suma y la media aritmetica de los valores contenidos. \n"
               + "10. Finalizar. \n" 
               + "\n"      
               + "\n"           
               + "Introduce una opcion  \n")); 
                
        switch (opcion){
            case 1 : visualizar();
                break;
            case 2 : buscarNum();
                break;
            case 3 : borrarNum();
                break;
            case 4 : array();
                break;
            case 5 : mostrarEle();
                break;
            case 6 : eleFinal();
                break;
            case 7 : eleUsurio();
                break;
            case 8 : borrarEle();
                break;
            case 9 : eleUsurio();
                break;
            case 10 : fin();
                break;    
        }
           
        
    } 
         while (opcion != 10);
        }

    
    public static void visualizar(){
        
           
        /*
         ArrayList<float> valores = new ArrayList<float>();
        
          String valor = JOptionPane.showMessageDialog(null, "Introduce un valor"));
          valores.add("valor");
           */
    
    }
    public static void buscarNum(){
        
        JOptionPane.showMessageDialog(null, "Numeros negativos no validos");
    
    }
    public static void borrarNum(){
      
    }
    public static void array(){
    
    }
    public static void mostrarEle(){
    
    }
    public static void eleFinal(){
    
    }
    public static void eleUsurio(){
    
    }
    public static void borrarEle(){
    
    }
    public static void sumaMedia(){
    
    }
    public static void fin(){
    
    }
    
}
