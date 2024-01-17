package ActividadesAmpliacion;

import java.util.Scanner;

public class Actividad1_13 {
    public static void main(String[] args) {
        int n,m,multiplo;
        Scanner sn=new Scanner(System.in);
        System.out.println("Escribe un numero entero: ");
        n = sn.nextInt();
        System.out.println("Escribe un numero entero: ");
        m = sn.nextInt();
        multiplo = m - n % m;
        System.out.println(multiplo);
        System.out.println("Al numero " + n + " tienes que sumarle " + multiplo + " para que sea multiplo de " + m);

    }
}
