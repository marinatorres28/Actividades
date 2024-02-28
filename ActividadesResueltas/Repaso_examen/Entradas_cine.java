package Repaso_examen;

import java.util.Scanner;

/**
 * Película:
 *  - Mayores -> 6€
 *  - Menores -> 4,5€
 *
 *  - Miércoles -> 4,5€
 *
 *  Cartelera -> Película -> +18 o todos los públicos
 *
 *   - Carnet joven/senior -> 4,5€
 *
 *   Ferrari (TP)       Pobres criaturas >=18           Priscila (TP)
 *   La piscina >=18    Pepa Pig (TP)                   Cazadores de demonios >=18**/

public class Entradas_cine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double precioNinios = 4.50;
        double precioAdulto = 6;
        double totalEntrada = 0;
        int miercoles = 0,opcion;
        int numeroNinios = 0,numeroAdultos = 0;
        int totalAdultos = 0,totalNinios = 0;

        System.out.println(" CARTELERA ");
        System.out.println(" 1. Ferrrari (TP) ");
        System.out.println(" 2. Priscila (TP) ");
        System.out.println(" 3. Pepa Pig (TP) ");
        System.out.println(" 4. La Piscina (18) ");
        System.out.println(" 5. Pobres criaturas (18) ");
        System.out.println(" 6. Cazadores de demonios (18) ");
        System.out.println(" 7. Facturar y salir.  ");

        do {
            if ((miercoles != 1 || miercoles != 2) && miercoles != 0) {
                System.err.println("Opcion no valida.");
            }

            System.out.println("\n¿Es miercoles?");
            System.out.println("\t1. Si   \n\t2.No");
            miercoles = sc.nextInt();

        } while (miercoles < 1 || miercoles > 2);


        if (miercoles == 1) {
            precioAdulto= 4.50;
        }
        do {
            System.out.println("¿Que pelicula quieres ver? ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1,2,3 -> {

                    System.out.println("Entradas niños ->");
                    numeroNinios = sc.nextInt();
                    totalNinios = totalNinios + numeroNinios;
                    totalEntrada = totalEntrada + (numeroNinios * precioNinios);
                    //forma simplificada: totalEntrada += numeroNinios * precioNinio

                    System.out.println("Entradas adultos ->");
                    numeroAdultos = sc.nextInt();
                    totalAdultos = totalAdultos + numeroAdultos;
                    totalEntrada= totalEntrada + (numeroAdultos * precioAdulto);
                    //forma simplificada: totalEntrada += numeroAdulto * precioAdulto


                }
                case 4,5,6 -> {
                    System.out.println("Entrada adultos ->");
                    numeroAdultos = sc.nextInt();
                    totalAdultos = totalAdultos + numeroAdultos;
                    totalEntrada = totalEntrada + (numeroAdultos * precioAdulto);

                }
                case 7 ->  {
                    System.out.println("Imprimiendo ticket.");
                }
                default -> System.err.println("Opcion no valida.");
            }

        } while (opcion!=7);

        System.out.println(" TICKET ");
        if (numeroNinios == 0 ) {
            System.out.println("Entradas adulto -> " + totalAdultos);
        }

        System.out.println("Entradas adulto -> " + totalAdultos);
        System.out.println("Entradas niño -> " + totalNinios);
        System.out.println("Total a pagar -> " + totalEntrada);


    }
}
