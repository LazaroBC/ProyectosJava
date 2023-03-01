/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m03uf1a1_4;
import java.util.Scanner;
/**
 *
 * @author Lázaro Belloch Canet
 */
public class M03UF1A1_4 {

    /**
     * @param args the command line arguments
     * Solicitar al usuario el año actual y el de su de nacimiento.
     * Calcular edad 
     */
    public static void main(String[] args) {
        // Definimos las variables necesarias
        int anyoActual;
        int anyoNacimiento;
        int edad;
        Scanner sc = new Scanner(System.in);
        // Pedimos al usuario la en año actual
        System.out.print("Dime el año en curso: ");
        anyoActual = sc.nextInt();
        // Pedimos al usuario el año de nacimiento
        System.out.print("Dime tu año de nacimiento: ");
        anyoNacimiento = sc.nextInt();
        //Calculamos la edad
        edad = anyoActual - anyoNacimiento;
        // Mostramos la edad
        System.out.print("Tienes "+ edad + " años.");
    }
    
}
