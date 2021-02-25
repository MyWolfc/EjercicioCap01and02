/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.colecciones;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class TestMiColeccion {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese Nombre; " );
        String nom = sc.next();
        
        Micollecion<String>  mc = new Micollecion<String>(5);
        while( !nom.equals("FIN"))
        {
            mc.insertar(nom, 0);
            
            nom = sc.next();
        }
        String aux;
        
        for(int i = 0; i<mc.cantidad();i++)
        {
            aux = (String) mc.obtener(i);
            
            System.out.println(aux + " - " + aux.length() + " Caracteres");
        }
    }
}
