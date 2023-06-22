/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

/**
 *
 * @author lazar
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int arrayNumeros[] = {1, 3, 10, 5, 50, 43, 22, 17, 16};
        int contadorPrimos = 0;

        for (int i = 0; i < arrayNumeros.length; i++) {
            if (esPrimo(arrayNumeros[i])) {
                contadorPrimos++;
            }
        }

        System.out.println("El total de números primos en el array es: " + contadorPrimos);
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
    
}
