package Unidad5_ActividadesAmpliacion;

import java.util.Scanner;

/* En un juego de rol el mapa puede implementarse como una matriz donde las filas y las columnas representan
lugares (lugar 0, lugar 1, lugar 2, etc.) que estarán conectados. Si desde el lugar X podemos ir hacia el lugar Y,
entonces la matriz en la posición [x][y] valdrá cierto; en caso contrario, valdrá falso. Escribe una función que,
dada una matriz que representa el mapa y dos lugares, indique si es posible viajar desde el primer lugar al segundo
(directamente o pasando por lugares intermedios).

* */
public class Actividad5_16 {
    static int puntos = 0;
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        int next=0;
        do {
            mostrarSinLn("¿Juegas? 1. Si | 2. No ");
            next = sc.nextInt();
            if (next==1)
                partida();
        }
        while (next!=2);
    }
    //mapa debe ser booleano
        public static void partida() {
            boolean mapa[][] = {
                    {true, false, true, false, true},
                    {false, true, false, true, false},
                    {true, false, true, false, true},
                    {false, true, false, true, false},
                    {true, false, true, false, true}
            };
            //bucle para mostrar el mapa
            for (int i = 0; i < mapa.length; i++) {
                for (int j = 0; j < mapa[i].length; j++) {
                    mostrarSinLn("y=" + i + " | x=" + j);
                }
                mostrar("");
                mostrar("");
            }

            int x = 0;
            int y = 0;
            //solicitamos el valor de x y de y para buscar su valor
            do {
                mostrarSinLn("Indique la posicion y de la tabla [0 - 4]: ");
                y = sc.nextInt();
                mostrarSinLn("Indique la posicion x de la tabla [0 - 4]: ");
                x = sc.nextInt();
            } while (y > 4 || y < 0 || x > 4 || x < 0);
            //creamos un contador,donde mostremos las posiciones que tiene que recorrer en el Array
            //para llegar al destino
            int contador = 0;
            for (int i = 0; i < mapa.length; i++) {
                for (int j = 0; j < mapa[i].length; j++) {
                    contador++;
                    if (i == y && j == x) {
                        mostrar("El resultado es " + mapa[i][j]);
                        mostrar("Ha recorrido " + contador + " casillas...");

                        if (mapa[i][j]) {
                            puntos++;
                        }
                        mostrar("Puntos -> " + puntos);

                    }
                }
            }
        }

    //metodos para mostrar
    public static void mostrar (String texto) {
            System.out.println("\t"+texto);
        }
    public static void mostrarSinLn (String texto) {
            System.out.print("\t"+texto);
        }
}
