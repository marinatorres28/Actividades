package Unidad2;

import java.util.Scanner;

/*Implementar un programa que pida por teclado un numero decimal e indique si es un numero
casi-cero,que son aquellos, positivos o negativos, que se acercan a 0 por menos de 1 unidad
aun que curiosamente el 0 no se considera un numero casi-cero. Ejemplos de numeros
casi-cero son el 0,3 el -0,99 o el 0,123; algunos numeros que no se consideran
casi ceros son: el 12,3 el 0 o el -1.
* */
public class Actividad2_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero real positivo o negativo: ");
        double num = entrada.nextDouble();
        if (-1 < num || num < 1 || num !=0)
            System.out.println("Es un numero casi-cero.");
        else
            System.out.println("No es un casi-cero.");
    }
}
