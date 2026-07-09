public class Pelicula extends Material{
    private int minutos;

    public Pelicula(int id, String nombre, String creador, int minutos){
        super(id, nombre, creador);
        this.minutos = minutos;
    }

    @Override
    public double minutosConsumo() {
        return this.minutos;
    }
}
