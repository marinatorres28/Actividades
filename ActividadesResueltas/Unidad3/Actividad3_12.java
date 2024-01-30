package Unidad3;

import java.util.Scanner;

/*Pedir 5 calificaciones de alumnos y decir al final si hay algun suspenso.
* */
public class Actividad3_12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean suspensos = false; //suponemos que al principio no hay ningun suspenso
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Indica una nota de 0 a 10: ");
            int notas = entrada.nextInt();
            if (notas < 5) {
                suspensos = true;
            }
        }
        if (suspensos) {
            System.out.println("Hay alumnos suspensos.");
        }
        else {
            System.out.println("No hay suspensos.");
        }
    }
}
