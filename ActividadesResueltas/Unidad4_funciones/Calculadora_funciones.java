package Unidad4_funciones;
/*Calculadora
* */
import java.util.Scanner;

public class Calculadora_funciones {
    static Scanner sc = new Scanner(System.in); //static scanner sirve para llamar al escaner en todos los bloques
    static double resultado;

    public static void main(String[] args) {
        menu();
    }
    static void menu() {
        System.out.println(" _________________________");
        System.out.println("|   Calculadora en Java   |");
        System.out.println("|                         |");
        System.out.println("|   1. Sumar              |");
        System.out.println("|   2. Restar             |");
        System.out.println("|   3. Multiplicar        |");
        System.out.println("|   4. Dividir            |");
        System.out.println("|   5. Raiz cuadrada      |");
        System.out.println("|   6. Exponencial        |");
        System.out.println("|   7. Salir              |");
        System.out.println("|                         |");
        System.out.println("|_________________________|");
        System.out.println("Indica tu opcion---------->");
        int opcion = sc.nextInt();
        operaciones(opcion); //llamamos a la funcion operaciones, para poder realizar los calculos

    }
    static void operaciones(int opcion) {
        int num1 = 0,num2 = 0,base = 0,exponente = 0;
        if (opcion >= 1 && opcion <= 4) { //si opcion es mayor o igual a 1, y opcion es menor o igual a 4
            System.out.println("Ingrese el valor del numero 1 ->");
            num1 = sc.nextInt();
            System.out.println("Ingrese el valor del numero 2 ->");
            num2 =  sc.nextInt();
        }
        switch (opcion) {
            case 1-> resultado=num1+num2;
            case 2-> resultado=num1-num2;
            case 3-> resultado=num1*num2;
            case 4-> resultado=num1/num2;
            case 5-> {
                System.out.println("Ingrese el numero a calcular la raiz cuadrada ->");
                base = sc.nextInt(); //para calcular la raiz cuadrada de un numero necesitamos su base
                resultado = Math.sqrt(base); //hacemos el calculo con Math.sqrt
            }
            case 6-> {
                System.out.println("Ingrese la base->");
                base = sc.nextInt();
                System.out.println("Ingrese el exponente->");
                exponente = sc.nextInt();
                resultado = Math.pow(base,exponente);
            }
            default -> {
                System.err.println("Opcion no valida.");
                menu(); //al ingresar una opcion no valida se vuelve a llamar al menu
            }
        }
        System.out.println("El resultado es -> " + resultado);
        menu(); //volvemos a llamar al menu
    }
}
