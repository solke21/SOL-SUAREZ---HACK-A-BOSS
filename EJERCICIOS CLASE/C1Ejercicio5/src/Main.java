import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declarar variables
        double base, altura, area;

        // Declarar Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que informe base
        System.out.println("Por favor, introduzca su base: ");
        base = scanner.nextDouble();

        // Solicitar al usuario que informe altura
        System.out.println("Por favor, introduzca su altura: ");
        altura = scanner.nextDouble();

        // Cálculo del Área del Rectángulo
        area = base * altura;

        // Mostrar Área del Rectángulo
        System.out.println("El Área del Rectángulo calculado es: "+area);

    }


}