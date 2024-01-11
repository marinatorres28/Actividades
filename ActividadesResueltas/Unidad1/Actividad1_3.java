package Unidad1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Actividad1_3 {
    //salida en consola System.out.println y la forma automacida es sout y tabulador
    //para hacer un programa debemos utilizar una funcion que sea la principal
    //y la forma automatica es psvm y tabulador

    public static void main(String[] args) { //<-funcion principal
        //solicitar la edad y decir cuanto tendra el proximo año
        //para crear salidas
        System.out.println();
        //para solicitar entradas Scanner sn=new Scanner(System.in)
        Scanner sn=new Scanner(System.in); //sn es el nombre de un objeto scanner
        System.out.println("Indica tu edad->");
        byte edad=sn.nextByte();
        ++edad; //incrementamos la edad que ha introducido el usuario en 1
        System.out.println("El proximo año tendras " + edad + " años");
        //para ejecutar nuestra pequeña aplicacion pulsamos mayusculas y f10
    }
}
