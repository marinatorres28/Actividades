package ActividadesAmpliacion;

import java.util.Scanner;

/*La FILA realiza una competicion donde cada participante escribe
un algoritmo en un papel y lo lanza, ganando quien consiga lanzarlo
mas lejos. La peculiaridad del concurso es que la longitud del
lanzamiento se mide en metros (con tantos decimales como se desee)
pero para el ranking solo se tiene en cuenta la longitud en
centimetros (sin decimales). Por ejemplo, para un lanzamiento de 12,3456 m
(que son 1234,56 cm) solo se contabilizaran 1234 cm.
Realiza un programa que solicite la longitud (en metros) de un lanzamiento
y muestra la parte entera correspondiente en centimetros.
* */
public class Actividad1_22 {
    public static void main(String[] args) {
        double longitud;
        int resultado;
        Scanner sn=new Scanner(System.in);
        System.out.println("Indica la longitud en metros: ");
        longitud = sn.nextDouble()*100;
        resultado=(int)longitud;
        System.out.println("La longitud en centimetros y sin decimales es: " + resultado );

    }
}
