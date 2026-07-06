public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public int getStock() {
        return this.stock;
    }

    public void modificarPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("No se puede poner un precio negativo");
        }
    }

    public void anadirStock(int stock) {
        if (stock > 0) {
            this.stock += stock;
        } else {
            System.out.println("Cantidad incorrecta");
        }
    }

    public void venderUnidades(int unidades) {
        if (unidades <= 0) {
            System.out.println("Cantidad incorrecta");
        } else if (unidades <= this.stock) {
            this.stock -= unidades;
        } else {
            System.out.println("No hay unidades suficientes");
        }
    }
    public void mostrarInformacion() {
        System.out.printf("Producto: %s | Precio: %.2f € | Stock: %d unidades%n", this.nombre, this.precio, this.stock);
    }


}
