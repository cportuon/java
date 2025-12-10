
package com.mycompany.mourepro;
import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        /*
        int edad;
        
        System.out.println("Introduce tu edad: ");
        edad = sc.nextInt();
        if (edad < 18){
            System.out.println("Eres menor de edad, no puedes votar.");
        }
        else System.out.println("Eres mayor de edad, puedes votar.");*/
        
        // 2. Declara dos nÃºmeros y muestra cuÃ¡l es mayor, o si son iguales.
            /*int num1;
            int num2;
            
            System.out.print("Introduce un número: ");
            num1 = sc.nextInt();
            System.out.print("Introduce un segundo número: ");
            num2 = sc.nextInt();
            
            if(num1 > num2){
                System.out.print(num1 + " es el valor más alto.");
            }
            else System.out.println(num2 + " es el valor más alto.");*/
        // 3. Dado un nÃºmero, verifica si es positivo, negativo o cero.
        /*int num;

        System.out.println("Introduce un número: ");
        num = sc.nextInt();
        if (num < 0){
            System.out.println("El número es negativo.");
        }
        else if (num > 0){
            System.out.println("El número es positivo.");
        }
        else System.out.println("El número es el cero.");*/
        // 4. Crea un programa que diga si un nÃºmero es par o impar.
        /*int num;

        System.out.println("Introduce un número:");
        num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("El número es par.");
        }
        else System.out.println("El número es impar.");*/
        // 5. Verifica si un nÃºmero estÃ¡ en el rango de 1 a 100.

        // 6. Declara una variable con el dÃ­a de la semana (1-7) y muestra su nombre con
        // switch.
        /*int dia;
        System.out.println("Introduce el número de tú día preferido de la semana: ");
        dia = sc.nextInt();
        switch(dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default: System.out.println("Día incorrecto.");
        }*/
        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o
        // "Suspenso" segÃºn la nota (0-100).
        /*System.out.println("Dinos tu nota: ");
        sc.nextInt();
        if (nota < 50) {
            System.out.println("Suspenso");
        }
        else if (nota >= 50 && nota < 90){
            System.out.println("Aprobado");
        }
        else System.out.println("Sobresaliente");*/

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al
        // menos 15 aÃ±os o ir acompaÃ±ado.

        /*int edad;
        System.out.println("¿Qué edad tienes?");
        edad = sc.nextInt();
        sc.nextLine();

        String acompa;

        if(edad < 15){
            System.out.println("¿Vas acompañado? (si/no): ");
            acompa = sc.nextLine();
            if (acompa.equalsIgnoreCase("si")){
                System.out.println("Adelante, disfrute de la película.");
            }
            else System.out.println("Lo sentimos, no puedes pasar");
        }
        else System.out.println("Adelante, disfrute de la película.");*/

        // 9. Crea un programa que diga si una letra es vocal o consonante.
        /*System.out.println("Introduce una letra: ");
        String letra = sc.nextLine();

        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u")) {
            System.out.println("La letra es vocal.");
        }
        else System.out.println("La letra es consonante.");*/

        // 10. Usa tres variables a, b, c y muestra cuÃ¡l es el mayor de las tres.
        int a = 34;
        int b = 23;
        int c = 21;

        if (a > b && a > c){
            System.out.println("La variable mayor es la a");
        }
        else if (b > c) {
            System.out.println("La variable mayor es la b");
        }
        else System.out.println("La variable mayor es la c");



    }
}
