package ActividadesAmpliacion2;

import java.util.Scanner;

/*Utiliza el operador ternario para calcular el valor absoluto de un numero
que se solicita al usuario por teclado.
* */
public class Actividad2_16 {
    public static void main(String[] args) {
        int num, valorAbsoluto;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Indica un numero: ");
        num = entrada.nextInt();
        valorAbsoluto = num <0 ? num * -1 : num;
        System.out.println("El valor absoluto del numero " + num + " es " + valorAbsoluto);

    }

}





