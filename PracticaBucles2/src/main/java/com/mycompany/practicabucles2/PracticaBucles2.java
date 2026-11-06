/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicabucles2;

import java.util.Scanner;

/**
 *
 * @author DIT-MAÑANA
 */
public class PracticaBucles2 {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
    
        for (int contador =1; contador <1000; contador+=5)
        {
            System.out.println(contador);
        }
        System.out.println("1000");

        ///////////////
        
        for (int contador =10000; contador >1; contador-=10)
        {
            System.out.println(contador);
        }
        System.out.println("1");
        
        //////////////
        
        String nombre;
        int veces;
        
        System.out.println("¿Cual es tu nombre?");
        nombre = datos.next();
        System.out.println("¿Cuantas veces quieres repetirlo?");
        veces = datos.nextInt();
        
        for (int contador = 0; contador < veces; contador+=1 )
        {
            System.out.println(nombre);
            
        }
        
        ///////////////
        
        int numeros2;
        
        System.out.println("Introduzca un numero: ");
        numeros2 = datos.nextInt();
        
        while (numeros2 !=0)
        {
            System.out.println("Introduzca un numero: ");
            numeros2 = datos.nextInt(); 
        }
        System.out.println("Ya es 0, puede seguir haciendo lo q este haciendo");
        
        ///////////////
        
        
        int numeros3;
        numeros3 = 0;
        do
        {
            numeros3+=1;
            System.out.println(numeros3);
        }
        while(numeros3 <100);
        System.out.println("100");
        
        
        //////////////////////////////
        
        int numero4;
        numero4 = 0;
        
        while (numero4 < 100)
        {
            System.out.println(numero4+=1);
        }
        
        
                
            
        
    
    
    
    }
}
