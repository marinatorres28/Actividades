package Unidad5_Tablas;

import java.util.Scanner;

/*Escribir una aplicacion que solicite al usuario cuantos numeros desea introducir. A continuacion introducir por
teclado esa cantidad de numeros enteros y por ultimo, mostrar el orden inverso al introducido.
* */
public class Actividad5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mostrar("Indica el numero de elementos enteros a insertar -> ");
        int longitud = sc.nextInt();
        int numeros[] = new int [longitud];

        for (int i = 0; i < longitud; i++) {
            mostrar("Indique el numero ->");
            numeros[i] = sc.nextInt();
        }
        //mostrar de forma inversa
        mostrar("Muestra de forma inversa los numeros insertados -> ");
        for (int i = numeros.length-1; i >= 0  ; i--) {
            mostrar("-> " + numeros [i]);
        }
    }

    public static void mostrar (String texto) {
        System.out.println("\t" + texto);
    }
}
