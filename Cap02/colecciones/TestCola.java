/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.colecciones;

/**
 *
 * @author Usuario
 */
public class TestCola {
    public static void main(String [] args)
    {
        MiCola<Integer> c = new MiCola<Integer>();
         c.encolar(1);
         c.encolar(2);
         c.encolar(3);
         System.out.println(c.desencolar());
         System.out.println(c.desencolar());       
         c.encolar(4);      
         System.out.println(c.desencolar());     
         System.out.println(c.desencolar());
        
    }

            
}
