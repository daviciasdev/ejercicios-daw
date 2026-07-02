import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3_1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("Introduce el segundo número: ");
        int b = Integer.parseInt(sc.nextLine());

        System.out.printf("Suma: %d%n", sumar(a, b));
        System.out.printf("Resta: %d%n", resta(a, b));
        System.out.printf("Multiplicación: %d%n", multiplicar(a, b));
        System.out.printf("División: %.2f%n", dividir(a, b));


    }

    public static int sumar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    public static int resta(int a, int b) {
        int resultado = a - b;
        return resultado;
    }

    public static int multiplicar(int a, int b) {
        int resultado = a * b;
        return resultado;
    }

    public static double dividir(int a, int b) {
        double resultado = (double) a / b;
        return resultado;
    }
}
