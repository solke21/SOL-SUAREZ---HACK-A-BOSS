import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaración de variables (la edad también funcionaría con String)
        String nombre, apellido;
        int edad;

        // Declaración Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, indique su nombre: ");
        nombre = scanner.nextLine();

        System.out.println("Por favor, indique su apellido: ");
        apellido = scanner.nextLine();

        System.out.println("Por favor, indique su edad: ");
        edad = scanner.nextInt();

        System.out.println("Su nombre y apellido es: "+nombre+" "+apellido+" y tiene "+edad+" años");
    }
}