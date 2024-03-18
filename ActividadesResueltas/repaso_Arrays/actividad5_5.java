import java.util.Arrays;
import java.util.Scanner;

/**
 * Escribir la funcion int [] rellenaPares (int longitud,int fin) , que crea y devuelve una tabla ordenada de la longitud especificada,que se encuentra
 * rellena con numeros pares aleatorios comprendidos en el rango desde 2 hasta fin (inclusive).
 */
public class actividad5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Indica la longitud de la tabla indicada: ");
        int longitud = sc.nextInt();
        System.out.println("Indica el numero fin de los numeros aleatorios: ");
        int fin= sc.nextInt();
        relllenaPares(longitud,fin);
    }

    public static int []relllenaPares (int longitud,int fin){
        //crearemos la tabla con la longitud adecuada
        int pares[]=new int[longitud];

        int i=0; //indica con que elemento de la tabla estamos trabajando

        while (i < pares.length){ //terminaremos de rellenar la tabla cuando el numero de pares sea igual a la longitud de la tabla
            int num = (int) (Math.random()*fin+1);
            if (num % 2 == 0){ //si es par
                pares[i]=num; //lo guardamos en el elemento i
                i++; //e incrementamos el indicador
            }
        }
        //ahora falta ordenar la tabla
        Arrays.sort(pares);
        System.out.println(Arrays.toString(pares));
        return pares;
    }
}
