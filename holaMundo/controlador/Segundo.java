package controlador;
import java.lang.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Segundo {
    public static void main(String[] args) {
        String nombre="Marina Torres";
        System.out.println("Mi nombre es: "+ nombre.toUpperCase());
        LocalDate hoy=LocalDate.now();
        System.out.println(hoy);
        int a=5;
        int b=6;
        int c=a+b; //c=11
        System.out.println("El valor de c es "+ c);
        c=c-a; //c=6 la variable del valor puede cambiar mientras se ejecuta el programa
        System.out.println("Ahora c vale "+ c);
        /* CONSTANTES-> el valor una vez declarado no cambia mientras se ejecuta el programa*/
        final int mayordeedad=18;
        LocalTime hora= LocalTime.now();
        System.out.println("La hora es "+ hora);
        Double calculo=Math.pow(5,3);
        System.out.println(calculo);
        //para calcular la raiz de un numero es Math.sqrt(numero)
        Double raizCuadrada=Math.sqrt(16); //raiz cuadrada=4
        System.out.println("La raiz cuadrada de 16 es "+ raizCuadrada);
        System.out.println(); //salto de linea
        /*Entrada de datos por consola con la clase Scanner*/
//        Scanner entrada=new Scanner(System.in); // tipo System.in indica que captura los datos del teclado
//        System.out.print("Indica tu nombre");
//        String nombreUsuario=entrada.nextLine();
//        //esta linea indica que lo que escriba el usuario se guardara en la variable nombre usuario
//        System.out.println("El usuario se llama"+ nombreUsuario);
//        System.out.println("Indica tu edad");
//        short edad=entrada.nextShort();
//        System.out.println("Tu edad es " + edad);
//        short nuevaEdad= (short) (edad+1);
//        System.out.println("El año que viene tendras "+nuevaEdad+ " años.");
//        System.out.println("Indica el año de nacimiento");
//        short anioNac=entrada.nextShort();
//        short edadCalculada=(short) (2024-anioNac);
        System.out.println("Indica el precio del articulo ->");


    }
}
