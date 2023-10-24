import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declarar variables
        double peso, altura, imc;

        // Declarar Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que informe su peso
        System.out.println("Por favor, introduzca su peso: ");
        peso = scanner.nextDouble();

        // Solicitar al usuario que informe su altura
        System.out.println("Por favor, introduzca su altura: ");
        altura = scanner.nextDouble();

        // Cálculo del IMC
        imc = peso / (altura+altura);

        // Mostrar IMC calculado
        System.out.println("El IMC calculado es: "+imc);

    }
}