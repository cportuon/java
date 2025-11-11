package com.mycompany.tareajava;
import java.util.Scanner;

public class TareaCondicionales2 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo número:");
        int num2 = sc.nextInt();
        
        int mayor;
        int menor;
        
        if (num1 < num2)
        {
            menor = num1;
        }
        else menor = num2;
        if (num1 > num2)
        {
            mayor = num1;
        }
        else mayor = num2;
        
        System.out.println("El número: " + mayor + " es mayor que el número " + menor);
        System.out.println("El número: " + menor + " es menor que el número " + mayor);
        
        System.out.println("Introduce otro número:");
        int num3 = sc.nextInt();
        
        if (num3 % 2 == 0){
            System.out.println("El número es par");
        }
        else System.out.println("El número es impar");
    }
    
}
