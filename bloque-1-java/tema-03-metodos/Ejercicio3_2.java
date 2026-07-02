import java.util.Scanner;

public class Ejercicio3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = Integer.parseInt(sc.nextLine());
        System.out.printf("¿Es par? %s%n", esPar(numero) ? "Si" : "No");
        System.out.printf("¿Es primo? %s%n", esPrimo(numero) ? "Si" : "No");
        System.out.println("Introduce tres números para hallar el  mayor:");
        System.out.print("Número 1: ");
        int n1 = Integer.parseInt(sc.nextLine());
        System.out.print("Número 2: ");
        int n2 = Integer.parseInt(sc.nextLine());
        System.out.print("Número 3: ");
        int n3 = Integer.parseInt(sc.nextLine());
        System.out.printf("El mayor es: %d%n", mayor(n1, n2, n3));
    }

    public static boolean esPar(int n) {
        return n % 2 == 0;
    }

    public static boolean esPrimo(int n) {
        boolean resultado;

        if (n < 2) {
            resultado = false;
        } else if (n == 2) {
            resultado = true;
        } else if (esPar(n)) {
            resultado = false;
        } else {
            resultado = true;
            for (int i = n - 1; i > 1 && resultado; i--) {
                if (n % i == 0) {
                    resultado = false;
                }
            }
        }
        return resultado;
    }

    public static int mayor(int a, int b) {
        int resultado;
        if (a > b) {
            resultado = a;
        } else {
            resultado = b;
        }
        return resultado;
    }

    public static int mayor(int a, int b, int c) {
        return mayor(a, b) == a ? mayor(a, c) : mayor(b, c);
    }

}
