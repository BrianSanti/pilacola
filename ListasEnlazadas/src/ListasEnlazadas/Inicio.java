/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasEnlazadas;

import java.util.Scanner;

/**
 *
 * @author EDUARDO
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        int op1 = 0;
        
        Scanner sc = new Scanner(System.in);
        ListasEnlazadas miLista=new ListasEnlazadas();
        System.out.print("Ingrese numero de datos que desea ingresar:   ");
        int num = sc.nextInt();
        
        for  ( int i = 0; i< num;i++ ){
         System.out.print("Ingrese numero " +(i+1)+  ":   ");   
         op1 = sc.nextInt();
          miLista.InsertarEnPrimero(op1);
        }
        System.out.println(miLista.Listar());
       	System.out.println("Borrar");
        miLista.borrarUltimo();
        miLista.borrarPrimero();
	
	System.out.println(miLista.Listar());

    }
    
}
