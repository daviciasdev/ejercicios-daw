import java.util.Locale;

public class Ejercicio7_1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        CancionT7 cancion = new CancionT7("Yellow", 267, 6.75);
        Podcast podcast = new Podcast("Sala de Peligro 001 - Batman Año uno", 7200, 347.0);
        RadioEnVivo radio = new RadioEnVivo("Los 40 Principales", "Del 40 al 1", 10800);

        Reproducible[] colaReproduccion = {cancion, podcast, radio};
        double totalDescarga = 0;
        for (Reproducible r : colaReproduccion) {
            r.reproducir();
            if (r instanceof Descargable) {
                totalDescarga += ((Descargable) r).devolverTamano();
            }
        }
        System.out.printf("El tamaño total de la descarga es de %.2f MB.", totalDescarga);


    }
}
