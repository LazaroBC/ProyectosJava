/*
 * Escribe el método int leerEntero() que pide un entero por consola, lo lee del
 * teclado y lo devuelve. Si la cadena introducida por consola no tiene el formato
 * correcto (es un carácter, decimal, etc.), muestra un mensaje de error y vuelve apedirlo.
*/
package m03uf3a1_1;

/**
 *
 * @author Lázaro Belloch Canet
 */

import java.util.InputMismatchException;
import java.util.Scanner;


public class M03UF3A1_1 {

    /**
     * @param args the command line arguments
     */
    
    public static int leerEntero() {
        boolean activo = true; // Lo definimos como true para que entre en el bucle y empiece a preguntar
        int num = 0;
        Scanner sc = new Scanner(System.in);
        while (activo) { // Mientras la variable activo sea cierta ejecutará la siguiente parte
            System.out.print("Introduce un número entero: ");
            try { // Comprueba que activo es true, pide un número por consola 
                  // y cambia a false para que continue a ejecución y pase a return 
                num = sc.nextInt(); 
                activo = false;
            } catch (InputMismatchException ex) { // En caso de que el valor introducido no sea un entero,
                                                  // al tener la variable num definida como entero saltará una excepción 
                                                  // en cuyo caso imprimira el mensaje de error y posteriormente limpiará la entrada de sc
                                                  // al no modificar la variable activo esta seguirá siendo true y continuará ejecutando el bucle while
                System.out.println("Error: Debes introducir un número entero válido.");
                sc.nextLine(); 
            }
        }
        return num;
    }
    public static void main(String[] args) {
        // 
        int num = leerEntero();
        System.out.println("Has introducido el número: " + num);
    }
    // No obstante se puede mejorar, ya que si introducimos un número entero muy largo por ejemplo "12345678901234567"
    // nos dará un error a pesar de que es entero ya que las variables int admiten 4 bytes
    // si definimos la variable como long ampliariamos el rango de enteros a admitir
    // Lo dejo en int por que el ejercicio pide explicitamente que el metodo debe llamarse int leerEntero()
}
