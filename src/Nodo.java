public class Nodo {
    String id;
    String nombre; 
    String servicio;
    Nodo siguiente;

    public Nodo(String id, String nombre, String servicio) {
        this.id = id;
        this.nombre = nombre;
        this.servicio = servicio;
        this.siguiente = null;
    }
}
