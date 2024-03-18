import java.util.Arrays;
import java.util.Scanner;

/**
 * El ayuntamiento de tu localidad te ha encargado una aplicación que ayude a realizar encuestas estadísticas para conocer el nivel adquisitivo
 * de los habitantes del municipio. Para ello, tendrás que preguntar el sueldo a cada persona encuestada. A priori, no conoces el número de encuestados.
 * Para finalizar la entrada de datos, introduce un sueldo con valor −1. Una vez terminada la entrada de datos, muestra la siguiente información:
 * -Todos los sueldos introducidos ordenados de forma decreciente.
 * -El sueldo máximo y mínimo.
 * -La media de los sueldos.
 */
public class AP5_14 {
    public static void main(String[] args) {
        //primero declaramos el array sueldos y declaramos el metodo de alta de sueldos
        double [] sueldos = altaSueldos();
        //declaramos el metodo para ordenar de forma decreciente
        ordenDecreciente(sueldos);
        //mostramos el sueldo maximo y el minimo
        maxMin(sueldos);
        //mostramos la media de los sueldos
        mediaSueldos(sueldos);

    }
    //Creamos el metodo para introducir todos los sueldos
    public static double [] altaSueldos(){ //no ponemos nada en los parentesis ya que esta funcion va a recoger datos que introduzca el usuario
        //declaramos la variable sueldos
        double sueldos[]=new double[0];
        double sueldoAux=0; //declaramos una variable auxiliar para sueldos donde guardaremos los datos que recojamos para luego copiarlos al array sueldos
        Scanner sc = new Scanner (System.in);
        do {
            System.out.print("Indica el sueldo -> ");
            sueldoAux=sc.nextDouble();
            if (sueldoAux != -1){
                sueldos= Arrays.copyOf(sueldos,sueldos.length+1); //copia el array sueldos con la longitud aumentada
                sueldos[sueldos.length-1]=sueldoAux;
            }
        }while (sueldoAux != -1); //el bucle se repetira hasta que el usuario introduzca -1
        Arrays.sort(sueldos);
        return sueldos; //devuelve el array sueldos ordenados de forma ascendente
    }
    public static void ordenDecreciente (double sueldos[]) {
        for (int i = sueldos.length-1; i >= 0; i--) { //bucle for para ordenar de forma decreciente los sueldos
            System.out.println(" " + sueldos[i] + " -");
        }
    }
    public static void maxMin (double sueldos[]){
        System.out.println("Sueldo mayor -> " + (sueldos[sueldos.length-1])); //accede al ultimo elemento del array usando sueldos.length-1 ya que el array ya
                                                                            //ya esta ordenado de forma ascendente
        System.out.println("Sueldo menor -> " + (sueldos[0])); //accede al primer elemento del array
    }
    public static void mediaSueldos(double sueldos[]){
        double suma=0; //en esta variable almacenaremos la suma de todos los sueldos del array sueldos
        for (int i = 0; i < sueldos.length; i++) {
            suma = suma + sueldos[i]; //suma+= sueldos[i]
        }
     double media= suma / sueldos.length;
        System.out.println("La media de todos los sueldos es -> " + media + " €");
    }

}
