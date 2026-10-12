# ☕ Interfaz Set en Java

**Materia:** Programación Orientada a Objetos (POO)

📅 **Fecha:** 10/10/2026

## 👥 Integrantes
- Rafael Dominguez Jimenez
- Angel Isahel Lopez Lopez

## 📌 ¿Qué es la interfaz Set?

`Set` es una interfaz perteneciente al **Java Collections Framework**, ubicada en el paquete `java.util`. Su principal característica es que permite almacenar una colección de elementos sin duplicados.

Esta interfaz extiende `Collection` y define métodos para agregar, eliminar, buscar y administrar elementos.

## ⭐ Características principales

- **Elementos únicos:** No permite almacenar elementos duplicados.
- **Sin acceso por índices:** A diferencia de `List`, no permite acceder a los elementos mediante posiciones.
- **Orden:** Depende de la implementación utilizada.
- **Polimorfismo:** Permite trabajar con diferentes implementaciones mediante una misma interfaz.
- **Valores nulos:** Su aceptación depende de la implementación.

## 🛠️ Métodos principales

| Método | Descripción |
|---|---|
| `add()` | Agrega un elemento si no existe. |
| `remove()` | Elimina un elemento del conjunto. |
| `contains()` | Comprueba si un elemento existe. |
| `size()` | Devuelve la cantidad de elementos. |
| `isEmpty()` | Comprueba si el conjunto está vacío. |
| `clear()` | Elimina todos los elementos. |

## 🔹 Implementaciones de Set

Entre sus principales implementaciones se encuentran:

- **HashSet:** No garantiza un orden específico.
- **LinkedHashSet:** Mantiene el orden de inserción.
- **TreeSet:** Mantiene los elementos ordenados.

## 📚 Referencias

GeeksforGeeks. (s. f.). *Set in Java*. https://www.geeksforgeeks.org/java/set-in-java/
