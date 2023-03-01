/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package m03uf1a1_5;;
import java.util.Scanner;
import java.util.Calendar;
/**
 *
 * @author Lázaro Belloch Canet
 */
public class M03UF1A1_5 {

   public static void main(String[] args) {
       //Inicializa las variables necesarias
        int diaNacimiento;
        int mesNacimiento;
        int anyoNacimiento;
        int edad; 
        
       //Pide los datos
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su día de nacimiento : ");
        diaNacimiento = sc.nextInt();
        System.out.print("Ingrese su mes de nacimiento : ");
        mesNacimiento = sc.nextInt();
        System.out.print("Ingrese su año de nacimiento : ");
        anyoNacimiento = sc.nextInt();
        
       //Averigua la fecha actual
        Calendar fechaActual = Calendar.getInstance();
        
        int diaActual = fechaActual.get(Calendar.DAY_OF_MONTH);
        int mesActual = fechaActual.get(Calendar.MONTH) + 1;
        int anyoActual = fechaActual.get(Calendar.YEAR);
        
       //Muestra ambas fechas
        System.out.print("Fecha nacimiento: " + diaNacimiento + "-" + mesNacimiento + "-" + anyoNacimiento + " \n");
        System.out.println("Fecha actual: " + diaActual + "-" + mesActual + "-" + anyoActual + "\n");
      
       //Decide si ya ha cumplido los años o no
        edad = (fechaActual.get(Calendar.YEAR) - anyoNacimiento);
        
       //Muestra la edad
       if (diaActual == diaNacimiento && mesActual == mesNacimiento) {
            System.out.println("¡FELICIDADES, Es tu cumpleaños!, Cumples "+  (edad) + " años" );
        } else {
            if (mesNacimiento > fechaActual.get(Calendar.MONTH) +1 || 
            mesNacimiento == fechaActual.get(Calendar.MONTH) +1 && 
            diaNacimiento > fechaActual.get(Calendar.DATE)) 
            {
                edad = edad-1;
            }
        System.out.println("Su edad es: " + (edad));
        }
    }
   
}
