public abstract class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalarioMensual();

    @Override
    public String toString() {
        return String.format("Nombre: %s | Salario: %.2f€", this.nombre, calcularSalarioMensual());
    }
}
