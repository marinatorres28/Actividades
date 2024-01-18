package ActividadesAmpliacion;

import java.util.Scanner;

/*Un biologo esta realizando un estudio de distintas especias de
invertebrados y necesita una aplicacion que le ayude a contabilizar
el numero de patas que tienen en total todos los animales capturados
durante la jornada de trabajo. Para ello,te ha solicitado que escribas
una aplicacion a la que hay que proporcionar:
-El numero de hormigas capturadas (6 patas)
-El numero de arañas capturadas (8 patas)
-El numero de cochinillas capturadas (14 patas)
La aplicacion debe mostrar el numero total de patas.
* */
public class Actividad1_18 {
    public static void main(String[] args) {
        int hormigas, arañas, cochinillas , totalPatas;
        Scanner sn=new Scanner(System.in);
        System.out.println("Indica las hormigas capturadas: ");
        hormigas = sn.nextInt();
        System.out.println("Indica las arañas capturadas: ");
        arañas = sn.nextInt();
        System.out.println("Indica las cochinillas capturadas: ");
        cochinillas = sn.nextInt();
        totalPatas= (hormigas*6) + (arañas*8) + (cochinillas*14);
        System.out.println("El numero total de patas es: " + totalPatas);


    }
}
