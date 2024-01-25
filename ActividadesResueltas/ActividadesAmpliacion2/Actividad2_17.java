package ActividadesAmpliacion2;

import java.util.Scanner;

/* Realiza el juego de la suma, que consiste en que aparezcan dos numeros aleatorios
comprendidos entre el 1 y el 99 que el usuario tiene que sumar. La aplicacion debe
indicar si el resultado de la aplicacion es correcto o incorrecto.

Numero aleatorio -> Math.random() * 10 para que sea 9
                                  * 100 para que sea 99
Si se necesita que el 0 no se tenga en cuenta tenemos que poner +1
* */
public class Actividad2_17  {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1= (int) (Math.random()*100+1);
        int num2= (int) (Math.random()*100+1);
        int resultado = num1 + num2;
        System.out.println("Realiza la suma: " + num1 + " + " + num2);
        int resulUser = entrada.nextInt();

        if ( resultado == resulUser ) {
            System.out.println("La respuesta es correcta. ");
        }
        else {
            System.out.println("La respuesta es incorrecta.");
        }

        }



    }



