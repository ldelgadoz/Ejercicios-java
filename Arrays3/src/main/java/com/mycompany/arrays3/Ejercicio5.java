/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio5 {
    public static void main(String[] args) {
       
        Scanner datos = new Scanner (System.in);
        
        System.out.println("De cuanto espacio quieres que sea tu array?: ");
        int cantidad = datos.nextInt();
        int [] arreglo = new int[cantidad];
        
        System.out.println("Introduce el numero minimo: ");
        int min = datos.nextInt();
        System.out.println("Introduce el numero maximo: ");
        int max = datos.nextInt();  
        
        Random rnd = new Random();
        int contador = 0;
        boolean esPrimo;
        for (int i = 0; i< cantidad; i++)
        {
            int numeror = rnd.nextInt((max-min)+1) +min;
            int divisores = 0;
            for (int j = 1; j <= numeror; j++) 
            {
                if (numeror % j == 0) 
                {
                    divisores++;
                }
            }
            if (divisores == 2) 
            {
                arreglo[i] = numeror; 
            } 
            else 
            {
                i--; 
            }
        }
        int mayor = arreglo[0];
        System.out.println("Estos son los primos generados");
        for (int i = 0; i<arreglo.length; i++)
        {
           System.out.println(arreglo[i]);
           if (arreglo[i] > mayor)
           {
               mayor = arreglo[i];
           }
        }
        System.out.println("El numero mayor es: "+mayor);
        
        
        
        
        
    }
    }

