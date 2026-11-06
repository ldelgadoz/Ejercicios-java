/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareamathiii;

import java.util.Scanner;

/**
 *
 * @author DIT-MAÑANA
 */
public class TareaMathIII {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        
        /////////1
        
        double radio;
        
        System.out.println("Introduce el radio del circulo: ");
        radio = datos.nextDouble();
        double area;
        area =(radio*radio)* (Math.PI);
        System.out.println("Este es: "+Math.round(area));
        
        
        //////////////2
        
        int cantidad;
        
        System.out.println("¿Cuantos numeros quieres teclear?:");
        cantidad = datos.nextInt();
        
        for (int i=0; i<cantidad;i++)
        {
           System.out.println(Math.random());
        }
        
        System.out.println("Ahora haremos lo mismo pero con numeros que nos pidas");
        
        int n1,n2;
        
        
        System.out.println("¿Cuantos numeros quieres teclear?: ");
        cantidad = datos.nextInt();
        System.out.println("Introduce el rango primero el primer numero: ");
        n1 = datos.nextInt();
        System.out.println("Introduce el segundo: ");
        n2 = datos.nextInt();
        System.out.println("---NUMEROS---");
        for (int i = 0; i<cantidad;i++)
        {
            int numero = (int) (Math.random() * (n2 - n1 + 1)) + n1;
            System.out.println(numero);
        }
        
        ///////3
        System.out.println("---PROGRAMA ECUACIÓN---");
        
        double a,b,c,x;
   
        System.out.println("---Introduce los valores---");
        System.out.print("a: ");
        a = datos.nextDouble();
        System.out.println();
        System.out.print("b: ");
        b = datos.nextDouble();
        System.out.println();
        System.out.print("c: ");
        c = datos.nextDouble();
        System.out.println();
        
        if (a == 0)
        {
            System.out.println("No es posible ya que no se puede dividir entre 0");
            
        }
        else
        {
             double raiz = Math.pow(b, 2) - 4 * a * c;
            if (raiz > 0)
            {
                double x1 = (-b + Math.sqrt(raiz)) / (2 * a);
                double x2 = (+b + Math.sqrt(raiz)) / (2 * a);
                System.out.println("Primer resultado X1 = "+x1);
                System.out.println("Segundo resultado X2 = "+x1);
            }
            else if (raiz == 0)
             {
                x = -b / (2 * a);
                System.out.println("Este es el valor de X = "+x);
             }
            else if (raiz < 0)
            {
                System.out.println("No hay solucion real");
            }
             
        }

        
    }
}
