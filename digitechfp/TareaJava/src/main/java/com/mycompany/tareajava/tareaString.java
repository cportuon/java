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

      }
}
