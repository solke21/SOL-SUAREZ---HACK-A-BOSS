import java.util.Scanner;

public class EJERCICIO3 {

    /* Ejercicio Nº 3 - Arreglos: Vectores - Individual

Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas
máximas de la última semana, calcule la temperatura máxima promedio que hubo.
Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente
temperatura máxima de cada día. Una vez almacenadas las temperaturas, deberá calcular
el promedio de las mismas recorriendo el vector y mostrando el resultado por pantalla.
     */



    public static void main(String[] args) {

        // VARIABLES
        int temperatura;
        int sumaTemperaturas = 0;
        double promedio;

        // SCANNER
        Scanner scanner = new Scanner(System.in);

        // INTRODUCIR DATOS
        for (int contador = 0; contador < 7; contador++){
            System.out.println("Por favor, introducir temperatura: ");
            temperatura = scanner.nextInt();
            sumaTemperaturas += temperatura;
        }

        // PROMEDIO
        promedio = sumaTemperaturas / 7;
        System.out.println("El promedio de las temperaturas indicadas es de: " +promedio +"grados");
    }
}