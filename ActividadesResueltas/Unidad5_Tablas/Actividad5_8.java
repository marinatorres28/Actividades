package Unidad5_Tablas;

import java.util.Arrays;
import java.util.Scanner;

/* Leer y almacenar n numeros enteros en una tabla, a partir de la que se construiran otras dos
tablas con los elementos con valores pares e impares de la primera, respectivamente. Las tablas pares deben
mostrarse ordenadas.
* */
public class Actividad5_8 {
    public static void main(String[] args) {
        //como las tablas con los numeros impares tienen que estar ordenadas,lo que haremos sera ordenar
        //los datos de entrada. Que recorremos y segun sea par o impar,se insertara en la tabla correspondiente
        Scanner sc = new Scanner (System.in);
        int datos[]; //tabla para los datos iniciales
        //creamos las tablas par e impar,inicialmente de longitud 0
        int par[]=new int[0];
        int impar[]=new int[0];

        mostrar("Escribe n: ");
        int n = sc.nextInt(); //n es el numero de datos a leer
        datos = new int[n]; //creamos la tabla de longitud n

        //leemos del teclado los valores de la tabla
        for (int i = 0; i < datos.length; i++) {
            mostrar("Introduzca un numero: ");
            datos[i]= sc.nextInt();
        }
        //recorremos los datos para clasificarlos
        for (int numero:datos) {
            //al estar la tabla con todos los datos ordenados,los elementos se insertaran siempre al final
            //de la tabla par o impar
            if (numero % 2 == 0) { //si el numero es par
                par = Arrays.copyOf(par,par.length+1); //incrementamos la longitud de par
                par[par.length-1] = numero; //guardo el numero en el ultimo elemento
            }
            else {
                impar = Arrays.copyOf(impar,impar.length+1);
                impar[impar.length-1] = numero; //hacemos lo mismo que con la tabla impar
            }
        }
        //mostramos las tablas par e impar
        mostrar("Pares: " + Arrays.toString(par));
        mostrar("Impar: " + Arrays.toString(impar));
    }
    public static void mostrar (String texto) {
            System.out.println(texto);
        }
}
