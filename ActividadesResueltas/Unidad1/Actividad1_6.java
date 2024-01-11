package Unidad1;

import java.util.Scanner;

public class Actividad1_6 {
    public static void main(String[] args) {
        int nota1, nota2;
        double media;
        Scanner sn=new Scanner(System.in);
        System.out.println("Nota 1: ");
        nota1 = sn.nextInt(); //para poder escribir tu los datos en el teclado
        System.out.println("Nota 2: ");
        nota2 = sn.nextInt();
        media= nota1 + nota2 / 2.0; //calculo de la media
        System.out.println("La nota media es: " + media);


    }
}
