package Unidad4_funciones;

public class Explicacion { //clase
    public static void main(String[] args) { //funcion o metodo
    //se llama las funciones o metodos que se van a ejecutar
        tresSaludos(3);
    }
    public static void tresSaludos(int veces){
        System.out.println("Te vamos a saludar 3 veces.");
        for (int i = 0 ; i < veces ; i++){
            System.out.println("Hola!");
        }
    }
}
