package Unidad4_funciones;

import java.util.Scanner;

/*Escribir una funcion a la que se le pasen dos enteros y muestre todos los numeros comprendidos entre ellos.
* */
public class Actividad4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Indica un numero: ");
        int num1 = sc.nextInt();
        System.out.println("Indica otro numero: ");
        int num2 = sc.nextInt();
        mayorMenor(num1,num2);
    }
    public static void mayorMenor(int num1,int num2){
       int mayor,menor;
        mayor = num1 > num2 ? num1 : num2;
        menor = num1 < num2 ? num1 : num2;
        for (int i = menor; i <=mayor ; i++) {
            System.out.println(i);
        }
    }
}
