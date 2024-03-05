package Unidad5_Tablas;

import java.util.Arrays;

/*Crea 5 elementos:
Enteros, doubles y booleanos.
Mostrarlos -> Usa una funcion
* */
public class ActividadP5_1 {
    public static void main(String[] args) {
    int [] edad = new int[5];
    edad [0] = 11;
    edad [1] = 12;
    edad [2] = 13;
    edad [3] = 14;
    edad [4] = 15;
    double [] longitud = new double[5];
    longitud [0] = 2.5;
    longitud [1] = 3.0;
    longitud [2] = 3.5;
    longitud [3] = 4.0;
    longitud [4] = 4.5;
    boolean [] datos = new boolean[5];
    datos [0] = true;
    datos [1] = false;
    datos [2] = true;
    datos [3] = false;
    datos [4] = true;
    //para mostrar los datos de los arrays usamos Arrays.toString
        System.out.println("Las edades son: " + Arrays.toString(edad));
        System.out.println("Las longitudes son: " + Arrays.toString(longitud));
        System.out.println("Los datos son: " + Arrays.toString(datos));

    mostrar("* * Referencias * *");
    mostrar("Edad: " + edad);
    mostrar("Longitud: " + longitud);
    mostrar("Datos:" + datos);

    }
    public static void mostrar(String texto) { //funcion para mostrar texto sin necesidad del sout
        System.out.println("\t" + texto);
    }
}
