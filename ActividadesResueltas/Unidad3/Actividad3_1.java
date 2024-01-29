package Unidad3;

import java.util.Scanner;

/*Diseñar un programa que muestre, para cada numero introducido por teclado, si es par,
si es positivo y su cuadrado. El proceso se repetira hasta que el numero introducido
sea 0.

* */
public class Actividad3_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        boolean esPar, esPositivo;
        System.out.println("Indica un numero -> ");
        num = entrada.nextInt();
        esPar = num % 2 == 0;
        esPositivo = num >= 0;

        while (num !=0 ) {
            esPar = num % 2 == 0 ? true : false;
            esPositivo = num >= 0 ? true : false;
            System.out.println("¿Es par?: " + esPar );
            System.out.println("¿Es positivo?: " + esPositivo );
            System.out.println("Cuadrado: " + num * num);
            System.out.println("Introduce otro numero: ");
            num = entrada.nextInt();
        }
    }
}
