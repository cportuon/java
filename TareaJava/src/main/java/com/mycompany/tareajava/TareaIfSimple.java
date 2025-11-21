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
        
        int mayor3 = n3;
        int menor3 = n3;
        
        if (n1 >= n2){        
            if (n1 >= n3){
                mayor3 = n1;
            }
        }
        else if (n2 >= n3){   
            mayor3 = n2;
        }
         
        if (n1 <= n2){       
            if (n1 <= n3){
                menor3 = n1;
            }
        }
        else if (n2 <= n3){
            menor3 = n2;
        }
     
        System.out.println("\nEl número mayor es: " + mayor3);
        System.out.println("El número menor es: " + menor3);
        System.out.println("Número mayor sumado al tercer valor:" + (mayor3 + n3));
        System.out.println("Número menor multiplicado por el tercer valor:" + (menor3 * n3));
        
        System.out.println("\n------------------Comparación de cuatro números---------------------------");
        Scanner sc6 = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int numero1 = sc6.nextInt();
        Scanner sc7 = new Scanner(System.in);
        System.out.println("Introduce el segundo número");
        int numero2 = sc6.nextInt();
        Scanner sc8 = new Scanner(System.in);
        System.out.println("Introduce el tercer número");
        int numero3 = sc6.nextInt();
        Scanner sc9 = new Scanner(System.in);
        System.out.println("Introduce el cuarto número");
        int numero4 = sc6.nextInt();
        
        int mayor4 = numero4;
        int menor4 = numero4;
        
        if(numero1 >= numero2){
            if(numero1 >= numero3){
                if(numero1 >= numero4){
                    mayor4 = numero1;
                }
            }
            else if (numero3 >= numero4){
                mayor4 = numero3;
            }
        }
        else if (numero2 >= numero3){
            if (numero2 >= numero4){
                mayor4 = numero2;
            }
        }
        
        if(numero1 <= numero2){
            if(numero1 <= numero3){
                if(numero1 <= numero4){
                    menor4 = numero1;
                }
            }
            else if (numero3 <= numero4){
                menor4 = numero3;
            }
        }
        else if (numero2 <= numero3){
            if (numero2 <= numero4){
                menor4 = numero2;
            }
        }
        
        System.out.println("\nEl número mayor es: " + mayor4);
        System.out.println("El número menor es: " + menor4);
        System.out.println("Número mayor sumado al segundo valor:" + (mayor4 + numero2));
        System.out.println("Número mayor multiplicado al primer valor:" + (menor4 * numero1));
        
    }
}
