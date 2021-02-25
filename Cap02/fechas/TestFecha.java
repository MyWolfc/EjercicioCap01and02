/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.fechas;

/**
 *
 * @author Usuario
 */
public class TestFecha {
    public static void main(String[] args)
    {
        Fecha f = new Fecha();
        f.setdia(2);
        f.setmes(10);
        f.setaño(1970);
        System.out.println("Dia= " + f.getdia());
        System.out.println("Mes= " + f.getmes());
        System.out.println("Año= " + f.getaños());
        System.out.println(f);
    }
    
}
