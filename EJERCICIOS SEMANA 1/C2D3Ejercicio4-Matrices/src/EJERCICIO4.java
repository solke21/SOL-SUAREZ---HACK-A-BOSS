import java.util.Scanner;

public class EJERCICIO4 {

    /* Ejercicio Nº 4 - Matrices - Grupal

Imagina que estás trabajando en un sistema de reservas de asientos para un teatro. Crea un
programa en Java que represente un mapa de asientos en una matriz de 5x5 y ten en cuenta lo
siguiente:

Los asientos pueden estar ocupados (representados por "X") o vacíos (representados por "O").

Permite al usuario ingresar por teclado donde quiere sentarse, indicando su fila y número de
asiento (por ejemplo, "Fila 3, Asiento 2"). El programa debe marcar como ocupado ese asiento
solo en caso de que esté vacío.

Si el asiento elegido por el usuario está ocupado, el sistema debe informar que elija otro
diferente.

A medida que los asientos se ocupen, el programa debe actualizar el mapa de asientos y
mostrarlo por pantalla luego de cada reserva.

Intenta hacer pruebas con otros compañeros, imagina que ellos son los compradores y tú el
encargado del teatro. ¿Funciona para todos los casos? ¿Encontraste errores que resolver?
¿Considera tu programa los asientos ya reservados?

El sistema deberá seguir corriendo hasta que el encargado de cargar las reservas de los
asientos determine que ha finalizado.

Pista: Puedes preguntar en cada “vuelta” del bucle, si esta ha sido la última compra.
     */



    public static void main(String[] args) {

    // VARIABLES
        String asientos [][] = new String[5][5];
        boolean bandera = false;
        Scanner scanner = new Scanner(System.in);
        int fila, asiento;
        String respuesta;

    // MENSAJE DE BIENVENIDA AL SISTEMA DE RESERVAS
        System.out.println("Bienvenid@ al sistema de reservas del teatro");

    // MATRIZ CON ASIENTOS
        for (int f = 0; f < 5; f++){
            for (int a = 0; a < 5; a++){
                asientos [f][a] = "O";
            }
        }

    // CONDICION WHILE PARA PREGUNTAR AL USUARIO
        // IF PARA INFORMAR SI ASIENTO OCUPADO O NO
            // SCANNER PARA QUE EL USUARIO DE RESPUESTA
                // UN SEGUNDO IF PARA TERMINAR BUCLE
                    // ELSE PARA MOSTRAR POR PANTALLA SI ASIENTO OCUPADO, SELECCIONAR OTRO
        while (bandera != true){
            System.out.println("Introducir número de fila entre 0 y 4");
            fila = scanner.nextInt();
            System.out.println("Introducir número de asiento entre 0 y 4");
            asiento = scanner.nextInt();

            if (asientos [fila] [asiento].equals("O")) {
                asientos [fila] [asiento] = "X";
                System.out.println("Asiento reservado correctamente");
                System.out.println("Desea finalizar la reserva? S: Si. Cualquier otra letra:  No ");
                respuesta = scanner.next();

                if (respuesta.equalsIgnoreCase("S")){
                    bandera = true;
                }

            }else {
                System.out.println("Asiento ocupado, por favor seleccionar otro");
            }
        }


    }
}