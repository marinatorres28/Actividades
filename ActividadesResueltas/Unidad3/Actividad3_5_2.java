package Unidad3;

import java.util.Scanner;

public class Actividad3_5_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int resultado, numero1, numero2;
        int numeroOperaciones = 0;
        byte operacion;
        String simbolo= " ";

        do {
            operacion= (byte) (Math.random()*3+1);
            numero1 = (int) (Math.random() * 100 + 1);
            numero2 = (int) (Math.random() * 100 + 1);

            switch (operacion) {
                case 1 -> {
                    simbolo = "+";
                    resultado = numero1 + numero2;
                }case 2 -> {
                    simbolo = "-";
                    resultado = numero1 - numero2;
                }case 3 -> {
                    simbolo = "*";
                    resultado = numero1 * numero2;
                }
            }

            System.out.println(numero1 + " " + simbolo + " " +numero2);
            resultado = entrada.nextInt();
            numeroOperaciones++;
        }
        while (resultado == resultado);
        System.out.println("Ha conseguido realizar: " + (numeroOperaciones - 1) + " operaciones consecutivas.");
        }
    }
