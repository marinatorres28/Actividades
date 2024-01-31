package Unidad3;

import java.util.Scanner;

public class SalidasAnticipadasContinue {
    public static void main(String[] args) {
        /*Hacer una lista de 14 personas la clase y saltar los que se llamen Manuel.
        * */
        Scanner entrada = new Scanner(System.in);
        String nombresInp=" ";
        String todosNombres=" ";
        for (byte i = 1; i <= 14 ; i++) {
            System.out.println("Indica tu nombre: ");
            nombresInp= entrada.nextLine();
            if (nombresInp.equals("Manuel") || nombresInp.equals("manuel")) {
                continue;
            }
            //solo se ejecutara desde esta linea si no se cumple la condicion anterior
            todosNombres+=nombresInp+"\n";
        }
        System.out.println("***Alumnos***\n" + todosNombres);
    }
}
