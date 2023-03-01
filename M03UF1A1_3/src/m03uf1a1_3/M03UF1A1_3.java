/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m03uf1a1_3;
import java.util.Scanner;
/**
 *
 * @author Lázaro Belloch Canet
 */
public class M03UF1A1_3 {

    /**
     * @param args the command line arguments
     * Solicitar al usuario la base y la altura de un triángulo 
     * para calcular su área
     */
    public static void main(String[] args) {
        // definimos las variables necesarias
        float base;
        float altura;
        float area;
        // Pedimos al usuario la base
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la medida de la base: ");
        base = sc.nextFloat();
        // Pedimos al usuario la altura
        System.out.print("Introduce la medida de la altura: ");
        altura = sc.nextFloat();
        // Calculamos el área y lo mostramos por pantalla
        area = (base * altura) / 2;
        System.out.print("El area del triangulo es: " + area );
    }
    
}
