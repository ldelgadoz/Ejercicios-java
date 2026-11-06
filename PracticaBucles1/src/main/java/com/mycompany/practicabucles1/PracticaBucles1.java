/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicabucles1;

import java.util.Scanner;

/**
 *
 * @author DIT-MAÑANA
 */
public class PracticaBucles1 {

    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        for (int contador=1; contador<100; contador+=10)
        {
            System.out.println(contador);
        }
        System.out.println("100");
        
        ////////////////////////////////////////
        
        int numero;
        System.out.println("Introduce un numero: ");
        numero = datos.nextInt();
        while (numero >0)
        {
            System.out.println(numero*2);
            System.out.println("Introduce un numero: ");
            numero = datos.nextInt();
        }
        System.out.println("El numero es 0, se acaba el bucle");
        
        
        ///////////////////////////////////////////////////
        
        int cantidadn;
        int numeros;
        int positivos;
        int negativos;
        positivos = 0;
        negativos = 0;
        
        
        System.out.println("¿Cuantos numeros vas a imprimir?");
        cantidadn = datos.nextInt();
        
        for ( int vuelta=0; vuelta < cantidadn; vuelta  +=1)
        {
           System.out.println("Introduce un numero");
           numeros = datos.nextInt();
           if (numeros >0)
           {
               positivos += 1;
           }
           else if (numeros < 0)
           {
               negativos +=1;
           }
           else if (numeros == 0)
           {
               System.out.println ("El numero es  0 por lo que no se suma a nada");
           }
        }
        System.out.println("Estos son los numeros positivos: "+positivos);
        System.out.println("Estos son los numeros negativos: "+negativos);
        
        
        ///////////////////////////////////
        
        int numerow;
        numerow = 1;
        
        do
        {
            numerow +=10;
            System.out.println(numerow);
        }
        while(numerow != 91);
        System.out.println("100");
        
        
        
        
        
        
        
        
        
        
    }
}
