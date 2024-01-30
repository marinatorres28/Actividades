package Unidad3;

import java.util.Scanner;

/*Pedir un numero y calcular su factorial. Por ejemplo, el factorial de 5 se denota
5! y es igual a 5 x 4 x 3 x 2 x 1 = 120.
* */
public class Actividad3_11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        double factorial;
        System.out.println("Indica un numero -> ");
        num = entrada.nextInt();
        factorial = 1;
        for (int i = num; i > 0 ; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}
