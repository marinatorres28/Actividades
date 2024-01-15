package Unidad1;

import java.util.Scanner;

public class Actividad1_8 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in); //<-Para poder introducir los datos en el teclado
        System.out.println("Indica tu edad->");
        int edad = sn.nextInt(); //<-Para poder escribir los datos de la variable en el teclado
        boolean mayorEdad = edad >= 18; //<-Mediante "boolean" (que nos indica si un dato es verdadero o falso) indicamos que mayor de edad = mayor de 18
        System.out.println("Mayoria de edad: " + mayorEdad);
    }
}
