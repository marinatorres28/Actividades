package Unidad3;

import java.util.Scanner;

/*Implementa la aplicacion eco, que pide al usuario un numero y muestra en la
pantalla eco... se muestra tantas veces como indique el numero introducido.
* */
public class AP_3_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Indica cuantas veces quieres que te salude-> ");
        int veces = entrada.nextInt();
        for (int i=1; i<=veces; i++){
            System.out.println("Eco...");
        }
    }
}
