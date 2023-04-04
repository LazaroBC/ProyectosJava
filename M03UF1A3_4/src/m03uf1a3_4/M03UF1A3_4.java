/*
 * Escribir una aplicación que solicite al usuario cuántos números desea introducir. A
 * continuación, introducir por teclado esa cantidad de números enteros, y por último
 * indicar el valor máximo, el total de ceros y la media. (3 puntos)
 */
package m03uf1a3_4;

/**
 *
 * @author  Lázaro Belloch Canet
 */
import java.util.Scanner;

public class M03UF1A3_4 {

        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Validamos que el valor que se introduce está dentro del rango permitido
        int valida = -1;
        int cantidad = 1;
        while (valida <=0 ) {
            // Define la cantidad de números a introducir
        System.out.print ("Introduzca la cantidad de números enteros (mínimo 1: ");
        cantidad = sc.nextInt();
            if (cantidad > 0) {
                valida = cantidad;
            }
        }
        // Definimos las variables necesarias.
        int maximo = Integer.MIN_VALUE;
        int ceros = 0;
        int suma = 0;
        int[] numeros = new int[cantidad]; 
        // cargamos el array con los números que nos proporciona el usuario
        // y realizamos los cálculos que nos pide el enunciado
        for (int i = 0; i < numeros.length; i++) {
            System.out.print ("Introduzca el número " + (i+1) + " : ");
            numeros[i] = sc.nextInt();
            // Esta condición mete en la variable maximo 
            // el numero que esta en la posicion numeros[i] 
            // si este es mayor que maximo
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            // Contamos los ceros que hay
            if (numeros[i] == 0) {
                ceros++;
            }
            // Realizamos la suma
            suma = suma + numeros[i];
        }
        // Mostramos los números si el usuario quiere
        System.out.println("Quieres comprobar los valores (S): ");
        char quiere = sc.next().charAt(0); 
        if (quiere == 'S' ){
        for (int i = 0; i < cantidad; i++) {
            System.out.println(numeros[i]);
        } 
        }
        System.out.println("Valor máximo: " + maximo);
        System.out.println("Total de ceros: " + ceros);
        double media = (double) suma / cantidad;
        System.out.println("Media: " + media);
    }
    
}
