import java.util.Arrays;
import java.util.Scanner;

/**
 * Debes desarrollar una aplicación que ayude a gestionar las notas de un centro educativo. Los alumnos se organizan en grupos compuestos
 * por 5 personas. Leer las notas (números enteros) del primer, segundo y tercer trimestre de un grupo. Debes mostrar al final la nota media
 * del grupo en cada trimestre y la media del alumno que se encuentra en una posición dada (que el usuario introduce por teclado).
 *
 */
public class AP5_15 {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        int[][]notas=altaNotas();
        media(notas);
        mostrarMediaAlumno(notas);
    }
    //primero creamos un metodo para introducir las notas
    public static int[][] altaNotas(){
        //debe ser un array con 3 filas (trimestres) y 5 columnas (alumnos)
        int[][] notas = new int[3][5];
        //recorremos los trimestres para introducir las notas
        for (int trimestre = 0; trimestre < 3; trimestre++){
             mostrar("Indica la nota del trimestre " + (trimestre+1));
             leerNotas(notas,trimestre);
        }
        return notas;
    }
    //metodo para leer las notas
    public static void leerNotas(int[][]notas,int trimestre){
        for (int i = 0; i < notas[trimestre].length; i++) { //recorremos las filas (trimestre) del array para almacenar ahi los datos
            mostrar("Indica la nota (Alumno " + (i+1) + ")");
            notas[trimestre][i]=sc.nextInt();
        }
        mostrar(Arrays.deepToString(notas));
    }
    //metodo para calcular la media por trimestre
    public static void media(int[][]notas){
        double[] media = new double[3];
        for (int alumno = 0; alumno < 5; alumno++) {
            for (int trimestre = 0; trimestre < 3 ; trimestre++) {
                media[trimestre]+=notas[trimestre][alumno]; //media (posicion del trimestre) mas las notas (del trimestre y del alumno)
            }
        }
        mostrar("La media de los alumnos en el primer trimestre -> " + media[0]/5);
        mostrar("La media de los alumnos en el segundo trimestre -> " + media[1]/5);
        mostrar("La media de los alumnos en el tercer trimestre -> " + media[2]/5);
    }
    public static void mostrarMediaAlumno(int[][]notas){
        int[] mediaAlumno=new int[3]; //para guardar las notas del alumno en cada trimestre
        int posicionAlumno=0;
        mostrar("Indica el alumno del que quieres ver la media: ");
        posicionAlumno= sc.nextInt()-1; //ponemos un -1 para que nos muestre el numero exacto del alumno,ya que la tabla empieza en 0
        for (int trimestre = 0; trimestre < 3; trimestre++) {
            mediaAlumno[trimestre]+=notas[trimestre][posicionAlumno]; //almacenamos en media alumno en la posicion del trimestre que toque del for la nots que esta en la fila del trimestre
                                                                      //y en la columna del alumno que le hemos indicado (posicionAlumno)
        }
        mostrar("Las notas del alumno son: " + Arrays.toString(mediaAlumno));
        double media=(mediaAlumno[0]+mediaAlumno[1]+mediaAlumno[2])/3;
        mostrar("La media del alumno: " + media);
    }

    //metodos para mostrar texto
    public static void mostrar (String texto) {
            System.out.println("\t"+texto);
        }
    public static void mostrarSinLn (String texto) {
            System.out.print("\t"+texto);
        }
}
