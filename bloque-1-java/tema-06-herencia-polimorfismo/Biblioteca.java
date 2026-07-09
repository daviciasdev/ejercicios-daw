import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Material> catalogo;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.catalogo = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void anadirMaterialesCatalogo(Material material) {
        this.catalogo.add(material);
    }

    public void mostrarCatalogo() {
        System.out.println("--- Catálogo completo ---");
        for (Material m : this.catalogo) {
            System.out.println(m);
        }
    }

    public double tiempoTotalConsumo() {
        double tiempoTotal = 0;
        for (Material m : this.catalogo) {
            tiempoTotal += m.minutosConsumo();
        }
        return tiempoTotal;
    }

    public int materialConsumoLargo() {
        int contador = 0;
        for (Material m : this.catalogo) {
            if (m.esConsumoLargo()) {
                contador++;
            }
        }
        return contador;
    }

    public Material mayorTiempoConsumo() {
        int pos = 0;
        double duracion = 0.0;
        for (int i = 0; i < this.catalogo.size(); i++){
            if (this.catalogo.get(i).minutosConsumo() > duracion){
                duracion = this.catalogo.get(i).minutosConsumo();
                pos = i;
            }
        }
        Material mayor = this.catalogo.get(pos);
        return mayor;
    }
}
