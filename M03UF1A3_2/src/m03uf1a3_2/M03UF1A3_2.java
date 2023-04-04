/*
 * Código para ordenar las palabras de una frase por orden alfabético
 */
package m03uf1a3_2;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Lázaro Belloch Canet
 */
public class M03UF1A3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();
        // Pasamos las palabras a minúsculas ya que Arrays.sort primero coloca ordenadas palabras que empiezan en mayúsculas
        frase = frase.toLowerCase();
        // Creamos un array o matriz con la frase de manera que utiliza el espacio para crear cada uno de los elementos del arreglo.
        String[] palabras =frase.split(" ");
        // Ordenamos el array
        Arrays.sort(palabras);
        // Recorremos el array con for e imprimimos cada uno de los elementos
        for (String palabra : palabras)
        System.out.println(palabra);
    }   
}
