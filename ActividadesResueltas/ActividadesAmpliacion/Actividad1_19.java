package ActividadesAmpliacion;

import java.util.Scanner;

/*Una empresa que gestiona un parque acuatico te solicita una
aplicacion que les ayude a calcular el importe que hay que cobrar
en la taquilla por la compra de una serie de entradas (cuyo numero
sera introducido por el usuario). Existen dos tipos de entrada:
Infantil que son 15,50 euros
Adultos que son 20 euros
En el caso de que el importe total sea igual o superior a 100 euros,
se aplicara un bono descuento del 5%.
* */
public class Actividad1_19 {
    public static void main(String[] args) {
        double infantil , adulto , calculo,total;
        Scanner sn=new Scanner(System.in);
        System.out.println("Indica el numero de entradas de adulto: ");
        adulto = sn.nextDouble();
        System.out.println("Indica el numero de entradas de niño: ");
        infantil = sn.nextDouble();
        calculo = (infantil * 15.5) + (adulto * 20);
        total = calculo >=100 ? calculo-(calculo*0.05) : calculo;
        System.out.println("El precio de las entradas en total es de: "+ calculo + " euros");
        System.out.println("El precio de las entradas con el descuento es: "+ total + " euros");

    }
}
