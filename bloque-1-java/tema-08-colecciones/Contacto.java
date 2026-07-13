public class Contacto implements Comparable<Contacto> {
    private String nombre;
    private String telefono;
    private String ciudad;
    private int edad;

    public Contacto(String nombre, String telefono, String ciudad, int edad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return String.format("N: %s | T: %s | C: %s - %d años", this.nombre, this.telefono, this.ciudad, this.edad);
    }

    @Override
    public int compareTo(Contacto otro) {
        return this.nombre.compareTo(otro.nombre);
    }
}
