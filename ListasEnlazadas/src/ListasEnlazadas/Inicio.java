package ListasEnlazadas;

import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) {
        int ingre, busqued, posic;
        int pp;
      
 

        Scanner sc = new Scanner(System.in);
        ListasEnlazadas miLista = new ListasEnlazadas();
        System.out.print("Ingrese numero de datos que desea ingresar:   ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print("Ingrese numero " + (i + 1) + ":   ");
            ingre = sc.nextInt();
            miLista.InsertarEnPrimero(ingre);
        }
        do{
        System.out.print("Ingrese numero de opcion: ");
        int sw = sc.nextInt();

        switch (sw) {

            case 1:

                System.out.print("Ingrese el numero que desea buscar:   ");
                busqued = sc.nextInt();
                System.out.println("El numero esta en la posicion:  " + miLista.locali(busqued));
                break;

            case 2:

                System.out.print("Ingrese la posicion que desea borrar:   ");
                posic = sc.nextInt();
                miLista.borrarPosicion(posic);
                System.out.println(miLista.Listar());

                break;

            case 3:

                System.out.println("Borrar");
                miLista.borrarUltimo();
                miLista.borrarPrimero();
                System.out.println(miLista.Listar());
                break;

        }
        System.out.print("Desea hacer otra operacion SI (1) NO (0):  ");
        pp = sc.nextInt();
        }while(pp!=0);
    }
}
