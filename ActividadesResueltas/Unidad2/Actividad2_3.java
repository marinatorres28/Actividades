package Unidad2;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

/*Solicitar dos numeros distintos y mostrar cual es el mayor.
* */
public class Actividad2_3 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Indica un numero: ");
        num1 = entrada.nextInt();
        System.out.println("Indica otro numero: ");
        num2 = entrada.nextInt();
        if (num1>num2)
            System.out.println(num1 + " es mayor que " + num2);
        else
            System.out.println(num2 + " es mayor que " +num1);
    }
}
