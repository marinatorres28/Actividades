package Unidad1;

import java.util.Scanner;

/*Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas
y peras. Por este motivo, es necesario diseñar una aplicacion que solicite las ventas (en
kilos) de cada semestre para cada fruta. La aplicacion mostrará el importe total sabiendo
que el precio del kilo de manzanas esta fijado en 2,35euros y el kilo de peras en 1,95 euros.
* */
public class Actividad1_11 {
    public static void main(String[] args) {
        final double precio_manzanas = 2.35;
        final double precio_peras = 1.95;
        double manz1Sem,manz2Sem;
        double peras1Sem,peras2sem;
        double impTotal;
        //despues de declarar todas las variables necesarias pedimos los datos
        Scanner sc=new Scanner(System.in);
        System.out.println("Para las manzanas: ");
        System.out.println("Ventas del primer semestre: ");
        manz1Sem = sc.nextDouble();
        System.out.println("Ventas del segundo semestre: ");
        manz2Sem = sc.nextDouble();
        System.out.println("Para las peras: ");
        System.out.println("Ventas del primer semestre: ");
        peras1Sem = sc.nextDouble();
        System.out.println("Ventas del segundo semestre: ");
        peras2sem = sc.nextDouble();
        //calculamos el importe total obtenido despues de recoger los datos
        impTotal = (manz1Sem + manz2Sem) * precio_manzanas;
        impTotal += (peras1Sem + peras2sem) * precio_peras;
        System.out.println("El importe total es de: " + impTotal + " euros");

    }
}
