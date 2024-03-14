package Unidad5_ActividadesAmpliacion;

import java.util.Arrays;
import java.util.Scanner;

/* Debes desarrollar una aplicación que ayude a gestionar las notas de un centro educativo. Los alumnos se
organizan en grupos compuestos por 5 personas. Leer las notas (números enteros) del primer, segundo y tercer
trimestre de un grupo. Debes mostrar al final la nota media del grupo en cada trimestre y la media del alumno
que se encuentra en una posición dada (que el usuario introduce por teclado).
* */
public class Actividad5_15 {
    static Scanner sc = new Scanner(System.in);
    static int notas[][]=new int[3][5];
    public static void main(String[] args) {
        altaNotas();
    }
    //metodo para insertar notas
    public static int [][] altaNotas(){
        //solicitamos los trimestres
        for (int trimestre=0;trimestre<3;trimestre++){
            mostrar("Notas del trimestre " + (trimestre+1)+" -> ");
            leerNotas(notas,trimestre);
        }
        //despues de leer notas,nos piden la media por trimestre
        double media[]=new double[3];
        for (int alum = 0; alum < 5; alum++) {
            for (int trim = 0; trim < 3; trim++){
                media[trim]+=notas[trim][alum];
            }
        }
        mostrar("La media del primer trimestre -> " + media[0]/5);
        mostrar("La media del segundo trimestre -> " + media[1]/5);
        mostrar("La media del tercer trimestre -> " + media[2]/5);
        mediaAlumno();
        return notas;
    }
    //metodo para leer las notas
    public static void leerNotas (int notas[][],int trimestre){
        for (int i = 0; i < notas[trimestre].length; i++) {
            mostrarSinLn("Alumno ("+(i+1)+") -> "); //hay que poner indice +1 porque si no imprime el alumno 0
            notas[trimestre][i]= sc.nextInt();
        }
    }
    //media de un alumno que se encuentra en una posicion dada
    public static void mediaAlumno (){
        mostrarSinLn("Indica de que alumno quieres saber la media -> ");
        int pos=sc.nextInt();
        double mediaAlumno= (notas[0][pos-1]+notas[1][pos-1]+notas[2][pos-1])/3.0;
        mostrarSinLn("La media del alumno " + pos + " es -> ");
        System.out.printf("%.2f",mediaAlumno);
    }
   //metodos para mostrar
    public static void mostrar (String texto) {
            System.out.println("\t"+texto);
        }
    public static void mostrarSinLn (String texto) {
            System.out.print("\t"+texto);
        }
}
