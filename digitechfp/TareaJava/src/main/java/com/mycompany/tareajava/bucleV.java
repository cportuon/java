
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
                    int inputAño = sc.nextInt();
                    sc.nextLine();
                    
                    while (inputAño < 0 ){
                        System.out.println("Dato incorrecto. Introduce el año de nuevo: ");
                        inputAño = sc.nextInt();
                        sc.nextLine();
                    }
                    año.add(inputAño);
                    System.out.println();
                    
                    System.out.println("Precio: ");
                    float inputPrecio = sc.nextFloat();
                    sc.nextLine();
                    
                    while (inputPrecio < 0){
                        System.out.println("Dato incorrecto. Introduce el precio de nuevo: ");
                        inputPrecio = sc.nextFloat();
                        sc.nextLine();
                    }
                    precio.add(inputPrecio);
                }   
                if(opcion == 2){
                    for (int i = 0; i < titulo.size(); i++){
                        System.out.println("------------------------------------");
                        System.out.println("Título: " + titulo.get(i));
                        System.out.println("Autor: " + autor.get(i));
                        System.out.println("Año de publicación: " + año.get(i));
                        System.out.println("Precio: " + precio.get(i));
                        System.out.println("------------------------------------");
                        System.out.println();
                    }
                    
                }
                if(opcion == 3){
                    String buscar;
                    int i = 0;
                    boolean encontrado = false;
                    
                    System.out.println("Introduce el título que buscas: ");
                    buscar = sc.nextLine();
                    while (i < titulo.size()){
                        if (titulo.get(i).equals(buscar)){
                            System.out.println(titulo.get(i));
                            System.out.println(autor.get(i));
                            System.out.println(año.get(i));
                            System.out.println(precio.get(i));
                            encontrado = true;
                            break;
                        }
                        i++;
                    } 
                    if (!encontrado){
                        System.out.println("--------------------------------------------");
                        System.out.println("El libro no esta en el inventario.");
                        System.out.println("--------------------------------------------");
                    }
                }
                if(opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4){
                    System.out.println("--------------------------------------------");
                    System.out.println("ERROR. Introduce de nuevo la opcion deseada.");
                    System.out.println("--------------------------------------------");
                }
            }while(opcion != 4);



        }
    }
