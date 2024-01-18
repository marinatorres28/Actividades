package ActividadesAmpliacion;

import java.util.Scanner;

/*Solicita al usuario tres distancias:
La primera,medida en milimetros.
La segunda, medida en centimetros.
La ultima, medida en metros.
Diseña un programa que muestre la suma de las tres longitudes
introducidas (medida en centimetros).
* */
public class Actividad1_17 {
    public static void main(String[] args) {
        double dist1, dist2, dist3, total;
        Scanner sn=new Scanner(System.in);
        System.out.println("Indica una distancia en milimetros: ");
        dist1 = sn.nextDouble()*10;
        System.out.println("Indica una distancia en centimetros: ");
        dist2 = sn.nextDouble();
        System.out.println("Indica una distancia en metros: ");
        dist3 = sn.nextDouble()/100;
        total= dist1 + dist2 + dist3;
        System.out.println("La suma de las tres longitudes es: " + total + " centimetros.");

    }

}
