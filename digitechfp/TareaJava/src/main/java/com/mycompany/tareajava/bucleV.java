
    package com.mycompany.tareajava;
    import java.util.Scanner;
    import java.util.ArrayList;

    public class bucleV {


        public static void main(String args[]) {

            Scanner sc = new Scanner(System.in);
            int opcion;
 
            ArrayList<String> titulo = new ArrayList<>();
            ArrayList<String> autor = new ArrayList<>();
            ArrayList<Integer> año = new ArrayList<>();
            ArrayList<Float> precio = new ArrayList<>();

            do{
                System.out.println();
                System.out.println("1. Agregar nuevo libro.");
                System.out.println("2. Mostrar todos los libros.");
                System.out.println("3. Buscar libro por título.");
                System.out.println("4. Salir.");
                System.out.println();
                System.out.println("Elije la opción que desees: ");
                opcion = sc.nextInt();
                sc.nextLine();
                System.out.println();
                
                if(opcion == 1){
                    System.out.println("Título: ");
                    titulo.add(sc.nextLine());
                    System.out.println();

                    System.out.println("Autor: ");
                    autor.add(sc.nextLine());
                    System.out.println();

                    System.out.println("Año de publicación: ");
                    año.add(sc.nextInt());
                    while (año.getLast() < 0 ){
                        System.out.println("Dato incorrecto. Introduce el año de nuevo: ");
                        año.add(sc.nextInt());
                    }
                    System.out.println();
                    
                    System.out.println("Precio: ");
                    precio.add(sc.nextFloat());
                    while (precio.getLast() < 0){
                        System.out.println("Dato incorrecto. Introduce el precio de nuevo: ");
                        precio.add(sc.nextFloat());
                    }
                }   
                if(opcion == 2){
                    for (int i = 0; i < titulo.size(); i++){
                        
                        System.out.println("Título: " + titulo.get(i));
                        System.out.println("Autor: " + autor.get(i));
                        System.out.println("Año de publkicación: " + año.get(i));
                        System.out.println("Precio: " + precio.get(i));
                        System.out.println();
                    }
                    
                }
                if(opcion == 3){

                }
                if(opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4){
                    System.out.println("--------------------------------------------");
                    System.out.println("ERROR. Introduce de nuevo la opcion deseada.");
                    System.out.println("--------------------------------------------");
                }

            }while(opcion != 4);



        }
    }
