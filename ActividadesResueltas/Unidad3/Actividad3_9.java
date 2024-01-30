package Unidad3;

import java.util.Scanner;

/*Implementar una aplicacion que pida al usuario un numero comprendido entre
1 y 10. Hay que mostar la tabla de multiplicar de dicho numero, asegurandose de
que el numero introducido se encuentra en el rango establecido.
* */
public class Actividad3_9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num; //numero del que mostraremos la tabla de multiplicar
        do {
            System.out.println("Indica un numero -> ");
            num = entrada.nextInt();
        }
        while (!(1<= num && num <= 10));
        System.out.println("Tabla del -> " + num);
        for (int i = 1; i <= 10 ; i++){
            System.out.println(num + " x " + i + " = " + num * i);
        }

    }
}
