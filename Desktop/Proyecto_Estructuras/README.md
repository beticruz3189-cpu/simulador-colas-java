# Proyecto Final: Simulador de Cola de Atención al Cliente 

**Estudiante:** Amanda Elizabeth de la Cruz Gonzales  
**Carnet:** 202503196  
**Curso:** Estructuras de Datos  
**Catedrático:** Ing. Brandon Chitay  

##  Descripción del Proyecto
Este sistema simula la atención en una sucursal bancaria. Implementa una **Cola (Queue)** para gestionar el orden de llegada de los clientes y una **Pila (Stack)** para registrar el historial de las personas ya atendidas.

##  Requerimientos Técnicos 
- **Estructuras Lineales:** Implementación manual de Pilas y Colas mediante Nodos. 
- **Restricción:** No se utilizaron librerías `java.util.Stack` o `java.util.Queue`.
- **Persistencia:** Carga masiva de datos desde el archivo `data/clientes.txt`.
- **Operaciones:** - `Encolar`: Agregar cliente.
    - `Desencolar`: Atender cliente y moverlo al historial.
    - `Peek`: Consultar el último cliente atendido.
    - `Recorrido`: Visualización completa de las estructuras.

##  Estructura
- `/src`: Código fuente en Java.
- `/data`: Archivo plano con la base de datos de clientes.

## Instrucciones de Ejecución

### Requisitos Previos
* Tener instalado el **JDK 21** o superior.
* Contar con un editor de texto o IDE (se recomienda **VS Code** con la extensión de Java).

### Pasos para Compilar y Ejecutar
1. **Clonar el repositorio**:
   `git clone https://github.com/tu-usuario/simulador-cola-java.git`
2. **Navegar a la carpeta del proyecto**:
   `cd simulador-cola-java`
3. **Compilar el código**:
   Desde la raíz del proyecto, usa el comando: javac src/*.ja
4. **Ejecutar el simulador**:
5. **Una vez compilado inicie el simulador con el siguiente comando:** java -cp src Main
6. **Que hara el programa:** cargara automáticamente los datos de data/clientes.txt.
7. **Utilice el menú numérico para:** gestionar la Cola de espera y la Pila de historial
8. **Para finalizar el programa de forma segura:** elija la opción salir.

