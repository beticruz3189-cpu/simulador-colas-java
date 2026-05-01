import java.util.Scanner;
import java.io.*;

// Método principal que controla el flujo del sistema y el menú interactivo 

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        ColaClientes cola = new ColaClientes();
        PilaHistorial historial = new PilaHistorial();
        
        // 1. CARGAR CLIENTES DESDE ARCHIVO (Caso de uso 1)
        cargarArchivo("data/clientes.txt", cola);

        int opcion = 0;
        do {
            System.out.println("\n--- MENU PRINCIPAL - SISTEMA BANCARIO ---");
            System.out.println("1. Atender cliente (Cola -> Pila)");
            System.out.println("2. Consultar ultimo atendido (Peek Pila)");
            System.out.println("3. Ver historial completo (Recorrer Pila)");
            System.out.println("4. Ver cola de espera (Recorrer Cola)");
            System.out.println("5. Agregar cliente manual (Encolar)");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sn.nextInt();
            sn.nextLine(); // Limpiar el enter

            switch (opcion) {
                case 1: // ATENDER CLIENTE
                    Nodo atendido = cola.desencolar();
                    if (atendido != null) {
                        System.out.println(">>> Atendiendo a: " + atendido.nombre);
                        historial.apilar(atendido); // GUARDAR EN HISTORIAL
                    } else {
                        System.out.println("No hay clientes en espera.");
                    }
                    break;
                case 2: // CONSULTAR ULTIMO ATENDIDO
                    Nodo u = historial.verUltimo();
                    if (u != null) {
                        System.out.println("Ultimo atendido: " + u.nombre + " [" + u.servicio + "]");
                    } else {
                        System.out.println("Aun no se ha atendido a nadie.");
                    }
                    break;
                case 3: // VER HISTORIAL (RECORRER PILA)
                    System.out.println("--- HISTORIAL DE ATENCION ---");
                    historial.recorrerPila();
                    break;
                case 4: // VER COLA (RECORRER COLA)
                    System.out.println("--- CLIENTES EN ESPERA ---");
                    cola.recorrerCola();
                    break;
                case 5: // AGREGAR CLIENTE MANUAL
                    System.out.print("ID: "); String id = sn.nextLine();
                    System.out.print("Nombre: "); String nom = sn.nextLine();
                    System.out.print("Servicio: "); String ser = sn.nextLine();
                    cola.encolar(id, nom, ser);
                    System.out.println("Cliente agregado a la fila.");
                    break;
            }
        } while (opcion != 6);
    }
// Función que se encarga de leer el archivo cliente.txt y llenar la cola inicial.
    public static void cargarArchivo(String ruta, ColaClientes cola) {
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea = br.readLine(); // Encabezado
            while ((linea = br.readLine()) != null) {
                String[] d = linea.split(",");
                if(d.length >= 3) {
                    cola.encolar(d[0].trim(), d[1].trim(), d[2].trim());
                }
            }
            System.out.println("Sistema: Clientes cargados del archivo.");
        } catch (Exception e) {
            System.out.println("Error al cargar: " + e.getMessage());
        }
    }
}