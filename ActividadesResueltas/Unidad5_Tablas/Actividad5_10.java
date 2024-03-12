package Unidad5_Tablas;

import java.util.Arrays;
import java.util.Scanner;

/* Escribir la funcion: int [] eliminarMayores (int t[],int valor)
que crea y devuelve una copia de la tabla t,donde se han elimiado todos los elementos que son mayores que valor.

* */
public class Actividad5_10 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int tablaImportada[] = pedirDatos(); //la funcion pedir datos retorna el array y lo almacena en la nueva variable tabla importada

        int resultado[] = eliminarMayores(tablaImportada); //la funcion eliminar mayores retorna la copia que hemos hecho de la tabla,y se
                                                           // almacena en la nueva variable resultado,que mostramos al final
        mostrar("Resultado final: " + Arrays.toString(resultado));
    }
    public static int [] pedirDatos (){
        mostrar("Indique la longitud de la tabla: ");
        int longitud = sc.nextInt();
        int tabla[]=new int[longitud];

        for (int i = 0; i < tabla.length; i++) {             //si introducimos los datos de la tabla de forma manual tenemos que hacerlo con un
                                                             // bucle for,que se repita hasta la propia longitud de la tabla
            mostrar("Indica un numero de la tabla: ");
            tabla[i]=sc.nextInt();
        }
        return tabla;
    }
    public static int [] eliminarMayores (int tabla[]) {
        Arrays.sort(tabla);
        mostrar("Tabla inicial: " + Arrays.toString(tabla)); //mostramos la tabla importada
        mostrar("¿A partir de que valor quieres eliminar?: ");
        int valor = sc.nextInt();

        int copia[] = Arrays.copyOf(tabla,tabla.length); //copiamos el array completo en la variable copia
        int i = 0; //contador o indice,que va diciendo las posiciones del array
        while (i < copia.length) {
           if (copia[i] > valor) {
               copia[i] = copia[copia.length-1]; //almacenamos dentro de copia i el ultimo valor
               copia = Arrays.copyOf(copia,copia.length-1); //copiamos la tabla menos el ultimo valor
           }else {
               i++;
           }
        }
        return copia;
    }
    public static void mostrar (String texto) {
            System.out.println(texto);
        }
}
