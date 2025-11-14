package com.mycompany.tareajava;
import java.util.Scanner;

public class TareaCondicionales2 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n------------------------------------------------------------------------");        
        System.out.println("\nIntroduce un número:");
        int num1 = sc.nextInt();
        System.out.println("\n------------------------------------------------------------------------");        
        System.out.println("Introduce otro número:");
        int num2 = sc.nextInt();
        
        int mayor, menor;
        
        if (num1 <= num2)
        {
            menor = num1;
        }
        else menor = num2;
        
        if (num1 >= num2)
        {
            mayor = num1;
        }
        else mayor = num2;
        
        System.out.println("\n------------------------------------------------------------------------");        
        if (num1 == num2)
        {
            System.out.println("\nLos dos números son iguales");
        }    
        else
        {
            System.out.println("\nEl número " + mayor + " es mayor que el número " + menor);
            System.out.println("\nEl número " + menor + " es menor que el número " + mayor);
        }
        
        System.out.println("\n------------------------------------------------------------------------");        
        System.out.println("\nIntroduce otro número:");
        int num3 = sc.nextInt();
        
        if (num3 % 2 == 0)
        {
            System.out.println("\n------------------------------------------------------------------------");
            System.out.println("\nEl número es par\n");
        }
        else
        {
            System.out.println("\n------------------------------------------------------------------------");
            System.out.println("\nEl número es impar\n");
        }
    }
    
}
