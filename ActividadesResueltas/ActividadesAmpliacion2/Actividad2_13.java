package ActividadesAmpliacion2;
/*granja
* */
import java.util.Scanner;

/*
* */
public class Actividad2_13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numerosAnimales;
        double cantidadComida, kiloXanimal, racion;
        System.out.println("Indica el numero de animales en la granja: ");
        numerosAnimales = entrada.nextInt();
        System.out.println("Indica la cantidad de comida disponible: ");
        cantidadComida = entrada.nextDouble();
        System.out.println("Indica cuanta comida come cada animal: ");
        kiloXanimal = entrada.nextDouble();

        //analizamos los datos, si la cantidadComida > numeroAnimales * kiloAnimal, entonces tendria suficiente comida
        if (cantidadComida>=numerosAnimales*kiloXanimal){
            System.out.println("Hay suficiente comida.");
        }
        else {
            System.out.println("Falta comida en la granja, hay que ajustar la racion. ");
        }
        //si esta condicion se cumple,solicita que calcule la racion necesaria
        //y evitemos la division entre 0
        if (numerosAnimales!=0) {
            racion = cantidadComida/numerosAnimales;
            System.out.println("Ajustando a lo que hay, los animales comeran " + racion + " kg" + " y no tendran los kilos iniciales " + kiloXanimal + " kg");
        }

    }
}
