/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.misclases;

/**
 *
 * @author Usuario
 */
public class TestFechaDetallada {
    public static void main(String[] args)
    {
        FechaDetallada f=new FechaDetallada("1/10/1900");
        f.setdia(25);
        f.setmes(10);
        f.setaño(2009);
        System.out.println(f);
        
    }
    
}
