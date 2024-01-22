package Unidad2;

import java.util.Scanner;

/*Pedir dos numeros y mostrarlos ordenados de forma decreciente.
* */
public class Actividad2_5 {
    public static void main(String[] args) {
        int num1, num2;
        int mayor, menor;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        num1 = entrada.nextInt();
        System.out.println("Introduce otro numero: ");
        num2 = entrada.nextInt();
        mayor = num1>num2 ? num1 : num2;
        menor = num1<num2 ? num1 : num2;
        System.out.println(mayor + "," + menor);
    }
}
