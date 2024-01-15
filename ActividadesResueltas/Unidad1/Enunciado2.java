package Unidad1;
/*
En una tienda, se quiere calcular el porcentaje de descuento de un producto, por lo que debes solicitar
el precio del producto y el porcentaje a aplicar, y calcular el precio total.
 */
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Enunciado2 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Indique el precio del producto");//solicitamos que ingrese el precio
        Double precio=sn.nextDouble(); //Leemos por consola
        System.out.println("Indique el descuento");//solicitamos que indique el descuento
        Double precioFinal=precio-(precio*(sn.nextDouble()/100));//operacion matematica
        System.out.println(precioFinal);


        //ESTAS LINEAS SON IGUAL QUE LA LINEA 11 DE FORMA MAS DETALLADA
        //Double descuento=sn.nextDouble();
        //Double montoDescuento=precio-descuento/100;
        //Double precioTotal=precio-montoDescuento;
    }
}
