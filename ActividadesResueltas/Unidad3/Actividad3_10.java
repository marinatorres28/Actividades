package Unidad3;
/*Diseña un programa que muestre la suma de los 10 primeros numeros impares.
* */
public class Actividad3_10 {
    public static void main(String[] args) {
        double suma=0; //guardara la suma de los 10 primeros impares
        for (int i = 1; i <= 10; i++) {
            int impar = 2 * i - 1;
            suma = suma + impar; //tambien se puede expresar como suma+= impar
        }
        System.out.println("La suma de los 10 primeros impares es " + suma);
    }
}
