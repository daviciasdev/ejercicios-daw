public class Comercial extends Empleado {
    private int ventas;

    public Comercial(String nombre, double salarioBase, int ventas) {
        super(nombre, salarioBase);
        this.ventas = ventas;
    }

    private int calcularPorcentaje(int ventas) {
        int porcentaje = 0;
        if (ventas > 0 && ventas < 10) {
            porcentaje = 3;
        } else if (ventas < 20) {
            porcentaje = 5;
        } else if (ventas < 30) {
            porcentaje = 10;
        } else {
            porcentaje = 15;
        }
        return porcentaje;
    }

    @Override
    public double calcularSalarioMensual() {
        int porcentaje = calcularPorcentaje(this.ventas);
        return this.salarioBase + (salarioBase * porcentaje / 100);
    }

}
