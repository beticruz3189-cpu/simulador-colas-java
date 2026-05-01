// Clase que gestiona la fila de espera (Estructura FIFO)
public class ColaClientes { 
    private Nodo frente, fin;
// Método para insertar un nuevo cliente al final de la cola 
    public void encolar(String id, String nombre, String servicio) {
        Nodo nuevo = new Nodo (id, nombre, servicio);
        if (fin == null) {
            frente = fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }
    // Metodo para retirar al cliente que esta al frente de la cola
    public Nodo desencolar(){
        if (frente == null) 
            return null; 
            Nodo aux = frente; 
            frente = frente.siguiente;
            if (frente == null)
                fin = null;
            return aux;
        }
    // Muestra todos los clientes que aún no se han atendido 
        public void recorrerCola() {
    Nodo temp = frente;
    if (temp == null) System.out.println("La cola esta vacia.");
    while (temp != null) {
        System.out.println("- " + temp.nombre + " (" + temp.servicio + ")");
        temp = temp.siguiente;
    }
}
    }
