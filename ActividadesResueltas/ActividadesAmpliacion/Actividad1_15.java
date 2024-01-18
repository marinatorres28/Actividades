package ActividadesAmpliacion;

import java.util.Scanner;

/*Dado el siguiente polinomio de segundo grado:
y = ax^2 + bx + c
crea un programa que pida los coeficientes a,b y c,asi como el
valor de x, y calcula el valor correspondiente de y.
* */
public class Actividad1_15 {
    public static void main(String[] args) {
        double exp=2;
        int base=15;
        double calculo=Math.pow(exp,base),y;
        System.out.println(calculo);
        Scanner sn=new Scanner(System.in);
        System.out.println("Calculemos el siguiente polinomio: y = ax^2 + bx + c");
        System.out.println("Introduce el coeficiente a: ");
        int a = sn.nextInt();
        System.out.println("Introduce el valor de x: ");
        int x= sn.nextInt();
        System.out.println("Introduce el coeficiente b: ");
        int b= sn.nextInt();
        System.out.println("Introduce el coeficiente c: ");
        int c= sn.nextInt();
        y = a*(Math.pow(x,2))+(b*x)+c;
        System.out.println("El valor de y es igual a: " + y );

    }
}
