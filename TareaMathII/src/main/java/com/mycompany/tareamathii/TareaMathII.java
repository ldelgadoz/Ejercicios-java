/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareamathii;

import java.util.Scanner;

/**
 *
 * @author DIT-MAÑANA
 */
public class TareaMathII {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        
        int tiempo;
        String continuar;
        
        
        do{
            System.out.println("Introduce el valor del segundo:");
            tiempo = datos.nextInt();
            int minuto;
            minuto = tiempo/60;
            System.out.println("Estas en el minuto: "+Math.floor(minuto));
            System.out.println("¿Desea continuar? s/n ?:");
            continuar = datos.next();
            
 
        }
        while(continuar.equalsIgnoreCase("s"));
        System.out.println("Gracias");
        
    }
}
