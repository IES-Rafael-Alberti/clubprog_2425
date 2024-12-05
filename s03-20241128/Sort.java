import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import javafx.scene.paint.Color;

import java.util.Arrays;
import java.util.Random;
import java.awt.Graphics2D;

public class Sort {

    public static void main(String[] args) {
        // Generar arrays aleatorios de tamaños 10, 100, 1000 y 10000
        int[] sizes = {
            10, 20, 50, 100, 200, 500, 1000, 2000, 5000, 10000,
            20000, 50000, 100000, 200000, 500000, 1000000, 2000000,
            5000000, 10000000, 20000000, 50000000, 100000000
        };
        for (int size : sizes) {
            int[] arr = generarArrayAleatorio(size);
            long tiempoInicio = System.nanoTime();
            //Ordenar el array
            //TODO
            ordenar(arr);
            
            long tiempoFin = System.nanoTime();
            System.out.println("Tamaño: " + size + ", Tiempo: " + (tiempoFin - tiempoInicio) / 1e9);
        }

        // Crear gráfica y guardar como imagen
        double[] tiempos = new double[sizes.length];
        double[] sizesArray = new double[sizes.length];
        for (int i = 0; i < sizes.length; i++) {
            int size = sizes[i];
            int[] arr = generarArrayAleatorio(size);
            long tiempoInicio = System.nanoTime();
            mergeSort(arr);
            long tiempoFin = System.nanoTime();
            tiempos[i] = (tiempoFin - tiempoInicio) / 1e9;
            sizesArray[i] = size;
        }

        // Configurar el lienzo para dibujar la gráfica
        int width = 800;
        int height = 600;
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        java.awt.Graphics2D g2d = img.createGraphics();

        // Dibujar fondo blanco
        g2d.setColor(java.awt.Color.WHITE);
        g2d.fillRect(0, 0, width, height);

        // Dibujar ejes
        g2d.setColor(java.awt.Color.BLACK);
        g2d.drawLine(50, 50, 50, height - 50);
        g2d.drawLine(50, height - 50, width - 50, height - 50);

        // Escalar los datos para ajustar al lienzo
        double maxX = sizes[sizes.length - 1];
        double maxY = Arrays.stream(tiempos).max().orElse(0);

        double scaleX = (width - 100) / maxX;
        double scaleY = (height - 100) / maxY;

        // Dibujar puntos y conectarlos con líneas
        for (int i = 0; i < sizes.length; i++) {
            int x = (int) (50 + sizesArray[i] * scaleX);
            int y = (int) (height - 50 - tiempos[i] * scaleY);

            // Dibujar punto
            g2d.fillOval(x - 2, y - 2, 4, 4);

            // Etiqueta para el tamaño del array
            g2d.drawString(String.valueOf(sizesArray[i]), x, height - 30);

            // Conectar con el punto anterior si no es el primero
            if (i > 0) {
                int prevX = (int) (50 + sizesArray[i - 1] * scaleX);
                int prevY = (int) (height - 50 - tiempos[i - 1] * scaleY);
                g2d.drawLine(prevX, prevY, x, y);
            }
        }
        // Guardar la imagen en un archivo PNG
        try {
            ImageIO.write(img, "png", new File("sort_graph.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int[] generarArrayAleatorio(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(1000);
        }
        return arr;
    }

    public static void ordenar(int[] arr){
	//TODO
    }

}