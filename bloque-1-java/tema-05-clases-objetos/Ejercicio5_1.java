import java.util.Locale;

public class Ejercicio5_1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);

        // Crear varios productos
        Producto producto1 = new Producto("Ratón", 10.99 , 10);
        Producto producto2 = new Producto("Teclado", 29.99, 5);
        Producto producto3 = new Producto("Monitor", 129.99, 2);

        // Mostrar información
        producto1.mostrarInformacion();
        producto2.mostrarInformacion();
        producto3.mostrarInformacion();

        // Realizar operaciones
        producto1.modificarPrecio(-10.99); // Da error
        producto1.modificarPrecio(12.99);
        producto1.mostrarInformacion(); // Ver el precio modificado
        producto2.anadirStock(-5); // Da error
        producto2.anadirStock(3);
        producto2.mostrarInformacion(); // Ver el stock actualizado
        producto3.venderUnidades(3); // Da error
        producto3.venderUnidades(2);
        producto3.mostrarInformacion(); // Ver el stock actualizado
    }
}
