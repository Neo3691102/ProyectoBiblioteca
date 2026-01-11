# Proyecto Biblioteca – Java Full Stack (Consola)

## Descripción

Este proyecto es una **aplicación de consola en Java** que simula el funcionamiento básico de una biblioteca. Implementa una arquitectura por capas, uso de **colecciones**, **excepciones personalizadas**, se implementan**patrones de diseño Factory Method y Singleton**, y está **empaquetado y dockerizado** para su ejecución portable.

El objetivo principal del proyecto es demostrar buenas prácticas de programación en Java, organización de código, y procesos básicos de build y despliegue.

---

## Tecnologías utilizadas

* **Java 11**
* **Gradle (multi-módulo)**
* **Docker**
* **Programación Orientada a Objetos (POO)**
* **JPA**
* **Conexion a BD MySQL**
* **Pruebas con Junit 5**

---

## Arquitectura del proyecto

El proyecto está organizado en módulos siguiendo una separación clara de responsabilidades:

```
proyectobiblioteca/
│
├── aplicacion/      # Capa de entrada (main)
├── capanegocio/     # Lógica de negocio
├── capadatos/       # Modelos y acceso a datos
├── Dockerfile
├── build.gradle
└── settings.gradle
```

### Capas

* **Aplicación**: contiene la clase `main` y coordina el flujo del programa.
* **Negocio**: encapsula la lógica y reglas de operación.
* **Datos**: define las entidades (`Usuario`, `Libro`, `Autor`) y excepciones personalizadas.

---

## Funcionalidades principales

* Gestión de usuarios, autores y libros, 
* Uso de listas y operaciones CRUD con patron Factory Method
* Excepción personalizada (`MiExcepcion`)
* Ejecución mediante JAR ejecutable
* Ejecución mediante contenedor Docker
* Conexion a base de datos MySQL usando JPA con patron Singleton

---

## Requisitos previos

Para ejecutar el proyecto localmente necesitas:

* **Java 11**
* **Gradle** (o usar el wrapper `gradlew`)
* **Docker** (opcional, para ejecución en contenedor)

---

## Compilación del proyecto

Desde la raíz del proyecto:

```bash
gradlew clean build
```

Esto genera un **JAR ejecutable con dependencias incluidas** en:

```
aplicacion/build/libs/aplicacion.jar
```

---

## Ejecución local

```bash
java -jar aplicacion/build/libs/aplicacion.jar
```

---

## Ejecución con Docker

### Construir la imagen

```bash
docker build -t biblioteca-java .
```

### Ejecutar el contenedor

```bash
docker run --rm biblioteca-java
```

---

## Dockerfile

El proyecto utiliza una imagen ligera con Java 11:

```dockerfile
FROM eclipse-temurin:11-jre
WORKDIR /app
COPY aplicacion/build/libs/aplicacion.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
```

---

## Buenas prácticas aplicadas

* Separación por capas
* Encapsulamiento y uso de POO
* Uso correcto de Streams (operaciones intermedias y terminales)
* Manejo de errores con excepción personalizada
* Build reproducible
* Contenedorización con Docker
* Patrones de diseño: Factory Method y Singleton

---

## Estado del proyecto

✔ Finalizado

Este proyecto forma parte de un proceso de formación como **Desarrollador Java Full Stack** y está preparado para ser presentado como **proyecto de portafolio**.

---

## Autor

**Néstor Arturo Castañeda**

Desarrollador Java Full Stack en formación.
