package Unidad2;

import java.util.Scanner;

/*Crea una aplicacion que solicite al usuario una fecha (dia mes y año) y
muestra la fecha correspondiente al dia siguiente.
* */
public class Actividad2_14 {
    public static void main(String[] args) {
        int dia, mes, anio, diaDelMes=0;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Indica el dia: ");
        dia = entrada.nextInt();
        System.out.println("Indica el mes: ");
        mes = entrada.nextInt();
        System.out.println("Indica el año: ");
        anio = entrada.nextInt();
        diaDelMes = switch (mes) {
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
        dia++; //incrementamos el dia
        if (dia > diaDelMes) { //si el dia es mayor al numero de dias del mes, lo ponemos en 1
            dia = 1;
        }
        mes++; //incrementamos el mes
        if (mes < 12) {
            mes = 1;
            anio++;
        }
        if (anio == 0 ) {
            anio = 1;
        }
        System.out.println(dia + "/" + mes + "/" + anio);








    }
}
