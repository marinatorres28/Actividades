package ActividadesAmpliacion2;

import java.util.Scanner;

/*Escribe una aplicacion que solicite al usuario un numero comprendido
entre 0 y 9999. La aplicacion tendra que indicar si el numero introducido
es capicua.
* */
public class Actividad2_11 {
    public static void main(String[] args) {
        boolean capicua=false;
        Scanner entrada = new Scanner(System.in);
        //numero entero entre 0 y 9999
        int num, u , d , c , um;
        System.out.println("Indica un numero entero entre 0 y 9999: ");
        num = entrada.nextInt();

        //evaluamos matematicamente
        u= num % 10; //obtengo las unidades
        num /= 10; //elimino la unidad de num
        d= num % 10; //
        num /= 10; //
        c = num % 10; //
        num /= 10; //
        um = num; //

        //evaluacion logica
        if (um==u && d==c) {
            capicua=true;
        }
        else if (um==0 && c==u){
            capicua=true;
        }
        else if (um==0 && c==0 && d==u) {
            capicua=true;
        }
        else if (um==0 && c==0 && d==0){
            capicua=true;
        }
       if (capicua) { //se obvia que if (capicua==true)
           System.out.println("El numero escrito es capicua.");
       }
       else {
           System.out.println("El numero no es capicua. ");
       }
    }
}
