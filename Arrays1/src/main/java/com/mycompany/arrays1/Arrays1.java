/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays1;

import java.util.Scanner;

/**
 *
 * @author DIT-MAÑANA
 */
public class Arrays1 {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        
       
        String frase;
        System.out.print("Introduce una frase: ");
        frase = datos.nextLine();
        char[] lista = new char[frase.length()];
        
        for (int i = 0; i<frase.length();i++)
        {
            
            char caracter = frase.charAt(i);
            lista[i] = caracter;
        }
        for (int i = 0; i< lista.length;i++)
        {
            System.out.println(lista[i]);
        }
        
    }
}
