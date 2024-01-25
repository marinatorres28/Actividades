package ActividadesAmpliacion2;

import java.util.Scanner;

/*Crea una aplicacion que solicite al usuario cuantos grados tiene un angulo
y muestre el equivalente en radianes. Si el angulo introducido por el usuario no se
encuentra en el rango de 0º a 360º, hay que transformarlo a dicho rango.
El operador modulo puede ayudarnos a convertir un angulo a su equivalente en el
rango comprendido de 0º a 360º.
* */
public class Actividad2_19 {
    public static void main(String[] args) {
        // indicar los grados y calcular los radianes
        // radianes = grados * pi / 180
        Scanner entrada = new Scanner(System.in);
        double grados=0;
        System.out.println("Indica los grados del angulo: ");
        grados= entrada.nextDouble();
        grados%=360;
        double radianes=grados*Math.PI/180;
        System.out.print("Los radianes son "); //no hace salto de lineas;
        System.err.printf("%.4f %n",radianes);
    }
}
