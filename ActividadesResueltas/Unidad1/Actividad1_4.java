package Unidad1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Actividad1_4 {
    public static void main(String[] args) {
        short anioNacimiento, anioActual;
        int edad;
        Scanner sn=new Scanner(System.in);
        System.out.println("Año actual->");
        anioActual= sn.nextShort();
        System.out.println("Año de nacimiento->");
        anioNacimiento= sn.nextShort();
        edad= anioNacimiento-anioActual;
        System.out.println("La edad actual es " + edad + " años");
    }
}
