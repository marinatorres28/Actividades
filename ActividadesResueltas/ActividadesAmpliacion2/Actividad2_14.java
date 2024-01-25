package ActividadesAmpliacion2;

import java.util.Scanner;

/*Escribe un programa que solicite al usuario un numero comprendido entre
1 y 99. El programa debe mostrarlo con letras, por ejemplo, para 56
se vera "cincuenta y seis".
* */
public class Actividad2_14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte num;
        String salida=" ";
        System.out.println("Indica un numero entre el 1 y el 99: ");
        num = entrada.nextByte();

        //1. Switch Numeros especiales: once,trece, doce, catorce, quince, dieciseis.....diecinueve
        //2. Calculamos las decenas byte u=num%10 d=num/10 switch con decenas -> 10, 20....hasta 90
        //3. Si las unidades es !=0 creamos una condicion que va a concatenar con "y"
        //4. Switch de unidades del 1 al 9
        //
        //logica -> hacer un switch del 1 al 99 escribiendo todos los resultados...
        /*Desarrollo de la logica*/

        switch (num) {
            case 11-> salida = "Once";
            case 12-> salida = "Doce";
            case 13-> salida = "Trece";
            case 14-> salida = "Catorce";
            case 15-> salida = "Quince";
            case 16-> salida = "Dieciseis";
            case 17-> salida = "Diecisiete";
            case 18-> salida = "Dieciocho";
            case 19-> salida = "Diecinueve";
            case 21-> salida = "Veintiuno";
            case 22-> salida = "Veintidos";
            case 23-> salida = "Veintitres";
            case 24-> salida = "Veinticuatro";
            case 25-> salida = "Veinticinco";
            case 26-> salida = "Veintiseis";
            case 27-> salida = "Veintisiete";
            case 28-> salida = "Veintiocho";
            case 29-> salida = "Veintinueve";
            default->{
                byte u = (byte) (num%10);
                int d= num/10;
                switch (d) {
                    case 1-> salida = "Diez";
                    case 2-> salida = "Veinte";
                    case 3-> salida = "Treinta";
                    case 4-> salida = "Cuarenta";
                    case 5-> salida = "Cincuenta";
                    case 6-> salida = "Sesenta";
                    case 7-> salida = "Setenta";
                    case 8-> salida = "Ochenta";
                    case 9-> salida = "Noventa";
                }
                //luego si la decena es mayor o igual a 3 y la unidad es distinta a 0
                if (d >= 3 && u!=0) {
                    salida += " y ";
                }
                switch (u) {
                    case 1 -> salida += "Uno";
                    case 2 -> salida += "Dos";
                    case 3 -> salida += "Tres";
                    case 4 -> salida += "Cuatro";
                    case 5 -> salida += "Cinco";
                    case 6 -> salida += "Seis";
                    case 7 -> salida += "Siete";
                    case 8 -> salida += "Ocho";
                    case 9 -> salida += "Nueve";
                }
            }
        }
        System.out.println("El numero escrito es: " + salida);












    }
}
