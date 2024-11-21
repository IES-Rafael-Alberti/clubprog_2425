# Apuntes básicos de Java

## El lenguaje Java[^1]

Es un lenguaje de programación, de alto nivel, orientado a objetos diseñado para ser multiplataforma y sus elementos fundamentales son:

**Variables**
    Contenedores de información.
    
**Clases y objetos**
    Definen comportamientos y atributos de eentidades.
    
**Métodos**
    Realizan tareas especificas dentro de una clase.
    
**Herencia**
    Propiedad que permite crear clases con propiedades de otras.
    
**Interfaces**
    Definen los métodos que debe implementar una clase.
    
**Paquetes**
    Organizan las clases en grupos relacionados.
    
### ¿Para qué se utiliza este lenguaje?

    Dessarrollo de videojuegos, computación en la nube, Big Data, Inteligencia Artificial, IoT.*
    
### Funcionamiento

    Java utiliza una arquitectura "write once, run anywhere" (WORA). El código fuente (.java) se compila a bytecode (.class), que luego se ejecuta en la Máquina Virtual de Java (JVM). Esto permite que el mismo código se ejecute en cualquier plataforma con JVM instalada23.
    
### ¿Cómo funciona Java?

Con lenguaje Java y API: comunicación entre el desarrollador y la plataforma Java en el frontend.
    
Con Java Virtual Machine: comunicación backend entre la plataforma Java y el hardware.
    

## Principales diferencias con Python[^2]
|  | Python | Java |
| -------- | -------- | -------- |
|   **Sintaxis**   | Más simple y concisa | Más complejo y verboso |
|   **Tipado**   | Dinámico | Estático |
|   **Compilación**   | Es interpretado | Es compilado |
|   **Rendimiento**   | Más lento  | Más rápido en tiempo de ejecución debido a su compilación previa |
|   **Orientación a objetos**   | Multiparadigma  | Completamente orientado a objetos |
|   **Menejo de errores**   | Se encuentran en tiempo de ejecución | Se encuentran en tiempo de compilación |
|   **Uso de memoria**   | Menos eficiente | Más eficiente |
|   **Curva de aprendizaje**   | Más fácil de aprender y usar | Más complejo |
|   **Aplicaciones**   | Ciencia de datos, inteligencia artificial y scripting | Aplicaciones empresariales y móviles |
|   **Indentación**   | Forma parte de la sintaxis  | Usa llaves y punto y coma para definir bloques de código |


## Variables y posibles valores básicos en Java[^3]
Las variables son en esencia contenedores de información, guardan información para que no la perdamos y podamos trabajar con ella. Un ejemplo de sintáxis es el siguiente

```java=
String nombre = "naomi";
```
En java tenemos varios tipos de datos con los que podemos trabajar, podriamos distinguirlos entre cadenas de texto, booleanos, numéricos, nulleable.

* Cadenas de texto
    * String: Son las cadenas de texto como las del ejemplo
    * Char: Es el tipo de dato de cada carácter de una cadena de texto
* Booleanos
    * Se encargan de verificar si algo es true o false, si algun dato con el que estás trabajando solo tiene dos posibles estados, los booleanos son tu clave

* Numéricos
Aquí hace falta aclarar que hay dos tipos de numéricos por así decirlo, los entero y los decimales.
    * Decimales:
        * Double
        * Float
        En esencia son lo mismo, solo que Double permite una         mayor representación de números
    * Enteros
        * byte: Utiliza 8 bits y puede almacenar valores entre -128 y 1271
        * short: Emplea 16 bits y puede representar valores en el rango de -32,768 a 32,7671

        * int: Usa 32 bits y es el tipo entero más común, con un rango de -2,147,483,648 a 2,147,483,6471

        * long: Es el tipo entero más grande, con 64 bits, y puede almacenar valores desde -9,223,372,036,854,775,808 hasta 9,223,372,036,854,775,807
        
* Nulleable
Null indica que un dato está vacío que no tiene nada, puede ser el causante de ciertos errores en java.

### Datos primordiales vs Clase

En java hay una diferencia entre poner int o Integer o entre string o String. La diferencia es que cuando lo pones en minúscula estás usando el dato primoridal

Cuando usas una clase tienes acceso a los método de la clase, de lo contrario no podrás usarlos.

```java=
Integer numero = 32;
int numero1 = 32;
```

## Condicionales[^4]

Permiten controlar el flujo de ejecución del programa según las condiciones.

**Tipos**

igualdad (==)
desigualdad (!=)
mayor que (>)
menor que (<)
mayor o igual que (>=)
menor o igual que (<=)

- IF
Se ejecuta si la condición es verdadera.
```java
int edad = 18;
if (edad >= 18) {
    System.out.println("Eres mayor de edad");
}
```
- IF ELSE
Se ejecuta un bloque si es verdadero u otro si es falso

```java
int numero = 7;
if (numero % 2 == 0) {
    System.out.println("El número es par");
} else {
    System.out.println("El número es impar");
}
```

- IF ELSE IF ELSE / SWITCH
 Evalúa múltiples condiciones
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

- Condicionales con operadores lógicos
AND (o el equivalente &) -> &&

OR (o el equivalente !) -> ||

NOT -> !

boolean x = true;
boolean y = false;
boolean andLogico = (x && y); // false
boolean orLogico = (x || y);  // true
boolean notLogico = !x;       // false

```java
int edad = 25;
boolean tieneLicencia = true;
if (edad >= 18 && tieneLicencia) {
    System.out.println("Puede conducir");
}
```

- Operador ternario
Forma abreviada de if-else (uso frecuente)

```java
int edad = 20;
String mensaje = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
System.out.println(mensaje);
```

## Bucles[^5]
Los bucles en java son estructuras de control que permiten repetir un bloque de código varias veces
Existen tres tipos de bucles en java:
Bucle while: ejecuta un bloque de código mientras una condición sea verdad.
```java
while (condición) {
    // código a ejecutar
}
```
ejemplo:
```java
int contador = 0;
while (contador < 5) {
    System.out.println("Contador: " + contador);
    contador++;
}
```

Bucle do-while: Similar al while, pero garantiza que el cuerpo se ejecute al menos una vez antes de evaluar la condición
```java
do {
    // código a ejecutar
} while (condición);
```
ejemplo:
```java
int numero = 1;
do {
    System.out.println("Número: " + numero);
    numero *= 2;
} while (numero < 50);
```
Bucle for: es útil cuando se conoce el número de iteraciones
```java
for (inicialización; condición; iteración) {
    // código a ejecutar
}
```
ejemplo:
```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Iteración: " + i);
}
```
Bucle for-each: es una variación del bucle for para iterar sobre arrays o colecciones
```java
for (Tipo elemento : colección) {
    // código a ejecutar con cada elemento
}
```
ejemplo:
```java
String[] frutas = {"manzana", "banana", "cereza", "durazno"};
for (String fruta : frutas) {
    System.out.println("Fruta: " + fruta);
}
```

## Ejecución de Java[^6]

El proceso de ejecución que sigue java cuando corremos un programa es el siguiente:
**1 Compilación del código fuente**: El código que estará escrito en formato .java, pasará a compilarse utilizando el compilador de javac, que convertirá este archivo en un formato .class para que la máquina virtual de java (JVM) se encargue de cargar este archivo generado.
**2 carga del archivo .class:** Como ya dije anteriormente, este archivo .class será cargado por la máquina virtual de Java (JVM) y verificará que este código sea válido y seguro, una vez vea que todo está correcto. Pasará a la última fase de ejecución.
**3 Interpretación y ejecución:** La máquina virtual de java interpreta el bytecode (.class) transformándolo así en el código fuente y ejecutando este mismo.
## Programa "Hola mundo"[^7]

*"El hola mundo no es más que un simple programa."*

**1 .- ¿Qué es el hola mundo en Java, y en qué nos beneficia a nosotros?**

El hola mundo puede ser para muchos su primer programa o sus primeras líneas de código, pero es mucho más que eso, es una introducción a la sintaxis básica y estructura del lenguaje, sirviendo como un punto de partida para posteriormente, aprender conceptos más avanzados de programación en Java

```Java
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("¡Hola, Mundo!");
    }
}
```

Este es el ejemplo más común de hola mundo dentro del lenguaje de Java. Todo programa en Java debe poseer una class principal, un método main, el cuál será el punto de entrada del programa y luego, este posee la estructura *"System.out.println"* que realiza la impresión a pantalla de la cadena de caractéres que hayamos introducido.


## Entrada de datos[^8]

La entrada de datos en Java se puede hacer de varias formas, pero la más común es a través del uso de *Scanner*

La función Scanner te permite leer tanto números como texto que introduzca el usuario por teclado. 

Para ello debemos:

**1.Importar la clase: import java.util.Scanner;**

**2. Crear un objeto Scanner:**


Un ejemplo sería: Scanner (nombre del objeto) = new Scanner(System.in);

**3. Leer datos**
    - Para String: String texto = sc.nextLine();
    - Para int: int numero = sc.nextInt();
    - Para double: double decimal = sc.nextDouble();
    
**Ejemplo completo**

```
import java.util.Scanner;

public class EntradaJava2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); //Se crea el lector

        System.out.println("Por favor ingrese su nombre");//Se pide un dato al usuario

        String nombre = sc.nextLine(); //Se lee el nombre con nextLine() que retorna un String con el dato

        System.out.println("Bienvenido " + nombre + ". Por favor ingrese su edad");//Se pide otro dato al usuario

        int edad = sc.nextInt(); //Se guarda la edad directamente con nextInt()

        //Nótese que ya no hubo necesidad de usar parseInt() pues nextInt nos retorna un entero derectamente

        System.out.println("Gracias " + nombre + " en 10 años usted tendrá " + (edad + 10) + " años."); //Operacion numerica con la edad
    }
}
```

## Salida de datos[^9]
La **salida de datos** es importante para comunicarse con el usuario, mostrar resultados y proporcionar información sobre el funcionamiento del programa.

**La salida de datos en java se realiza mediante la clase System y su atributo out.** seguido de println o print.

**Diferencias entre println y print:**
print(): Imprime sin salto de línea.
println(): Imprime con salto de línea.

![](https://codimd.cursoitb.xyz/uploads/upload_c0d010e4ee82e0ff3e9b4f9dd9dabac8.png)

**Para imprimir variables junto con texto, se utiliza la concatenación con el operador +:**
![](https://codimd.cursoitb.xyz/uploads/upload_1e8aff3a2ad4d3fa748af0de42693a73.png)

**Para imprimir concatenando operaciones numéricas, para evitar errores, se deben usar paréntesis:**

![](https://codimd.cursoitb.xyz/uploads/upload_d12a1d90ca10b1998cbe16dd2bed3912.png)





## Importar y usar librerías[^10]

El uso principal de las **librerías en Java** es de reutilizar códigos que ya existan previamente, evitando escribirlo de cero.

**Limpieza y organización**
Debido a lo anteriormente mencionado, podemos desarrollar nuestro código de una manera más limpia y eficiente, ahorrando un tiempo valioso, simplificando tu código y acelerando  el proceso de su creación.

**Importar una librería**
Pongamos un ejemplo de ello;


```import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ejemplo");
        System.out.println(lista);
    }
}
```
**Personalizada o estándar**
A la hora de personalizar una librería en Java podemos elegir entre una librería personalizada o estándar.
La diferencia principal entre ellas es la complejidad de las librerías personalizadas con las estándares.
1. Tiene una **mayor complejidad** en la configuración.
2. El mantenimiento debe ser propio del desarrollador, al contrario de el resto de librerías.
3. Al igual que el mantenimiento, la documentación debe ser producida por el propio desarrollador.
4. Si no se usa correctamente, una librería personalizada puede tener **problemas de compatibilidad** entre versiones de Java.
5. **No pueden ser usadas en cualquier proyecto**.





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