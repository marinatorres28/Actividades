package Unidad4_funciones;

import java.util.Scanner;

/* Realizar una funcion que calcule y muestre el area o el volumen de un cilindro, segun se especifique.
Para distinguir un caso de otro se le pasara como opcion un numero: 1 (para el area) o 2 (para el volumen).
Ademas, hay que pasarle a la funcion el radio de la base y la altura.
area = 2pi * radio * (altura + radio)
volumen = pi * radio^2 * altura
* */
public class Actividad4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //para realizar los calculos necesarios necesitamos pedir el radio y la altura
        System.out.println("Indica el radio: ");
        double radio = sc.nextDouble();
        System.out.println("Indica la altura: ");
        double altura = sc.nextDouble();
        System.out.println("¿Que vas a calcular? 1. Volumen 2. Area");
        int opcion = sc.nextInt();
        //se llama a la funcion para hacer el calculo del cilindro
        calculoCilindro(radio,altura,opcion); //tenemos que indicar todas las variables en el parentesis
    }
    public static void calculoCilindro(double radio,double altura, int opcion){
        double volumen,area;
        switch (opcion) {
            case 1-> {
                volumen = Math.PI * Math.pow(radio,2) * altura;
                System.out.println("El volumen es: " + volumen);
            }
            case 2-> {
                area = 2*Math.PI * radio * (altura + radio);
                System.out.println("El area es: " + area);
            }
            default -> System.out.println("Opcion erronea.");
        }
    }
}
