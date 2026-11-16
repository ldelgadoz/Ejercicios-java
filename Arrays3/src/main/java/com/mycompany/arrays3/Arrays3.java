/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays3;

import java.util.Arrays;
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
        boolean capicua = true;
        
        for (int i = 0; i<20/2; i++)
        {
            if (array2[i] != array2[(20-1)-i])
            {
                capicua = false;
                break;
            }
        }
        
        if (capicua)
        {
            System.out.println("El array es capicua");
        }
        else 
        {
            System.out.println("El array no es capicua");
        }
        
        //3
        
       
        System.out.print("Introduce el tamaño 'n' para ambos arreglos: ");
        int h = datos.nextInt();
        int [] array3 = new int [h];
        int [] array4 = new int [h];
        
        for (int i = 0; i<array3.length; i++)
        {
            array3[i] = 1;
            array4[i] = 2;
        }

        System.out.println("Vamos a cambiar los valores, el primer array contiene 1 y el segundo 2");
        
        
        for (int i = 0; i <h; i++)
        {
            int provisional = array3[i];
            array3[i] = array4[i];
            array4[i] = provisional;
        }
        System.out.println("MOSTRAMOS LOS ARRAYS");
        System.out.println("ARRAY 1 = "+Arrays.toString(array3));
        System.out.println("ARRAY 1 = "+Arrays.toString(array4));
        
        
        
    }
}
