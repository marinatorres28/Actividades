package Unidad5_ActividadesAmpliacion;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/* Realiza la funcion: int [] buscarTodos (int t [],int clave), que crea y devuelve una tabla con todos
los indices de los elementos donde se encuentra la clave de busqueda. En el caso de que clave no se encuentre
en la tabla t, la funcion devolvera la tabla vacia.
* */
public class Actividad5_11 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int tabla[] = crearTabla();
        int resultado[] = buscarIndice(tabla);
        mostrarSinLn("El resultado encontrado es: ");
        mostrarSinLn(Arrays.toString(resultado));
    }
    //Metodo para crear la tabla y devolver los datos.

    public static int [] crearTabla (){
        mostrarSinLn("Indique el numero de elementos a insertar -> ");
        int longitud=sc.nextInt(); //preguntamos la longitud
        int tabla [] = new int[longitud]; //creamos la tabla con la longitud indicada
        for (int i = 0; i < tabla.length; i++) { //recorremos la tabla para insertar datos
            mostrarSinLn("Indique el elemento " + (i+1) + " ->");
            tabla[i]= sc.nextInt(); //leemos el dato e insertamos el dato en el indice i
        }
        return tabla;

    }
    //Metodo que busca en la tabla el valor que se solicita y guarda el resultado en otra tabla
    public  static int[] buscarIndice (int tabla []){
        //creamos una tabla donde insertaremos los indices del numero buscado
        int aux []=new int[0];
        mostrarSinLn("Indica el numero a buscar ->");
        int buscar=sc.nextInt();
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i]==buscar) {
                //aumento una posicion del array aux
                aux= Arrays.copyOf(aux,aux.length+1);
                //inserto el elemento encontrado
                aux[aux.length-1]=tabla[i];
            }
        }
        return aux;
    }
    public static void mostrar (String texto) {
            System.out.println("\t"+texto);
        }
    public static void mostrarSinLn (String texto) {
            System.out.print("\t"+texto);
        }
}
