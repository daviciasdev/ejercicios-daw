import java.util.Locale;

public class Ejercicio6_2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Libro libro1 = new Libro(1, "El principito", "Antoine de Saint-Exupéry", 120, 2);
        Libro libro2 = new Libro(2, "Batman: Año 1", "Frank Miller", 144, 1);
        Pelicula pelicula1 = new Pelicula(3, "Batman Begins", "Christopher Nolan", 110);
        Pelicula pelicula2 = new Pelicula(4, "The Batman", "Matt Reaves", 150);
        Cancion cancion1 = new Cancion("Pista 1", 5);
        Cancion cancion2 = new Cancion("Pista 2", 4);
        Cancion cancion3 = new Cancion("Pista 3", 6);
        Cancion cancion4 = new Cancion("Pista 4", 3.5);
        Cancion cancion5 = new Cancion("Pista 5", 5.5);
        Cancion[] canciones = {cancion1, cancion2, cancion3, cancion4, cancion5};
        Disco disco = new Disco(5, "Mi primer disco", "David", canciones);
        Biblioteca biblioteca = new Biblioteca("A Coruña");
        // Añadir materiales al catálogo
        biblioteca.anadirMaterialesCatalogo(libro1);
        biblioteca.anadirMaterialesCatalogo(libro2);
        biblioteca.anadirMaterialesCatalogo(pelicula1);
        biblioteca.anadirMaterialesCatalogo(pelicula2);
        biblioteca.anadirMaterialesCatalogo(disco);
        // Mostrar catálogo (se comprueba si se han añadido bien los materiales)
        biblioteca.mostrarCatalogo();
        // Calcular el tiempo total del consumo del catálogo
        System.out.printf("El catálogo de la biblioteca %s es de un total de %.2f minutos%n", biblioteca.getNombre(), biblioteca.tiempoTotalConsumo());
        // Contar cuántos materiales son de consumo largo
        System.out.printf("En la biblioteca %s hay un total de %d materiales de consumo largo%n", biblioteca.getNombre(), biblioteca.materialConsumoLargo());
        // Encontrar y devolver el material con mayor tiempo de consumo del catálogo
        System.out.printf("El material con mayor tiempo de consumo del catálogo de la biblioteca %s es:%n %s%n", biblioteca.getNombre(), biblioteca.mayorTiempoConsumo().toString());

    }
}
