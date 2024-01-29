package Unidad3;

import java.util.Scanner;

/*Implementar una aplicacion para calcular datos estadisticos de las edades de los
alumnos de un centro educativo. Se introduciran datos hasta que uno de ellos sea
negativo, y se mostrara: la suma de todas las edades introducidas, la media, el numero
de alumnos y cuantos son mayores de edad.

*En cada iteracion acumularemos la edad, incrementaremos un contador para llevar la cuenta
de las edades introducidad, y si el alumno es mayor de edad, incrementaremos el contador
de alumnos mayores de edad.
* */
public class Actividad3_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int sumaEdades = 0; //para acumular la suma de las edades
        int contadorAlumnos = 0; //contador de alumnos
        int contadorMayorEdad = 0; //contador de alumnos mayores de edad
        double media; //media de las edades
        System.out.println("Indica la edad -> ");
        int edad = entrada.nextInt();

        while (edad >=0 ) { //repetimos mientras la edad no sea negativa
            sumaEdades += edad; //acumulamos la edad
            contadorAlumnos ++; //se incrementa al introducir la edad de un alumno mas

            if (edad >= 18) { //si la edad introducida corresponde a un mayor de edad
                contadorMayorEdad ++; //incrementamos
            }
            System.out.println("Indica la edad -> ");
            edad = entrada.nextInt();
        }
       media = (double) sumaEdades / contadorAlumnos;
        System.out.println("Suma de todas las edades -> " + sumaEdades);
        System.out.println("Media -> " + media );
        System.out.println("Numero total de alumnos -> " + contadorAlumnos);
        System.out.println("Mayores de edad -> " + contadorMayorEdad);
    }
}
