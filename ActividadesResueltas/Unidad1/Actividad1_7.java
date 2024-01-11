package Unidad1;

import java.util.Scanner;

////Diseñar una aplicacion que calcule la longitud y el area de una circunferencia.
// Para ello, el usuario debe introducir el radio (que puede contener decimales).
////Longitud = 2pi * radio
////Area = pi * radio elevado a 2
public class Actividad1_7 {
    public static void main(String[] args) {
        double radio, area, longitud;
        Scanner sn=new Scanner(System.in); //<-Para poder teclear los datos
        System.out.println("Indica el radio: ");
        radio = sn.nextInt();
        longitud = Math.PI * radio;
        area = Math.PI * Math.pow(radio,2);


    }
}
