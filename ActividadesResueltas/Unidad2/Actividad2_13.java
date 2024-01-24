package Unidad2;

import java.util.Scanner;

/*Escribir un programa que pida una hora de la siguiente forma: hora, minutos y segundos.
El programa debe mostrar que hora sera un segundo mas tarde. Por ejemplo:
hora actual [10:41:59] -> hora actual +1 segundo: [10:42:00]
* */
public class Actividad2_13 {
    public static void main(String[] args) {
        int hora, minutos, segundos;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Indica la hora: ");
        hora = entrada.nextInt();
        System.out.println("Indica los minutos: ");
        minutos = entrada.nextInt();
        System.out.println("Indica los segundos: ");
        segundos = entrada.nextInt();

        segundos++; //incrementamos los segundos
        if (segundos > 59) {
            segundos = 0; //si los segundos son mayor que 59, los ponemos en 0
        }
        minutos ++; //incrementamos los minutos
        if (minutos > 59) {
            minutos = 0;
        }
        hora++; //incrementamos las horas
        if (hora > 23) {
            hora = 0;
        }
        System.out.println("La hora + 1 segundo es: " + hora + "." + minutos + "." + segundos);














    }

}
