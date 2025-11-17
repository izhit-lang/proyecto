package view;
import java.util.List;
import java.util.Scanner;

import modelo.Producto;


class InventarioVista {
    private Scanner scanner;
    
    public InventarioVista() {
        this.scanner = new Scanner(System.in);
    }
    
    public int mostrarMenu() {
        System.out.println("\n=== SISTEMA DE INVENTARIO DE DEVSOLUTIONS ===");
        System.out.println("1. Agregar producto");
        System.out.println("2. Buscar producto por SKU");
        System.out.println("3. Mostrar todos los productos");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
        
        while (!scanner.hasNextInt()) {
            System.out.print("Por favor, ingrese un número válido: ");
            scanner.next();
        }
        
        return scanner.nextInt();
    }
    
    public Producto pedirDatosUsuario() {
        scanner.nextLine();
        
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese el SKU del producto: ");
        String sku = scanner.nextLine();
        
        System.out.print("Ingrese la cantidad: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Por favor, ingrese un número válido para la cantidad: ");
            scanner.next();
        }
        int cantidad = scanner.nextInt();
        
        System.out.print("Ingrese el precio: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Por favor, ingrese un número válido para el precio: ");
            scanner.next();
        }
        double precio = scanner.nextDouble();
        
        return new Producto(nombre, sku, cantidad, precio);
    }
    
    public String pedirSku() {
        scanner.nextLine();
        System.out.print("Ingrese el SKU del producto: ");
        return scanner.nextLine();
    }
    
    public void mostrarProducto(Producto producto) {
        if (producto != null) {
            System.out.println(producto.toString());
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
    
    public void mostrarProductos(List<Producto> productos) {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            System.out.println("\n=== LISTA DE PRODUCTOS ===");
            for (Producto producto : productos) {
                System.out.println(producto.toString());
            }
        }
    }
    
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
   }
}
