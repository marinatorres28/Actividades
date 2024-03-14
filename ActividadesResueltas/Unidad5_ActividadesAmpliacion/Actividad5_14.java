package Unidad5_ActividadesAmpliacion;

import java.util.Arrays;
import java.util.Scanner;

/* El ayuntamiento de tu localidad te ha encargado una aplicación que ayude a realizar en-cuestas estadísticas
para conocer el nivel adquisitivo de los habitantes del municipio. Para ello, tendrás que preguntar el sueldo
a cada persona encuestada. A priori, no conoces el número de encuestados. Para finalizar la entrada de datos,
introduce un sueldo con va-lor −1.Una vez terminada la entrada de datos, muestra la siguiente información:
-Todos los sueldos introducidos ordenados de forma decreciente.
-El sueldo máximo y mínimo.
-La media de los sueldos.
* */
public class Actividad5_14 {
    public static void main(String[] args) {
        double sueldos []=altaSueldos();
        //llamamos al metodo mostrar decreciente
        mostrarDecreciente(sueldos);
        //mostramos el maximo y el minimo con la funcion
        mostrarMaxMin(sueldos);
        //mostramos la media de los sueldos con la funcion
        mediaSueldos(sueldos);
    }
    //Metodo de insertar los sueldos
    public static double [] altaSueldos() {
        double sueldos[] = new double[0];
        double sueldoAux=0;
        Scanner sc = new Scanner(System.in);
        //el bucle while que hasta que no se escriba -1 no salga del bucle
        do {
            mostrarSinLn("Indique el sueldo -> ");
            sueldoAux = sc.nextDouble();
            if (sueldoAux !=-1) {
                sueldos= Arrays.copyOf(sueldos,sueldos.length+1);
                sueldos[sueldos.length-1]=sueldoAux;
            }
        }while (sueldoAux != -1);
        //enviamos el resultado y lo ordenamos
        Arrays.sort(sueldos);
        return sueldos;
    }
    //Metodo para mostrar decreciente
    public static void mostrarDecreciente(double sueldos[]){
        for (int i = sueldos.length-1; i >= 0 ; i--) { //bucle para ordenar los datos de forma decreciente
            mostrarSinLn(" " + sueldos[i] + " -");
        }
    }
    //Metodo para indicar max y min de una tabla ordenada
    public static void mostrarMaxMin(double sueldos[]){
        mostrar("\nSueldo mayor -> " + (sueldos[sueldos.length-1]));
        mostrar("Sueldo menor -> " + (sueldos[0]));
    }
    //Metodo para calcular la media
    public static void mediaSueldos (double sueldos[]){
        double suma=0;
        for (int i = 0; i < sueldos.length ; i++) {
            suma+=sueldos[i];
        }
        double media=suma / sueldos.length;
        mostrar("La media de los sueldos es -> " +  media + "€");
    }
    /*Metodos de impresion en pantalla */
    public static void mostrar (String texto) {
            System.out.println("\t"+texto);
        }
    public static void mostrarSinLn (String texto) {
            System.out.print("\t"+texto);
        }
}
