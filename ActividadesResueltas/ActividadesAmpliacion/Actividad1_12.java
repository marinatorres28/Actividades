package ActividadesAmpliacion;
/* Escribe un programa que tome como entrada un numero entero e indique que cantidad hay
que sumarle para que el resultado sea multiplo de 7. Un ejemplo:
A 2 hay que sumarle 5 para que el resultado (2+5=7) sea multiplo de 7.
A 13 hay que sumarle 1 para que el resultado (13+1=14) sea multiplo de 7.
Si proporcionas el numero 2 o 13 la salida de la aplicacion debe ser 5 o 1,respectivamente.
* */

import java.util.Scanner;

public class Actividad1_12 {
    public static void main(String[] args) {
        int num,multiplo;
        Scanner sn=new Scanner(System.in);
        System.out.println("Escribe un numero entero: ");
        num = sn.nextInt();
        multiplo = 7 - num % 7;
        System.out.println(multiplo);
        System.out.println("Al numero " + num + " tienes que sumarle " + multiplo + " para que sea multiplo de 7.");



    }
}
