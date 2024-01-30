package Unidad3;

import java.util.Scanner;

/*Pedir diez numeros enteros por teclado y mostar la media.
* */
public class Actividad3_8 { /* Como tenemos claro que vamos a solicitar 10 numeros,utilizaremos un bucle for.*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n; //cada numero introducido
        int suma=0; //acumulara la suma de todos los numeros introducidos
        double media; //como la media puede usar decimales se usa double
        for (int i = 1; i <= 10; i++) {
            System.out.println("Indica un numero-> ");
            n = entrada.nextInt();
            suma = suma + n;
        }
        media = suma / 10; //para calcular la media
        System.out.println("La nota media es-> " + media);
    }
}
