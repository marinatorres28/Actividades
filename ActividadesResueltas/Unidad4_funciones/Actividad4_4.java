package Unidad4_funciones;

import java.util.Scanner;

/* Diseñar una funcion que recibe como parametros dos numeros enteros y devuelve el maximo de ambos.
* */
public class Actividad4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica un numero: ");
        int num1 = sc.nextInt();
        System.out.println("Indica un numero: ");
        int num2 = sc.nextInt();

        int max = valorMaximo(num1,num2);
        System.out.println("El numero maximo es: " + max);
        int min = valorMinimo(num1,num2);
        System.out.println("El numero minimo es: " + min);
    }
    public static int valorMaximo(int num1, int num2) {
        return Math.max(num1,num2);
    }
    public static int valorMinimo(int num1,int num2) {
        return Math.min(num1,num2);
    }
}
