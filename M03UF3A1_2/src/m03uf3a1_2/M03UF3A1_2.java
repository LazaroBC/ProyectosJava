/*
 * Código que lee un fichero, le cambia el nombre al fichero 
 * y lo escribe en el mismo directorio 
*/
package m03uf3a1_2;

/**
 *
 * @author Lázaro Belloch Canet
 */
import java.io.*;
import java.util.Scanner;

public class M03UF3A1_2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // 
        Scanner sc = new Scanner(System.in);
        String ruta;
        System.out.print("Introducir la ruta completa del archivo a descodificar: "); //ruta a introducir con Visual Studio Code [ M03UF3A1_2\archivos\frase_codificada.dat ]
                                                                                        //ruta a introducir con NetBeans [ archivos\frase_codificada.dat ]
        ruta = sc.next();
        File archivoOriginal = new File(ruta);
        // Verifica si el archivo a modificar existe
        if (!archivoOriginal.exists()) {
            System.out.println("El archivo original no existe.");
            return;
        }
        String nombreNuevo;
        System.out.print("Introducir el nombre que quieres para tu archivo descodificado: ");
        nombreNuevo =  sc.next();
        // Crear un archivo nuevo con el nombre especificado y si el nombre del archivo ya existe avisa y termina la ejecución del programa
        File archivoNuevo = new File(archivoOriginal.getParent(), nombreNuevo);
        if (archivoNuevo.exists()) {
            System.out.println("El archivo nuevo ya existe.");
            return;
        }
        // Si todo ha salido bien y ha llegado hasta aquí 
        try (BufferedReader br = new BufferedReader(new FileReader(archivoOriginal)); // Crea un objeto con el BufferedReader con el método  FileReader() 
                                                                                      // encargado de leer el contenido del archivo original
             BufferedWriter bw = new BufferedWriter(new FileWriter(archivoNuevo))) {  // Crea un objeto BufferedWriter con el método  FileWriter() 
                                                                                      // Este archivo de momento está vacio
                                                                                      // En caso de que en vez de crear un archivo nuevo quisieramos renombrarlo
                                                                                      // usariamos el método renameTO()

            // Crea un archivo nuevo leyendo el archivo original linea por linea y escribiendolo en el archivo nuevo 
            // asegurandonos de que cada linea la cuarde un una linea nueva
            // Con esto conseguimos conservar el archivo original
            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }
            System.out.println("El archivo nuevo ha sido creado correctamente.");
            // En caso de que ocurra algo más (carpeta protegida contra escritura, por ejemplo) y no se pueda guardar el archivo notificará el error.
        } catch (IOException e) {
            System.out.println("Error al crear el archivo nuevo.");
            e.printStackTrace();
        }
    
    }
    
}
