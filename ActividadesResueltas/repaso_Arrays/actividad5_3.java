import java.util.Scanner;

/**
 * Escribir una aplicacion que solicite al usuario cuantos numeros desea introducir. A continuacion,introducir por teclado esa cantidad
 * de numeros enteros y por ultimo mostrar en el orden inverso al introducido.
 */
public class actividad5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //primero leeremos la cantidad de numeros que se quieren introducir
        System.out.print("¿Cuantos numeros desea introducir? -> ");
        int longitudTabla=sc.nextInt();
        //creamos la tabla con la longitud que ha introducido el usuario
        int [] tabla = new int[longitudTabla];
        //recorremos la tabla con bucle for desde 0 hasta tabla.lenght
        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Introduce un numero -> ");
            tabla[i]=sc.nextInt();
        }
        System.out.print("Los numeros en orden inverso son -> ");
        for (int i = tabla.length -1; i >= 0 ; i--) { //recorremos en orden inverso la tabla
            System.out.println(tabla[i]);
        }
    }
}
