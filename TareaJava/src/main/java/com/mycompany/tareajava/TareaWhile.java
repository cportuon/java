
package com.mycompany.tareajava;
import java.util.Scanner;

public class TareaWhile {
    
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        int valor = 0;
        int suma = 0;
        
        while(valor >= 0){
            
            System.out.println("Introduce un número entero positivo:");
            valor  = sc.nextInt();
            suma = suma + valor;
            System.out.println("Suma de los valores: " + suma);
        }
    }
}
