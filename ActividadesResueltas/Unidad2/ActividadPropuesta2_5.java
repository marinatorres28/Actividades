package Unidad2;

import java.util.Scanner;

/*-Datos: aforo
-Precio
-numeroVendidas
si numeroVendidas <20% del aforo -> no hay concierto
si numeroVendidas <50% -> precio 25%
Solicitar los datos al usuario
Tomar decisiones con el total de entradas vendidas
* */
public class ActividadPropuesta2_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int aforo, numeroVendidas;
        double precioEntrada, recaudacion;
        System.out.println("Indica el precio por entrada: ");
        precioEntrada = entrada.nextDouble();
        System.out.println("Indica el aforo del local: ");
        aforo = entrada.nextInt();
        System.out.println("Numero de entradas vendidas: ");
        numeroVendidas = entrada.nextInt();
        //calculo de la recaudacion
        recaudacion = numeroVendidas * precioEntrada;
        //tomar decisiones basadas en el aforo
        if (numeroVendidas > aforo){
            System.out.println("Overbooking! Busca un local mas grande.");
        }
        else {}
        if (numeroVendidas < aforo * 0.2) { //si el aforo es menor del 20% se cancela el concierto
            System.out.println("Se cancela el concierto.");
        }
        else if (numeroVendidas < aforo * 0.5) {
            precioEntrada = precioEntrada - (precioEntrada * 0.25);
            //15 - 25 %
            recaudacion = numeroVendidas * precioEntrada;
            System.out.println("Entradas al 25%. ");
        }
        else {
            System.out.println("El concierto es normal.");
        }
        System.out.println("La recaudacion del concierto es de " + recaudacion + " €.");














    }

}
