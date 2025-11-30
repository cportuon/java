
package com.mycompany.tareajava;
import java.util.Scanner;

public class bucleII {

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        //Imprime del 1-1000 de 5 en 5
        for(int i = 5; i <= 1000;){
            System.out.println(i);
            i = i + 5;
        }
        
        //Imprime del 10000-1 de 10 en 10
        for(int i = 10000; i > 0;){
            System.out.println(i);
            i = i-10;
        }
        //Pide tu nombre y las veces que quieres imprimirlo, y lo imprime
        String nombre;
        int j;
        System.out.println("Escribe tu nombre: ");
        nombre = sc.next();
        System.out.println("Cuantas veces quieres imprimer tu nombre");
        for (j = sc.nextInt(); j > 0; j--){
            System.out.println(nombre);
        }
        
        //Se piden números hasta que introduzcan el 0
        int num = 1;
        
        while(num!=0){
            System.out.println("Introduce un número: ");
            num = sc.nextInt();
        }
        
        //Imprimir del 1-100 con do while
        int i=1;
        do{
            System.out.println(i++);
        }while(i<=100);
        
        //Imprimir del 1-100 con while
        int y=1;
        while(y<=100){
            System.out.println(y++);
        }
    }
}
