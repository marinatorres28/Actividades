package ActividadesAmpliacion;

import java.util.Scanner;

/*Diseña una aplicacion que solicite al usuario que introduzca una
cantidad de segundos. La aplicacion debe mostrar cuantas horas
minutos y segundos hay en el numero de segundos introducidos por
el usuario.
* */
public class Actividad1_16 {
    public static void main(String[] args) {
        int horas , minutos , segundos;
        Scanner sn=new Scanner(System.in);
        System.out.println("Introduce una cantidad de segundos: ");
        segundos = sn.nextInt();
        minutos= segundos/60;
        segundos%=60; //se utiliza el modulo para obtener el resto entre los segundos minutos y las horas
        horas=minutos/60;
        minutos%=60;
        System.out.println(horas+ ":" + minutos + ":" + segundos);




    }

}
