package Unidad4_funciones;

import java.util.Scanner;

/*Diseñar la funcion eco() a la que se le pasa como parametro un numero n, y muestra por pantalla n veces el mensaje Eco...
* */
public class Actividad4_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int n = sc.nextInt();
        funcionEco(n);
    }
    public static void funcionEco(int n){
        for (int i=0 ; i < n ; i++){
            System.out.println("Eco...");
        }
    }
}
