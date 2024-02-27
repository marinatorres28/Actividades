package Unidad4_funciones;

import java.util.Scanner;

public class PedirDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nombre;
        String apellido;
        byte edad;
        System.out.println("Indique el nombre: ");
        nombre=sc.nextLine();
        System.out.println("Indica el apellido: ");
        apellido=sc.nextLine();
        System.out.println("Indica la edad: ");
        edad=sc.nextByte();
        incrementoEdad(nombre,apellido,edad);
        quitarEdad(nombre,apellido,edad);
    }
    public static void incrementoEdad(String nom,String ape,byte ed){
        ed+=10;
        System.out.println(nom+ " " +ape+ " tendras dentro de 10 años " + ed + " años!");
    }
    public static void quitarEdad(String nombreUsuario,String apellidoUsuario,byte edadUsuario) {
        edadUsuario-=10;
        System.out.println(nombreUsuario+ " " +apellidoUsuario+ " tenías hace 10 años " + edadUsuario + " años!");
        for (int i = 1; i <= edadUsuario; i++) { //la variable i tiene ambito de bloque,solo funcionara dentro del bloque for
            System.out.println(nombreUsuario + " " + apellidoUsuario + "->" + i);
        }
    }
}
