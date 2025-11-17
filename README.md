💎 Directorio MVC Java - Sistema de Gestión de Inventario de Joyas
🧠 Descripción General
Este proyecto implementa una aplicación de consola en Java, diseñada para gestionar un inventario de joyas utilizando el patrón Modelo - Vista - Controlador (MVC).
Permite registrar, consultar, listar, eliminar y buscar joyas por tipo o material.

👩‍💻 Integrantes del Proyecto
Juan Jose Gutierrez Rudas
Lina Maria David Cabrera
Dahian Michelle Gonzales Diaz
Johan Alberto Majin
Asignatura: Ingeniería de Software I
Docente: Jorge Andrés Benavides
Fecha de Entrega: 17 de noviembre de 2025


Características

· Agregar nuevos productos al inventario
· Buscar productos por SKU
· Mostrar todos los productos registrados
· Eliminar productos del inventario
· Almacenamiento en memoria (lista en RAM)

Estructura del Proyecto


src/
├── controlador/
│   └── ControladorInventario.java
├── modelo/
│   ├── BaseDeDatos.java
│   └── Producto.java
├── view/
│   └── InventarioVista.java
└── App.java


Clases Principales

ControladorInventario

· Gestiona el flujo principal de la aplicación
· Coordina entre la vista y el modelo
· Implementa el patrón MVC

BaseDeDatos

· Almacena los productos en una lista
· Proporciona operaciones CRUD (Crear, Leer, Actualizar, Eliminar)
· Búsqueda por SKU

Producto

· Modela un producto con: nombre, SKU, cantidad y precio
· Incluye validaciones y formato de presentación

InventarioVista

· Interfaz de usuario por consola
· Entrada y validación de datos
· Presentación de información al usuario

Instalación y Ejecución

Requisitos

· Java JDK 8 o superior
· Cualquier IDE Java compatible (Eclipse, IntelliJ, VS Code)

Pasos para ejecutar:

1. Clonar o descargar el proyecto
2. Compilar todos los archivos .java
3. Ejecutar la clase App.java

bash
javac -d bin src/*.java src/controlador/*.java src/modelo/*.java src/view/*.java
java -cp bin App


Uso del Sistema

Al iniciar la aplicación, se mostrará un menú con las siguientes opciones:

1. Agregar producto: Solicita nombre, SKU, cantidad y precio
2. Buscar producto por SKU: Muestra los detalles de un producto específico
3. Mostrar todos los productos: Lista completa del inventario
4. Eliminar producto: Remueve un producto usando su SKU
5. Salir: Finaliza la aplicación

Ejemplo de Flujo


=== SISTEMA DE INVENTARIO DE DEVSOLUTIONS ===
1. Agregar producto
2. Buscar producto por SKU
3. Mostrar todos los productos
4. Eliminar producto
5. Salir
Seleccione una opción: 1

Ingrese el nombre del producto: Laptop Dell XPS
Ingrese el SKU del producto: LP-DELL-XPS15
Ingrese la cantidad: 5
Ingrese el precio: 1599.99

Producto agregado correctamente.


Tecnologías Utilizadas

· Lenguaje: Java
· Paradigma: Programación Orientada a Objetos (POO)
· Patrón: Modelo-Vista-Controlador (MVC)
· Estructuras de datos: ArrayList, List

Características Técnicas

· Validación de entrada de datos
· Manejo de excepciones básico
· Código modular y mantenible
· Separación de responsabilidades

Próximas Mejoras

· Persistencia en base de datos o archivos
· Actualización de productos existentes
· Búsquedas avanzadas (por nombre, rango de precios)
· Generación de reportes
· Interfaz gráfica de usuario (GUI)
