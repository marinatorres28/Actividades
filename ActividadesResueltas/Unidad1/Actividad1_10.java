package Unidad1;
//diseñar un algoritmo que nos indique si podemos salir a la calle.

import java.util.Scanner;

public class Actividad1_10 {
    public static void main(String[] args) {
        boolean llueve,finalizadoTarea,irBiblioteca; //definimos las variables
        Scanner sc=new Scanner(System.in); //declaramos el scanner
        System.out.println("¿Está lloviendo? (true/false)"); //preguntamos al usuario si esta lloviendo
        llueve = sc.nextBoolean(); // esto recoge el valor de la variable "llueve"
        System.out.println("¿Has finalizado tus tareas? (true/false)"); //
        finalizadoTarea = sc.nextBoolean();
        System.out.println("¿Tienes que ir a la biblioteca?");
        irBiblioteca = sc.nextBoolean();
        boolean salir = !llueve && finalizadoTarea || irBiblioteca; //realizamos la operacion para poder obetener el valor de "salir"
        System.out.println("Puedes salir: "+ salir);

    }
}
