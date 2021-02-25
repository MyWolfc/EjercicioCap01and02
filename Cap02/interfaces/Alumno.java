/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.interfaces;

/**
 *
 * @author Usuario
 */
public class Alumno implements Comparable<Alumno> 
{
    private String nombre;
    private int edad;
    private double notapromedio;
    
    public Alumno(String nom, int e, double np)
    {
        this.nombre = nom;      
        this.edad = e;      
        this.notapromedio = np;
    }
    
     public int compareTo(Alumno otroAlumno)   
     {      
         return this.edad - otroAlumno.edad;   
     }
     
      public String toString()   
      {      
          return nombre+", "+edad+", "+notapromedio;   
      } 
}      

