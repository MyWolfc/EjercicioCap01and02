/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap02.estaticas;

/**
 *
 * @author Usuario
 */
public class TestGC {
    private static int count = 0;
    
    public TestGC()
    {
        count++;
        System.out.println(count);
    }
    public void finalize()
    {
        count--;
    }
    public static void main(String [] args)
    {
        while(true)
        {
            new TestGC();
        }
    }
    
}
