package com.mycompany.tareajava;
import java.util.Scanner;           // Importo la clase

public class TareaScanner 
{
    public static void main(String[]args)
    {        
        Scanner sc = new Scanner(System.in);        //  Creo una instancia de la clase Scanner para leer desde el teclado
        System.out.println("\n------------------------------------------------------------------------\n");              
        System.out.println("Introduce tu nombre:"); //  Muestra un mensaje con lo que se pide

        String name = sc.next();                    //  Lee la siguiente secuencia de caracteres sin espacios y lo guarda en la variable

        Scanner sc2 = new Scanner(System.in);
        System.out.println("\n------------------------------------------------------------------------\n");                
        System.out.println("Introduce tu primer apellido:");
        String surname1 = sc2.next();
        
        Scanner sc3 = new Scanner(System.in);
        System.out.println("\n------------------------------------------------------------------------\n");        
        System.out.println("Introduce tu segundo apellido:");
        String surname2 = sc3.next();

        System.out.println("\n------------------------------------------------------------------------\n");                
        System.out.println("Buenos días " + name + " " + surname1 + " " + surname2 + "\n");
    }
}
