package Unidad1;

import java.util.Scanner;

public class Enunciado1 {
    //public static void main-> psvm + tb
    public static void main(String[] args) {
        int a,b,c;
        Scanner sn=new Scanner(System.in);
        System.out.println("Ingresa un numero tipo entero: ");
        a= sn.nextInt();
        System.out.println("Ingresa un numero tipo entero: ");
        b= sn.nextInt();
        c=a+b;
        System.out.println("El resultado de la suma de los dos numeros es igual a " + c);
/*Codigo optimizado*/
        int cc; //solo declaro la variable c
        System.out.println("Ingresa un numero tipo entero: ");
        cc= sn.nextInt(); //leemos y acumulamos el valor en cc
        System.out.println("Ingresa un numero tipo entero: ");
        cc=cc+ sn.nextInt();
        System.out.println("El resultado de la suma de los dos numeros es igual a " + c);
    }
}
