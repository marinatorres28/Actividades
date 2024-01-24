package Unidad2;

import java.util.Scanner;

/*Escribe una aplicacion que indique cuantas cifras tiene un numero
entero introducido por teclado, que estara comprendido entre 0 y 99999.
* */
public class Actividad2_9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Introduce un numero entre 0 y 99999");
        num = entrada.nextInt();
        if (num < 10){
            System.out.println("Tiene 1 cifra.");
        }
        else if (num < 100) {
            System.out.println("Tiene 2 cifras");
        }
        else if (num < 1000) {
            System.out.println("Tiene 3 cifras");
        }
        else if (num < 10000) {
            System.out.println("Tiene 4 cifras");
        }
        else if (num < 100000) {
            System.out.println("Tiene 5 cifras");
        }

    }
}
