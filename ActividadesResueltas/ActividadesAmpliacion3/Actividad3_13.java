package ActividadesAmpliacion3;

import java.util.Scanner;

/*Escribe un programa que incremente la hora de un reloj. Se pediran
por teclado la hora, minutos y segundos, asi como cuantos segundos se
desea incrementar la hora introducida. La aplicacion mostrara la nueva
hora. Por ejemplo si las 13:59:51 se incrementan en 10 segundos
resultan las 14:00:01.
* */
public class Actividad3_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica la hora: ");
        int hora = sc.nextInt();
        System.out.println("Indica los minutos: ");
        int minutos = sc.nextInt();
        System.out.println("Indica los segundos: ");
        int segundos = sc.nextInt();

        System.out.println("Indica cuantos segundos quieres incrementar: ");
        int segundosIn = sc.nextInt();

        for (int i = 1; i <= segundosIn; i++) {
            segundos++;
            if (segundos == 60) {
                segundos = 0;
                minutos++;

                if (minutos == 60) {
                    minutos = 0;
                    hora++;


                    if (hora == 24) {
                        hora = 0;
                    }

                }

            }
            System.out.println("La hora es: " + hora + " : " + minutos + " : " + segundos);
        }

    }
}