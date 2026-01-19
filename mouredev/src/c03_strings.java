/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mourepro;

/**
 *
 * @author cosisi
 */
public class c03_strings {

    public static void main(String[] args) {
        // 1. Concatena dos cadenas de texto.
        String cadena1 = "Cosme";
        String cadena2 = "Jen";
        
        System.out.println(cadena1 + " " + cadena2);
        
        // 2. Muestra la longitud de una cadena de texto.
        System.out.println("Longitud de " + cadena1 + " es: " + cadena1.length());
        
        // 3. Muestra el primer y último carácter de un string.
        System.out.println(cadena1.charAt(0));
        System.out.println(cadena1.charAt(cadena1.length() - 1));
        
        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(cadena1.toUpperCase());
        System.out.println(cadena1.toLowerCase());
        
        
        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(cadena1.contains("osi"));
        
        // 6. Formatea un string con un entero.
        int age = 25;
        System.out.println(String.format("Hola me llamo Cosme y tengo %d", age));
        
        // 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println("   Cosme y Jen están cenando.  ". trim());
        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println("Vamos a cenar calabaza hecha en la AirFryed.".replace(" ", "-"));
        
        // 9. Comprueba si dos strings son iguales.
        System.out.println(cadena1.equals(cadena2));
        
        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println(cadena1.length() == cadena2.length());

    }
}
