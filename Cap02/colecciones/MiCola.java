/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.colecciones;

/**
 *
 * @author Usuario
 */
public class MiCola<T> 
{
    private static final int capacidadInicial = 5;
    
    private Micollecion<T> coll = new Micollecion<T>(capacidadInicial);
    
    public void encolar(T elm)
    {
        coll.agregar(elm);
    }
    
    public T desencolar()
    {
        return coll.eliminar(0);
    }
    
    
    
}
