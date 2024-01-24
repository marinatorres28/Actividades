package ActividadesAmpliacion2;

import java.util.Scanner;

/*El DNI consta de un entero de 8 digitos seguido de una letra que se
obtiene apartir del numero de la siguiente forma:
letra = numero DNI modulo 22
Basandote en esta informacion,elige la letra a partir de la numeracion
de la siguiente tabla *libro*.
Diseña una aplicacion en la que dado un numero de dni, calcule la letra
que le corresponde. Observa que un numero de 8 digitos esta dentro del
rango de tipo int.
* */
public class Actividad2_12 {
    public static void main(String[] args) {
        int numeroDNI,calculo;
        String letra=" "; //como es una sola letra podemos usar la variable char
        Scanner entrada = new Scanner(System.in);
        System.out.println("Indica tu numero de DNI sin la letra: ");
        numeroDNI = entrada.nextInt();
        calculo= numeroDNI % 23; //0 al 22
        switch (calculo) {
            case 0 -> letra="T";
            case 1 -> letra="R";
            case 2 -> letra="W";
            case 3 -> letra="A";
            case 4 -> letra="G";
            case 5 -> letra="M";
            case 6 -> letra="Y";
            case 7 -> letra="F";
            case 8 -> letra="P";
            case 9 -> letra="D";
            case 10 -> letra="X";
            case 11 -> letra="B";
            case 12 -> letra="N";
            case 13 -> letra="J";
            case 14 -> letra="Z";
            case 15 -> letra="S";
            case 16 -> letra="Q";
            case 17 -> letra="V";
            case 18 -> letra="H";
            case 19 -> letra="L";
            case 20 -> letra="C";
            case 21 -> letra="K";
            case 22 -> letra="E";
        }
        System.out.println("La letra del DNI " + numeroDNI + " es " + letra);
    }
}
