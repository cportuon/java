
package com.mycompany.tareajava;
import java.util.Scanner;

public class TareaCondicionales {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int num1 = sc.nextInt();
        
        System.out.println("Introduce otro número:");
        int num2 = sc.nextInt();
        
        System.out.println("Introduce un último número:");
        int num3 = sc.nextInt();
        
        int mayor;
        int menor;
        
        if ((num1 >= num2) && (num1 >= num3)){
            mayor = num1;
        }
        else if ((num2 >= num3) && (num2 >= num1)){
            mayor = num2;
        }
        else mayor = num3;
        
        if ((num1 <= num2) && (num1 <= num3)){
            menor = num1;
        }
        else if ((num2 <= num3) && (num2 <= num1)){
            menor = num2;
        }
        else menor = num3;
        
        System.out.println("EL número mayor es:" + mayor);
        System.out.println("EL número menor es:" + menor);


    }
}
