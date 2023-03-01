/*
 * Código que calcula la letra del DNI
 */
package m03uf1a2_6;

/**
 *
 * @author Lázaro Belloch Canet
 */

import java.util.Scanner;

public class M03UF1A2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);
        
        // Solicitar por consola que el usuario ingrese uel número del DNI
        System.out.print("Ingrese uel número de DNI: ");
        int dni = input.nextInt();
        
        // Calcula la letra
        char letra = calcularLetra(dni);
        System.out.println("El DNI completo es: " + dni + letra);
    }
    
    public static char calcularLetra(int dni) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int resto = dni % 23;
        return letras[resto];
    }
}
