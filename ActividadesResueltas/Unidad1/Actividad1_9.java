package Unidad1;

import java.util.Scanner;

public class Actividad1_9 {
    public static void main(String[] args) {
        int num;
        boolean esPar;
        Scanner sn=new Scanner(System.in);
        System.out.println("Inserta un numero");
        num = sn.nextInt();
        esPar = (num%2)==0;
        System.out.println(esPar);
    }
}
