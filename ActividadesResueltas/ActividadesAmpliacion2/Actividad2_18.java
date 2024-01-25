package ActividadesAmpliacion2;

import java.util.Scanner;

/*Modifica la actividad 2.17 para que, ademas de los dos numeros aleatorios,
tambien aparezca la opcion que debe realizar el jugador: suma,resta o multiplicacion.
* */
public class Actividad2_18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1= (int) (Math.random()*100+1);
        int num2= (int) (Math.random()*100+1);
        //suma - resta y multiplicacion, por lo que las operaciones son 3
        int operacion = (int) (Math.random()*3+1);
        int resultado = 0;
        String simbolo=" ";
        switch (operacion) {
            case 1 -> {
                simbolo = "+";
                resultado = num1 + num2; //suma
            }
            case 2 -> {
                simbolo = "-";
                resultado = num1 - num2; //resta
            }
            case 3 -> {
                simbolo = "x";
                resultado = num1 * num2; //multiplicacion
            }
        }
        System.out.println("¿Cuanto es " + num1 + " " + simbolo + " " + num2 + "?");
        int resultUser = entrada.nextInt();
        if (resultUser == resultado) {
            System.out.println("Operacion correcta.");
        }
        else {
            System.out.println("Operacion incorrecta.");
        }

    }
}
