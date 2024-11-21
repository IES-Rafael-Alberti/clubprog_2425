package es.iesra.club.problem.solver;

import java.io.*;
import java.util.*;

/**
 * Clase abstracta para resolver problemas de procesamiento basados en lectura y escritura de archivos.
 * Proporciona métodos genéricos para lectura, escritura y ejecución.
 * <p>
 * IMPORTANTE: Esta clase no debe ser modificada.
 * Las subclases deben implementar el método process() para resolver problemas específicos.
 * <p>
 * Aunque se ha implementado esta clase, la pagina AceptaElReto nos da varios esqueletos de código para resolver problemas:
 * <a href="https://aceptaelreto.com/doc/templates.php">plantillas de acepta el reto</a>   (Java)
 *
 */
public abstract class ProblemSolver {

    /**
     * Lee un archivo de entrada y devuelve su contenido como una lista de líneas.
     * @param inputFilePath Ruta del archivo de entrada.
     * @return Lista de líneas leídas del archivo.
     * @throws IOException Si ocurre un error al leer el archivo.
     */
    protected List<String> readInput(String inputFilePath) throws IOException {
        System.out.println("Leyendo datos...");
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }

    /**
     * Escribe una lista de líneas en un archivo de salida.
     * @param outputFilePath Ruta del archivo de salida.
     * @param outputLines Lista de líneas a escribir.
     * @throws IOException Si ocurre un error al escribir el archivo.
     */
    protected void writeOutput(String outputFilePath, List<String> outputLines) throws IOException {
        System.out.println("Escribiendo resultados...");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            for (String line : outputLines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }

    /**
     * Método principal que ejecuta el flujo de procesamiento del problema.
     * @param inputFile Ruta del archivo de entrada.
     * @param outputFile Ruta del archivo de salida.
     * @throws IOException Si ocurre un error al manejar los archivos.
     */
    public void execute(String inputFile, String outputFile) throws IOException {
        List<String> inputLines = readInput(inputFile);
        System.out.println("Procesando datos...");
        List<String> outputLines = process(inputLines);
        writeOutput(outputFile, outputLines);
    }

    /**
     * Método abstracto que procesa los datos de entrada y genera la salida.
     * Este método debe ser implementado por las subclases.
     * @param inputLines Lista de líneas de entrada.
     * @return Lista de líneas procesadas como salida.
     */
    protected abstract List<String> process(List<String> inputLines);
}
