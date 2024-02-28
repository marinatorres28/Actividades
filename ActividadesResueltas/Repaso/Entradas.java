package Repaso;
/*Pelicula-> -Mayores:6,00€
             -Menores:4,50€
         Miercoles:4,50€

* */
import java.util.Scanner;

public class Entradas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double precioNinios = 4.5;
        double precioAdulto = 6.0;
        double totalEntrada = 0;
        byte opcionMenu = 0, miercoles;

        System.out.println("*******************************");
        System.out.println(" CARTELERA ");
        System.out.println("1.  Ferrari (TP)");
        System.out.println("2. Priscila (TP)");
        System.out.println("3. Pepa pig (TP)");
        System.out.println("4. La piscina (+18)");
        System.out.println("5. Pobres criaturas (+18)");
        System.out.println("6. Cazadores de demonios (+18)");
        System.out.println("7. Facturar y salir");
        System.out.println("*******************************");

        System.out.println("\t¿Es miércoles?");
        System.out.println("\t1. Si \n\t 2. No");
        System.out.println("\tRespuesta ->");
        miercoles = sc.nextByte();

        if (miercoles == 1) {
            precioAdulto = 4.50;
        }

        do {
            System.out.print("\nIndica una opción -> ");
            opcionMenu = sc.nextByte();

            switch (opcionMenu) {
                case 1, 2, 3 -> {
                    System.out.print("Número de niños -> ");
                    totalEntrada += sc.nextDouble() * precioNinios;
                    System.out.print("Número de adultos -> ");
                    totalEntrada += sc.nextByte() * precioAdulto;
                }

                case 4, 5, 6 -> {
                    System.out.print("Número de adultos -> ");
                    totalEntrada += sc.nextByte() * precioAdulto;
                }

                case 7 -> {
                    System.out.println("\t*** Imprimiendo su ticket ***");
                }
                default -> System.out.println("Opción no válida");
            }

        } while (opcionMenu !=7);
        System.out.println("\t*** Entradas ***");
        System.out.println("\tImporte a pagar -> " + totalEntrada);
        System.out.println("\t------------------------------------");
    }
}
