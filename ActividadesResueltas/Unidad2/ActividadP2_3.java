package Unidad2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.SortedMap;

/*Escribe una aplicacion que pida al usuario dos numero enteros y muestre: true,
si ambos numeros son distintos entre si o alguno de ellos es cero; y false en
caso contrario.
A!=B || A==0 | B==0
* */
public class ActividadP2_3 {
    public static void main(String[] args) {
        int a,b;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Indica a-> ");
        a = entrada.nextInt();
        System.out.println("Indica b-> ");
        b = entrada.nextInt();
        if (a!=b || a==0 || b==0) {
            System.out.println("Se ha cumplido la condicion.");
        }
        else {
            System.out.println("Esto no cumple la condicion.");
        }
    }
}
