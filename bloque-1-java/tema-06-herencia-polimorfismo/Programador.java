public class Programador extends Empleado{
    private int certificaciones;
    private int plus;

    public Programador(String nombre, double salarioBase, int certifiaciones, int plus){
        super(nombre, salarioBase);
        this.certificaciones = certifiaciones;
        this.plus = plus;
    }

    @Override
    public double calcularSalarioMensual() {
        return this.salarioBase + (certificaciones * plus);
    }
}
