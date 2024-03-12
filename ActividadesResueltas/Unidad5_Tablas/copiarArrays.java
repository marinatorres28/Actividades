package Unidad5_Tablas;

import java.util.Arrays;

public class copiarArrays {
    public static void main(String[] args) {
        //copiar un array, crear dos arrays con la misma longitud
        int arrayUno [] = new int[5];
        for (int i = 0; i < arrayUno.length ; i++) {
            arrayUno[i] = (int) (Math.random() * 100 + 1);
        }
        mostrar(Arrays.toString(arrayUno));
        //si necesitas copiar un array
        int arrayDos [] = new int[5];
        //***copyOf***
        //copyOf construye y devuelve una copia del origen al destino con la longitud pasada o indicada en el metodo
        arrayDos = Arrays.copyOf(arrayUno,arrayUno.length);
        mostrar(Arrays.toString(arrayDos));
        //***copyOfRange
        //crea y devuelve una tabla donde se copian los elementos indicados en el rango
        //indice desde,donde comienza
        //hasta donde termina sin incluir este elemento
        int arrayTres [] = Arrays.copyOfRange(arrayUno,2,4);
        mostrar(Arrays.toString(arrayTres));
        //copiar con un metodo de la clase System -> insertar o borrar elementos en una tabla
        int arrayCuatro[] = new int[5];
        System.arraycopy(arrayUno,0,arrayCuatro,0,arrayUno.length);
        mostrar(Arrays.toString(arrayCuatro));

    }
    public static void mostrar (String texto) { //funcion para mostrar texto sin necesidad del sout
        System.out.println("\t"+texto);
    }
}
