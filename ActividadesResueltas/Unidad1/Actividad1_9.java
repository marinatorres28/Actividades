package Unidad1;

import java.util.Scanner;

public class Actividad1_9 {
    public static void main(String[] args) {
        int num; //indicamos la variable
        boolean esPar; //como es verdadero o falso usamos boolean
        Scanner sn=new Scanner(System.in); //definimos el scanner
        System.out.println("Inserta un numero");
        num = sn.nextInt(); //para introducir los datos de la variable "num"
        esPar = (num%2)==0; //formula para que sea un numero par
        System.out.println(esPar);
    }
}
