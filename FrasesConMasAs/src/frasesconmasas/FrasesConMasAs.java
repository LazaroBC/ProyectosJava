/*
 * Realiza un programa llamado FrasesConMasAs que vaya leyendo las
 * frases que entran por teclado, y que muestre cual es la frase que se ha escrito hasta el
 * momento con mas letras ‘a’ (ya sea mayúscula o minuscula) y que muestre el total.El
 * programa debe ir ejecutándose hasta que lea la frase ‘fin’.
 *
 */
package frasesconmasas;

/**
 *
 * @author Lázaro Belloch Canet
 */

import java.util.Scanner;

public class FrasesConMasAs {
    private String fraseActual = "";
    private int contadorAs = 0;
    private String fraseConMasAs = "";
    private int contadorAsMaximo = 0;

    public static void main(String[] args) {
        FrasesConMasAs programa = new FrasesConMasAs();
        programa.inicio();
    }
    
    // El metodo inicio() contiene el bucle do while que nosmantendrá en la ejecucion
    // mientras no introduzcamos la palabra fin 
    // entrará en la condición que llama a los metodos 
    // procesarFrase() y mostrarResultadoActual() 
    // Llama al metodo mostrarResultadoFinal() 
    // Si no entra en la condicion finaliza la entrada de texto y con ello el programa
    public void inicio() {
        Scanner entrada = new Scanner(System.in);
        String frase = "";
        do {
            System.out.print("Escribe una frase (escribe fin para terminar): ");
            frase = entrada.nextLine();
            if (!frase.equalsIgnoreCase("fin")) {
                procesarFrase(frase);
                mostrarResultadoActual();
            }
        } while (!frase.equalsIgnoreCase("fin"));
        mostrarResultadoFinal();
        System.out.println("(El programa ha terminado.)");
        entrada.close();
    }
    
    // Metodo procesarFrase() guardamos la frase en fraseActual
    // llama al metodo contarAs() y lo guarda en la variable contador
    // la condición decide si ha contado más a que en la que tiene en fraseActual
    // y en caso de que sí la guarda en fraseConMasAs y la cantidad de as en contadorAsMaximo
    public void procesarFrase(String frase) {
        fraseActual = frase;
        int contador = contarAs(frase);
        contadorAs = contador;
        if (contador > contadorAsMaximo) {
            fraseConMasAs = fraseActual;
            contadorAsMaximo = contador;
        }
    }
    
    // Método mostrarResultadoActual muestra la última frase introducida 
    // y el número de letras a que tiene
    public void mostrarResultadoActual() {
        System.out.println("Frase actual: " + fraseActual);
        System.out.println("Total de letras 'a': " + contadorAs);
    }

    // Método mostrarResultadoFinal() muestra el resultado final 
    // mostrando las variables fraseConMasAs y la variable contadorAsMaximo
    public void mostrarResultadoFinal() {
        System.out.println("La frase con más letras 'a' es: " + fraseConMasAs);
        System.out.println("Total de letras 'a' en la frase: " + contadorAsMaximo);
    }

    // Método contarAs recorre el string de entrada y si encuenta 
    // una 'a' o bien 'A' o bien 'á' o bien 'A' 
    // (esta última A debería estar acentuada, pero NetBeans me da un problema con los acentos y no me he parado a solucionarlo, con Visual Code no me pasa)
    public int contarAs(String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (letra == 'a' || letra == 'A' || letra =='á' || letra == 'A') {
                contador++;
            }
        }
        return contador;
    }
}


