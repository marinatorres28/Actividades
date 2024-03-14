import java.util.Scanner;

public class Main {
//    static Scanner sc = new Scanner (System.in); //para declarar el scanner de forma general y no en cada bloque (static)
//    public static void main(String[] args) {
//        System.out.println("Indique en euros el importe a convertir: ");
//        double euros = sc.nextDouble();
//        menu(euros); //llamada a la funcion con pase de parametros
//    }
//    public static void menu (double euros){
//        char opcion;
//       do {
//           mostrar("·····CONVERSOR DE MONEDA·····");
//           mostrar("\ta-> Libras");
//           mostrar("\tb-> Yen");
//           mostrar("\tc-> Dolar EEUU");
//           mostrar("\td-> Dolar Canada");
//           mostrar("\tx-> Salir");
//
//           System.out.println("Indica la moneda a convertir");
//           opcion = sc.next().charAt(0); //0 significa que toma el primer caracter
//
//           switch (opcion) {
//               case 'a' -> {
//                   mostrar(euros + " € = " + euros * 0.8562 + " GBP");
//               }
//               case 'b' -> {
//                   mostrar(euros + " € = " + euros * 163.24 + " Yen Japones");
//               }
//               case 'c' -> {
//                   mostrar(euros + " € = " + euros * 1.0838 + " Dolar EEUU");
//               }
//               case 'd' -> {
//                   mostrar(euros + " € = " + euros * 1.4711 + " Dolar Canada");
//               }
//               case 'x' -> {
//                   mostrar("¿Estas seguro de que quieres salir? x -> confirmar");
//                   opcion = sc.next().charAt(0);
//                   if (opcion != 'x') {
//                       menu(euros);
//                   }
//               }
//               default -> mostrar("Introduce el valor valido");
//           }
//       }while (opcion != 'x');
//       }
//    public static void mostrar(String texto) {
//        System.out.println("\t"+texto);
//    }
    static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.println("Indica en kilos la cantidad a convertir");
        double kilos=sc.nextDouble();
        menu(kilos);
    }
    public static void menu (double kilos) {
        char opcion;
        do {
            mostrar("··· Conversor kilos ··· ");
            mostrar(" a-> Libra ");
            mostrar(" b-> Tonelada ");
            mostrar(" c-> Onza ");
            mostrar(" d-> Gramo ");
            mostrar(" e-> Miligramos ");
            mostrar(" x-> Salir ");

            mostrar("Indica a que quieres convertir: ");
            opcion=sc.next().charAt(0);

            switch (opcion) {
                case 'a'-> {
                    mostrar(kilos + " kg = " + kilos * 163.24 + " Libras");
                }
                case 'b'-> {
                    mostrar(kilos + " kg = " + kilos * 163.24 + " Toneladas");
                }
                case 'c'-> {
                    mostrar(kilos + " kg = " + kilos * 163.24 + " Onzas");
                }
                case 'd'-> {
                    mostrar(kilos + " kg = " + kilos * 163.24 + " Gramos");
                }
                case 'e'-> {
                    mostrar(kilos + " kg = " + kilos * 163.24 + " Miligramos");
                }
                case 'x' -> {
                    mostrar("¿Estas seguro de que quieres salir? x -> confirmar");
                    opcion = sc.next().charAt(0);
                    if (opcion != 'x') {
                        menu(kilos);
                    }
                }
                default -> mostrar("Introducir un valor valido");
            }

        }while (opcion != 'x');
    }
    public static void mostrar(String texto) {
        System.out.println("\t"+texto);
    }













}

