/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        int opcion;
        int ne;
        int nt;
        int np;
        do
        {
            System.out.println("=== MENU ===");
            System.out.println("1- Triangulo de asteriscos");
            System.out.println("2-  Tabla de multiplicar completa");
            System.out.println("3- Piramide de numeros");
            System.out.println("0- Salir");
            
            System.out.println("Introduce una opción: ");
            opcion = datos.nextInt();
            
            switch(opcion)
            {
                case 1:
                    System.out.println("Introduzca un numero entero positivo");
                    ne = datos.nextInt();
                    for (int i=0; i<=ne; i++)
                    {
                        for (int j=0; j<=i; j++)
                        {
                            System.out.print("*");
                        }
                        System.out.println();
                    }       
                    break;
                case 2:
                    System.out.println("De cuantos numeros quieres la tabla de multplicar?: ");
                    nt = datos.nextInt();
                    
                    for (int i = 1; i<=nt; i++)
                        
                    {
                        for (int j = 1; j<=10; j++)  
                        {
                            System.out.print((i*j));
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Introduce un numero entero positivo: ");
                    np = datos.nextInt();
                    
                    for (int i=1; i<= np; i++)
                    {
                        for(int j=1; j<=i; j++)
                        {
                            System.out.print(j);
                        }
                        System.out.println();
                    }
                    break;
            }       
           
        }
        while(opcion !=0);
        System.out.println("Hasta luego");
    }
} 
