package Unidad3;

import javax.swing.*;
import java.util.Scanner;

public class Actividad3_5_2menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String menu = " ";
        byte opcion = 0;
        char simbolo = ' ';
        String salida = " ";
        int operador1, operador2, resultado = 0, resultadoUser = 0, contador = 0;

        do {
            menu = " ";
            menu += "****Menu****\n";
            menu += "1. Sumar \n";
            menu += "2. Restar \n";
            menu += "3. Multiplicar \n";
            menu += "4. Salir \n";
            opcion = (byte) Integer.parseInt(JOptionPane.showInputDialog(menu));
            operador1 = (int) (Math.random() * 100 + 1);
            operador2 = (int) (Math.random() * 100 + 1);

            switch (opcion) {
                case 1 -> {
                    simbolo = '+';
                    resultado = operador1 + operador2;
                }
                case 2 -> {
                    simbolo = '-';
                    resultado = operador1 - operador2;
                }
                case 3 -> {
                    simbolo = '*';
                    resultado = operador1 * operador2;
                }
            }
            salida = operador1 + " " + simbolo + operador2;

            if (opcion != 4) {
                resultadoUser = Integer.parseInt(JOptionPane.showInputDialog(salida));
            }
            ++contador;

            while (opcion != 4 && resultadoUser == resultado) ;
            --contador;
            JOptionPane.showMessageDialog(null, contador);
        }



    }
}


