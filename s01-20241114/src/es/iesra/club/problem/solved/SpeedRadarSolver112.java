package es.iesra.club.problem.solved;

import es.iesra.club.problem.solver.ProblemSolver;
import java.io.*;
import java.util.*;

/**
 * id: 112
 * Clase concreta que resuelve el problema de los radares de tramo.
 * Extiende la clase abstracta ProblemSolver.
 */
public class SpeedRadarSolver112 extends ProblemSolver {


    @Override
    protected List<String> process(List<String> inputLines) {
        List<String> output = new ArrayList<>();

        if (inputLines.isEmpty()) {
            return output;
        }

        int numLines = 0; // Número de líneas procesadas. Primera línea es 0
        String line = inputLines.get(numLines); // Primera línea


        while (!line.equals("0 0 0") && numLines < inputLines.size()) {

            String[] parts = line.split(" "); // Divide la línea en tres partes

            int distance = Integer.parseInt(parts[0]);
            int speedLimit = Integer.parseInt(parts[1]);
            int timeInSeconds = Integer.parseInt(parts[2]);

            // Comprueba que los valores sean válidos
            if (distance < 0 || speedLimit < 0 || timeInSeconds < 0) {
                output.add("ERROR");
            } else {

                // Calcula la velocidad media en km/h. Se realiza, de la siguiente forma:
                // 1. Se divide la distancia en metros, entre 1000 para obtener los kilómetros.
                // 2. Se divide el tiempo en segundos entre 3600 para obtener las horas.
                // 3. Se divide la distancia en kilómetros entre el tiempo en horas.

                double averageSpeed = (distance / 1000.0) / (timeInSeconds / 3600.0);

                if (averageSpeed <= speedLimit) {
                    output.add("OK");
                } else if (averageSpeed < speedLimit * 1.2) {
                    output.add("MULTA");
                } else {
                    output.add("PUNTOS");
                }

            }

            // Siguiente línea
            numLines++;
            line = inputLines.get(numLines);
        }

        return output;
    }

    public static void main(String[] args) {

        // TODO: Cambiar el id del problema
        String problemaId = "112";

        String inputFile = "./data/entrada" + problemaId;
        String outputFile = "./data/salida" + problemaId;

        if (args.length != 2) {
            System.out.println("Uso: java problem.solved.SpeedRadarSolver <inputFile> <outputFile>");
            System.out.println("Por defecto se usará:");
            System.out.println("  - inputFile: " + inputFile);
            System.out.println("  - outputFile: " + outputFile);
            System.out.println("---\n");
        }
        else {
            inputFile = args[0];
            outputFile = args[1];
        }

        SpeedRadarSolver112 solver = new SpeedRadarSolver112();

        try {
            solver.execute(inputFile, outputFile);
        } catch (IOException e) {
            System.err.println("Error al procesar los archivos: " + e.getMessage());
        }
    }
}
