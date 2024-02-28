package Repaso;

import java.util.Scanner;

/*Crear un programa que permita a traves de un menu (tortilla, croquetas, jamon y queso, bebidas) indicar lo que
el cliente solicita, y mostrar el total de su pedido, tomando en cuenta los precios.
Tortilla -> 2€
Croquetas -> 8€
Jamon y queso -> 15€
Bebidas -> 3€
* */
public class Comandas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cuenta=0; //donde acumulamos el total del pedido
        String detallePedido=""; //donde mostramos los detalles del pedido (bebida,tortilla...)
        byte opcion=0;
        int cantidad=0;
        int total=0;
        int ivaCalculado;

        //crear un bucle con el menu

        do {
            System.out.println("····Menú Coffe House····");
            System.out.println("\t1.Tortillas");
            System.out.println("\t2.Croquetas");
            System.out.println("\t3.Jamon y queso");
            System.out.println("\t4.Bebida");
            System.out.println("\t5.Salir");
            System.out.println("\n\tIndique su opcion: ");
            opcion= sc.nextByte();

            switch (opcion) {
                case 1-> {
                    System.out.println("Indica la cantidad: ");
                    cantidad = sc.nextInt();
                    total+=cantidad*2;
                    cuenta+=2;
                    detallePedido+="Tortilla: " + cantidad + "\n";
                }
                case 2-> {
                    System.out.println("Indica la cantidad: ");
                    cantidad = sc.nextInt();
                    total+=cantidad*8;
                    cuenta+=8;
                    detallePedido+="Croquetas: " + cantidad + "\n";
                }
                case 3-> {
                    System.out.println("Indica la cantidad: ");
                    cantidad = sc.nextInt();
                    total+=cantidad*15;
                    cuenta+=15;
                    detallePedido+="Jamon y queso: " + cantidad + "\n";

                }
                case 4 -> {
                    System.out.println("Indica la cantidad: ");
                    cantidad = sc.nextInt();
                    total+=cantidad*3;
                    cuenta+=3;
                    detallePedido+="Bebida: " + cantidad + "\n";

                }
                case 5 -> System.out.println("····Generando su cuenta····");
                default -> {
                    System.err.println("Opcion no valida");
                }
            }

        }while (opcion!=5);
        double iva = cuenta * 1.21;
        System.out.println("\n\n····Factura simplificada····");
        System.out.println("\tPedido: \n" + detallePedido);
        System.out.println("\tTotal sin IVA: " + cuenta + "€");
        System.out.println("\tIVA: " + iva);
        System.out.printf("%15.3f",iva);
        System.out.println("\tImporte a pagar IVA incluido: "+ (iva+cuenta) + "€");
        System.out.println("································");

    }
}
