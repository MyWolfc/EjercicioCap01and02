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
public class DemoSwitch {
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un dia de la semana (En numero): ");
        int V = scanner.nextInt();
        
        String Dia;
        
        switch( V )
          {
            case 1:
                Dia = "Lunes";
                 break;
            case 2:
                Dia = "Martes";
                break;
            case 3:
                Dia = "Miercoles";
                break;
            case 4:
                Dia = "Jueves";
                break;
            case 5:
                Dia = "Viernes";
                break;
            case 6:
                Dia = "Sabado";
                break;
            case 7:
                Dia = "Domingo";
                break;
            default:
                Dia = "Dia incorrecto.. valores del 1 al 7";
                        break;
                    
          }
        System.out.println(Dia);
    }
    
}
