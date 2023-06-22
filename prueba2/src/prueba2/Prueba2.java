/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba2;

/**
 *
 * @author lazar
 */
import java.io.*;
public class Prueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Introduce el nombre del archivo a modificar: ");
            String nombreArchivo = br.readLine();

            File archivoOriginal = new File(nombreArchivo);
            String nombreNuevo = "copia_" + nombreArchivo;

            // Crear un archivo nuevo con el nombre especificado
            File archivoNuevo = new File(archivoOriginal.getParent(), nombreNuevo);
            try (BufferedReader brArchivo = new BufferedReader(new FileReader(archivoOriginal));
                 BufferedWriter bwArchivo = new BufferedWriter(new FileWriter(archivoNuevo))) {

                // Leer y escribir el contenido del archivo original en el nuevo archivo
                String linea;
                while ((linea = brArchivo.readLine()) != null) {
                    bwArchivo.write(linea);
                    bwArchivo.newLine();
                }
                System.out.println("Se ha creado una copia del archivo con éxito.");
            } catch (IOException e) {
                System.out.println("Error al crear la copia del archivo.");
                e.printStackTrace();
            }
        } catch (IOException e) {
            System.out.println("Error al leer el nombre del archivo.");
            e.printStackTrace();
        }
    }
    
}
