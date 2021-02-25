/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Cap01;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class DemoArray2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String Dias[] = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        System.out.println("Ingrese un dia de la semana(Numero)");
        int v=scanner.nextInt();
        if(v<=Dias.length && v>0 )
        {
           System.out.println(Dias[v-1]);
        }
        else
        {
            System.out.println("Dia incorrecto");
        }
        
        
        
        
    }
    
}
