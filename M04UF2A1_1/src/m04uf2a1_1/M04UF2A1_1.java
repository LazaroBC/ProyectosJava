/**
* Escribe una función a la que se le pase como parámetros de entrada una cantidad de días, horas y minutos. 
* La función calculará y devolverá el número de segundos que existen en los datos de entrada.
* 
*/

package m04uf2a1_1;

import java.util.Scanner;

/**
 *
 * @author Lázaro Belloch Canet
 */

public class M04UF2A1_1 {

    /**
     * @param args the command line arguments
     */
    
    // Defino la función que recibe tres parámetros 
    
    static int totalSegundos(int dias, int horas, int minutos) {
            // Formulo el cálculo de los segundos
            int seg;
            seg = (dias * 24 *60 *60) + (horas * 60 * 60) + (minutos * 60); 
            // La función devuelve un entero con los segundos calculados
            return seg;
       } 
    public static void main(String[] args) {
        int dias;
        int horas;
        int minutos;
        int total;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce los dias: ");
        dias = sc.nextInt();
        System.out.print("Introduce las horas: ");
        horas = sc.nextInt();
        System.out.print("Introduce los minutos: ");
        minutos = sc.nextInt();
        
        // Meto en una variable total el resultado de la función 
        // con los tres parámetros que pide el enunciado 
        total = totalSegundos(dias,horas,minutos);
        
        System.out.println("El total de segundos es: " + total);
        
    }
    // El prográma es muy mejorable ya que devuelve errores que habría que controlar
    // Como el hehco de que el usuario no introdujera un numero entero.
    // Lo dejo así por que ya he hecho eso en otros ejercicios y el enunciado realmente pide solo la función.
}
