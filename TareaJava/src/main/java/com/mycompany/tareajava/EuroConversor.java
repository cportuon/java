package com.mycompany.tareajava;
import java.util.Scanner;

public class EuroConversor 
{   
    public static void main(String[] args)
    {    
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("\nIntroduce un importe en euros: ");

        double importe = sc.nextDouble();
        double resultado = importe * 0.88;
        System.out.println("\n------------------------------------------------------------------------");
        System.out.println("\nEl importe de " + importe + " euros son "+ resultado + " libras\n");   
    }        
}