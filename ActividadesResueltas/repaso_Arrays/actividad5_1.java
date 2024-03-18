import java.util.Arrays;

public class actividad5_1 {
    /*
    Crear una tabla de longitud 10 que se inicializara con numeros aleatorios comprendidos entre 1 y 100.
    Mostrar la suma de todos los numeros aleatorios que se guarden en la tabla.
     */
    public static void main(String[] args) {
        int[] valores=new int [10];
        //recorremos la tabla para inicializar con valores aleatorios con un bucle for
        for (int i = 0; i < valores.length; i++) {
            valores[i]= (int) (Math.random()*100+1);
        }
        //ahora recorremos la tabla para calcular la suma de sus elementos
        int suma=0;
        for (int valor: valores){
            suma=suma+valor; //suma+=valor
        }
        System.out.println(Arrays.toString(valores)); //para mostrar el array
        System.out.println("La suma de todos los numeros es -> " + suma);




    }
}
