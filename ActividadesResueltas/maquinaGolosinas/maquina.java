import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * @Description Aplicacion para una maquina expendedora de golosina. Tema: Array
 * @author Marina Torres
 * @version 1.0 14/03/2024
 *
 *
 *
 *
 *
 *
 *
 *
 */

public class maquina {
    public static void main(String[] args) throws InterruptedException {
       menu();

    }
    /**
     * Muestra el menu de la aplicacion
     */
    public static void menu() throws InterruptedException {
        //Array de las golosinas
        String [][] golosinas ={
                {
                    "KitKat","Chicles de Fresa","Lacasitos","Palotes"
                },
                {
                    "Kinder Bueno","Bolsa Haribo","Chettos","Twix"
                },
                {
                    "Galletas Oreo","M&M's","Patatas Fritas","Chicles de Menta"
                },
                {
                    "MilkyBar","KitKat Blanco","Galleta Oreso Fresa","Huesitos"
                }
        };
        //Array de precios
        double [][] precios = {
                {
                    1.5,1.0,1.65,1.10
                },
                {
                    2.0,2.20,1.0,1.05
                },
                {
                    1.23,2.0,2.50,1.0
                },
                {
                    3.0,1.50,1.25,1.50
                }
        };
        //Array de stock
        int stock[][]=new int[4][4];
        //llamamos a la funcion rellenar maquina
        stock=rellenarMaquina(stock,5);
        mostrar(Arrays.deepToString(stock));
        boolean salir=false; //para validar el bucle del menu
        double totalVentaEuros=0;
        int opcion,posicionFila,posicionColumna,cantidadStock,posicion;

        //desarrollamos el menu
        while (!salir) { //la variable booleana indica que es falso(mientras sea falso,se repite el bucle)
           //opciones
            mostrar("* * * * * * * * * * * * * * * * * * *");
            mostrar("* * * * MAQUINA DE GOLOSINAS  * * * *");
            mostrar("* * 1. Pedir golosinas.           * *");
            mostrar("* * 2. Mostrar golosinas.         * *");
            mostrar("* * 3. Rellenar stock (Admin).    * *");
            mostrar("* * 4. Apagar máquina.            * *");
            mostrar("* * * * * * * * * * * * * * * * * * *");
            Scanner sc = new Scanner(System.in);
            mostrarSinLn("Indique su opcion -> ");
            opcion=sc.nextInt();
            //hacemos un switch case de opciones
            switch (opcion) {
                case 1 -> {
                    //pedir golosinas
                    mostrarSinLn("Indique la posicion de la golosina a comprar -> ");
                    posicion= sc.nextInt();
                    //tenemos que validar que la posicion sea mayor o igual que 0 y menor o igual que 33
                    if (posicion>= 0 && posicion<=3 || posicion>10 && posicion<=13 || posicion>=20 && posicion<=23 || posicion>=30 && posicion<=33){
                        //calculamos el valor de la fila
                        posicionFila=(posicion%100)/10;
                        posicionColumna=posicion%10;
                        //llamar a un metodo que controle el stock y me diga true o false si
                        //hay cantidad suficiente para vender
                        if (controlStock(stock,posicionFila,posicionColumna)){
                            mostrarSinLn("Ingresa el dinero -> " + precios[posicionFila][posicionColumna] + " -> ");
                            double aux = sc.nextDouble();
                            double cambio = aux - precios[posicionFila][posicionColumna];
                            mostrar("El cambio es de " + cambio + "€");
                            mostrar("Disfruta de tu " + golosinas[posicionFila][posicionColumna]);
                            stock[posicionFila][posicionColumna]--;
                            totalVentaEuros+=precios[posicionFila][posicionColumna];
                        }else {
                            mostrar("No hay " + golosinas[posicionFila][posicionColumna] + " en la maquina");
                        }
                    }else {
                        mostrar("Opcion no admitida.");
                    }
                }
                case 2 -> {
                    //mostrar todos los codigos,los nombres de las golosinas y su precio
                    mostrarGolosinas(golosinas,precios);
                }
                case 3 -> {
                    //solicitara la contraseña del tecnico y luego llamar la funcion rellenar maquina
                    mostrarSinLn("Ingresa la contraseña autorizada -> ");
                    String password = sc.next();sc.nextLine();
                    if (password.equals("chuch3s")){
                        mostrar("Reponiendo máquina. . .");
                        rellenarMaquina(stock,5);
                        for (int i = 0; i < 6; i++) {
                            mostrarSinLn("\uD83C\uDF6D");
                            TimeUnit.SECONDS.sleep(1);
                           }
                        mostrar("");
                        }
                    else {
                        mostrar("Usuario no autorizado");
                    }

                }
                case 4 -> {
                    //mostrar los recolectados en las ventas de la maquina (cierre de caja)
                    mostrar("La maquina ha vendido -> " + totalVentaEuros + " €");
                    salir=true;

                }
                default -> mostrar("Opcion no válida.");
            }
        }
    }

    /**
     * Metodo que se utiliza para rellenar el stock de la maquina al incicio y cuando va el tecnico
     * a reponer el stock
     * @param stock
     * @param valor
     * @return
     */
    public static int [][] rellenarMaquina(int stock[][],int valor){
        //inicializamos el array de stock de cada golosina en 5
        for (int i = 0; i < stock.length; i++) {
            for (int j = 0; j < stock[i].length; j++) {
                stock[i][j]=valor; //valor que se envia como parametro
            }
        }
        return stock;
    }

    /**
     * Metodo para mostrar las posiciones,los nombres de las golosinas y sus precios
     * @param golosinas
     * @param precios
     */
    public static void mostrarGolosinas (String golosinas[][],double precios[][]){
        //necesitamos recorrer el array de nombres y con posicion obtenemos precio
        for (int i = 0; i < golosinas.length; i++) {
            for (int j = 0; j < golosinas[i].length; j++) {
                mostrar(i + "" + j+ " "+ golosinas[i][j] + " " + precios[i][j] + " €");
            }
        }
    }

    /**
     * Metodo que controla el stock con un booleano
     * @param stock
     * @param posicionFila
     * @param posicionColumna
     * @return
     */
    public static boolean controlStock (int stock[][],int posicionFila,int posicionColumna){
        if (stock[posicionFila][posicionColumna]==0){
            return false;
        }else {
            return true;
        }
    }

    /**
     * Metodo que se utiliza para mostrar en cosola los textos con salto de linea
     * @param texto
     */
    public static void mostrar (String texto) {
        System.out.println("\t"+texto);
    }
    /**
     * Metodo que se utiliza para mostrar en cosola los textos sin salto de linea
     * @param texto
     */
    public static void mostrarSinLn (String texto) {
        System.out.print("\t"+texto);
    }
}
