
package pilass;
import java.util.Scanner;


public class Pilass {

    
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in); 
        int dow, datosp, tamaño, value, ext;
                      
      
            System.out.print("Ingrese numero de datos que desea ingresar a la pila:   ");
            tamaño = sc.nextInt();    
            ppilas mipila = new ppilas(tamaño); 
              for (int i = 0; i < tamaño; i++) {
              System.out.print("Ingrese numero " + (i + 1) + ":   ");
              datosp = sc.nextInt();
              mipila.push(datosp);
              }
             
              do{
              System.out.print("Operaciones \n\t *Mostrar datos de la pila \n\t *Elimar la pila \n\t *Insertar en la pila");  
              System.out.print("\n\t >>>>:  ");  
              int opc = sc.nextInt(); 
             
         
         
        switch(opc){
         
         
            case 1:
                while (!mipila.vacio()) {
                value = mipila.pop();
                System.out.print(value);
                System.out.print("  ");
                }
                break;
            case 2:
                
                System.out.print("\n\t Desea vaciar el arreglo SI(0) NO(1):   ");

                tamaño = sc.nextInt();  
                mipila.vaciar(tamaño);
                break;
                
            case 3:
                 System.out.print("Cuantos desea agregar:  ");
                 ext = sc.nextInt();
                 int bn = ext;
                 mipila.insert(ext);
                 for (int i = 0; i < bn; i++) {
                 System.out.print("Ingrese numero " + (i + 1) + ":   ");
                 datosp = sc.nextInt();
                 mipila.push(datosp);
              }
            
                 
                 
                break;
                
         
      }
      System.out.print("\n\t Desea hacer otra operacion SI (1) NO (0):  ");
      dow = sc.nextInt();
      }while(dow!=0); 
      }  
}
