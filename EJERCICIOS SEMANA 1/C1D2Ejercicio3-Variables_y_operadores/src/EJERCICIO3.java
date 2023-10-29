import java.util.Scanner;

public class EJERCICIO3 {

    /* Escribe un programa que permita calcular el área de un triángulo y luego mostrar el resultado por pantalla..
    Recuerda que la fórmula para calcular esto es: (base * altura) / 2 (base por altura dividido dos).

    Pista: Debes declarar variables para la base y la altura del triángulo, asignarles valores y luego calcular el área utilizando
    la fórmula.
     */

    public static void main(String[] args) {
    // DECLARAR VARIABLES
    double area, base, altura;

    // DECLARAR SCANNER
    Scanner scanner = new Scanner(System.in);

        // SOLICITAR A USUARIO QUE INFORME DE LA BASE
        System.out.println("Por favor, introduzca la base: ");
        base = scanner.nextDouble();

        // SOLICITAR A USUARIO QUE INFORME DE LA ALTURA
        System.out.println("Por favor, introduzca la altura: ");
        altura = scanner.nextDouble();

        // CÁLCULO ÁREA DEL TRIÁNGULO
        area = base * altura / 2;

        // MOSTRAR POR PANTALLA
        System.out.println("El área del triángulo es_ "+area);

    }
}