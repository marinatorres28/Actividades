package Unidad4_funciones;

import java.util.Scanner;

/* Calcular el indice de masa corporal.
Para calcular el IMC de una persona necesitamos el peso (kg) y la estatura (m).
formula IMC = PESO / ALTURA^2
Segun el resultado del IMC:
Peso inferior al normal -> Menos de 18.5
Normal -> 18.5 – 24.9
Peso superior al normal -> 25.0 – 29.9
Obesidad -> Más de 30.0

* */
public class IMC_funciones {
    static Scanner sc = new Scanner (System.in);
    static double peso=0, altura =0, resultadoIMC = 0;
    public static void main(String[] args) {
        datos(); //si la funcion "datos" pide datos en la propia funcion,no hace falta que especifiquemos
                 //el tipo de dato que quiere pedir (como por ejemplo en la funcion calculoIMC)
    }
    public static void datos() {
        System.out.println("Indica el peso (kg) ->");
        peso = sc.nextDouble();
        System.out.println("Indica la altura (m) ->");
        altura = sc.nextDouble();
        calculoIMC(peso,altura);
        tablaDatos();
    }
    public static void calculoIMC(double peso,double altura) {
        resultadoIMC = peso / Math.pow(altura,2);
        System.out.println("El IMC es -> " + resultadoIMC);
    }
    public static void tablaDatos() {
        if (resultadoIMC < 18.5 ) {
            System.out.println("Tienes un peso inferior al normal.");
        }
        if (resultadoIMC > 18.5 && resultadoIMC < 24.9 ) {
            System.out.println("Tienes un peso normal.");
        }
        if (resultadoIMC > 25.0 && resultadoIMC < 29.9) {
            System.out.println("Tienes un peso superior al normal.");
        }
        if (resultadoIMC > 30.0) {
            System.out.println("Tienes obesidad.");
        }

    }
}
