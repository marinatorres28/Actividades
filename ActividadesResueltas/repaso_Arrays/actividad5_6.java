import java.util.Arrays;
import java.util.Scanner;

/**
 * Definir una funcion que tome como parametros dos tablas,la primera con los 6 numeros de una apuesta de la primitiva,  y la segunda (ordenada) con los 6
 * numeros de la combinacion ganadora. La funcion devolvera el numero de aciertos.
 */
public class actividad5_6 {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        //llamamos al metodo combinacion ganadora
        int combinacionGanadora[]=combinacionGanadora();
        int apuesta[]=apuesta();
        int aciertos=comprobar(combinacionGanadora,apuesta);
        if (aciertos==6){
            mostrar("Tu apuesta es: " + Arrays.toString(apuesta));
            mostrar("Has ganado el juego.");
        }
        else {
            mostrar("El numero ganador es: " + Arrays.toString(combinacionGanadora));
            mostrar("Numero de aciertos: " + aciertos);
        }
    }
    //metodo para ver la combinacion ganadora
    public static int [] combinacionGanadora(){
        int combinacionGanadora[]=new int[6];
        //creamos una variable para que no se repitan los numeros aleatorios
        int numeroAleatorio=0;
        for (int i = 0; i < combinacionGanadora.length; i++) {
            numeroAleatorio=(int) (Math.random()*49+1); //creamos el math random en el numero aleatorio

            int indice=0; //creamos este indice para comprobar que no se repita un numero generado aleatoriamente
            while (indice< combinacionGanadora.length && combinacionGanadora[indice]!=numeroAleatorio){ //mientras el indice sea menor a la longitud de la tabla y ese indice sea distinto al
                                                                                                        //numero aleatorio
                indice++; //incrementamos el indice
            }
            if (indice>= combinacionGanadora.length){ //si el indice es mayor o igual a la longitud de la tabla (ha comprobado todos los valores de la tabla)
                combinacionGanadora[i]=numeroAleatorio; //los almacena dentro de la tabla en la posicion i del for
            }else {
                i--;
            }
        }
        Arrays.sort(combinacionGanadora); //para ordenar el array
        return combinacionGanadora; //devolvemos el array de la combinacion ganadora
    }
    public static int[] apuesta(){
        //creamos el array que contendra el numero de la apuesta
        int apuesta[]=new int[6];
        for (int i = 0; i < apuesta.length; i++) {
            mostrarSinLn("Indica tu apuesta " + (i+1) + " ->");
            apuesta[i]= sc.nextInt();
        }
        Arrays.sort(apuesta);
        return apuesta;
    }
    //
    public static int comprobar(int combinacionGanadora[],int apuesta[]){
        int aciertos=0;
        for (int elemento:apuesta){ //para comprobar cada elemento del array
            if (Arrays.binarySearch(combinacionGanadora,elemento)>=0){ //buscamos con binarysearch
                aciertos++;
            }
        }
        return aciertos;
    }
    //metodo para mostrar texto
    public static void mostrar (String texto) {
            System.out.println("\t"+texto);
        }
    public static void mostrarSinLn (String texto) {
            System.out.print("\t"+texto);
        }
}
