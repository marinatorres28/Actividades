package Unidad5_Tablas;

import java.util.Arrays;

public class Ordenar {
    public static void main(String[] args) {
        //ordenar un array, se modifica el array...
        //se ordena de forma creciente
        //los datos pueden ser primitivos (numericos)
        int [] numeros = {5,8,7,1,3,9,15};
        //la funcion para ordenar es Arrays.short(nombreDelArray)
        Arrays.sort(numeros); //el array se modifica y se ordena
        System.out.println(Arrays.toString(numeros));

        //ordenar tipos no primitivos
        String nombres [] = {"Maria", "Ana", "Xiomara", "Beatriz", "arancha"};
        Arrays.sort(nombres); //arancha aparece el ultimo nombre porque la letra esta en minuscula
        System.out.println(Arrays.toString(nombres));
    }
}
