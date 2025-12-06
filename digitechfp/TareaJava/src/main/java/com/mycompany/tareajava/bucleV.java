
package com.mycompany.tareajava;
import java.util.Scanner;
import java.util.ArrayList;

public class bucleV {

   
    public static void main(String args[]) {
        
        /*Scanner sc = new Scanner(System.in);
        int opcion;
        
        System.out.println("1. Agregar nuevo libro.");
        System.out.println("2. Mostrar todos los libros.");
        System.out.println("3. Buscar libro por título.");
        System.out.println("4. Salir.");
        System.out.println("Elije la opción que desees: ");
        opcion = sc.nextInt();
        
        do{
            if(opcion == 1){
                
            }
            if(opcion == 2){
            
            }
            if(opcion == 3){
            
            }
            if(opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4){
                System.out.println("ERROR. Introduce de nuevo la opcion deseada.");
            }
               
        }while(opcion != 4);*/
        
        String[][] numerosMatriz2 = {{"cosme","tito"},{"alberto","aitor"},{"naia","ana"}};
        
        for(int i=0; i < (numerosMatriz2[i].length) + 1; i++){
            for (int j=0; j < numerosMatriz2[i].length; j++){
                System.out.println(numerosMatriz2[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
