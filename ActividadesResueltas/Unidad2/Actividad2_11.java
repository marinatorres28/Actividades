package Unidad2;

import java.util.Scanner;

/*Idear un programa que solicite al usuario un numero comprendido entre
1 y 7 correspondiente a un dia de la semana. Se debe mostrar el nombre
del dia de la semana al que corresponde. Por ejemplo, el numero 1
corresponde a lunes.
* */
public class Actividad2_11 {
    public static void main(String[] args) {
        int dia=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Indica un numero-> ");
        dia = entrada.nextInt();
        switch (dia) {
            case 1: {
                System.out.println("Lunes.");
                break;
            }
            case 2: {
                System.out.println("Martes.");
                break;
            }
            case 3: {
                System.out.println("Miercoles.");
                break;
            }
            case 4: {
                System.out.println("Jueves");
                break;
            }
            case 5: {
                System.out.println("Viernes.");
                break;
            }
            case 6: {
                System.out.println("Sabado.");
                break;
            }
            case 7: {
                System.out.println("Domingo.");
                break;
            }
        }

    }
}
