package Unidad2;

import java.util.Scanner;

/*Pedir dos numeros enteros y decir si son iguales o no.*/
public class Actividad2_2 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Indica un numero: ");
        num1 = entrada.nextInt();
        System.out.println("Indica otro numero: ");
        num2 = entrada.nextInt();
        if (num1==num2)
            System.out.println("Los numeros son iguales.");
        else
            System.out.println("Los numeros son diferentes.");
    }
}
