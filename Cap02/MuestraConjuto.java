/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02;

/**
 *
 * @author Usuario
 */
public class MuestraConjuto 
{
    public static void mostrar(Object[] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            System.out.println("arr["+ i +"] =" + arr[i]);
        }
    }
}