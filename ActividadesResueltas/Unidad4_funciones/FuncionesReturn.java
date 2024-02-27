package Unidad4_funciones;

import java.util.Scanner;

public class FuncionesReturn {
    public static void main(String[] args) {
//        String nombreUsuario=llamadaNombre(3);
//        System.out.println("Tu nombre es " + nombreUsuario);
        int suma=funcionSumar(45,34);
        System.out.println("El resultado de a + b = " + suma);
//        suma=funcionSumar(85,42);
//        System.out.println("El resultado de a + b = " + suma);
//        int valor=Math.max(45,89);//API Java
//        System.out.println(valor);
    }
//    public static String llamadaNombre(int contador) {
//        String nombre="";
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Indica el nombre: ");
//        nombre = sc.nextLine();
//        return nombre; //envia a quien invoca esa funcion el valor de nombre
//    }
    public static int funcionSumar(int a,int b) {
        return a+b;
    }
}
