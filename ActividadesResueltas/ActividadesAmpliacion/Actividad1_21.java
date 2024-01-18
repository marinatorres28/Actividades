package ActividadesAmpliacion;

import java.util.Scanner;

/*Pide dos numeros al usuario: a y b. Debera mostrarse true
si ambos numeros son iguales y false en caso contrario.
* */
public class Actividad1_21 {
    public static void main(String[] args) {
        int a , b;
        Scanner sn=new Scanner(System.in);
        System.out.println("Escribe el valor de a: ");
        a = sn.nextInt();
        System.out.println("Escribe el valor de b: ");
        b = sn.nextInt();
        boolean igual = a==b;
        boolean diferente = a!=b;
        System.out.println("¿A es igual que b? " + igual);
        System.out.println("¿A es diferente a b? " + diferente);


    }
}
