// Clase que representa la estructura de pila (LIFO) para el historial de atención
public class PilaHistorial {
    private Nodo tope;
// Agrega al cliente que acaban de atender a la cima del historial (Push)
    public void apilar(Nodo nodo) {
        if (nodo == null) return;
        Nodo nuevo = new 
        Nodo (nodo.id, nodo.nombre, nodo.servicio);
        nuevo.siguiente = tope;
        tope = nuevo;
    }
// Permite ver quién fue el último atendido sin sacarlo de la pila
    public Nodo verUltimo() {
        return tope;
    }
// Muestra todo el historial bien completo desde el primero hasta el último
   public void recorrerPila() {
    Nodo temp = tope;
    if (temp == null) System.out.println("El historial esta vacio.");
    while (temp != null) {
        System.out.println("* " + temp.nombre + " atendido de: " + temp.servicio);
        temp = temp.siguiente;
    }
}
}
    

    

    


