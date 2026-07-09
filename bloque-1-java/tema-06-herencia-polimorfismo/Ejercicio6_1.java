import java.util.Locale;

public class Ejercicio6_1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);

        Empleado [] empleados = new Empleado[4];
        empleados[0] = new Programador("David", 1200, 5, 20);
        empleados[1] = new Programador("Claudio", 1500, 1, 50);
        empleados[2] = new Comercial("Manolo", 1000, 9);
        empleados[3] = new Comercial("María", 1000, 30);

        for (Empleado empleado : empleados){
            System.out.println(empleado.toString());
        }
    }
}
