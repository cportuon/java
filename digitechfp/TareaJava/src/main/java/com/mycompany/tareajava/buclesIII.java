
package com.mycompany.tareajava;
import java.util.Scanner;

public class buclesIII {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        //Crea una estructura de x filas de un caracter
        int filas;
        String caracter;
        int i=1;
        
        System.out.println("Introduce el número de filas: ");
        filas = sc.nextInt();
        System.out.println("Introduce el cáracter a utilizar: ");
        caracter = sc.next();
        
        while(i<=filas){
            int l=i;
            while(l>0){
                System.out.print(caracter);
                l--;
            }
            i++;
            System.out.println();
        }
        
        //Crea una estructura de x filas de números
        int row;
        int j = 1;
        
        System.out.println("Introduce el número de filas: ");
        row = sc.nextInt();
        
        while(j<=row){
            int num = 1;
            int x = j;
            
            while(x>0){
                System.out.print(num);
                x--;
                num++;
            }   
            j++;
            System.out.println();
        }
        
    }
}
