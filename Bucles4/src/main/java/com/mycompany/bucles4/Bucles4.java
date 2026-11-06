/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bucles4;

import java.util.Scanner;

/**
 *
 * @author DIT-MAÑANA
 */
public class Bucles4 {

    public static void main(String[] args) {
        
        int n1;
        n1=0;
        while(n1 !=100)
        {
            System.out.println(n1+=1);
        }
        
        
        for (int i=1;i<101;i++)
        {
            System.out.println(i);
        }
        
        /////////////////////////////////////////////////
        int n2;
        Scanner datos=new Scanner(System.in);
        int suma;
        suma = 0;
        System.out.println("Introduzca un numero");
        n2 = datos.nextInt();
        
        while(n2>= 0)
        {
            suma += n2;
            System.out.println(suma);
            System.out.println("Introduzca un numero");
            n2 = datos.nextInt();
        }
        System.out.println("Este es el resultado de la ultima suma: "+suma);
        
        //////////////////////////////
        
        int opcion;
        int numero1;
        int numero2;
        
        do
        {
            System.out.println("--- MENU ---");
            System.out.println("1- Sumar numeros");
            System.out.println("2- Restar dos numeros");
            System.out.println("3- Multiplicar dos numeros");
            System.out.println("4- Salir");
           
            System.out.println("Introduzca una opción: ");
            opcion = datos.nextInt();
            if (opcion == 1)
            {
                System.out.println("Introduce el primer numero: ");
                numero1 = datos.nextInt();
                System.out.println("Introduce el segundo numero: ");
                numero2 = datos.nextInt();
                System.out.println("La suma de ambos numeros es: "+(numero1+numero2));
                
            }
            else if(opcion == 2)
            {
                System.out.println("Introduce el primer numero: ");
                numero1 = datos.nextInt();
                System.out.println("Introduce el segundo numero: ");
                numero2 = datos.nextInt();
                System.out.println("La resta de ambos numeros es: "+(numero1-numero2));                
            }
            else if (opcion == 3)
            {
                System.out.println("Introduce el primer numero: ");
                numero1 = datos.nextInt();
                System.out.println("Introduce el segundo numero: ");
                numero2 = datos.nextInt();
                System.out.println("La multiplicacion de ambos numeros es: "+(numero1*numero2));                
            }
            else if(opcion == 4)
            {
                
            }
            else
            {
                System.out.println("Eso no es una opción");
            }
        }
        while(opcion !=4);
        System.out.println("Hasta luego");
    }
    
}
