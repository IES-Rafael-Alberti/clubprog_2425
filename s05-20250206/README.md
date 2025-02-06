# Resolución del problrma de rotación de matrices

Partiendo de una matrix 2D de dimensiones mxn y un número entero positivo r, debemos rotar la matriz r veces para conseguir la matriz resultado.

La rotación debe ser en sentido antihorario. En una rotación, cada elemento tiene que desplazarse un solo paso.

Se garantiza que el mínimo de m y n es un número par.

Ejemplo de rotación de una matriz 4x4, 2 veces:

    Matriz        Primera         Segunda
     1 2 3 4       2  3  4  5      3  4  5  6
    12 1 2 5  ->   1  2  3  6 ->   2  3  4  7
    11 4 3 6      12  1  4  7      1  2  1  8
    10 9 8 7      11 10  9  8     12 11 10  9

La entrada de datos será:  
m n r  
x x x ... x  
...  
...  
x x x ... x  

Ejemplo para la matriz anterior:  
4 4 2  
1 2 3 4  
12 1 2 5  
11 4 3 6  
10 9 8 7  

