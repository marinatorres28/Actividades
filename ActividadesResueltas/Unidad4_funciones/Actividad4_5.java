package Unidad4_funciones;

import java.util.Scanner;

/*Crear una funcion que,mediante un booleano,indique si el caracter que se pasa como parametro de entrada corresponde
con una vocal.
* */
public class Actividad4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Indica una letra: ");
        String letra = sc.nextLine();
        boolean resultado= esVocal(letra);
        System.out.println(resultado);
    }
    public static boolean esVocal(String letra){
        boolean resultado;
        if (letra.equals("a")|| letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u") || letra.equals("A") || letra.equals("E") ||
                letra.equals("I") || letra.equals("O") || letra.equals("U")){
            resultado=true;
        } else {
            resultado=false;
        }
        return resultado;
    }
}
