package ActividadesAmpliacion;
/*Crea un programa que pida la base y la altura de un triangulo y muestre su area.
* */
import java.util.Scanner;

public class Actividad1_14 {
    public static void main(String[] args) {
        double base,altura,area;
        Scanner sn=new Scanner(System.in);
        System.out.println("Indica la base del triangulo: ");
        base = sn.nextDouble();
        System.out.println("Indica la altura del triangulo: ");
        altura = sn.nextDouble();
        area = (base * altura) / 2;
        System.out.println("El area del triangulo es: " + area);
    }
}
