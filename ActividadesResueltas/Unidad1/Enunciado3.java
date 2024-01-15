package Unidad1;
/*
Teniendo como base que el 100% de un colegio esta formado por todos los alumnos, solicita cuantas niñas
y cuantos niños hay, e indica el porcentaje de cada uno. Por ejemplo:
Existe 84 niñas y 78 niños, eñ 100% de los niños del colegio son 162 niños.
51,85% son niñas
48,148 son niños
Recordemos la regla de tres:    162 total - 100%  -> 84 * 100 / 162
                                84 niñas  - x
 */

import java.util.Scanner;

public class Enunciado3 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in); //declaramos el scanner
        System.out.println("Indica cuentas niñas hay matriculadas "); // pedimos el dato
        short ninas=sn.nextShort(); //indicamos el numero de niñas
        System.out.println("Indica cuantos niños hay matriculados "); //pedimos el dato
        short ninos=sn.nextShort(); //indicamos el numero de niños
        double totalMatriculado=ninas+ninos;
        double porcentajeNinas=(double) (ninas*100 / totalMatriculado); //regla de 3
        double porcentajeNinos=(double) (ninos*100 / totalMatriculado);
        System.out.println("El porcentaje de niñas matriculadas es " + porcentajeNinas);
        System.out.println("El porcentaje de niños matriculados es " + porcentajeNinos);
    }

}
