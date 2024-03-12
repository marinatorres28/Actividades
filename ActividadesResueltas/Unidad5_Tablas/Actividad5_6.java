package Unidad5_Tablas;

import java.util.Arrays;
import java.util.Scanner;

/* Definir una funcion que tome como parametros dos tablas, la primera con los 6 numeros de una apuesta de la
primitiva, y la segunda (ordenada) con los 6 numeros de la combinacion ganadora. La funcion devolvera el numero
de aciertos.

Solicitar la apuesta a la primitiva y verificar si existen en la combinacion ganadora.
* */
public class Actividad5_6 {
    public static void main(String[] args) {
        int combinacionGanadora [] = new int[6];
        for (int i = 0; i < 6; i++) {
            int numero = (int) (Math.random()* 49 + 1);
           //si el random duplica un numero en la primitiva eso no se da,por lo que hay que validar
           //hay que hacer una busqueda en el array
            int indice = 0;
            while (indice < combinacionGanadora.length && combinacionGanadora[indice] != numero) {
                indice++;
            }
            if (indice >= combinacionGanadora.length) {
              combinacionGanadora[i] = numero;
            }
            else {
                i--;
            }
        }
        Scanner sc = new Scanner(System.in);
        mostrar("Indica tu apuesta ->");
        int apuesta [] = new int [6];
        for (int i = 0; i < apuesta.length; i++) {
            mostrar("Numero " + (i+1) + " -> ");
            apuesta[i] = sc.nextInt();
        }
        mostrar("Tu apuesta es: " + Arrays.toString(apuesta));
        mostrar("Numero de aciertos en tu apuesta: " + primitiva(apuesta,combinacionGanadora));
        mostrar("La combinacion ganadora es: " + Arrays.toString(combinacionGanadora));
    }
    public static int primitiva(int apuesta[],int ganadora[]) {
        int acierto = 0;
        Arrays.sort(apuesta);
        Arrays.sort(ganadora);
        for (int elemento:apuesta) {
            //como la tabla ganadora esta ordenada utilizamos el binarySearch
            if (Arrays.binarySearch(ganadora,elemento) >= 0) {
                acierto++; //esto quiere decir que hemos acertado ese numero
            }
        }
        return (acierto);
    }
    public static void mostrar (String texto) {
        System.out.println("\t"+texto);
    }
}
