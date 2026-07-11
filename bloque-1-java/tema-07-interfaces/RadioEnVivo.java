public class RadioEnVivo implements Reproducible {
    private String cadena;
    private String programa;
    private double duracion;

    public RadioEnVivo(String cadena, String programa, double duracion) {
        this.cadena = cadena;
        this.programa = programa;
        this.duracion = duracion;
    }

    @Override
    public void reproducir() {
        System.out.printf("Está sonando %s en %s. Quedan %.2f segundos%n", this.programa, this.cadena, devolverDuracion());
    }

    @Override
    public double devolverDuracion() {
        return this.duracion;
    }
}
