package com.mycompany.tareajava;
import java.util.Scanner;

public class TareaIfSimple
{
    public static void main(String[]args)
    {        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n------------------Comparación de dos números----------------------------\n");
        System.out.println("Introduce un número:");
        int num = sc.nextInt();
        
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introduce otro número:");
        int num2 = sc2.nextInt();
        
        System.out.println("\nEste es el número mayor: " + Math.max(num, num2));
        
        System.out.println("\n------------------Comparación de tres números---------------------------");
        Scanner sc3 = new Scanner(System.in);
        System.out.println("\nIntroduce el primer número:");
        int n1 = sc3.nextInt();
        
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Introduce el segundo número:");
        int n2 = sc4.nextInt();    
        
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Introduce el tercer número:");
        int n3 = sc5.nextInt();
        
        int mayor3 = n1;
        int menor3 = n1;
        
        if (n1 >= n2)
        {        
            if (n1 >= n3)
            {
                mayor3 = n1;
            }
            else mayor3 = n3;
        }
        else if (n2 >= n1)
        {
            if(n2 >= n3)
            {
                mayor3 = n2;
            }
        }
        else mayor3 = n3;
         
        if (n1 <= n2)
        {       
            if (n1 <= n3)
            {
                menor3 = n1;
            }
            else menor3 = n3;
        }
        else if (n2 <= n1)
        {
            if(n2 <= n3)
            {
                menor3 = n2;
            }
        }
        else menor3 = n3;
     
        System.out.println("\nEl número mayor es: " + mayor3);
        System.out.println("El número menor es: " + menor3);
        System.out.println("Número mayor sumado al tercer valor:" + (mayor3 + n3));
        System.out.println("Número menor multiplicado por el tercer valor:" + (menor3 * n3));
    }
}
