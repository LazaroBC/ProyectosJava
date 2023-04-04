/*
 * Escribe una función recursiva printArrayR(int[] array, int i) 
 * que recorra un array por ejemplo int[] array = {1, 2, 3, 4, 5} 
 * y lo imprima por pantalla.
 */
package m04uf2a1_4;

/**
 *
 * @author Lázaro Belloch Canet
 */ 

public class M04UF2A1_4 {
    
    // Definimos la función
    public static void printArrayR(int[] array, int i) {
        if (i < array.length) {
            System.out.print(array[i] + " ");
            printArrayR(array, i + 1);
        }
    }
    // Para que invierta el orden 
    public static void printArrayRI(int[] array, int i) {
        if (i < array.length) {
            printArrayRI(array, i + 1);
            System.out.print(array[i] + " ");
    }
        
    }
    // Esta función nos sirve también para imprimir el array a partir de una posición 
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        printArrayR(array, 0);
        System.out.println();
        printArrayR(array, 1);
        System.out.println();
        printArrayR(array, 4);
        System.out.println();
        // Orden inverso
        printArrayRI(array, 0);
        System.out.println();
        printArrayRI(array, 1);
        System.out.println();
        printArrayRI(array, 4);
        System.out.println();
    }
    
   
}




