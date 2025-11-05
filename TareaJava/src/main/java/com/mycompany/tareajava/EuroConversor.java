
package com.mycompany.tareajava;
import java.util.Scanner;

public class EuroConversor {
    
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Introduce un importe en euros: ");
    
    double importe = sc.nextDouble();
    double resultado = importe * 0.88;
    
    System.out.println("El importe de " + importe + " en libras son " + resultado);
    
    
    }
    
    
}