/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicaclasestring;

import java.util.Scanner;

/**
 *
 * @author DIT-MAÑANA
 */
public class PracticaClaseString {

    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);

        String contraseña;
        System.out.println("Intoduce la contraseña:");
        contraseña = datos.next();
        String caracter1;
        
        String caracter2;
        caracter2 = "";
        caracter1 = "";
        int n;
        n=contraseña.length();
        if (contraseña.length()<25)
        {
            if (contraseña.indexOf("@")<0 && contraseña.indexOf(".")<0 && contraseña.indexOf("$")<0 && contraseña.indexOf("#")<0 && contraseña.indexOf("&")<0  && contraseña.indexOf("/")<0)
            {
                System.out.println("Su contraseña cumple los parametros se almacenara");
                caracter1 = contraseña.substring(0, 1).toUpperCase();
                caracter2 = contraseña.substring(n - 1, n).toUpperCase();
                
            }
            else
            {
                System.out.println("La contraseña contiene caracteres especiales");
            }
        }
        else
        {
            System.out.println("La contraseña tiene mas de 25 caracteres");
        }
        
        //2.
       Scanner datos2=new Scanner(System.in);
       System.out.println("Introduce");
       String hola;
       hola = datos2.nextLine();
       int n2;
       n2 = hola.length();
       
       System.out.println(hola.substring(0, n2/2));
       System.out.println(hola.substring(n2-1, n2));
       for (int i=n2 -1;i >=0; i--)
       {
           System.out.print(hola.charAt(i));
       }
       System.out.println("");
       for (int i=0; i<n2 ; i++)
       {
           char letra = hola.charAt(i);
           System.out.print(hola.charAt(i)+"-");
       }
       
       System.out.println("");
       int contador =0;
       
       
       for (int i=0; i<n2; i++)
       {
           char letra = hola.charAt(i);
           if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
           {
               contador +=1;
           }
        
       }
       System.out.println(contador);
       
       System.out.println("-------------------------------");
       
       String texto;
       System.out.println("Introduzca un texto");
       texto = datos2.nextLine();
       for (int i = 0; i < texto.length(); i++) 
       {
            char letra = texto.charAt(i);
            if (letra == ' ') 
            {
                System.out.println(); 
            } 
            else 
            {
                System.out.print(letra); 
            }
        }
       
    }
}
