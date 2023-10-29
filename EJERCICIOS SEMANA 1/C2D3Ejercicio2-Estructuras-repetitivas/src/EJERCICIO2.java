import java.util.Scanner;

public class EJERCICIO2 {

    /* Ejercicio Nº 2 - Estructuras Repetitivas

a) Imagina que eres un cajero en un supermercado. Crea un programa en Java que permita ingresar
el precio de varios productos comprados por un cliente.
Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo precios
hasta que el usuario decida finalizar. Luego, muestra el total de la compra que debe abonar.

Pista: Recuerda que existen dos tipos de bucles, los controlador por un contador
(cuando sabemos un número exacto de productos por ejemplo) u por centinela (cuando no sabemos
cuántos productos va a comprar el cliente). En este caso debes aplicar un “centinela”.
Un ejemplo podría ser, si se ingresa un número negativo o un 0 como monto de un producto.
*/


    public static void main(String[] args) {

        // VARIABLES
        double precioProducto;
        double totalProductos = 0;
        boolean seguir = false;

        // SCANNER
        Scanner scanner = new Scanner(System.in);


        // BUCLE
        while (seguir != true) {
            System.out.println("Introducir precio del producto: ");
            precioProducto = scanner.nextDouble();
            if (precioProducto > 0) {
                totalProductos += precioProducto;
            } else {
                seguir = true;
            }
        }

        // RESULTADO POR PANTALLA
        System.out.println("El total de la compra es de: " +totalProductos +"€");

    }

}