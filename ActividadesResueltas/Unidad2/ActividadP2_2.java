package Unidad2;

import java.util.Scanner;

/*Solicita por teclado un numero de tipo int añ usuario y escribe un programa que
muestre true o false,dependiendo si el numero es positivo.
* */
public class ActividadP2_2 {
    public static void main(String[] args) {
        int num;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Indica un numero entero: ");
        num = entrada.nextInt();
        if (num<0) {
            System.out.println("El numero es negativo.");
        } else {
            System.out.println("El numero es positivo.");
        }
    }
}
