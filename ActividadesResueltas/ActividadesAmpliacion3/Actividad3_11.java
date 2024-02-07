package ActividadesAmpliacion3;

import java.util.Scanner;

/*Realiza un programa que convierta un numero decimal en su reoresentacion
binaria. Hay que tener en cuenta que desconocemos cuantas cifras tiene el
numero que introduce el usuario. Por simplicidad, iremos mostrandoel numero
binario con un digito por linea.
* */
public class Actividad3_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Indica el numero entero: ");
        int numero = sc.nextInt();

        while (numero!=0) {
            int unidadBinaria = numero % 2;
            numero /= 2;
            System.out.println(unidadBinaria);
        }

    }
}
