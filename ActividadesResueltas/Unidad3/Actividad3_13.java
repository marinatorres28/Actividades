package Unidad3;

import java.util.Scanner;

/*Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (nota
igual a 4) y suspensos.
* */
public class Actividad3_13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int aprobados = 0 , suspensos = 0 , condicionados = 0;
        for (int i= 1 ; i <= 6; i++) {
            System.out.println("Nota del alumno numero " + i + " : ");
            int nota = entrada.nextInt();
            if (nota == 4 ) {
                condicionados++;
            }
            if (nota >= 5 ) {
                aprobados++;
            }
            if (nota < 4 ) {
                suspensos++;
            }
        }
        System.out.println("Alumnos aprobados: " + aprobados);
        System.out.println("Alumnos suspensos: " + suspensos);
        System.out.println("Alumnos condicionados: " + condicionados);
    }
}
