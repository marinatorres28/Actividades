package Unidad5_Tablas;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //la declaracion de arrays o tabla debe contener 3 elementos.
        //1 el tipo de dato
        //2 el nombre de la variable
        //3 la longitud
        int[] edad = new int [5];
        edad[0] = 23; //valores arrays edad
        edad[1] = 52;
        edad[2] = 18;
        edad[3] = 32;
        edad[4] = 45;
        System.out.println(Arrays.toString(edad)); //para mostrar los valores de la tabla
        //Ejemplo: solicitar con scanner las edades
        //solicitar primero cuantas edades voy a insertar

        Scanner sc = new Scanner(System.in);
        mostrar("Indica el numero de edades a insertar: ");
        int longitud = sc.nextInt(); //se guarda la longitud con la que voy a crear el arrays
        byte [] edades = new byte[longitud]; //crearemos el array con la longitud leida

        //necesitamos preguntar las edades, para ello crearemos un bucle for para que recorra las
        //posiciones del array e inserte los valores
        //utilizamos la variable longitud para saber donde debe parar nuestro bucle

        for (int i = 0; i < longitud; i++) {
            mostrar("Indique la edad nº " + (i + 1));
            edades[i] = sc.nextByte();
        }
        System.out.println(Arrays.toString(edades));
        //bucle foreach (para recorrer tablas)
        for (int ed: edades) { //se declara una variable llamada elemento (en este caso ed) y que recorre el array
            System.out.println("Edad insertada ->" + ed);
        }
        //metodos de la API de java sobre los arrays
        //conocer la longitud de un array: lenght
        mostrar("Longitud del array edad -> " +  edad.length);
        mostrar("Longitud del array edades -> " +  edades.length);
        for (int i = 0; i < edad.length; i++) {
            mostrar("La edad insertada en la posicion " + (i+1) + " es -> " + edad[i]);
        }

        //referencias en los arrays:
        mostrar("** REFERENCIAS DE MEMORIA **");
        System.out.println(edad);
        System.out.println(edades);
    }
    public static void mostrar (String texto) { //funcion para mostrar texto sin necesidad del sout
        System.out.println("\t"+texto);
    }
}
