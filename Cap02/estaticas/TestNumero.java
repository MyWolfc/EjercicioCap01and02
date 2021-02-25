/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.estaticas;

/**
 *
 * @author Usuario
 */
public class TestNumero {
    public static void main(String [] args)
    {
        double d = Numero.sumar(2, 3);
        
        Numero n1 = new Numero(5);
        n1.Sumar(4);
        System.out.println(n1);
        
        n1.Sumar(4).Sumar(6).Sumar(8).Sumar(1);
        System.out.println(n1);
    }
    
}
