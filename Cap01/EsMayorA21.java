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
public class EsMayorA21 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int Edad = scanner.nextInt();
        if(Edad>=21)
        {
            System.out.println("Usted es mayor de edad");
        }
        else
        {
            System.out.println("Usted NO es mayor de edad");
        }
        
        
        
    }
    
}
