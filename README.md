# 💱 Currency Converter – Java API Exchange Rate App

Esta aplicación en **Java** permite obtener el tipo de cambio entre dos monedas en tiempo real utilizando una **API pública de tasas de cambio**.  
El usuario elige una opción para convertir una moneda a otra, después selecciona el monto a convertir y la aplicación muestra el valor convertido de acuerdo con el último tipo de cambio.
Fue desarrollada con fines educativos, aplicando conceptos de **POO**, **Records** (Java 14+), y consumo de **APIs REST** mediante `HttpURLConnection`.

---

## 🧰 Tecnologías y herramientas utilizadas

- **Lenguaje:** Java 17 (compatible desde Java 14 por uso de Records)
- **Entorno sugerido:** IntelliJ IDEA
- **Dependencias externas:** Gson
- **API utilizada:** [ExchangeRate API](https://www.exchangerate-api.com/)  
  (puede reemplazarse por cualquier otra compatible con JSON)

---

## 📁 Estructura del proyecto

```
src/
└── com.aluracursos.projectcurrencyconverter
    ├── Main.java                  # Punto de entrada de la aplicación
    ├── ExchangeApliClient.java    # Implementa la lógica de conexión y obtención de datos desde la API
    ├── ExchangeRate.java          # Record que modela la información del tipo de cambio
    └── ExchangeRateApi.java       # Implementa la lógica de conexión y obtención de datos desde la API
```

---

## ⚙️ Requisitos previos

Antes de ejecutar el proyecto, asegúrate de tener instalado:

- **Java JDK 17** o superior  
  ```bash
  java --version
  ```
- **Conexión a Internet** (para acceder a la API de tipo de cambio)

---

## 🚀 Ejecución del programa

1. **Clona o descarga** este repositorio.
   ```bash
   git clone [https://github.com/gmarcialj/CurrencyConverter.git](https://github.com/gmarcialj/CurrencyConverter.git)
   cd currencyconverter/src
   ```

2. **Compila** los archivos Java:
   ```bash
   javac *.java
   ```

3. **Ejecuta** el programa:
   ```bash
   java Main
   ```

4. **Ejemplo de ejecución:**
   ```
   *********************************************
    Bienvenido al conversor de monedas.
    
    Seleccione una de las siguientes opciones:
    1) Dolar => Peso mexicano
    2) Dólar => Peso argentino
    3) Dolar => Real brasileño
    4) Dolar => Peso colominano
    5) Peso mexicano  => Dólar
    6) Peso argentino => Dólar
    7) Real brasileño => Dólar
    8) Peso colominano => Dólar
    0) Salir
   *********************************************
    1
    Ingrese el valor a convertir: 
    180
    $180.0 USD = $3300.534 MXN (de acuerdo al tipo de cambio correspondiente al "Wed, 12 Nov 2025 00:00:01 +0000")
   ```

---

## 🧠 Conceptos aplicados

- **Records (Java 14+)**
  - Uso de `record ExchangeRate(...)` para representar datos inmutables de la API.
- **Consumo de API REST**
  - Peticiones HTTP con `HttpURLConnection`.
- **Manejo de entrada de usuario**
  - Lectura mediante `Scanner` desde consola.
- **POO y encapsulación**
  - Separación de responsabilidades entre clases.

---

## 🧾 Licencia

Este proyecto se distribuye bajo la licencia **MIT**.  
Puedes usarlo, modificarlo o adaptarlo libremente citando al autor original.

---

## 👨‍💻 Autor

Desarrollado por **Gil [@gmarcialj]**  
> Proyecto educativo para aprender consumo de APIs y estructuras modernas de Java.
