
public class Main {
    public static void main(String[] args) {

        // Declarar e inicializar las variables de la fórmula para calcular el IMC
        // Tipo de variable: double
        double peso = 80;
        double altura = 1.80;
        double imc;

        // Realizamos cálculo de IMC
        imc  = peso / (altura * altura);

        // Muestra por pantalla el valor IMC
        System.out.println("Su IMC es de: "+imc);

    }
}

