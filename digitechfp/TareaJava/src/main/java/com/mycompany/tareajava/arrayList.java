package com.mycompany.tareajava;
import java.util.ArrayList;

public class arrayList {
    public static void main(String[] arg){
        ArrayList<String> ciudades = new ArrayList<> ();
        ciudades.add("Bilbao");
        ciudades.add("Barcelona");
        ciudades.add("Madrid");
        ciudades.add("Sevilla");
        ciudades.add("Santander");
        System.out.println("Tamaño de la lista: " + ciudades.size());
        System.out.println("Contenido del primer valor: " + ciudades.get(2));
        System.out.println(ciudades.removeFirst());
        System.out.println("Contiene ''Madrid'' la lista: " + ciudades.contains("Madrid"));
        ciudades.clear();
        System.out.println("La lista está vacía: " + ciudades.isEmpty());
     }
}
