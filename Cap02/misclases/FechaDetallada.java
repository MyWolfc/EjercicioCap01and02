/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.misclases;
import Libro.Cap02.fechas.Fecha;
/**
 *
 * @author Usuario
 */
public class FechaDetallada extends Fecha
{
    private static String meses[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    
    public FechaDetallada(String f)
    {
        super(f);
    }
    
    public String toString()
    {
        return getdia() + " de " + meses[getmes()-1]+"de "+ getaños();
    }
    
    
    
    
}
