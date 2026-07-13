import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class Agenda {
    private HashMap<String, Contacto> contactos;

    public Agenda() {
        this.contactos = new HashMap<>();
    }

    public boolean anadirContacto(Contacto contacto) {
        if (this.contactos.containsKey(contacto.getTelefono())) {
            return false;
        } else {
            this.contactos.put(contacto.getTelefono(), contacto);
            return true;
        }
    }

    public Contacto buscarContactoPorTelefono(String telefono){
        return this.contactos.get(telefono);
    }

    public boolean eliminarPorTelefono(String telefono){
        return this.contactos.remove(telefono)!= null;
    }

    public ArrayList<Contacto> listarPorNombre(){
        ArrayList<Contacto> lista = new ArrayList<>(this.contactos.values());
        lista.sort(Comparator.comparing(Contacto::getNombre));
        return lista;
    }

    public ArrayList<Contacto> listarPorEdad(){
        ArrayList<Contacto> lista = new ArrayList<>(this.contactos.values());
        lista.sort(Comparator.comparingInt(Contacto::getEdad));
        return lista;
    }

    public HashSet<String> obtenerCiudades(){
        HashSet<String> ciudades = new HashSet<>();
        for (Contacto c : this.contactos.values()){
            ciudades.add(c.getCiudad());
        }
        return ciudades;
    }

    public double edadMedia(){
        if (this.contactos.isEmpty()){
            return  -1;
        }
        int suma = 0;
        for (Contacto c : this.contactos.values()){
            suma += c.getEdad();
        }
        return (double) suma / this.contactos.size();
    }
}
