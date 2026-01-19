/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author Usuario
 */
public class TrianguloIsosceles extends Triangulo {
    // "extends Triangulo" significa que TrianguloIsosceles HEREDA:
    // - los atributos privados NO los hereda directamente (porque son private),
    //   pero sí accede a ellos mediante getters/setters del padre.
    // - los métodos públicos del padre, por ejemplo: area()

    // Atributo propio (extra) de la clase hija
    private float ladoIgual;
    
    // CONSTRUCTOR:
    // Se ejecuta al hacer: new TrianguloIsosceles(base, altura, ladoIgual)
    public TrianguloIsosceles(float base, float altura, float ladoIgual) {
        
        // super(base, altura) llama al constructor de la clase padre (Triangulo)
        // Sirve para inicializar la parte "Triangulo" del objeto (base y altura).
        // IMPORTANTE: super(...) debe ser la PRIMERA línea del constructor.
        super(base, altura);
        
        // Inicializamos lo propio de la clase hija.
        // Usamos setter para validar el valor.
        setLadoIgual(ladoIgual);
    }
    
    // GETTER:
    // Devuelve el valor del atributo ladoIgual
    public float getLadoIgual() {
        return ladoIgual;
    }

    public void setLadoIgual(float ladoIgual) {
        if (ladoIgual <= 0) throw new IllegalArgumentException("El lado debe ser > 0");
        this.ladoIgual = ladoIgual;
    }

    public float perimetro() {
        return getBase() + 2 * ladoIgual;
    }
}
