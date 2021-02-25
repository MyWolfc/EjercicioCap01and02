/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.fechas;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class TestFecha3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese fecha1 (Dia, mes y año);");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int año = scanner.nextInt();
        
        Fecha f1 = new Fecha(dia,mes,año);
        
        System.out.print("Ingrese fecha2 (Dia, mes y año);");
        dia = scanner.nextInt();
        mes = scanner.nextInt();
        año = scanner.nextInt();
        
        Fecha f2 = new Fecha(dia,mes,año);
        System.out.println("Fecha 1"+f1);
        System.out.println("Fecha 2" +f2 );
        
        if(f1.equal(f2))
        {
            
           System.out.println("son iguales ");
        }
        else
        {
            System.out.println("Son distintas");
        }
    }
    
}
