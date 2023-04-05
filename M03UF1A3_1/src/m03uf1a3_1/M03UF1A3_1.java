/*
 * Programa que divide una palabra en secuencias de dos letras
 */
package m03uf1a3_1;

/**
 *
 * @author Lázaro Belloch Canet
 * 
 */

import java.util.Scanner;

public class M03UF1A3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese una palabra: ");
            String palabra = sc.nextLine();
            int n = 0;
            while (n <= 0 || n > palabra.length()){
            System.out.print("Ingrese el tamaño de las secuencias: ");
            n = sc.nextInt();
            }

            // Con este bucle mientras que la palabra sea mayor que cero
            // en la variable linea introducimos la secuencia recortada de la plabra
            // de manera que desde el index 0 del string palabra por medio de la función min de la clase MATH
            // lo que hace esta función es capturar los n valores del tamaño de la variable palabra.
            // Introducimos en la variable palabra el valor del resultado de la funcion substring con los valores del tamaño de linea
            // Esta función lo que hace es recortar el string dado con el valor que le indicamos.
            // Finalmente imprime la variable linea que es donde hemos almacenado temporalmente el valor recortado en la función min
            
            while (palabra.length() > 0) {
                String linea = palabra.substring(0, Math.min(n, palabra.length()));
                palabra = palabra.substring(linea.length());
                
            // Para proteger en caso de que el último valor de n no lo tomará correctamente se podria introducir la siguiente condición
                if (palabra.length() < n) {
                    n = palabra.length();
                }
                System.out.println(linea);
            
            }
        }

        // Pedimos la palabra con la que vamos a trabajar 
        // y la secuencia con la que vamos a recortar la palabra
        
        // He probado el programa tanto en Visual Studio como en NetBeans y el error que se menciona que hay que corregir no se produce. 
        // Cuando hago el debug de Visua Studio, por ejemplo con la palabra "rem" y con el valor 2 la secuencia,
        // el último valor que se almacen en la variable linea en la es m, por lo tanto deduzco que la función min ya lleva implicita la corrección  del error.
        // No obstante, si introducimos un valor negativo en el valor de la secuencia, sí se produce un error en tiempo de ejecución
        // Corrijo ese problema por si sirve para la parte B) del ejercicio,  añado tambien la proteción a que sea igual a 0 o que la secuencia
        // n sea mayor que el tamaño de la palabra, ya que aunque no da error en estos dos casos sí lo creo conveniente.

    }   
}
