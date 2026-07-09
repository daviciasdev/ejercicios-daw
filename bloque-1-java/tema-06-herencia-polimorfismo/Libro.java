public class Libro extends Material{
    private int paginas;
    private double minutosPorPagina;

    public Libro(int id, String nombre, String creador, int paginas, double velocidadLectura){
        super(id, nombre, creador);
        this.paginas = paginas;
        this.minutosPorPagina = velocidadLectura;
    }

    @Override
    public double minutosConsumo() {
        return this.paginas * this.minutosPorPagina;
    }
}
