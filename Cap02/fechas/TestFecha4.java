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
public class TestFecha4 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //SE TIENE QUE PONES LA FECHA CON LAS // 
        //EJEMPLO 18/02/2021
        System.out.println("Ingrese Fecha (dd/mm/aaaa)");
        
        String sFecha= scanner.next();
        
        Fecha F = new Fecha(sFecha);
        
        System.out.println("La fecha ingresada es; " + F);
        
        System.out.println("Ingrese dias a sumar (puede ser negativo)");
        int diasSum = scanner.nextInt();
        
        F.addDias(diasSum);
        
        System.out.println("Sumando " + diasSum + "dias,queda: " + F);
    }
}
