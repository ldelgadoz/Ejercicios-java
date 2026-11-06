/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bucles3;

import java.util.Scanner;

/**
 *
 * @author DIT-MAÑANA
 */
public class Bucles3 {

    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        
        int n;
        
        System.out.println("Introduce un numero");
        n = datos.nextInt();
        
        while(n !=0)
        {
            if (!(n%2 == 0 && n == 2))
            {
                System.out.println("El numero es primo");
            }
            else {
                System.out.println("El numero no es primo");
            }
            System.out.println("Introduce un numero");
            n = datos.nextInt();
        }
        
        ////////////////
        int a = 0;
        int b = 1;

        System.out.println("Los 10 primeros números de Fibonacci ");

        for (int i = 0; i < 10; i++) 
        {
            
            if (i < 10 ) {
                System.out.print(a+",");
            } else {
                System.out.print(a);
            }
            int temporal = a + b;
            a = b;
            b = temporal;
        }
        
        
        /////////////////////////
        ///*
        ///3.Calcular el factorial del número 15.
        ///El factorial de un número entero positivo (\(n\)) es el producto de todos los números enteros positivos desde el \(1\) hasta ese número
        ///
        ///
       System.out.println("---------------------------------"); 
       long resultado = 1;
      
        for (int i=1; i <15; i++)
        {
            resultado = resultado*i;
        }
            System.out.println(resultado);
        
        
        
        
        
        int numero;
        System.out.println("Introduce un numero del 0 al 999 y te diremos los digitos: ");
        numero = datos.nextInt();
        
        while (numero != 0)
        {
            if (numero >= 1 && numero <=9)
            {
                System.out.println("El numero tiene 1 digito");
            }
            else if (numero >= 10 && numero <=99)
            {
                System.out.println("El numero tiene 2 digitos");
            }
            else if (numero >= 100  && numero <1000)
            {
                System.out.println("El numero es de 3 digitos");
            }
            else
            {
                System.out.println("Ese numero no esta en el rango propuesto");
            }
        System.out.println("Introduce un numero del 0 al 999 y te diremos los digitos: ");
        numero = datos.nextInt(); 
        }
        System.out.println("El numero es 0, hasta pronto");
        
        
        int numero2;   
        do
        {
            System.out.println("Introduzca numeros por pantalla");
            numero2 = datos.nextInt();
            for (int i = 0; i<numero2; i++)
            {
                System.out.println(numero2*i);
            }
        }
        while(numero2 !=0);
        
        System.out.println("Hasta pronto");
    }
}
