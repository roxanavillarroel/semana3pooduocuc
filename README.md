![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Actividad Sumativa – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** Roxana Villarroel Liberona
- **Sección:** 002A
- **Carrera:** Analista Programador Computacional
- **Sede:** Online

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la Actividad Sumativa de la asignatura Desarrollo Orientado a Objetos I, cuyo propósito es aplicar los fundamentos de la Programación Orientada a Objetos (POO) mediante la construcción de un sistema modular y reutilizable.

El sistema está desarrollado completamente en Java e implementa una solución que modela el funcionamiento de una empresa del rubro salmonero, representando entidades reales como empleados, productos, direcciones y datos comerciales. Para ello, se aplican de manera explícita los principios fundamentales de la POO:
	•	Encapsulamiento: cada clase maneja y protege sus atributos internos mediante el uso de modificadores de acceso y métodos públicos controlados.
	•	Composición: clases como Empresa, Empleado y Productos se estructuran a partir de otras clases, fortaleciendo la modularidad del sistema.
	•	Herencia: la clase Empleado hereda atributos y comportamientos de la clase base Persona, evitando duplicación de código.
	•	Polimorfismo: se implementa a través del uso de métodos sobrescritos (toString) y el manejo de colecciones que permiten almacenar distintos tipos de objetos.
	•	Modularidad: el sistema se organiza en paquetes funcionales (model, service, util, app), facilitando la mantenibilidad y escalabilidad del proyecto.
 	•	Lectura de datos desde archivos externos .csv
	•	Gestión automática de listas de empleados y productos
	•	Uso de colecciones dinámicas (ArrayList)
 
---

## 🧱 Estructura del Proyecto

```plaintext
EmpreSalmonera/
 ├── pom.xml
 ├── README.md
 └── src/
     ├── main/
     │   ├── java/
     │   │   └── org/example/
     │   │       ├── app/
     │   │       │   └── Main.java
     │   │       ├── model/
     │   │       │   ├── Persona.java
     │   │       │   ├── Empleado.java
     │   │       │   ├── Empresa.java
     │   │       │   ├── Productos.java
     │   │       │   └── Direccion.java
     │   │       ├── util/
     │   │       │   ├── LectorArchivo.java
     │   │       │   └── RutInvalidoException.java
     │   │       └── service/
     │   │           └── EmpresaService.java
     │   └── resources/
     │       └── data/
     │           ├── empleados.csv
     │           └── productos.csv
     └── test/
         └── java/ (vacío o con tests)

Repositorio GitHub: https://github.com/roxanavillarroel/semana3pooduocuc
Fecha de entrega: 24/11/2025
