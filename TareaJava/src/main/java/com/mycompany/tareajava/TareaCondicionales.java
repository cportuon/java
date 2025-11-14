package com.mycompany.tareajava;
import java.util.Scanner;

public class TareaCondicionales {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n---------------------Vamos a comparar 3 números-------------------------");
        System.out.println("\nIntroduce el primer número:");
        int num1 = sc.nextInt();
        
        Scanner sc2 = new Scanner(System.in);
        System.out.println("\nIntroduce el segundo número:");
        int num2 = sc2.nextInt();
        
        Scanner sc3 = new Scanner(System.in);
        System.out.println("\nIntroduce el tercer número:");
        int num3 = sc3.nextInt();
        
        int mayor, menor;
        
        // Buscar el número mayor
        if ((num1 >= num2 && num1 >= num3))
        {
            mayor = num1;
        }
        else if ((num2 >= num3 && num2 >= num1))
        {
            mayor = num2;
        }
        else mayor = num3;
        
        // Buscar el número menor
        if ((num1 <= num2 && num1 <= num3))
        {
            menor = num1;
        }
        else if ((num2 <= num3 && num2 <= num1))
        {
            menor = num2;
        }
        else menor = num3;
        System.out.println("\n------------------------------------------------------------------------");        
        System.out.println("\nEl número mayor es: " + mayor + "\nEl número menor es: " + menor + "\n");
    }
}
