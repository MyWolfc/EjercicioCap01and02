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
public class DemoConstantes {
    public static final int Lunes = 1;
    public static final int Martes = 2;
    public static final int Miercoles = 3;
    public static final int Jueves = 4;
    public static final int Viernes = 5;
    public static final int Sabado = 6;
    public static final int Domingo = 7;
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Ingrese un dia de la semana (Numero): ");
        int V = scanner.nextInt();
        
        String Dia;
        
        switch (V)
        {
            case Lunes:
                Dia = "Lunes";
                 break;
            case Martes:
                Dia = "Martes";
                break;
            case Miercoles:
                Dia = "Miercoles";
                break;
            case Jueves:
                Dia = "Jueves";
                break;
            case Viernes:
                Dia = "Viernes";
                break;
            case Sabado:
                Dia = "Sabado";
                break;
            case Domingo:
                Dia = "Domingo";
                break;
            default:
                Dia = "Dia incorrecto.. valores del 1 al 7";
                        break;
        }
        
        System.out.println(Dia);
        
    }
}
