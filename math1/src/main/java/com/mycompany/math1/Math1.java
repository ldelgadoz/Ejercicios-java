/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.math1;

/**
 *
 * @author DIT-MAÑANA
 */
public class Math1 {

    public static void main(String[] args) {
        System.out.println(Math.PI);
        //calculamos raiz cuadrada de un valor
        System.out.println(Math.sqrt(15));
        
        //Funcion para redondear
        double n = 2.3;
        System.out.println(Math.floor(n));
        //ceil redonde a normal
        System.out.println(Math.ceil(n));
        //round
        System.out.println(Math.round(n));
        //creamos valor absolluto 
        int n2 = -2;
        System.out.println(Math.abs(n2));
        //Calculo numero aleatorio 
        
        System.out.println(Math.random());
        
        int n3 = (int)(Math.random()*100);
        System.out.println(n3);
        
        //maximo y minimo
        
        System.out.println("El valor mayor es: "+ Math.max(n, n2));
        System.out.println("El valor minimo es: "+ Math.min(n, n2));
        
    }
}
