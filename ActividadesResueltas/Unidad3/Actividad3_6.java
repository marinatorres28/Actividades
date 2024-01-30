package Unidad3;

import java.util.Scanner;

/*Escribir una aplicacion para aprender a contar, que pedira un numero n
y mostrara todos los numeros del 1 al n.
* */
public class Actividad3_6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Indica un numero-> ");
        int n = entrada.nextInt();
        for (int i = 1; i <= n ; i++ ) {
            System.out.println(i);
        }
    }
}
