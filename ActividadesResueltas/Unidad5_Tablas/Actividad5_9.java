package Unidad5_Tablas;

import java.util.Arrays;
import java.util.Scanner;

/* Diseñar una aplicacion para gestionar un campeonato de programacion, donde se introduce la puntuacion (enteros)
obtenidos por 5 programadores,conforme van terminando su prueba. La aplicacion debe mostrar las puntuaciones ordenadas
de los 5 participantes. En ocasiones,cuando finalizan los 5 participantes anteriores,se suman al campeonato programadores
de exhibicion,cuyos puntos se incluyen con el resto. La forma de especificar que no intervienen mas programadores de
exhibicion es introducir como puntuacion un -1.
La aplicacion debe mostrar,finalmente,los puntos ordenados de todos los participantes.

Se introducen las puntuaciones de los participantes (5).
Mostar ordenadas las puntuaciones.
Pueden sumarse nuevos participantes a las puntuaciones.
La forma de que no se pidan mas notas es introducir un -1.
Finalmente mostrar las notas ordenadas de todos los participantes.

* */
public class Actividad5_9 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        puntuacion();

    }
    public static void puntuacion () {
        int[] puntuacion = new int [5];

        for (int i = 0; i < puntuacion.length; i++) {
            mostrar("Introduce la puntuacion: ");
            puntuacion[i] = sc.nextInt();
        }
        Arrays.sort(puntuacion);
        mostrar(Arrays.toString(puntuacion));
        nuevasPuntuaciones(puntuacion);
    }
    public static void nuevasPuntuaciones (int[]puntuacion) {
        mostrar("Introduce las nuevas puntuaciones: ");
        int nuevasPun = sc.nextInt();
        while (nuevasPun != -1) { //mientras no se escriba -1,sigue el bucle
            int indiceInsercion = Arrays.binarySearch(puntuacion,nuevasPun); //binary search sirve para saber en que posicion
                                                                             // del array tiene que ir el nuevo elemento

            if (indiceInsercion < 0) { //si el indice de insercion es menor que 0,se sale de rango
                indiceInsercion = -indiceInsercion -1;
            }

            int [] copiaPun = new int[puntuacion.length+1];
            System.arraycopy(puntuacion,0, copiaPun, 0,indiceInsercion);
            mostrar("Cortado hasta la posicion: " + Arrays.toString(copiaPun));
            copiaPun[indiceInsercion] = nuevasPun;

            mostrar("Insertado: " + Arrays.toString(copiaPun));
            System.arraycopy(puntuacion,indiceInsercion,copiaPun,indiceInsercion+1, puntuacion.length-indiceInsercion);
            puntuacion = copiaPun;

            mostrar("Puntuaciones agregadas finales: " + Arrays.toString(puntuacion));

            mostrar("Introduce las nuevas puntuaciones: ");
            nuevasPun = sc.nextInt();
        }
        mostrar("Las puntuaciones finales son: " + Arrays.toString(puntuacion));
    }
    public static void mostrar (String texto) {
            System.out.println("\t"+texto);
        }
}
