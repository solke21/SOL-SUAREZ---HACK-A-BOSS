import java.util.Scanner;

public class EJERCICIO1 {

    /* Ejercicio Nº 1 - Estructuras Condicionales

a) Una recital permite únicamente el ingreso de mayores de 18 años. Para ello
necesita un programa que, a partir de que un usuario ingrese su edad, determine
mediante un mensaje en pantalla si la persona puede o no ingresar al evento.
El programa debe mostrar (según cada caso) un mensaje informando la situación.
     */

    public static void main(String[] args) {

        // VARIABLE
        int edad;

        // SCANNER
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca edad: ");
        edad = scanner.nextInt();

        // CONDICION
        if (edad >= 18) {
            System.out.println("Puedes entrar al evento");
        }else {
            System.out.println("No puedes entrar al evento; eres menor de edad");
        }
    }
}