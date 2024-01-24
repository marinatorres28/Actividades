package Unidad2;

import java.util.Scanner;

/*Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma:
insuficiente (de 0 a 4),suficiente (5),bien (6),notable (7 y 8) y sobresaliente (9 o 10)
* */
public class Actividad2_10 {
    public static void main(String[] args) {
        int nota , opcion;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Indica tu nota: ");
        nota = entrada.nextInt();
        switch (nota){
            case 0,1,2,3,4:{
                System.out.println("Tu nota es un insuficiente.");
                break;
            }
            case 5:{
                System.out.println("Tu nota es un suficiente.");
                break;
            }
            case 6:{
                System.out.println("Tu nota es un bien.");
                break;
            }
            case 7,8:{
                System.out.println("Tu nota es un notable.");
                break;
            }
            case 9,10:{
                System.out.println("Tu nota es un sobresaliente.");
                break;
            }
        }
    }
}
