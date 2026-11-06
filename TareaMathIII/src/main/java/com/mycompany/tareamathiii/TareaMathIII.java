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
        
    }
}
