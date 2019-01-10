/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseString;

/**
 *
 * @author adrian
 */
public class ClaseString {
    
    public static void main(String[] args) {
        
        String s = "iesmardealboran.com";
        
        //Tamaño de la cadena
        
        System.out.println("Tamaño: " + s.length());
        
        //Obtener el char de una posicion concreta
        System.out.println("Char asociado a la posicion 5:"  + s.charAt(5));
        
        
        //Obtener subcadena desde el caracter i-ésimo hasta el final de la cadena
        String subcadena = s.substring(3);
        System.out.println("Subcadena = " + subcadena);
        
        
        //Obtener subcadena desde el caracter i-ésimo hasta el caracter j-ésimo de la cadena
        subcadena = s.substring(8,15);
        System.out.println("Subcadena = " + subcadena);
        
        //Concatenar cadenas. Equivale al operador +
        
        String s1 = "ies";
        String s2 = "mardealboran.com";
        
        String nuevo = s1+s2;
        String nuevo2 = s1.concat(s2);
        System.out.println("Nuevo: " + nuevo);
        System.out.println("Nuevo2:" + nuevo2);
        
        //Devuelve el indice dentro de la cadena 
        // de la primera aparición de la cedena a buscar
        
        int indice= nuevo.indexOf("alboran");
        System.out.println("Indice:" + indice);
        
        indice = nuevo.indexOf("ran", 10);
         System.out.println("Indice:" + indice);
         
         //Métodos equals y equalsIgnoreCase
         
         System.out.println("Igualdad Java y java: " + "Java".equals("java"));
         System.out.println("Igualdad Java y java: " + "Java".equalsIgnoreCase("java"));
        
    }
}
