import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declaración de variables
        int num1, num2, num3, num4, num5, total;
        double promedio;

        // Declarar Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicitar y asignar los números informados
        System.out.println("Informar un número: ");
        num1 = scanner.nextInt();
        System.out.println("Informar otro número: ");
        num2 = scanner.nextInt();
        System.out.println("Informar otro número: ");
        num3 = scanner.nextInt();
        System.out.println("Informar otro número: ");
        num4 = scanner.nextInt();
        System.out.println("Informar otro número: ");
        num5 = scanner.nextInt();

        // Sumar los números informados
        total = num1+num2+num3+num4+num5;

        // Obtener promedio
        promedio = (double) total / 5;

        // Mostrar valores
        System.out.println("La suma de todos los números es de: "+total);
        System.out.println("El promedio de los números informados es de: "+promedio);

    }
}