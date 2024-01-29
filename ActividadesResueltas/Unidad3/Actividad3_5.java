package Unidad3;

import java.util.Scanner;

/*Desarrollar un juego que ayude a mejorar el calculo mental de la suma. El jugador
tendra que introducir la solucion de la suma de dos numeros aleatorios comprendidos
entre el 1 y el 100. Mientras la solucion introducida sea la correcta, el juego
continuara. En caso contrario, el programa terminara y mostrara el numero de operaciones
realizadas correctamente.
* */
public class Actividad3_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int resultado, numero1, numero2;
        int numeroOperaciones = 0;
        do {
            numero1 = (int) (Math.random()*100 + 1);
            numero2 = (int) (Math.random()*100 + 1);
            System.out.println(numero1 + " + " + numero2);
            resultado = entrada.nextInt();
            numeroOperaciones++;
        }
        while (resultado == numero1 + numero2);
        System.out.println("Ha conseguido realizar: " + (numeroOperaciones - 1) + " sumas consecutivas.");


    }
}
