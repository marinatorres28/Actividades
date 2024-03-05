package Unidad5_Tablas;
/* Diseñar la funcion: int maximo (int t []) que devuelva el maximo valor contenido en la tabla t.
Se utiliza el codigo del ejercicio anterior.
* */

import java.util.Scanner;

public class Actividad5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mostrar("Indica el numero de elementos enteros a insertar -> ");
        int longitud = sc.nextInt();
        int numeros[] = new int [longitud];

        for (int i = 0; i < longitud; i++) {
            mostrar("Indique el numero ->");
            numeros[i] = sc.nextInt();
        }
        //mostrar de forma inversa
        mostrar("Muestra de forma inversa los numeros insertados ");
        for (int i = numeros.length-1; i >= 0  ; i--) {
            mostrar("-> " + numeros [i]);
        }
        mostrar("El valor maximo introducido es -> " + maximo(numeros));
    }
    public static void mostrar (String texto) {
        System.out.println("\t" + texto);
    }
    public static int maximo (int t[]) { //podemos pasar arrays por parametros a una funcion
        int max = t[0]; //asumimos que al menos hay un elemento
        for (int elemento: t) { //recorremos el array pasado por parametros
            if (elemento > max) { //validamos cada elemento y comparamos con el maximo acumulado
                max = elemento;
            }
        }
        return max;
    }
}
