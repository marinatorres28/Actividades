package Unidad2;

import java.util.Scanner;

/*Diseñar una aplicacion que solicite al usuario un numero e
indique si es par o impar.
Analisis: Para ser par tenemos que calcular el modulo (%) al numero
leido y si cumple que el resultado es ==0, es par,si no es impar.
* */
public class ActividadP2_1 {
    public static void main(String[] args) {
    //Declaramos el scanner para leer los datos
    Scanner entrada = new Scanner(System.in);
    int num; //solo se solicitan numeros enteros
        System.out.println("Indica un numero entero: ");
        num = entrada.nextInt();
        //condicional
        if (num%2==0) //las llaves tienen sentido si hay mas de una instruccion, si no, puedes suprimirla
            System.out.println("El numero " + num + " es par.");
        else
            System.out.println("El numero " + num + " no es par.");
        //si if y else tienen UNA sola instruccion, se pueden borrar las llaves

        String nombre;
        System.out.println("Indica tu nombre: ");
        nombre = entrada.next();
        //para comparar cadenas de caracteres en java utilizamos un metodo que se llama equals
        if (nombre.equals("Maria")) //metodo de String
        System.out.println("Es el nombre que esperaba.");
        else
            System.out.println("Tu nombre no es el indicado.");
    }



}
