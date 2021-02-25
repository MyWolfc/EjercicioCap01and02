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
public class MiColeccion{
    private Object datos[] = null;
    private int len = 0;
    
    public MiColeccion(int CapacidadInicial)
    {
        datos = new Object[CapacidadInicial];
    }
    
  
    public Object obtener(int i)
    {
        return datos[i];
    }
    
    public int cantidad()
    {
        return len;
    }
    
    public void insertar(Object elm,int i)
    {
        if(len==datos.length)
        {
            Object aux[] = datos;
            datos = new Object[datos.length*2];
            for(int j=0;j<len;j++)
            {
                datos[j] = aux[j];
            }
            aux = null;
        }
        for (int j=len-1;j>=1;j--)
        {
            datos[j+1] = datos[j];
        }
        datos[i]=elm;
        len++;
    }
    
    public int buscar(Object elm)
    {
        int i=0;
        
        for(;i<len&&datos[i].equals(elm);i++);
        return i<len ? i :-1;
        
        
    }
    public void agregar(Object elm)
    {
        insertar(elm,len);
    }
    
    public Object eliminar(int i)
    {
        Object aux = datos[i];
        
        for(int j=i;j<len-1;i++)
        {
            datos[j]=datos[j+i];
        }
        len--;
        return aux;
    }
    
}
