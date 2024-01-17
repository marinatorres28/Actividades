package Unidad1;
/*Realizar un programa que pida como entrada un numero decimal y lo muestre redondeado
al entero mas proximo.
* */
import java.util.Scanner;

public class Actividad1_14 {
    public static void main(String[] args) {
        double num; //aqui se guarda el numero decimal escrito por el usuario
        int redondeo; //utilizamos esta variable para truncar el valor de los decimales
        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe un numero decimal: ");
        num = sc.nextDouble();
        //ahora redondeamos la variable num
        redondeo = (int) (num + 0.5); //al ser una conversion de tipos, tenemos que aplicar el (int)
        System.out.println(num + " redondeado es " + redondeo);



    }
}
