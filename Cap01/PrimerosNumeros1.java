/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap01;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class PrimerosNumeros1 {
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        int n= scanner.nextInt();
        
        int i=1;
        
        while (1 <= n)
        {
        
            System.out.println(i);
            i++;
        }
        
    }
    
}
