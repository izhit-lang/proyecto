package controlador;
import java.util.List;
import modelo.BaseDeDatos;
import modelo.Producto;
import view.InventarioVista;

public class ControladorInventario {
    private BaseDeDatos baseDatos;
    private InventarioVista vista;
    private boolean salir;
    
    public ControladorInventario(BaseDeDatos baseDatos, InventarioVista vista) {
        this.baseDatos = baseDatos;
        this.vista = vista;
        this.salir = false;
    }

    public void iniciar() {
        vista.mostrarMensaje("Bienvenido al Sistema de Inventario de DevSolutions");
        
        while (!salir) {
            int opcion = vista.mostrarMenu();
            
            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                    
                case 2:
                    buscarProducto();
                    break;
                    
                case 3:
                    mostrarTodos();
                    break;
                    
                case 4:
                    eliminarProducto();
                    break;
                    
                case 5:
                    salir = true;
                    vista.mostrarMensaje("¡Hasta luego!");
                    break;
                    
                default:
                    vista.mostrarMensaje("Opción inválida. Por favor, seleccione 1-5.");
            }
        }
    }
    
    private void agregarProducto() {
        Producto producto = vista.pedirDatosUsuario();
        baseDatos.agregarProducto(producto);
        vista.mostrarMensaje("Producto agregado correctamente.");
    }
    
    private void buscarProducto() {
        String sku = vista.pedirSku();
        Producto producto = baseDatos.buscarProductoSku(sku);
        vista.mostrarProducto(producto);
    }
    
    private void mostrarTodos() {
        List<Producto> productos = baseDatos.buscarTodos();
        vista.mostrarProductos(productos);
    }
    
    private void eliminarProducto() {
        String sku = vista.pedirSku();
        boolean eliminado = baseDatos.eliminarProducto(sku);
        
        if (eliminado) {
            vista.mostrarMensaje("Producto eliminado correctamente.");
        } else {
            vista.mostrarMensaje("Error: No se encontró un producto con ese SKU.");
        }
    }
}