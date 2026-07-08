public class Sala {
    // Atributos
    private String nombre;
    private int butacasTotales;
    private int butacasLibres;
    private int entradasVendidas;

    // Constructor
    public Sala(String nombre, int butacasTotales) {
        this.nombre = nombre;
        this.butacasTotales = butacasTotales;
        this.butacasLibres = butacasTotales;
        this.entradasVendidas = 0;
    }

    // Consultar sus datos
    public String getNombre() {
        return this.nombre;
    }

    public int getButacasTotales() {
        return this.butacasTotales;
    }

    public int getEntradasVendidas() {
        return this.entradasVendidas;
    }

    // Vender un número determinado de entradas
    public boolean venderEntradas(int entradas) {
        boolean exito = false;
        if (entradas > 0 && entradas <= butacasLibres) {
            butacasLibres -= entradas;
            entradasVendidas += entradas;
            exito = true;
        }
        return exito;
    }

    // Anular un número determinado de entradas ya vendidas
    public boolean anularEntradas(int entradas) {
        boolean exito = false;
        if (entradas > 0 && entradas <= entradasVendidas) {
            entradasVendidas -= entradas;
            butacasLibres += entradas;
            exito = true;
        }
        return exito;
    }

    // Consultar butacas libres
    public int consultarButacasLibres() {
        return this.butacasLibres;
    }

    // Mostrar el estado de la sala con formato
    public void mostrarEstado() {
        System.out.printf("Sala %s: %d entradas vendidas | %d butacas libres | %d butacas totales%n", this.nombre, this.entradasVendidas, this.butacasLibres, this.butacasTotales);
    }
}
