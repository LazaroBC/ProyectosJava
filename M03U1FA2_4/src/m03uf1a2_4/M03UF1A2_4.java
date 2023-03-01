/*
 * Código que Solicita al usuario un número n 
* y dibuja un triángulo de base y altura n
 */

package m03uf1a2_4;

/**
 *
 * @author Lázaro Belloch Canet
 */
import java.util.Scanner;

public class M03UF1A2_4 {

    public static void main(String[] args) {
        
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);
        
        // Solicitar por consola que el usuario ingrese un número
        System.out.print("Ingrese un número entero positivo: ");
        int n = input.nextInt();
        
        // Imprimir el triángulo
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}