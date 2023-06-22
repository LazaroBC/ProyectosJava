/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication29;

/**
 *
 * @author lazar
 */
import java.io.*;
public class JavaApplication29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       File archivoOriginal = new File("archivos\frase_codificada.dat");
        String nombreNuevo = "descodificado.txt";

        // Crear un archivo nuevo con el nombre especificado
        File archivoNuevo = new File(archivoOriginal.getParent(), nombreNuevo);
        try (BufferedReader br = new BufferedReader(new FileReader(archivoOriginal));
             BufferedWriter bw = new BufferedWriter(new FileWriter(archivoNuevo))) {

            // Leer y escribir el contenido del archivo original en el nuevo archivo
            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }
            System.out.println("El archivo nuevo ha sido creado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo nuevo.");
            e.printStackTrace();
        }

    }
    
}
