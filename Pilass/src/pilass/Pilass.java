
package pilass;
import java.util.Scanner;


public class Pilass {

    
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in); 
              
        
        
        System.out.print("Ingrese numero de datos que desea ingresar a la pila:   ");
        int tamaño = sc.nextInt();    
        ppilas mipila = new ppilas(tamaño);
        
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Ingrese numero " + (i + 1) + ":   ");
            int dato = sc.nextInt();
            mipila.push(dato);
            
    
        }
        
        while (!mipila.vacio()) {
         int value = mipila.pop();
         System.out.print(value);
         System.out.print(" ");
      }
      
      
        
        
        
    
       
        
        
        
    }
    
}
