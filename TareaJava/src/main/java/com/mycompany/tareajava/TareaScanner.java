/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareajava;
import java.util.Scanner; // Importo la clase
/**
 *
 * @author cosisi
 */
public class TareaScanner {
    public static void main(String[]args){
        
        //  Creo una instancia de la clase Scanner para leer desde el teclado
        Scanner sc = new Scanner(System.in);        
        //  Muestra un mensaje con lo que se pide
        System.out.println("Introduce tu nombre:");
        //  Lee la siguiente secuencia de caracteres sin espacios y lo guarda en la variable
        String name = sc.next();
        
        System.out.println("Introduce tu primer apellido:");
        String surname1 = sc.next();
        
        System.out.println("Introduce tu segundo apellido:");
        String surname2 = sc.next();
        
        System.out.println("Buenos días " + name + " " + surname1 + " " + surname2);
    }
}
