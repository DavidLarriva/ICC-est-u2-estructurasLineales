# **Práctica de Estructuras Lineales: Pilas y Colas**

Este proyecto pertenece a la práctica académica enfocada en la unidad de **Estructuras Lineales**. Aquí se presentan ejercicios que abordan la implementación y resolución de problemas prácticos mediante el uso de **pilas** y **colas**, desarrollados en el lenguaje de programación **Java**.

El propósito de este proyecto es consolidar los conocimientos teóricos aplicándolos en situaciones prácticas que simulan escenarios reales.

---

## **Ejercicios Desarrollados**

### **Ejercicio 01: Validador de Expresiones Balanceadas**
Este ejercicio consiste en crear un programa que determine si una expresión tiene correctamente balanceados sus signos de apertura y cierre. Para ello, se utiliza una **pila**, lo que permite gestionar eficientemente el control de los signos.

- **Objetivo:** Comprobar si expresiones matemáticas o lógicas, que contienen signos como `()`, `{}`, `[]`, están correctamente balanceadas.
- **Cómo Funciona:**
  - Los signos de apertura (`(`, `{`, `[`) se agregan a la pila.
  - Cada signo de cierre encontrado es comparado con el último signo almacenado en la pila para verificar si coinciden.
  - Al finalizar, la pila debe estar vacía para confirmar que la expresión es válida.

---

### **Ejercicio 02: Ordenar Números en una Pila**
En este ejercicio se implementa un algoritmo para organizar de forma ascendente los elementos de una pila, utilizando únicamente las operaciones básicas de esta estructura (`push`, `pop`, `peek`). Este ejercicio muestra un uso avanzado de las pilas para resolver problemas de ordenamiento.

- **Objetivo:** Reorganizar los números dentro de una pila sin emplear estructuras externas, salvo otra pila auxiliar.
- **Cómo Funciona:**
  - Los elementos de la pila principal son transferidos a una pila auxiliar para ordenar los valores.
  - Cada número se ubica en su posición correcta dentro de la pila auxiliar, respetando el orden ascendente.

