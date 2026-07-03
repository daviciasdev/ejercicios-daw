import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4_1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas temperaturas vas a introducir?: ");
        int t = Integer.parseInt(sc.nextLine());
        double[] temperaturas = new double[t];

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.printf("Temperatura %d: ", i + 1);
            temperaturas[i] = Double.parseDouble(sc.nextLine());
        }

        System.out.printf("--- Análisis ---%n");
        System.out.printf("Media: %.2f%n", calcularMedia(temperaturas));
        System.out.printf("Máxima: %.2f%n", calcularMaxima(temperaturas));
        System.out.printf("Mínima: %.2f%n", calcularMinima(temperaturas));
        System.out.printf("Por encima de la media: %d%n", contarSobreMedia(temperaturas));

    }

    public static double calcularMedia(double[] temperaturas) {
        double suma = 0.0;
        for (double t : temperaturas) {
            suma += t;
        }
        return suma / temperaturas.length;
    }

    public static double calcularMaxima(double[] temperaturas) {
        double maxima = temperaturas[0];
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > maxima) {
                maxima = temperaturas[i];
            }
        }
        return maxima;
    }

    public static double calcularMinima(double[] temperaturas) {
        double minima = temperaturas[0];
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] < minima) {
                minima = temperaturas[i];
            }
        }
        return minima;
    }

    public static int contarSobreMedia(double[] temperaturas) {
        double media = calcularMedia(temperaturas);
        int contador = 0;
        for (double t : temperaturas) {
            if (t > media) {
                contador++;
            }
        }
        return contador;
    }
}
