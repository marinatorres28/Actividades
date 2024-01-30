package Unidad3;

import java.util.Scanner;

/*Implementar un programa que pida al usuario un numero positivo y lo muestre guarismo
a guarismo. Por ejemplo,para el numero 123, debe mostrar primero el 3, luego el 2, y
por ultimo el 1.
* */
public class AP_3_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Indica un numero positivo y lo mostrare guarismo: ");
        int num = entrada.nextInt();
        int unidad = 0;
        int numeroFor= num;
        //para mostrarlo voy a calcular la unidad %10 y luego lo divido / 10 hasta que el numero sea 0
        System.out.println("***Con bucle while***");
        while (num > 0) { //mientras el numero sea mayor que 0 se va a repetir
            unidad= num%10;
            System.out.println(unidad);
            num/=10;
        }
        System.out.println("***Con bucle for***");
        //con bucle for
        for (int i= numeroFor; i > 0; i/=10) {
            System.out.println(i%10);
        }
    }
}

