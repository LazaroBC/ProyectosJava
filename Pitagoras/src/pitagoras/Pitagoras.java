/*
 * Consultad la documentación de la clase Math para ver si hay algún método que permita 
 * simplificar el siguiente programa para calcular la hipotenusa al teorema de Pitágoras. 
 * Modifica el programa para que utilice los métodos y comprueba que funciona.
 */
package pitagoras;

/**
 *
 * @author Lázaro Belloch Canet
 */

public class Pitagoras {
    public static void main (String[] args) {
	Pitagoras programa = new Pitagoras();
	programa.inicio();
	}
    
public void inicio() {
	double base = 4.5;
	double altura = 10;
	// Se eleva al cuadrado cada lado del triangulo
	double sumaCuadrados = (base*base) + altura*altura;
	double hipotenusa1 = Math.sqrt(sumaCuadrados);
        // Aplicamos el método hypot() de la clase math
        double hipotenusa = Math.hypot(base, altura);
        System.out.println("El valor de la hipotenusa es " +
	hipotenusa1);
	System.out.println("El valor de la hipotenusa con hypot() es " +
	hipotenusa);
        // Dejo las dos formas de hacerlo para comprobar que el resultado es el mismo.
}
}

