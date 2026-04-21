# 📚 Sistema de Biblioteca en Java

## 📌 Descripción

Este proyecto consiste en un sistema sencillo de biblioteca desarrollado en Java, que permite gestionar libros mediante un menú por consola.

El sistema permite cargar libros en memoria, consultarlos, modificarlos y aplicar distintas operaciones como préstamos y devoluciones.

---

## 🎯 Funcionalidades

El sistema permite:

* ➕ Agregar un libro
* 🔍 Buscar un libro por código
* 📋 Listar todos los libros
* 📖 Prestar un libro (cambia su estado a prestado)
* 🔄 Devolver un libro (cambia su estado a disponible)
* 📚 Mostrar solo los libros prestados
* 🔢 Contar cuántos libros están prestados
* 📅 Mostrar el libro más antiguo
* 🚪 Salir del sistema

---

## 🧠 Conceptos aplicados

* Programación Orientada a Objetos (POO)
* Uso de `ArrayList`
* Recorridos con `for`
* Búsquedas con `equals()`
* Filtros
* Contadores
* Búsqueda de mínimo (libro más antiguo)
* Menú por consola con `Scanner`

---

## 🧩 Estructura del proyecto

```id="biblio1"
src/
│
├── model/
│   └── Libro.java
│
├── service/
│   └── GestionLibro.java
│
├── service/imp/
│   └── GestionLibroImp.java
│
└── inicio/
    └── Main.java
```

---

## 📄 Clase principal: Libro

Cada libro contiene:

```id="biblio2"
codigo
titulo
autor
anioPublicacion
prestado (boolean)
```

Incluye:

* Constructores
* Getters y setters
* Método `toString()`

---

## ▶️ Funcionamiento

1. Se ejecuta la clase `Main`
2. Se muestra un menú por consola
3. El usuario selecciona una opción
4. El sistema realiza la operación sobre la lista de libros

---

## ⚠️ Consideraciones

* Los datos se almacenan en memoria (no persisten al cerrar el programa)
* No se permiten operaciones sobre libros inexistentes
* El estado del libro cambia según se preste o devuelva

---

## 🚀 Posibles mejoras

* Guardar y cargar libros desde un archivo `.txt`
* Validar códigos duplicados
* Implementar eliminación de libros
* Agregar interfaz gráfica

---

## 👨‍💻 Autor

Proyecto realizado como práctica para parcial de Programación Orientada a Objetos.
