package Unidad1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Enunciado2 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Indique el precio del producto");//solicitamos que ingrese el precio
        Double precio=sn.nextDouble(); //Leemos por consola
        System.out.println("Indique el descuento");//solicitamos que indique el descuento
        Double precioFinal=precio-(precio*(sn.nextDouble()/100));
        System.out.println(precioFinal);

    }
}
