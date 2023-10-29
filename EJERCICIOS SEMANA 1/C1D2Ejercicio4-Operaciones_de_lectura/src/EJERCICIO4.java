import java.util.Scanner;

public class EJERCICIO4 {

    /*  Crea un programa que pida al usuario que ingrese por teclado dos números enteros
    y realice las siguientes operaciones con ellos: suma, resta, multiplicación y división.
    Muestra por pantalla/consola los resultados de cada una de las operaciones con un mensaje
    amigable para el usuario.

    Sugerencia: Compara los resultados que obtengas con otros compañeros.
    Pide a tus compañeros que te digan números al azar y haz las pruebas necesarias para
    comprobar el funcionamiento de tu programa.

    Extra: ¿Qué sucede si como segundo número de una división se ingresa 0? Con lo que sabes o
    aprendiste hasta ahora… ¿De qué manera tratarías de evitar ésta situación?
     */


    public static void main(String[] args) {

    // DECLARAR VARIABLES
        double num1;
        double num2;
        double suma, resta, multiplicacion, division;

    // SCANNER
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca primer número: ");
        num1 =scanner.nextInt();
        System.out.println("Introduzca segundo número: ");
        num2 =scanner.nextInt();

    // OPERACIONES
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;

    //  MOSTRAR POR PANTALLA
        System.out.println("La suma de los números es de " +suma);
        System.out.println("La resta de los números es de " +resta);
        System.out.println("La multiplicación de los números es de " +multiplicacion);
        System.out.println("La división de los números es de " +division);

    }
}

/* Cuando se divide entre 0 da una excepción de error, porque no se puede dividir entre 0.
Se podría evitar tratando la excepción poniendo una condición con un BreakPoint */


