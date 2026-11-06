/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionalesanidadas;

import java.util.Scanner;

/**
 *
 * @author DIT-MAÑANA
 */
public class CondicionalesAnidadas {

    public static void main(String[] args) {
        
        float n1;
        Scanner datos1=new Scanner(System.in);
        
        //pedimos datos
        System.out.println("Introduzca tu nota porfa: ");
        n1 = datos1.nextInt();
        
        // si es >= que 9 sobresaliente si es >= 7 notable >=5 aprobado < 5 suspeso
        
        if (n1 >= 9){
            System.out.println("Usted tiene un sobresaliente");
        
        }
        else if (n1 >=7){
            System.out.println("Su calificación es de notable");
        }
        else if (n1 >= 5){
            System.out.println("Su calificación es de aprobado");
        }
        else if (n1 < 5){
            System.out.println("Tiene una calificación suspensa");
        }

            
    }
}
