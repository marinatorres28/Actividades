package ActividadesAmpliacion;

import java.util.Scanner;

/*Un economista te ha encargado un programa para realizar calculos con el IVA. La
aplicacion debe solicitar la base imponible y el IVA que se debe aplicar. Muestra
en pantalla el importe correspondiente al IVA y al total.
* */
//1. Primero definimos las variables que necesitamos: base imponible,valor del iva, valor total e iva.
//2. Definimos el scanner.
//3. Pedimos el precio del articulo, que equivale a la base imponible.
//4. Pedimos el porcentaje de IVA que va a aplicarse.
//5. Calculamos el valor del iva: precio * (iva / 100).
//6. Calculamos el valor total: base imponible + valor del iva.
public class Actividad1_11 {
    public static void main(String[] args) {
        double baseImponible,valorIva,valorTotal;
        byte iva;
        Scanner sn=new Scanner (System.in);
        System.out.println("Indica el precio del articulo: ");
        baseImponible = sn.nextDouble();
        System.out.println("Indica el porcentaje de IVA: ");
        iva = sn.nextByte();
        valorIva = baseImponible * ((double) iva / 100);
        System.out.println(valorIva);
        valorTotal = baseImponible + valorIva;
        System.out.println("El producto con precio de " + baseImponible + " tiene un iva de " + valorIva);
        System.out.println("El producto cuesta en total: " + valorTotal);



    }
}
