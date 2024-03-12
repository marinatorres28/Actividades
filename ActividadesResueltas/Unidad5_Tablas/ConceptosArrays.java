package Unidad5_Tablas;

import java.util.Arrays;

public class ConceptosArrays {
    public static void main(String[] args) {
        //comparacion de arrays
        int numero1[]={1,2,3,4,5,6};
        int numero2[]={1,2,3,4,5,6};
        boolean prueba = Arrays.equals(numero1,numero2);
        System.out.println(prueba);
        //arrays bidimensionales
        int[][] nuevo = new int[5][5];
        nuevo [0][0] = 5;
        nuevo [1][0] = 6;
        nuevo [2][0] = 8;
        nuevo [3][0] = 10;
        nuevo [4][0] = 12;
        for (int i = 0; i < 5 ; i++) { //
            for (int j = 0; j < 5; j++) { //utilizamos
                nuevo[i][j] = (int) (Math.random()*100+1);
                System.out.print(nuevo[i][j]+"-");
            }
        }
        System.out.println("");
        System.out.println(Arrays.deepToString(nuevo));


    }
}
