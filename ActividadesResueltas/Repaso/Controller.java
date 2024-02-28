package Repaso;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        //tipos de datos (variables) -> Las declaraciones de las variables tienen que ser llamadas por su tipo de dat. EJ: int total
        int habitantes, total=0; //se puede inicializar en el momento de la declaracion o luego dentro de la ejecucion del programa
        String poblacion;
        String nombreUsuario;
        //Luego tenemos las declaraciones de la clase Scanner, que nos permite solicitar y leer la informacion que solicitamos, siempre relacionado con el tipo de dato que se va a introducir.
        Scanner sc = new Scanner(System.in);
        //EJ: Solicita el nombre, la poblacion, y el numero de habitantes, y acumulalo hasta que se lean las 5 capitales de provincia de CLM.
        //Sumar el total de habitantes de las 5 capitales.

        //bucles
        //utilizamos un bucle desde 1 hasta 5 y lee los datos.

        for (int i=1;i<=5;i++) {
            System.out.println("Indica tu nombre: ");
            nombreUsuario = sc.nextLine();
            System.out.println("Indica la provincia: ");
            poblacion = sc.nextLine();
            System.out.println("Indica el numero de habitantes: ");
            habitantes = sc.nextInt();sc.nextLine();
            //condicional-> si el numero de habitantes es menor que 20 000, indicar que hay un error y restar 1 a i para que vuelva a solicitar datos.
            if (habitantes < 20000){
                i--;
                System.out.println("Los habitantes de " + poblacion + " son mas de " + habitantes + ". Vuelve a insertar la informacion.");
            }
            else {
                total += habitantes;
            }
        }
        System.out.println("El numero de habitantes de las 5 provincias de CLM es: " + total);
    }
}
