package m04uf2a1_2;

/**
 * Implementa la función divisoresPrimos() que muestra, por consola, 
 * todos los divisores primos del número que se le pasa como parámetro. 
 * Además deberás utilizar la función static boolean esPrimo(int n)a la que se le pasará como parámetro un número 
 * y devolverá un booleano en función de si n es primo o no.
 */

import java.util.Scanner;

public class M04UF2A1_2 {

    // Implementé esta  una formula que encontré en:
    //https://es.stackoverflow.com/questions/34895/determinar-si-el-n%C3%BAmero-es-primo
    // Que entiendo lo que hace pero luego no me devuelve correctamente el valor 2 
    // en caso de que el valor a comprobrar sea 12
    static boolean esPrimo(int n) {
        /*
        //revisa si n es multiplo de 2
        if (n%2==0) return false;
        //si no, solo revisa los impares
        for(int i=3;i*i<=n;i+=2) {
        if(n%i==0)
            return false;
        }
        return true;
    }*/
        
        // Sin embargo econtré esta aquí, cambiando un detalle que alguien comentaba que era más eficiente:
        // https://stackoverflow.com/questions/26247466/java-prime-number-method
        // Aunque no entiendo muy bien lo que hace funciona correctamente
    
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
        }
    
    
    static void divisoresPrimos(int n) {
        System.out.println("Los divisores primos de " + n + " son:");
        /* Itera desde el número 2 hasta el número `n`. En cada iteración, se verifica si el número actual es divisible por i 
        * y si i es un número primo, aprovechando la función esPrimo(). Si ambas condiciones se cumplen, se imprime el valor de `i` en la consola.
        */
        for (int i = 2; i <= n; i++) {
            if (n % i == 0 && esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        numero = sc.nextInt();
        boolean primo;
        divisoresPrimos(numero);
        primo = esPrimo(numero);
        System.out.println("¿El número " + numero + " es primo? " + primo);
        
    }
}
    
