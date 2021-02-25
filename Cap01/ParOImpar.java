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
public class ParOImpar {
    
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        int v = scanner.nextInt();
        
        int Resto = v%2;
        
        if(Resto == 0)
        {
            System.out.println(v+" Es par");
        }
        else
        {
            System.out.println(v+ "No es par");
        }
    }
    
}
