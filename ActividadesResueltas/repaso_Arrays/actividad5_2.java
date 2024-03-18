import java.util.Arrays;
import java.util.Scanner;

/**
 * Diseñar un programa que solicite al usuario que introduzca por teclado 5 numeros decimales. A continuacion, mostrar los numeros en el mismo orden que
 * se han introducido.
 */
public class actividad5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] numeros = new double[5];
        for (int i = 0; i < numeros.length; i++) { //recorremos el array con un bucle que tenga la longitud de numeros (numeros.lenght)
            System.out.print("Introduce un numero -> ");
            numeros[i]=sc.nextDouble(); //para almacenar los datos tenemos que poner numeros de i (numeros[i])
        }
        System.out.println(Arrays.toString(numeros)); //mostramos la tabla con los numeros
    }
}
