Sistema de Inventario en Java

Sistema de gestión de inventario desarrollado con Java y arquitectura MVC.

Características

· Gestión completa de productos (agregar, buscar, listar, eliminar)
· Interfaz de consola interactiva
· Validación de datos de entrada
· Almacenamiento en memoria

Estructura de Carpetas

El workspace contiene dos carpetas por defecto:

· src: la carpeta para mantener los archivos fuente
· lib: la carpeta para mantener las dependencias

Mientras tanto, los archivos de salida compilados se generan en la carpeta bin por defecto.

Estructura del Proyecto

El proyecto sigue el patrón MVC:

· Modelo: Producto.java, BaseDeDatos.java
· Vista: InventarioVista.java
· Controlador: ControladorInventario.java
· Main: App.java

Como Ejecutar

```bash
# Compilar
javac -d bin src/*.java src/controlador/*.java src/modelo/*.java src/view/*.java

# Ejecutar
java -cp bin App
```

Funciones Disponibles

1. Agregar producto - Registrar nuevos productos en el inventario
2. Buscar producto - Encontrar productos por SKU
3. Mostrar todos - Listar todos los productos registrados
4. Eliminar producto - Remover productos del inventario
5. Salir - Cerrar la aplicación

Gestión de Dependencias

La vista JAVA PROJECTS te permite gestionar tus dependencias. Más detalles pueden encontrarse aquí.