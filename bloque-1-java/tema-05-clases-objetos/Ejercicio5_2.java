public class Ejercicio5_2 {
    public static void main(String[] args) {
        Sala sala1 = new Sala("Sala-1", 120);

        // Consultar datos (vendiendo 100 entradas previamente)
        sala1.venderEntradas(100);
        System.out.printf("La %s tiene %d butacas y ha vendido %d entradas%n", sala1.getNombre(), sala1.getButacasTotales(), sala1.getEntradasVendidas());
        // Ahora intento vender 25
        if (sala1.venderEntradas(25)) {
            System.out.println("Operación realizada correctamente.");
        } else {
            System.out.println("No hay butacas libres suficientes.");
        }
        // Anular 10 entradas
        if (sala1.anularEntradas(10)) {
            System.out.println("Operación realizada correctamente.");
        } else {
            System.out.println("No se han podido anular las entradas.");
        }
        //Anular 100 entradas
        if (sala1.anularEntradas(100)) {
            System.out.println("Operación realizada correctamente.");
        } else {
            System.out.println("No se han podido anular las entradas.");
        }
        // Mostrar información para ver el estado actualizado
        sala1.mostrarEstado();
    }
}
