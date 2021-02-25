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
public class TestFecha2 {
    public static void main(String [] args)
    {
        Fecha f= new Fecha();
        //si se pone como en el libro no corre
        //tenemos que inicializar el objeto;
        f.setdia(2);
        f.setmes(10);
        f.setaño(1970);
        
        System.out.println(f);
    }
}
