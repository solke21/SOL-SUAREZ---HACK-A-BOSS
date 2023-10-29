public class EJERCICIO2B {

    /*b) Ahora, asigna valores que no correspondan al tipo de dato.
    Por ejemplo, un int en un String o un String en un double… ¿Qué sucede con el programa? ¿Se produce algún error?
    ¿En qué situaciones se genera error y en cuáles no? Justificar el por qué de cada caso.
    Debatir con otros compañeros.
     */

    // DECLARAR VARIABLES
    public static void main(String[] args) {
        int numero = "Esto es un número";
        double decimal = 5.1;
        boolean trueOrFalse = true;
        String cadena = 9;

        // Si modificamos el valor de la variable String por un número, nos indica que hay que informarlo con "String.valueOf"
        // Si modificamos el valor de la variable int por una cadena de caracteres, nos indica que hay que informarlo con "Integer.parseInt"

    }

}