// Clase que representa un Cliente
public class Cliente {
    // Atributos de la clase
    private String nombre;  // Nombre del cliente
    private String dni;     // DNI del cliente
    private int edad;       // Edad del cliente

    // Constructor de la clase
    public Cliente(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    // Método para mostrar la información del cliente en formato de tabla
    public String toTableRow() {
        return String.format("| %-20s | %-10s | %-5d |", nombre, dni, edad);
    }

    // Método principal para ejecutar el programa
    public static void main(String[] args) {
        // Crear un arreglo de objetos Cliente
        Cliente[] clientes = {
            new Cliente("Juan Pérez", "12345678Z", 30),
            new Cliente("María López", "87654321X", 25),
            new Cliente("Carlos García", "23456789Y", 40)
        };
        
        // Imprimir la cabecera de la tabla
        System.out.println("| Nombre              | DNI        | Edad |");
        System.out.println("|---------------------|------------|------|");
        
        // Imprimir la información de cada cliente en formato de tabla
        for (Cliente cliente : clientes) {
            System.out.println(cliente.toTableRow());
        }
    }
}

