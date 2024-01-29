package Unidad3;

import java.util.Scanner;

/*Un centro de investigacion de la flora urbana necesita una aplicacion que muestre
cual es el arbol mas alto. Para ello se introducira por teclado la altura (en centimetros)
de cada arbol (terminando la introduccion de datos cuando se utilice -1 como altura).
Los arboles se identifican mediante etiquetas con numeros unicos correlativos,
comenzando en 0. Diseñar una aplicacion que resuelva el problema planteado.
* */
public class Actividad3_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int etiquetaArbolMasAlto;
        int alturaArbolMasAlto;
        int etiqueta = 0;
        int altura;
        System.out.println("Altura del arbol (" + etiqueta + "): ");
        altura = entrada.nextInt();
        alturaArbolMasAlto = altura;
        etiquetaArbolMasAlto = 0;

        while (altura != -1) {
            if (altura > alturaArbolMasAlto) {
                alturaArbolMasAlto = altura;
                etiquetaArbolMasAlto = etiqueta;
            }
            etiqueta++;
            System.out.println("Altura del arbol (" + etiqueta + "): ");
            altura = entrada.nextInt();
        }
        if (alturaArbolMasAlto == -1){
            System.out.println("No hay ningun arbol. ");
        }
        else {
            System.out.println("El arbol mas alto mide: " + alturaArbolMasAlto);
            System.out.println("Etiqueta del arbol: " + etiquetaArbolMasAlto);
        }


    }
}
