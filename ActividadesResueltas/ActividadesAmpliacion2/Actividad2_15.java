package ActividadesAmpliacion2;

import java.util.Scanner;

/*Escribe una aplicacion que solicite por consola dos numeros reales
que corresponden a la base y la altura de un triangulo. Debera mostrarse su area, comprobando
los numeros introducidos por el usuario no son negativos, algo que no tendria sentido.
* */
public class Actividad2_15 {
    public static void main(String[] args) {
        double base, altura, area;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Indica la base: ");
        base = entrada.nextDouble();
        System.out.println("Indica la altura: ");
        altura = entrada.nextDouble();

        area = base * altura / 2;

        if (base > 0 || altura > 0 ) {
            System.out.println("No se puede calcular el area. ");
        }

        System.out.println("El area del triangulo es: " + area);

        }












    }

