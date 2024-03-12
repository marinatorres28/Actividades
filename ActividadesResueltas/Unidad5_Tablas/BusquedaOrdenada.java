package Unidad5_Tablas;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BusquedaOrdenada {
    public static void main(String[] args) {
        int numeros[] = {14,12,18,13,19,20,11,15};
        mostrar("Longitud -> " + numeros.length);
        mostrar("Sin ordenar ->");
        mostrar(Arrays.toString(numeros));
        mostrar("Ordenado ->");
        Arrays.sort(numeros);
        mostrar(Arrays.toString(numeros));

        //despues de ordenar el array,se puede buscar un elemento con la clase
        //binarySearch(nombreArray,elementoBuscar)
        //el resultado de esta clase es un entero, si es positivo, es el indice donde se encuentra
        //si es negativo menor que 0, es el indice donde deberia ir posicionado ese elemento buscado pero que no se encuentra
        int posicion = Arrays.binarySearch(numeros,20);
        mostrar("Posicion -> " + posicion);
        int indiceInsertar = - posicion-1;
        mostrar("El 8 deberia ir en el indice " + indiceInsertar + " para mantener la tabla ordenada.");
        if (posicion < 0) {
            mostrar("Este numero no existe en la tabla: ");
            indiceInsertar = - posicion - 1;
            mostrar("El 20 deberia ir en el indice " + indiceInsertar + " para mantener la tabla ordenada.");
        }

    }
    public static void mostrar (String texto) {
        System.out.println("\t"+texto);
    }
    public static void mostrarSinLn (String texto) {
        System.out.print("\t"+texto);
    }
}
