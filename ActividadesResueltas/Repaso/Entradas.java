package Repaso;
/*Pelicula-> -Mayores:6,00€
             -Menores:4,50€
         Miercoles:4,50€

* */
import java.util.Scanner;

public class Entradas {
    public static void main(String[] args) {
        final double ninio=4.5;
        double adultoN=6.00;
        double totalEntradas=0;
        byte opcionPeliculas;
        byte miercoles=0;
        int entAdulto=0, entNinio=0;
        String pelicula1="Ferrari";
        String pelicula2="Priscilia";
        String pelicula3="Guardianes de la noche";
        String pelicula4="Peppa´s Cinema Party";
        String pelicula5="Pobres Criaturas";
        String pelicula6="La Piscina";
        String peliculaSelecc="";
        Scanner sc=new Scanner(System.in);
        /*Bucle Menu*/
        System.out.println("····Bienvenido····");
        System.out.println("¿Es Miercoles? \t1.Si, \t2.No");
        miercoles=sc.nextByte();
        if (miercoles==1){
            adultoN=4.5;
        }
        System.out.println("····Eliga la pelicula deseada····");
        System.out.println("\t1."+pelicula1);
        System.out.println("\t2."+pelicula2);
        System.out.println("\t3."+pelicula3);
        System.out.println("\t4."+pelicula4);
        System.out.println("\t5."+pelicula5);
        System.out.println("\t6."+pelicula6);

        System.out.println("\t7.Facturar");

        do{
            System.out.println("\tQue opcion desea:");
            opcionPeliculas=sc.nextByte();
            switch (opcionPeliculas){
                case 1,2,3,4->{
                    if (opcionPeliculas==1){
                        peliculaSelecc+="\n\t"+pelicula1;
                    }
                    if (opcionPeliculas==2){
                        peliculaSelecc+="\n\t"+pelicula2;
                    }
                    if (opcionPeliculas==3){
                        peliculaSelecc+="\n\t"+pelicula3;
                    }
                    if (opcionPeliculas==4){
                        peliculaSelecc+="\n\t"+pelicula4;
                    }

                    System.out.println("Nº de niños");
                    totalEntradas+=sc.nextDouble()*ninio;
                    System.out.println("Nº de adultos");
                    totalEntradas+= sc.nextDouble()*adultoN;
                }
                case 5,6->{
                    if (opcionPeliculas==5){
                        peliculaSelecc+="\n\t"+pelicula5;
                    }if (opcionPeliculas==6){
                        peliculaSelecc+="\n\t"+pelicula6;
                    }
                    System.out.println("Nª de adultos->");
                    totalEntradas+=sc.nextDouble()*adultoN;
                }
                case 7->{
                    System.out.println("Opcion no valida");
                }
            }

        }while(opcionPeliculas!=7);
        System.out.println("\t Entradas");
        System.out.println("\t"+peliculaSelecc);
        System.out.println("\t Importe a pagar->"+totalEntradas);
        System.out.println("\t Disfrute de la pelicula");

    }
}
