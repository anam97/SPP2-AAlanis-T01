/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.aalanisc.t01;
import java.util.Scanner ;
/**
 *
 * @author anamartha
 */
public class SPP2AAlanisCT01 {
 // Declaracion de variables
    double mat , cal1 , cal2 , cal3 , cal4 , cal5 , prom ;
    // mat= materi a , cal=calificacion , prom = promedio
    
    Scanner T = new Scanner (System.in) ;
    
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declaracion de variables
    double mat , cal1 , cal2 , cal3 , cal4 , cal5 , prom ;
    // mat= materi a , cal=calificacion , prom = promedio
    
    Scanner T = new Scanner (System.in) ;
        System.out.println("Introduce tu matrícula");
        mat = T.nextDouble();
        System.out.println("Introduce tu primera calificación");
        cal1 = T.nextDouble() ;
        System.out.println("Introduce tu segunda calificación");
        cal2 = T.nextDouble() ;
        System.out.println("Introduce tu tercer calificación");
        cal3 = T.nextDouble();
        System.out.println("Introduce tu cuarta calificación");
        cal4 = T.nextDouble() ;
        System.out.println("Introduce tu quinta calificacion");
        cal5 = T.nextDouble() ;
        
        //Se resuelve el promedio
       prom = ((cal1 + cal2 + cal3 + cal4 + cal5) /5) ;
       
       if (prom > 7.0)
            System.out.println("APROBADO");
       else if  (prom <7.0)
            System.out.println("REPROBADO");
       
       //Mostrar resultado
        System.out.println("Tu promedio es " + prom);
    
              
               
    }
    
}
