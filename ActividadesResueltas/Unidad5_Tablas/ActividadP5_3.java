package Unidad5_Tablas;

import java.util.Scanner;

/* Solicita por teclado un numero y realizar la media de los numeros insertados. La media de los negativos y la
cuenta de los numeros 0 introducidos.
* */
public class ActividadP5_3 {
    public static void main(String[] args) {
        //solicitar cuantos numeros se van a introducir
        Scanner sc = new Scanner(System.in);
        mostrar("Indica el numero de elementos a insertar: ");
        int longitud = sc.nextInt();
        int numeros [] = new int [longitud];
        int contadorCero = 0;
        int contadorNegativos = 0;
        int contadorPositivos = 0;
        double mediaPositivos = 0;
        double mediaNegativos = 0;

        for (int i = 0; i < longitud; i++) {
            mostrar("Indica el elemento Nº " + (i+1));
            numeros[i] = sc.nextInt();
            if (numeros[i] < 0) {
                mediaNegativos += numeros[i];
                contadorNegativos ++;

            }
            else if (numeros[i] > 0){
                mediaPositivos += numeros[i];
                contadorPositivos ++;

            }
            else {
                contadorCero ++;
            }
        }
        mediaNegativos /= contadorNegativos;
        mediaPositivos /= contadorPositivos;
        mostrar("La media de los " + contadorNegativos + " numeros negativos -> " + mediaNegativos);
        mostrar("La media de los " + contadorPositivos + " numeros negativos -> " + mediaPositivos);
        mostrar("Los 0 insertados son -> " + contadorCero);
    }
    public static void mostrar (String texto) {
        System.out.println("\t" + texto);
    }
}
