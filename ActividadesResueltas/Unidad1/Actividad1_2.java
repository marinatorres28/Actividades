package Unidad1;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Actividad1_2 {
    public static void main (String[] args){
        int num;
        System.out.println("Escriba un numero: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Valor introducido: "+ num);
    }
}
