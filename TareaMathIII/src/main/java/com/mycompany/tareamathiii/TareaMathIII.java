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
        
    }
}
