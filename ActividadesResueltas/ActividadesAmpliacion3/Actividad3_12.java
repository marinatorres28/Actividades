package ActividadesAmpliacion3;
import java.util.Scanner;
/*Modifica la actividad de ampliacion 3.11 para que el usuario pueda
introducir un numero en binario y el programa muestre su conversion
a decimal.
* */
public class Actividad3_12 {
    public static void main(String[] args) {
        Scanner sn=new Scanner (System.in);
        System.out.println("Indica el numero decimal -> ");
        int binario = sn.nextInt();
        int decimal = 0;
        int base = 1;
        while (binario!=0) {
            int unidadBinaria = binario % 2;
            binario /= 10;
            decimal+= base * unidadBinaria;
            base *=2;
        }
        System.out.println("El numero binario en decimal es: " + decimal);

    }
}
