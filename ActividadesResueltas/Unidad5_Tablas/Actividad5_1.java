package Unidad5_Tablas;

import java.util.Arrays;

/*Crea una tabla de longitud 10 que se inicializara con numeros aleatorios entre el 1 y el 100.
Mostrar la suma de todos los numeros que se guarden.
* */
public class Actividad5_1 {
    public static void main(String[] args) {
        //crear el arrays de numeros
        int [] numeros = new int[10];
        int suma= 0 ;
        //utilizamos el lenght para conocer la longitud del arrays
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*100+1);
            suma+=numeros[i];
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println("La suma de todos los elementos es: " + suma);
        //salida -> con foreach
        for (int elemento:numeros) {
            System.out.print(elemento + " + ");
        }
        System.out.print(" = " + suma);

        String [] id = new String[5];
        //inicializar con un valor predeterminado un array
        Arrays.fill(id,"nombre");
        System.out.println("\n" + Arrays.toString(id));
        double [] puntuacion = new double[10];
        Arrays.fill(puntuacion,0);
        System.out.println(Arrays.toString(puntuacion));
        //inicializa los indices comprendidos de 0 a 5 con el valor de 55
        Arrays.fill(puntuacion,0,5,55);
        System.out.println(Arrays.toString(puntuacion));
    }
}
