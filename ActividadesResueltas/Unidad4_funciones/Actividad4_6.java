package Unidad4_funciones;

import java.util.Scanner;

/* Diseñar una funcion con el siguiente prototipo: boolean esPrimo (int n)
   que devolvera true si n es primo y false en caso contrario.
* */
public class Actividad4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica un numero: ");
        int n = sc.nextInt();
        boolean resultadoFuncion=esPrimo(n);
        System.out.println("El numero introducido " + n + " es primo" + resultadoFuncion);
    }
    public static boolean esPrimo(int n ) {
        return true;
    }

}
