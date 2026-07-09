public class Disco extends Material {
    private Cancion[] canciones;

    public Disco(int id, String nombre, String creador, Cancion[] canciones) {
        super(id, nombre, creador);
        this.canciones = canciones;
    }

    @Override
    public double minutosConsumo() {
        double duracion = 0.0;
        for (Cancion c : this.canciones) {
            duracion += c.getDuracion();
        }
        return duracion;
    }
}


class Cancion {
    private String titulo;
    private double duracion;

    Cancion(String titulo, double duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public double getDuracion() {
        return this.duracion;
    }
}