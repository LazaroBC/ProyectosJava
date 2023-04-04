/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m03uf1a1_2;
/*Importamos las dependencias que necesitamos*/

import java.util.Scanner;
/**
 *
 * @author Lázaro Belloch Canet
 */
public class M03UF1A1_2 {

    /**
     * @param args the command line arguments
     * Programa que solicita al usuario por consola
     * tres medidas de este tipo: 
     * milímetros, centímetros y metros
     * Mostrará la suma de las tres en centímetros.
     */
    public static void main(String[] args) {
        // Creamos los bojetos Scanner de entrada de datos
        // con los cuales solicitamos las medidas
        double suma;
        double mm;
        double cm;
        double mt;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la medida en milímetos: ");
        mm = sc.nextDouble();
        System.out.print("Introduce la medida en centímetros: ");
        cm = sc.nextDouble();
        System.out.print("Introduce la medida en metros: ");
        mt = sc.nextDouble();
        suma = (mm/10)+cm+(mt*100);
       System.out.print("La suma total en centímetros es: " + suma );
        
        
    }
    
}
