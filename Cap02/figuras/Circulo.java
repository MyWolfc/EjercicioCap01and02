/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.figuras;

/**
 *
 * @author Usuario
 */
public class Circulo extends FiguraGeometrica
{
    private int radio;
    
    public Circulo (int r)
    {
        super("Circulo");
        radio = r;
        
    }
    
    public double area()
    {
        return(Math.PI*Math.pow(radio,2));
    }
}
