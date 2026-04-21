# 🎬 Sistema de Videoteca en Java

## 📌 Descripción

Este proyecto consiste en un sistema de gestión de una videoteca desarrollado en Java.
Permite administrar películas mediante un menú por consola, aplicando Programación Orientada a Objetos (POO) y una arquitectura en capas.

El sistema carga datos desde un archivo `.txt` y permite operar sobre ellos en memoria.

---

## 🎯 Funcionalidades

El sistema permite:

* ➕ Agregar una película
* 🔍 Buscar una película por código
* ❌ Eliminar una película
* 📋 Listar todas las películas
* 🎥 Alquilar una película (cambia a no disponible)
* 🔄 Devolver una película (cambia a disponible)
* 📂 Mostrar solo películas alquiladas
* 🔢 Informar cuántas películas están alquiladas
* 🕰️ Mostrar la película más antigua
* 🚪 Salir del sistema

---

## 🧠 Conceptos aplicados

* Programación Orientada a Objetos (POO)
* Encapsulamiento (atributos privados + getters/setters)
* Uso de `ArrayList`
* Interfaces e implementación
* Arquitectura en capas:

  * Model
  * Service
  * Repository
* Lectura de archivos (`BufferedReader`)
* Manejo de excepciones (`try-catch`)
* Entrada por consola con `Scanner`
* Recorridos, filtros, contadores y búsqueda de mínimos

---

## 🧩 Estructura del proyecto

```id="8eq2nx"
src/
│
├── model/
│   └── Pelicula.java
│
├── repository/
│   └── LecturaArchivoRepository.java
│
├── repositoryImp/
│   └── LecturaArchivoRepositoryImp.java
│
├── service/
│   └── PeliculaService.java
│
├── serviceImp/
│   └── PeliculaServiceImpl.java
│
└── inicio/
    └── Main.java
```

---

## 📄 Archivo de datos

El sistema utiliza un archivo:

```id="c0m9qc"
peliculas.txt
```

### Formato:

```id="4w1a4o"
codigo,titulo,genero,anio,disponible
```

### Ejemplo:

```id="vt9cbd"
001,Avatar,Ciencia Ficcion,2009,true
002,Titanic,Romance,1997,false
003,Matrix,Accion,1999,true
```

---

## ▶️ Ejecución

1. Ejecutar la clase `Main`
2. El sistema carga automáticamente las películas desde el archivo
3. Se muestra un menú por consola
4. El usuario interactúa ingresando opciones

---

## ⚠️ Consideraciones

* Los datos se cargan desde el archivo al iniciar
* Las modificaciones realizadas (altas, bajas, alquileres, etc.) **no se guardan automáticamente en el archivo**
* El sistema trabaja en memoria durante la ejecución

---

## 🚀 Posibles mejoras

* Guardar cambios en el archivo `.txt`
* Validar códigos duplicados
* Manejo de errores más robusto
* Implementar persistencia con base de datos
* Crear una interfaz gráfica

---

## 👨‍💻 Autor

Proyecto realizado como práctica para parcial de Programación Orientada a Objetos.

