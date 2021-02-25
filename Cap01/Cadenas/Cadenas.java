/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap01.Cadenas;

/**
 *
 * @author Usuario
 */
public class Cadenas {
    public static void main(String[] args)
    {
        String S="Esta es mi cadena epica";
        
        System.out.println(S.charAt(0));
        System.out.println(S.charAt(5));
        System.out.println(S.charAt(S.length()-1));
        
        char c;
        for (int i=0;i<S.length();i++)
        {
            c = S.charAt(i);
            System.out.println(i+"->"+c);
        }
               

    }
    
}
