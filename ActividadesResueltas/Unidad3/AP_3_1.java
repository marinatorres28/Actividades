package Unidad3;

import java.util.Scanner;

/*Diseña una aplicacion que muestre la edad maxima y minima de un grupo de Alumnos.
El usuario introducira las edades y terminara escribiendo un -1.
***ANALISIS***
Solicitar edad
leer la edad
1 entrada asignar a la variable edadMaxima=edad ; edadMinima=edad
mientras edad !=-1
comparo edadMinima>edad
        edadMinima=edad
comparo edadMaxima<edad
        edadMaxima=edad
mostramos la edadMinima y la edadMaxima
* */
public class AP_3_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte edad, edadMinima, edadMaxima;
        System.out.println("Indica la edad -> "); //esta linea se tiene que repetir
        edad = entrada.nextByte();
        edadMinima=edad;
        edadMaxima=edad;

        while (edad !=-1) { //se repetira mientras el usuario no escriba -1
            //condicionales if
            if (edadMinima > edad) {
                edadMinima = edad;
            }
            if (edadMaxima < edad) {
                edadMaxima = edad;
            }
            System.out.println("Indica la edad -> ");
            edad = entrada.nextByte();
        }
        System.out.println("La edad minima ingresada es " + edadMinima);
        System.out.println("La edad maxima ingresada es " + edadMaxima);














    }
}
