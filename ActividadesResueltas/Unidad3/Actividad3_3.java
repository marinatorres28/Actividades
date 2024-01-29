package Unidad3;

import java.util.Scanner;

/*Codificar el juego "el numero secreto", que consiste en acertar un numero entre
1 y 100 (generado aleatoriamente). Para ello se introduce por teclado una serie de
numeros, para los que se indica: "mayor" o "menor", segun sea mayor o menor con
con respecto al numero secreto. El proceso  termina cuando el usuario acierta o cuando
se rinde, introduciento un -1.
* */
public class Actividad3_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroSecreto = (int) (Math.random()* 100 + 1);
        System.out.println("Introduce un numero entre 1 y 100 -> ");
        int num = entrada.nextInt();
        while (numeroSecreto != num && num != -1) {
            if (numeroSecreto < num) {
                System.out.println("Menor");
            }
            else {
                System.out.println("Mayor");
            }
            System.out.println("Introduzca otro numero -> ");
            num = entrada.nextInt();
        }
        if (numeroSecreto == num ) {
            System.out.println("Respuesta correcta.");
        }
        else {
            System.out.println("Otra vez será.");
        }
    }
}
