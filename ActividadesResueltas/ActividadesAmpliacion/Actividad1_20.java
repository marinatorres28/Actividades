package ActividadesAmpliacion;

import java.util.Scanner;

/*Solicita al usuario un numero real y calcula su raiz cuadrada
implementa el programa utilizando el nombre cualificado de las
clases, en lugar de utilizar ninguna importacion.
* */
public class Actividad1_20 {
    public static void main(String[] args) {
        int num;
        double calculo;
        Scanner sn=new Scanner(System.in);
        System.out.println("Indica un numero entero: ");
        num = sn.nextInt();
        calculo = (Math.sqrt(num));
        System.out.println("La raiz cuadrada de: " + num + " es "+ calculo );



    }
}
