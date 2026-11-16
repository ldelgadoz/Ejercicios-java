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
public class Ejercicio6 {
    
     public static void main(String[] args){
         Scanner datos = new Scanner(System.in);
         Random rnd = new Random();
         System.out.println("Introduce el numero de posiciones del primer arreglo: ");
         int p = datos.nextInt();
         int [] a1 = new int[p];
         System.out.println("Introduce el numero de posiciones del segundo arreglo: ");
         p = datos.nextInt();
         int [] a2 = new int[p];
         
         System.out.println("Introduce el minimo para el primer arreglo: ");
         int min = datos.nextInt();
         System.out.println("Introduce el maximo para el primer arreglo: ");
         int max = datos.nextInt();
         
         for (int i = 0; i<a1.length; i++)
         {
            int numeror = rnd.nextInt((max - min)+1)+min;
            a1[i] = numeror;
         }
         
         System.out.println("Introduce el minimo para el SEGUNDO arreglo: ");
         min = datos.nextInt();
         System.out.println("Introduce el maximo para el SEGUNDO arreglo: ");
         max = datos.nextInt();
         
         for (int i = 0; i<a2.length; i++)
         {
            int numeror = rnd.nextInt((max - min)+1)+min;
            a2[i] = numeror;
         }     
         
         System.out.println("Vamos a multiplicar y mostrar los resultados");
         
         int longitud;
         if (a1.length < a2.length)
         {
             longitud = a1.length;
         }
         else
         {
             longitud = a2.length;
         }
         for (int i = 0; i < longitud; i ++)
         {
             int multi = a1[i]* a2[i];
             System.out.println("El resultado de la posicion "+i+" es:"+multi);
         }
         System.out.println("CONTENIDO ARRAY 1");
         for (int i = 0; i<a1.length; i++)
         {
             System.out.println(a1[i]);
         }
         System.out.println("CONTENIDO ARRAY 2");
         for (int i = 0; i<a2.length; i++)
         {
             System.out.println(a2[i]);
         }

     }
}
