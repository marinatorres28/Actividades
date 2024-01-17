package Unidad1;

import java.util.Scanner;

/*Escribir un programa que solicite las notas del primer,segundo,y tercer
trimestre (notas enteras que se solicitaran al usuario). El programa debe
mostrar la nota media del curso como se utiliza en el boletin de
calificaciones (solo la parte entera) y como se usa en el expediente
academico (con decimales).
* */
public class Actividad1_13 {
    public static void main(String[] args) {
        int nota1,nota2,nota3; //variables para las notas
        int mediaBoletin; //la media usa tipos entero
        double mediaExpediente; //la media usa decimales,por eso usamos double
        Scanner sc=new Scanner(System.in);
        //leemos las notas
        System.out.println("Nota del primer trimestre: ");
        nota1 = sc.nextInt();
        System.out.println("Nota del segundo trimestre: ");
        nota2 = sc.nextInt();
        System.out.println("Nota del tercer trimestre: ");
        nota3 = sc.nextInt();
        //calculamos la media con decimales
        mediaExpediente = (nota1 + nota2 + nota3) / 3.0;
        mediaBoletin = (int) mediaExpediente;
        System.out.println("La nota media del boletin es: " + mediaBoletin);
        System.out.println("La nota media del expediente academico es: " + mediaExpediente);

    }
}
