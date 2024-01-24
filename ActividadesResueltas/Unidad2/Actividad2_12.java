package Unidad2;

import java.sql.SQLOutput;
import java.util.Scanner;

/*Pedir el dia,mes y año de una fecha e indicar si la fecha es correcta.
Hay que tener en cuenta que existen meses con 28,30 y 31 dias.
* */
public class Actividad2_12 {
    public static void main(String[] args) {
        int dia, mes, anio;
        boolean fechaCorrecta;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Indica el día: ");
        dia = entrada.nextInt();
        System.out.println("Indica el mes: ");
        mes = entrada.nextInt();
        System.out.println("Indica el año: ");
        anio = entrada.nextInt();
        if (dia == 0 ) {
            fechaCorrecta = false;
        }
        else if (mes == 2 && (1<= dia && dia <= 28)) {
                fechaCorrecta = true;}

        else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (1<= dia && dia <= 30)){
                fechaCorrecta = true;
            }
        else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (1<= dia && dia <= 30)){
            fechaCorrecta = true;
        }
        if (fechaCorrecta = true) {
            System.out.println("Fecha correcta. Dia: " + dia + " mes: " + mes + " año: " + anio);
        }
        else {
            System.out.println("Fecha incorrecta.");
        }

        }



    }








