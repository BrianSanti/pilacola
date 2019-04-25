
package pilass;


public class ppilas {
    
   private int tamaño;
    private int[] capacidad;
    private int top;
     private int ext;
     
    
    ppilas(int s) {
     tamaño = s;
       capacidad = new int[tamaño];
       top = -1;
    }
    public void push(int j) {
       capacidad[++top] = j;
    }
    public int pop() {
       return capacidad[top--];
    }
    public int peek() {
       return capacidad[top];
    }
    public boolean vacio() {
       return (top == -1);
    }
    public void vaciar(int s){
    tamaño = s;
    capacidad = new int[tamaño];
    System.out.println("Pila vaciada");
    
    }
     public void insert(int j) { 
     tamaño = (tamaño + ext);
     capacidad[++top] = j;
     
       
    }
    

  

    
    
    
    
    
    
}
