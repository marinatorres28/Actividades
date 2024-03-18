import java.util.Scanner;

/**
 * Diseña la funcion: int maximo (int t[]) , que devuelva el maximo valor contenido en la tabla t.
 */
public class actividad5_4 {
    public static void main(String[] args) {
        int tabla[]=new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Introduce el valor de la tabla -> ");
            tabla[i]= sc.nextInt();
        }
        System.out.print("El valor maximo introducido es -> " + maximo(tabla));
    }
    public static int maximo (int tabla[]){
        int max = tabla[0]; //el primer elemento sera en principio, el maximo. Suponemos que la tabla tendra siempre un elemento
        for (int elemento: tabla) { //recorremos la tabla para buscar un elemento mayor que max
            if (elemento > max){ //si elemento (tabla[i]) es mayor que max,es el nuevo maximo
                max = elemento;
            }
        }
        return max;
    }
}
