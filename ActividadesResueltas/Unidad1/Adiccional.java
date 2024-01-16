package Unidad1;

import java.util.Scanner;

public class Adiccional {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe tu edad: ");
        int edad = sc.nextInt();
        String mensaje=edad >=18 ? "Puede entrar al pub" : "Ir a dormir";
        boolean entrar=edad>=18?true:false;
        System.out.println(mensaje);
        System.out.println("¿Es mayor de edad? " + entrar);
    }
}
