# Arrays y vectores en Java

## 1. Definición de un array en Java[^1]

Un array es una estructura de datos que permite almacenar múltiples valores del mismo tipo en una sola variable. Los arrays tienen un tamaño fijo que se declara al momento de su creación y no puede cambiar durante la ejecución del programa. Esto los hace muy útiles cuando necesitamos manejar datos homogéneos de manera eficiente.

**Declaración y inicialización de un array**:

Podemos declarar e inicializar un array al mismo tiempo:

```java
int[] numeros = {1, 2, 3, 4, 5};
```

También podemos declararlo primero y luego asignar los valores:

```java
int[] numeros = new int[5];

numeros[0] = 1;
numeros[1] = 2;
```

Como vemos, declaramos un array de enteros llamado `numeros` con un tamaño de 5. Luego asignamos un valor a cada posición.

### Ejemplo más completo:

```java
int[] edades = new int[3];
edades[0] = 25;
edades[1] = 30;
edades[2] = 22;
System.out.println("Primera edad: " + edades[0]); // Imprime 25
```

En este ejemplo, se muestra cómo inicializar cada posición del array de manera individual y acceder a los elementos almacenados.


## 2. Acceso y modificación de elementos en un array[^2]

Podemos acceder a los elementos de un array utilizando su índice. Recuerda que los índices en Java empiezan en 0, es decir, el primer elemento está en la posición `0`.

**Acceso a un elemento**:

```java
int[] array = {1, 2, 3};
System.out.println(array[0]); // Imprime 1
```

**Modificación de un valor existente**:

Para modificar un valor, debemos asignar un nuevo valor al índice correspondiente:

```java
int[] numeros = {1, 2, 3, 4, 5}; 
numeros[2] = 10;
System.out.println(Arrays.toString(numeros)); // Imprime [1, 2, 10, 4, 5]
```

### Métodos útiles de la clase Arrays:

- **fill()**: Llena un array con un valor específico.
- **copyOf()**: Crea una copia del array con una nueva longitud.
- **sort()**: Ordena el array en orden ascendente.

Estos métodos **modifican el array original** y permiten manipular fácilmente los elementos.


## 3. Tamaño fijo de los arrays[^3]

Los arrays en Java tienen un tamaño fijo debido a varias razones:

1. **Eficiencia en la gestión de memoria**: El tamaño fijo permite a Java asignar un bloque contiguo de memoria para el array, facilitando un acceso rápido y eficiente.
2. **Seguridad en tiempo de ejecución**: Evita desbordamientos y errores de acceso fuera de los límites del array.
3. **Optimización del rendimiento**: Conocer el tamaño exacto permite a la máquina virtual de Java realizar optimizaciones específicas.
4. **Simplicidad**: Un tamaño fijo simplifica la gestión interna y manipulación de los arrays en el código.

### Ejemplo de intento de acceder a un índice fuera del rango:

```java
int[] numeros = new int[5];
numeros[0] = 10;
numeros[1] = 20;
// numeros[5] = 60; // Esto causaría un ArrayIndexOutOfBoundsException
```

Para modificar el tamaño del array, debemos crear uno nuevo y copiar los elementos anteriores:

```java
int[] nuevoArray = new int[6];
System.arraycopy(numeros, 0, nuevoArray, 0, numeros.length);
nuevoArray[5] = 60;
```


## 4. Recorrido de arrays usando bucles[^4]

**Uso de un bucle `for`**: Permite recorrer cada elemento del array de forma precisa.

```java
int[] numeros = {5, 10, 15, 20, 25};
for (int i = 0; i < numeros.length; i++) {
    System.out.println("Índice " + i + ": Valor = " + numeros[i]);
}
```

Podemos usar un bucle `for` inverso para recorrer el array desde el final:

```java
for (int i = numeros.length - 1; i >= 0; i--) {
    System.out.println("Valor inverso: " + numeros[i]);
}
```

**Bucle `for-each`**: Se usa cuando necesitamos iterar sobre todos los elementos sin preocuparnos por el índice.

```java
int[] numeros = {10, 20, 30, 40, 50};
for (int numero : numeros) {
    System.out.println("Número: " + numero);
}
```


## 5. Uso común de arrays[^5]

### Situaciones comunes:

- **Almacenamiento de datos**: Como lista de calificaciones, nombres de usuarios, precios de productos, etc.
- **Iteración**: Permiten realizar operaciones sobre cada elemento con bucles.
- **Ordenamiento**: Son útiles para implementar algoritmos de ordenamiento como el método burbuja.
- **Matrices multidimensionales**: Permiten representar matrices o tablas de datos.

### Ventajas:

- **Acceso rápido**: Acceso directo mediante índice, lo cual es muy eficiente.
- **Uso eficiente de memoria**: Utilizan bloques de memoria contiguos, lo cual es más eficiente.
- **Simplicidad**: Fáciles de implementar para almacenar datos homogéneos.

### Limitaciones:

- **Tamaño fijo**: Debemos conocer el número de elementos por adelantado.
- **Redimensionamiento**: No se puede cambiar su tamaño directamente, se requiere crear un nuevo array.
- **Falta de métodos avanzados**: No incluyen métodos avanzados para manipulación.


## 6. Vectores en Java[^6]

Los **vectores** son una estructura de datos dinámica que permite cambiar de tamaño durante la ejecución. 

### Diferencias con arrays:

|               | Arrays                                   | Vectores                     |
| ------------- | ---------------------------------------- | ---------------------------- |
| Tamaño        | Tamaño fijo                              | Tamaño dinámico              |
| Sincronización| No están sincronizados                   | Están sincronizados por defecto (thread-safe) |
| Rendimiento   | Mejor rendimiento por tamaño fijo        | Menor rendimiento debido a la sincronización |
| Métodos       | Limitados                                | Métodos avanzados como `add()`, `remove()`    |

### Ejemplo de un vector:

```java
import java.util.Vector;

public class EjemploVector {
    public static void main(String[] args) {
        // Creación de un vector
        Vector<String> frutas = new Vector<>();

        // Añadir elementos
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");

        // Modificar un elemento
        frutas.set(1, "Pera");

        // Eliminar un elemento
        frutas.remove("Naranja");

        // Mostrar el tamaño
        System.out.println("Tamaño del vector: " + frutas.size());
    }
}
```


## 7. Operaciones dinámicas en vectores[^7]

Las operaciones dinámicas permiten modificar el tamaño del vector en tiempo de ejecución.

Para **añadir** elementos:

```java
Vector<Integer> listaEnteros = new Vector<>();
listaEnteros.addElement(1); // Añade un elemento al final
listaEnteros.add(2);
listaEnteros.add(0, 10); // Añade un elemento en la posición 0
```

Para **eliminar** elementos:

```java
listaEnteros.remove(0); // Elimina el elemento en el índice 0
listaEnteros.removeElementAt(0);
```

Ambas opciones (`remove()` y `removeElementAt()`) son válidas para eliminar elementos.


## 8. Métodos útiles de la clase `Vector`[^8]

- **`size()`**: Devuelve el número de elementos presentes en el vector.
  
  ```java
  Vector<String> frutas = new Vector<>();
  frutas.add("Manzana");
  System.out.println(frutas.size()); // Imprime 1
  ```
- **`get(int index)`**: Devuelve el elemento en la posición especificada.
  
  ```java
  String fruta = frutas.get(0); // Obtiene "Manzana"
  ```
- **`set(int index, E element)`**: Reemplaza el elemento en el índice especificado.
  
  ```java
  frutas.set(0, "Pera"); // Cambia "Manzana" por "Pera"
  ```
- **`remove(int index)`**: Elimina el elemento en la posición especificada.
  
  ```java
  frutas.remove(0); // Elimina "Pera"
  ```

### Diferencia entre `capacity` y `size`
- **`capacity`**: Es la cantidad de espacio reservado para almacenar elementos (es decir, cuántos elementos puede almacenar antes de necesitar redimensionar).
- **`size`**: Es el número actual de elementos en el vector.

```java
Vector<Integer> numeros = new Vector<>(10); // Capacidad inicial de 10
System.out.println("Capacidad: " + numeros.capacity()); // Imprime 10
numeros.add(1);
System.out.println("Tamaño: " + numeros.size()); // Imprime 1
```

## 9. Cálculos comunes con arrays[^9]

- **Suma de todos los elementos**:
  
  ```java
  int[] numeros = {1, 2, 3, 4, 5};
  int suma = 0;
  for (int num : numeros) {
      suma += num;
  }
  System.out.println("Suma: " + suma); // Imprime 15
  ```

- **Calcular el promedio**:
  
  ```java
  double promedio = (double) suma / numeros.length;
  System.out.println("Promedio: " + promedio); // Imprime 3.0
  ```


## 10. Comparación entre arrays y vectores[^10]

### Diferencias clave:
- **Tamaño**: Los arrays tienen un tamaño fijo, mientras que los vectores son dinámicos.
- **Rendimiento**: Los arrays suelen ser más rápidos debido a la falta de sincronización.
- **Sincronización**: Los vectores están sincronizados, lo cual los hace aptos para aplicaciones con múltiples hilos (thread-safe).
- **Métodos**: Los vectores proporcionan más métodos integrados para facilitar la manipulación.

### Cuándo usar cada uno:
- **Arrays**: Cuando conocemos el tamaño de antemano y necesitamos eficiencia en memoria y velocidad.
- **Vectores**: Cuando necesitamos una estructura dinámica que pueda crecer y disminuir durante la ejecución, especialmente en entornos multihilo.


[^1]: Autoría: Luis Miguel Gomila Dominguez

[^2]: Autoría: Gonzalo Romero Bernal

[^3]: Autoría: Samuel Jiménez

[^4]: Autoría: Marta Sánchez

[^5]: Autoría: Víctor Gómez

[^6]: Autoría: Aitana

[^7]: Autoría: Naomi Jiménez Cerpa

[^8]: Autoría: GPT-4o

[^9]: Autoría: GPT-4o

[^10]: Autoría: GPT-4o