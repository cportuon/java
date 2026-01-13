package com.mycompany.tareajava;
import java.util.Scanner;

public class tareaString {
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          String password;

          System.out.println("Introduce la contraseña:");
          password = sc.nextLine();
          while (password.length()>25 || password.contains("@") == true || password.contains(".") == true || password.contains("$") == true
                  || password.contains("#") == true || password.contains("&") == true || password.contains("/") == true){
              System.out.println("Contraseña incorrecta\nNo puede ser superior a 25 caracteres, ni " +
                      "contener estos caracteres especiales: @,.,$,#,&,/\nIntroduce la contraseña:");
              password = sc.nextLine();

          }
          password = password.toUpperCase().charAt(0) + password.substring(1, password.length()-1) + password.toUpperCase().charAt(password.length());
          System.out.println(password);
          System.out.println("Contraseña válida");

          System.out.println("Introduce dos o tres palabras:");
          String texto = sc.nextLine();

          primeraMitad(texto);
          ultimoCaracter(texto);
          inversa(texto);
          separadoGuiones(texto);
          contarVocales(texto);
          capicua(texto);


      }
    public static void primeraMitad(String texto){
        int mitad = texto.length()/2;
        System.out.println(texto.substring(0, mitad));
    }
    public static void ultimoCaracter(String texto){
          System.out.println("Último caracter es: " + texto.charAt(texto.length()-1));
    }
    public static void inversa(String texto){
          String textoInvertido = "";
          for (int i = texto.length()-1; i >= 0; i--){
              textoInvertido += texto.charAt(i);
          }
        System.out.println(textoInvertido);
    }

    public static void separadoGuiones(String texto){
          String resultado = texto.replace(" ", "-");
          System.out.println(resultado);

    }

    public static void contarVocales(String texto){
          int contador = 0;
          for (int i = 0; i <= texto.length()-1; i++){
              if (texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i'
                      || texto.charAt(i) == 'o' || texto.charAt(i) == 'u'){
                  contador++;
              }
          }
          System.out.println("Contiene " + contador + " vocales.");
    }
    public static void capicua(String texto){
          String isCapicua = "";
          for (int i = texto.length()-1; i>=0;i--){
              isCapicua += texto.charAt(i);
          }
          if(texto.equals(isCapicua)){
              System.out.println("Se lee igual de derecha a izquierda que de izquierda a derecha.");
          }
          else System.out.println("No se lee igual de izquierda a derecha.");
    }
}
