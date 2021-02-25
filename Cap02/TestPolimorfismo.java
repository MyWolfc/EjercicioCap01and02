/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02;
import Libro.Cap02.fechas.Fecha;
import Libro.Cap02.misclases.FechaDetallada;
/**
 *
 * @author Usuario
 */
public class TestPolimorfismo {
    public static void main(String[] args)
    {
        Fecha fec = new FechaDetallada("25/02/2009");
        
        Object obj = new FechaDetallada("3/12/2008");
        
        System.out.println("fec =" + fec);
        System.out.println("obj =" + obj);
    }
    
}
