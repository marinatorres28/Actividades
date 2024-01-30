package Unidad3;

public class EjemploBucleFor {
    public static void main(String[] args) {
        for (int i=0; i<=10; i++) {
            System.out.println("El valor de i es ->" + i);
        }

        /*Si la variable i esta declarada dentro del for, solo se puede
        obtener su valor dentro del bloque for, por tener ambito local.
        * */
    }
}
