/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {

        Triangulo t1 = new Triangulo(10, 5);
        System.out.println("Area t1: " + t1.area());

        Triangulo t2 = new Triangulo();
        t2.setBase(6);
        t2.setAltura(4);
        System.out.println("Area t2: " + t2.area());

        //TrianguloIsosceles iso = new TrianguloIsosceles(10, 6, 8);
        //System.out.println("Area iso: " + iso.area());
        //System.out.println("Perimetro iso: " + iso.perimetro());
    }
}
