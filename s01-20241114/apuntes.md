# Apuntes básicos de Java

## El lenguaje Java[^1]

Java es un lenguaje de programación de alto nivel, orientado a objetos y diseñado para ser multiplataforma. Sus elementos fundamentales son:

**Variables**: Contenedores que almacenan información para que pueda ser utilizada posteriormente.

**Clases y objetos**: Definen los comportamientos y atributos de las entidades que modelamos en nuestros programas. Una clase es como un molde, y los objetos son instancias de esa clase.

**Métodos**: Funciones que realizan tareas específicas dentro de una clase. Son el comportamiento de las clases y objetos.

**Herencia**: Permite crear clases que heredan propiedades y comportamientos de otras, facilitando la reutilización del código y la creación de jerarquías.

**Interfaces**: Contratos que definen los métodos que una clase debe implementar, fomentando la consistencia y el desacoplamiento entre partes del código.

**Paquetes**: Agrupaciones de clases e interfaces que ayudan a organizar el proyecto y evitar conflictos de nombres.

### ¿Para qué se utiliza este lenguaje?

Java se utiliza en una amplia variedad de aplicaciones, tales como el desarrollo de videojuegos, computación en la nube, Big Data, Inteligencia Artificial e IoT.

### Funcionamiento de Java

Java sigue la filosofía "write once, run anywhere" (WORA). El código fuente (.java) se compila a bytecode (.class), que luego se ejecuta en la Máquina Virtual de Java (JVM). Esto permite que el mismo código se ejecute en cualquier plataforma que tenga una JVM instalada.

El funcionamiento se puede dividir en dos partes:

- **Con lenguaje Java y API**: Se produce la interacción entre el desarrollador y la plataforma Java, creando la lógica de negocio y los elementos visuales (frontend).
- **Con la Java Virtual Machine**: La JVM realiza la comunicación backend, gestionando cómo el software interactúa con el hardware.


## Principales diferencias con Python[^2]
|  | Python | Java |
| -------- | -------- | -------- |
| **Sintaxis** | Más simple y concisa | Más compleja y verbosa |
| **Tipado** | Dinámico | Estático |
| **Compilación** | Interpretado | Compilado |
| **Rendimiento** | Más lento | Más rápido en ejecución gracias a la compilación previa |
| **Orientación a objetos** | Multiparadigma | Completamente orientado a objetos |
| **Manejo de errores** | Mayormente en tiempo de ejecución | Mayormente en tiempo de compilación |
| **Uso de memoria** | Menos eficiente | Más eficiente |
| **Curva de aprendizaje** | Más fácil de aprender y usar | Más compleja |
| **Aplicaciones** | Ciencia de datos, IA, scripting | Aplicaciones empresariales y móviles |
| **Indentación** | Es parte de la sintaxis | Usa llaves y punto y coma para definir bloques |


## Variables y tipos de datos básicos en Java[^3]

Las variables son contenedores que almacenan información. En Java existen diferentes tipos de datos, que se pueden agrupar en:

* **Cadenas de texto**
  * `String`: Almacena cadenas de texto. Ejemplo: `String nombre = "Naomi";`
  * `char`: Almacena un solo carácter. Ejemplo: `char letra = 'A';`

* **Booleanos**
  * `boolean`: Permite almacenar valores de verdad (`true` o `false`). Se usa cuando solo hay dos posibles estados. Ejemplo: `boolean activo = true;`

* **Numéricos**
  * **Enteros**
    * `byte`: Utiliza 8 bits y almacena valores entre -128 y 127.
    * `short`: Utiliza 16 bits y almacena valores entre -32,768 y 32,767.
    * `int`: Utiliza 32 bits y es el entero más común (rango: -2,147,483,648 a 2,147,483,647).
    * `long`: Utiliza 64 bits, almacenando valores mucho mayores.
  * **Decimales**
    * `float`: Permite almacenar números decimales con precisión menor. Ejemplo: `float precio = 19.99f;`
    * `double`: Permite almacenar decimales con mayor precisión. Ejemplo: `double saldo = 200.5678;`

* **Nullable (nulleable)**
  * `null`: Indica que una variable no tiene valor asignado. Puede causar errores si no se maneja adecuadamente.

### Tipos primitivos vs. Clases Wrapper

En Java, hay diferencias entre usar tipos primitivos (`int`, `char`) y sus clases equivalentes (`Integer`, `Character`). Las clases wrapper permiten acceder a métodos adicionales, mientras que los tipos primitivos son más eficientes en cuanto a memoria.

```java
Integer numero = 32; // Clase wrapper, permite métodos adicionales
int numero1 = 32;    // Tipo primitivo, más eficiente
```

## Condicionales[^4]

Los condicionales permiten ejecutar diferentes bloques de código según ciertas condiciones.

**Tipos de operadores relacionales**: 
- `==` igualdad
- `!=` desigualdad
- `>` mayor que
- `<` menor que
- `>=` mayor o igual que
- `<=` menor o igual que

- **IF**: Ejecuta el bloque de código si la condición es verdadera.
  ```java
  int edad = 18;
  if (edad >= 18) {
      System.out.println("Eres mayor de edad");
  }
  ```

- **IF-ELSE**: Ejecuta un bloque si la condición es falsa.
  ```java
  int numero = 7;
  if (numero % 2 == 0) {
      System.out.println("El número es par");
  } else {
      System.out.println("El número es impar");
  }
  ```

- **IF-ELSE IF-ELSE / SWITCH**: Evalúa múltiples condiciones.
  ```java
  int nota = 75;
  if (nota >= 90) {
      System.out.println("Sobresaliente");
  } else if (nota >= 70) {
      System.out.println("Notable");
  } else if (nota >= 50) {
      System.out.println("Aprobado");
  } else {
      System.out.println("Suspenso");
  }
  ```

  ```java
  int diaSemana = 3;
  switch (diaSemana) {
      case 1:
          System.out.println("Lunes");
          break;
      case 2:
          System.out.println("Martes");
          break;
      case 3:
          System.out.println("Miércoles");
          break;
      default:
          System.out.println("Otro día");
  }
  ```

- **Condicionales con operadores lógicos**: AND (`&&`), OR (`||`), NOT (`!`).
  ```java
  int edad = 25;
  boolean tieneLicencia = true;
  if (edad >= 18 && tieneLicencia) {
      System.out.println("Puede conducir");
  }
  ```

- **Operador ternario**: Forma abreviada de `if-else`.
  ```java
  int edad = 20;
  String mensaje = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
  System.out.println(mensaje);
  ```

## Bucles[^5]

Los bucles son estructuras de control que permiten repetir un bloque de código varias veces.

- **Bucle `while`**: Ejecuta el bloque mientras la condición sea verdadera.
  ```java
  int contador = 0;
  while (contador < 5) {
      System.out.println("Contador: " + contador);
      contador++;
  }
  ```

- **Bucle `do-while`**: Similar a `while`, pero garantiza que el cuerpo se ejecuta al menos una vez.
  ```java
  int numero = 1;
  do {
      System.out.println("Número: " + numero);
      numero *= 2;
  } while (numero < 50);
  ```

- **Bucle `for`**: Es útil cuando se conoce el número de iteraciones.
  ```java
  for (int i = 1; i <= 5; i++) {
      System.out.println("Iteración: " + i);
  }
  ```

- **Bucle `for-each`**: Itera sobre arrays o colecciones de una manera más simple.
  ```java
  String[] frutas = {"manzana", "banana", "cereza", "durazno"};
  for (String fruta : frutas) {
      System.out.println("Fruta: " + fruta);
  }
  ```

## Ejecución de Java[^6]

El proceso de ejecución de un programa Java consta de tres fases:

1. **Compilación del código fuente**: El código fuente (.java) se compila usando `javac` y se convierte en bytecode (.class).
2. **Carga del archivo .class**: La JVM carga el archivo .class, verificando que sea válido y seguro.
3. **Interpretación y ejecución**: La JVM transforma el bytecode en instrucciones ejecutables y lo ejecuta.

## Programa "Hola mundo"[^7]

El programa "Hola Mundo" es la introducción clásica a la programación, y enseña la estructura básica de Java:

```java
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("¡Hola, Mundo!");
    }
}
```

Todo programa Java necesita una clase principal y un método `main`, que es el punto de entrada para la ejecución.

## Entrada de datos[^8]

Para leer datos en Java, se suele utilizar la clase `Scanner`. Este permite leer tanto texto como números desde el teclado.

1. **Importar la clase**: `import java.util.Scanner;`
2. **Crear un objeto Scanner**:
   ```java
   Scanner sc = new Scanner(System.in);
   ```
3. **Leer datos**:
   - Para `String`: `String texto = sc.nextLine();`
   - Para `int`: `int numero = sc.nextInt();`
   - Para `double`: `double decimal = sc.nextDouble();`

Ejemplo completo:

```java
import java.util.Scanner;

public class EntradaJava2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese su nombre");
        String nombre = sc.nextLine();

        System.out.println("Bienvenido " + nombre + ". Por favor ingrese su edad");
        int edad = sc.nextInt();

        System.out.println("Gracias " + nombre + " en 10 años usted tendrá " + (edad + 10) + " años.");
    }
}
```

## Salida de datos[^9]

La salida de datos se realiza con `System.out`:

- **`print()`**: Imprime sin salto de línea.
- **`println()`**: Imprime con salto de línea.

Ejemplo:
```java
System.out.println("Hola, " + nombre);
```

## Importar y usar librerías[^10]

Las librerías permiten reutilizar código previamente creado, haciendo más eficiente y organizado nuestro proyecto.

**Ejemplo** de importación y uso de la librería `ArrayList`:

```java
import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ejemplo");
        System.out.println(lista);
    }
}
```

### Librerías personalizadas vs. estándar

Las librerías personalizadas ofrecen mayor flexibilidad pero requieren mayor mantenimiento y documentación. Las librerías estándar son más simples y suelen estar bien documentadas, siendo más fáciles de integrar en diferentes proyectos.

[^1]: Autoría: Víctor Gómez

[^2]: Autoría: Aitana 

[^3]: Autoría: Naomi Jiménez

[^4]: Autoría: Marta Sánchez

[^5]: Autoría: Samuel Jiménez

[^6]: Autoría: Luis Miguel Gomila Dominguez

[^7]: Autoría: Gonzalo Romero Bernal

[^8]: Autoría: Elvira Romero

[^9]: Autoría: Jesús Conde

[^10]: Autoría: Juan Manuel Gómez
