/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bucles;

import java.util.Scanner;

/**
 *
 * @author DIT-MAÑANA
 */
public class Bucles {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    
        //se ejecuta un determinado numero de veces
        
        //primera parte "contador =1" crea la variable, la segunda indica la condición y la tercera el que se hace
        for(int contador = 1; contador <6;contador++)
        {
            System.out.println("Estoy dentro del bucle el contador vale: "+contador);
        }
    
    //adivina un numero del 1 al 10 y tienes 3 intentos
    
        int numeros;
        int intento;
        numeros = 7;
        
        Scanner datos=new Scanner (System.in);
        
        System.out.println("Introduce un numero del 1-10: ");
        intento = datos.nextInt();
        for(int contador2 = 1;contador2 <3; contador2 +=1)
        {
            if(intento == numeros)
            {
                System.out.println("Es el numero correcto, felicidades");
                break;
            }
            else
            {
                System.out.println("Ese no es el numero");
                System.out.println("Introduce un numero del 1-10: ");
                intento = datos.nextInt();
            }
        }
        /////////////////////////////////////////////////////////////////////////////////       
        int intento2;
        int numeros2;
        numeros2 = 4;
        int contador2;
        contador2 = 1;
        //el bucle mientras se ejecuta si la condicion se cumple
            System.out.println("Introduce un numero del 1-10: ");
            intento2 = datos.nextInt();
        while(numeros2 != intento2 && contador2 != 3)
        {
            System.out.println("Introduce un numero del 1-10: ");
            intento2 = datos.nextInt();
            contador2 +=1;
        }
        if (intento2 == numeros2)
        {
            System.out.println("Has acertado");
        }
        else{
            System.out.println("Se han acabado los intentos");
        }
        
        //// DO WHILE
        
        int dato3;
        dato3 = 0;
        
        do
        {
            System.out.println("Inroduce un num numero");
            dato3 =  datos.nextInt();
        }
        while(dato3 != 0);
        {
                    
        }
    }
}
