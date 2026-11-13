/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays3;

import java.util.Scanner;

/**
 *
 * @author DIT-MAÑANA
 */
public class Arrays3 {

    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
        
        //1
        String[] nombres = new String[3];
        String n;
        for (int i = 1; i<nombres.length;i++)
        {
            
            System.out.println("Introduce nombres a poder ser diferentes ");
            n = datos.nextLine();
            boolean igual = false;
            
            for(int j = 0; j<nombres.length; j++)
            {
                if (n.equalsIgnoreCase(nombres[j]))
                {
                    igual = true;
                    System.out.println("Ese nombre ya esta por lo que no se añade");
                    break;
                }
                else
                {
                    nombres[i] = n;
                }
            }
            
        }
        for (int i = 0; i<nombres.length;i++)
        {
            System.out.println(nombres[i]);
        }
        
        //2
        int[] array2 = new int[20];
        int num;
        for (int i = 0; i<array2.length;i++)
        {
            System.out.println("Introduce un numero: ");
            num = datos.nextInt();
            array2[i] = num;
        }
    }
}
