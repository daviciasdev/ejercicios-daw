public class Podcast implements Reproducible, Descargable {
    private String titulo;
    private double duracion;
    private double tamano;

    public Podcast(String titulo, double duracion, double tamano) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.tamano = tamano;
    }

    @Override
    public void descargar() {
        System.out.printf("Se han descargado %.2f MB correctamente.Disfruta del podcast%n", devolverTamano());
    }

    @Override
    public double devolverTamano() {
        return this.tamano;
    }

    @Override
    public void reproducir() {
        System.out.printf("Está sonando %s. Quedan %.2f segundos%n", this.titulo, devolverDuracion());
    }

    @Override
    public double devolverDuracion() {
        return this.duracion;
    }
}
