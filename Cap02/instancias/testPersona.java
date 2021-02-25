/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.instancias;
import Libro.Cap02.misclases.FechaDetallada;
/**
 *
 * @author Usuario
 */
public class testPersona {
    public static void main(String [] args)
    {
        Persona p1 = new Persona("Juan","21773823",new FechaDetallada("12/6/1971"));
        Persona p2 = new Persona("Pablo","19234452",new FechaDetallada("12/6/1968"));
        
        System.out.println(p1);
        System.out.println(p1);
        System.out.println(p1);
        System.out.println("--------");
        System.out.println(p2);
        System.out.println(p2);
        System.out.println("----------");
        System.out.println(p1);
        System.out.println(p1);
    }
    
}
