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
public class HolaMundoNombre {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String Nom = scanner.next();
        int Edad = scanner.nextInt();
        double Altura = scanner.nextDouble();
        
        System.out.println("\nNombre: "+ Nom + "\nEdad: " + Edad + "\nAltura: "+Altura );
        
        
        
    }
    
}
