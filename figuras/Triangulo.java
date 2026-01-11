/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author Usuario
 */
public class Triangulo {
    
    // Atributos (datos/estado del objeto)
    private float base;
    private float altura;
    private String nombre;
    
    String cadena = new String("prueba");
    
    // CONSTRUCTOR VACÍO:
    // Se ejecuta al hacer: new Triangulo();
    // Sirve para crear el objeto "vacío" y luego asignar valores con setters.
    public Triangulo() {
    }

    // CONSTRUCTOR CON PARÁMETROS:
    // Se ejecuta al hacer: new Triangulo(10, 5);
    // Sirve para crear el objeto ya con valores iniciales.
    public Triangulo(float base, float altura) {
        
        // (forma directa)
        // this.base = base;  
        // this.altura = altura;
        
        // Mejor usar setters
        setBase(base);
        setAltura(altura);
    }

    // OTRO CONSTRUCTOR (sobrecarga):
    // Mismo nombre (Triangulo) pero distinta lista de parámetros.
    // Permite crear el objeto con nombre + base + altura.
    public Triangulo(String nombre, float base, float altura) {
        
        
        this.nombre = nombre;
        setBase(base);
        setAltura(altura);
    }

    // GETTERS:
    // Sirven para "leer" (obtener) el valor de un atributo privado desde fuera.
    // Como los atributos son private, desde fuera NO puedes hacer t.base.
    // En su lugar haces: t.getBase()
    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public String getNombre() {
        return nombre;
    }

    // SETTERS:
    // Sirven para "modificar" (asignar) el valor de un atributo privado.
    // Aquí puedes meter validaciones para impedir valores incorrectos.
    public void setBase(float base) {
        if (base <= 0) throw new IllegalArgumentException("La base debe ser > 0");
        this.base = base;
    }

    public void setAltura(float altura) {
        if (altura <= 0) throw new IllegalArgumentException("La altura debe ser > 0");
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método normal: usa los atributos del objeto para calcular el área
    public float area() {
        return (base * altura) / 2;
    }
}
