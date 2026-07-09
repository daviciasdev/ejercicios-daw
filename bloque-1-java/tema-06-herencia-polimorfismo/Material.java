public abstract class Material {
    protected int id;
    protected String nombre;
    protected String creador;

    public Material(int id, String nombre, String creador) {
        this.id = id;
        this.nombre = nombre;
        this.creador = creador;
    }

    public abstract double minutosConsumo();

    public boolean esConsumoLargo(){
        return minutosConsumo() > 120;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Título: %s | Creador: %s", this.id, this.nombre, this.creador);
    }

}



