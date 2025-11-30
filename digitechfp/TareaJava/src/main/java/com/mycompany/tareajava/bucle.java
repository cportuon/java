
package com.mycompany.tareajava;
import java.util.Scanner;

public class bucle{


    public static void main(String args[]) {
        
        for (int i = 1; i <= 100; i++){
            System.out.println(i);
        }
             
        int i=1;
        while(i<=100){
            System.out.println(i);
            i++;
        }
       
        Scanner sc = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;
        do{
           System.out.println("1. Sumar dos números"); 
           System.out.println("2. Restar dos números");
           System.out.println("3. Multiplicar dos números");
           System.out.println("4. Salir");
           System.out.println("Elije una opción: ");
           
           opcion = sc.nextInt();
           
           switch(opcion){
               case 1:
                   System.out.println("Introduce el primer número: ");
                   num1 = sc.nextDouble();
                   System.out.println("Introduce el segundo número: ");
                   num2 = sc.nextDouble();
                   resultado = num1 + num2;
                   System.out.println("Resultado: " + resultado);
                   break;
               case 2:
                   System.out.println("Introduce el primer número: ");
                   num1 = sc.nextDouble();
                   System.out.println("Introduce el segundo número: ");
                   num2 = sc.nextDouble();
                   resultado = num1 - num2;
                   System.out.println("Resultado: " + resultado);
                   break;
                case 3:
                   System.out.println("Introduce el primer número: ");
                   num1 = sc.nextDouble();
                   System.out.println("Introduce el segundo número: ");
                   num2 = sc.nextDouble();
                   resultado = num1 * num2;
                   System.out.println("Resultado: " + resultado);
                   break;
                case 4:
                    break;
                default:
                    System.out.print("Opción no válida\n");
           }            
        }while(opcion != 4);
        
    }
}
