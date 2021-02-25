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
public class ParOImpar2 {
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese Un valor: ");
        int V = scanner.nextInt();
        
        int Restos= V%2;
        
        String mssg = (Restos == 0)?"Es par":"Es impar"; 
        
        System.out.println(V+" " + mssg);
    }
        
    
}
