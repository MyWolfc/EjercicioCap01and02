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
public class DemoMatriz {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese Cantidad De Filas:");
        int n=scanner.nextInt();
        
        System.out.print("Ingrese Cantidad de columnas: ");
        int m= scanner.nextInt();
        
        int Matrix [][] = new int [n][m];
        
        int NumeroBelico;
        for(int i=0;i<n; i++)
        {
            for(int j=0;j<m;j++)
            {
                NumeroBelico=(int)(Math.random()*1000);
                Matrix[i][j] = NumeroBelico;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(Matrix [i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}
