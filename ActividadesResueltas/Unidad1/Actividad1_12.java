package Unidad1;

import java.util.Scanner;

/*Escribir un programa que pida un numero al usuario y muestre su valor absoluto
* */
public class Actividad1_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        int num = sc.nextInt();
        int valorAbsoluto = num <0 ? num * -1 : num;
        System.out.println("El valor absoluto de " + num + " es " + valorAbsoluto);
    }

}
