/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap01.Cadenas;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Cadenas6 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        
        System.out.println("Valor ingresado:" + v);
        System.out.println("Binario = "+Integer.toBinaryString(v));
        System.out.println("Octal = " + Integer.toOctalString(v));
        System.out.println("Hexadeciaml = " + Integer.toHexString(v));
        
        System.out.println("Ingrese una base numerica; ");
        int b = scanner.nextInt();
        
        String sBaseN = Integer.toString(v,b);
        System.out.println(v+" en base("+b+") = " + sBaseN);
    }
}
