package Unidad3;

import java.util.Scanner;

public class SalidasAnticipadas {
    public static void main(String[] args) {

        /*Ejemplo: Indica la edad para entrar al pub, solo puede entrar los mayores de 18
        y quiero saber cuantas personas han entrado porque el aforo es de 100 personas.
        *Indica la edad -> si es menor de 18 no entra y no cuenta
        Si es mayor y el aforo lo permite, entra. Si no, el programa se interrumpe porque
        no puede tener dentro del local mas de 5 personas.
        * */


        //declaraciones
        Scanner entrada = new Scanner(System.in);
        byte edad;
        byte menores=0;
        for (byte i= 1; i <= 7 ; i++) {
            System.out.println("Indica la edad: ");
            edad = entrada.nextByte();
            if (edad < 18) {
                System.out.println("No puedes entrar. ");
                i--;
                menores++;
            }
            if (i==5) {
                System.out.println("Han intentado entrar " + menores + " menores de edad.");
                System.out.println("***Aforo completo.***");
                break;

            }

        }






    }
}
