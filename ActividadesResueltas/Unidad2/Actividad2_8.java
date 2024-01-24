package Unidad2;

import java.util.Scanner;

/*Pedir los coeficientes de una ecuacion de segundo grado y mostrar sus
soluciones reales. Si no existen, habra que indicarlo. Hay que tener en
cuenta que las soluciones de una ecuacion de segundo grado, ax + bx + c = 0, son=
(formula de ecuacion de segundo grado)
* */
public class Actividad2_8 {
    public static void main(String[] args) {
        double a , b , c;
        double x1 , x2 , d;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer coeficiente (a): ");
        a = entrada.nextInt();
        System.out.println("Introduce el segundo coeficiente (b): ");
        b = entrada.nextInt();
        System.out.println("Introduce el tercer coeficiente (c): ");
        c = entrada.nextInt();
        //calculamos d
        d = (b * b - 4 * a * c);
        if (d < 0) {
            System.out.println("No existen soluciones reales.");
        }
        if (a==0) {
            System.out.println("No es una ecuacion de segundo grado.");
        }
        else {
            x1 = (-b + Math.sqrt(d) /2 * a);
            x2 =(-b - Math.sqrt(d) * 2 * a);
            System.out.println("Solucion 1: " + x1);
            System.out.println("Solucion 2: " + x2);
        }
    }
}
