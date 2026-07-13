import java.util.Locale;

public class Ejercicio8_2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Agenda agenda = new Agenda();

        // Añadir contactos a la agenda
        agenda.anadirContacto(new Contacto("Pepe", "+34666444555", "Madrid", 25));
        agenda.anadirContacto(new Contacto("María", "881881881", "A Coruña", 40));
        agenda.anadirContacto(new Contacto("Ana", "+786543129", "Barcelona", 30));
        agenda.anadirContacto(new Contacto("Juan", "+34777543129", "Barcelona", 30));

        // Intentar duplicado
        boolean anadido = agenda.anadirContacto(new Contacto("Jose Luis", "881881881", "A Coruña", 41));
        if (anadido) {
            System.out.println("Contacto añadido correctamente.");
        } else {
            System.out.println("No se pudo añadir el contacto: el teléfono ya se encuentra en la agenda.");
        }

        // Buscar por teléfono
        Contacto encontrado = agenda.buscarContactoPorTelefono("881881881");
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado);
        } else {
            System.out.println("No se encontró ese contacto.");
        }

        // Listar todos los contactos ordenados por nombre
        System.out.println("--- CONTACTOS por NOMBRE ---");
        for (Contacto c : agenda.listarPorNombre()) {
            System.out.println(c);
        }

        // Listar todos los contactos ordenados por edad
        System.out.println("--- CONTACTOS por EDAD ---");
        for (Contacto c : agenda.listarPorEdad()) {
            System.out.println(c);
        }

        // Ciudades distinas
        System.out.println("--- CIUDADES ---");
        for (String ciudad : agenda.obtenerCiudades()) {
            System.out.println(ciudad);
        }

        // Edad media
        if (agenda.edadMedia() != -1) {
            System.out.printf("Edad media de los contactos: %.2f años%n", agenda.edadMedia());
        } else {
            System.out.println("No hay contactos guardados.");
        }

    }

}
