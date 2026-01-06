package com.mycompany.tareajava;
import java.util.Scanner;

public class arraysI {
    public static void main(String[] arg){
        // 1. Diseñar un array, que almacena los números del 1 al 10
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        for (int i = array.length-1; i >= 0;i--){
            System.out.println(array[i]);
        }

        /* 2.Se pide por pantalla el número de posiciones que queremos que tenga nuestro array, se
        piden los datos por pantalla.
        Se crea otro array, pidiendo el número de posiciones por pantalla. Los valores se cargan con un
        bucle for.
        Crear un tercer array que contiene, los datos de los dos arrays. */
        Scanner sc = new Scanner(System.in);
        int positions1;
        System.out.println("Número de posiciones de nuestro array:");
        positions1 = sc.nextInt();
        int[] array1 = new int[positions1];
        for (int i = 0; i < positions1; i++ ){
            System.out.println("Introduce un número");
            array1[i] = sc.nextInt();
        }
        int positions2;
        System.out.println("Número de posiciones de nuestro array:");
        positions2 = sc.nextInt();
        int[] array2 = new int[positions2];
        for (int i = 0; i < positions2; i++ ){
            System.out.println("Introduce un número");
            array2[i] = sc.nextInt();
        }
        int[] array3 = new int[positions1 + positions2];
        for (int i = 0; i < positions1; i++){
            array3[i] = array1[i];
        }
        for (int i = 0; i < positions2; i++){
            array3[i + array1.length] = array2[i];
        }
        for (int i = 0; i < array3.length; i++){
            System.out.println(array3[i]);
        }

        /* 3. Crear un array de caracteres, con los siguientes valores: a,e,r,t,y,u. Crea un array con datos
        enteros con valores del 1 al 6.
        Diseña un tercer array que tiene el mismo número de celdas que la suma de las celdas de los
        dos arrays anteriores.*/


        /* 4.Diseña un array con los números del 1-57, se debe mostrar el número de celdas que
        contienen números pares y el número de celdas que contienen números impares */


        /* 5.Diseñar un array con las calificaciones de 6 asignaturas de un alumno que se piden por
        pantalla. Se debe calcular su nota media final.*/
    }
}
