/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class RETO {
    public static void main(String[] args){
       Scanner datos = new Scanner (System.in);
       
       System.out.println("---FASE INICIAL---");
       String oj1,oj2,oj3;
       System.out.println("Hola jugadores, quereis iniciar un nuevo juego? todos deben votar que si");
       System.out.print("Jugador1: ");
       oj1 = datos.nextLine();
       System.out.print("Jugador2: ");
       oj2 = datos.nextLine();
       System.out.print("Jugador3: ");
       oj3 = datos.nextLine();
       
       if (oj1.equals("si") && oj2.equals("si") && oj2.equals("si"))
       {
           System.out.println("¡QUE EMPIEZE EL JEUGO!");
           do{
           
           
            }
            while(oj1.equals("si") && oj2.equals("si") && oj3.equals("si"));
       }
       else {
           System.out.println("Perfecto, hasta luego");
       }
       
//QUEDA TERMINARLO SE ACTUALIZARA LA ENTREGA EN CASO DE QUE SE COMPLETE.       
       
       
    
    
    }
    
}
