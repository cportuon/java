package com.mycompany.tareajava;

public class CreacionVariables
{
    public static void main(String[] args)
    {    
        // Tipos enteros       
        byte b = 2;             // Entero pequeño con signo
        short s = 3;            // Entero corto con signo
        int num = 5;            // Opción por defecto para valores enteros
        long l = 2147483648L;   // Entero largo con signo, usado cuando int no es suficiente
        
        // Tipos reales
        float num2 = 0.3f;      // Número de punto flotante de precisión simple           
        double num3 = 5.5;      // Número de punto flotante de doble precisión. Opción por defecto para decimales
        
        // Tipo caracter o cadena
        char c = 'c';           // Un solo carácter 
        String name = "Cosme";  // Cadenas de carácteres
        
        // Tipo lógico
        boolean happy = true;   // Representa un valor booleano
        System.out.println("\n--------------------------Variables tipo entero-------------------------");
        System.out.println("\nVariable tipo byte: " + b);
        System.out.println("Variable tipo short: " + s);
        System.out.println("Variable tipo int: " + num);
        System.out.println("Variable tipo long: " + l + "\n");
        System.out.println("---------------------------Variables tipo real--------------------------");
        System.out.println("\nVariable tipo float: " + num2);
        System.out.println("Variable tipo double: " + num3 + "\n");
        System.out.println("--------------------------Variables tipo caracter-----------------------");
        System.out.println("\nVariable tipo char: " + c);
        System.out.println("Variable tipo String: " + name + "\n");
        System.out.println("---------------------------Variables tipo lógico------------------------");
        System.out.println("\nVariable tipo boolean: " + happy + "\n");
    }
}
