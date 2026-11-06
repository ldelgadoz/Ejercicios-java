/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicastringsv;

import java.util.Scanner;

/**
 *
 * @author DIT-MAÑANA
 */
public class PracticaStringsV {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        String frase;
        int cantidad;
        
        System.out.println("Teclea una frase con minimo tres palabras: ");
        frase = datos.nextLine();
        if (frase.equals(" "))
        {
            cantidad = 0;
        }
        else
        {
            String[] palabras = frase.split(" ");
            cantidad = palabras.length;
        }
        if (cantidad <3)
        {
            System.out.println("La cantidad de palabras es menor a 3");
        }
        else
        {
            int cantidadespacios = 0;
            for (int i = 0; i < frase.length(); i++)
            {
                char caracter;
                caracter = frase.charAt(i);
                if (caracter == ' ')
                    cantidadespacios ++;
                else
                {
                    
                }
            }
            System.out.println("La cantidad de espacios que hay son: "+cantidadespacios);
            System.out.println("---------------------");
            System.out.println("Se creara una sub cadena de la posicion 2 a la 12");
            String sub = frase.substring(2,13);
            System.out.println(sub);
            System.out.println("---------------------");
            System.out.println("Se creara una nueva subcadena de la posicion 3 a la 8");
            String sub2 = sub.substring(3, 9);
            System.out.println(sub2);
            System.out.println("---------------------");
            System.out.println("Se va a recorrer la cadena caracter a caracter");
            for (int i = 0; i < sub2.length(); i++)
            {
                char caracter = sub2.charAt(i);
                System.out.println(caracter);
            }
            System.out.println("--------------------------");
            System.out.println("Ahora las letras en posicion par seran mayusculas y las impar sera minuscula");
            String sub2string = "";
            for (int i = 0; i < sub2.length(); i ++)
            {
                char caracter = sub2.charAt(i);
                if (i%2 == 0)
                {
                    caracter = Character.toUpperCase(caracter);
                    System.out.println("Caracter con mayuscula: "+caracter);
                    System.out.println("Su posicion es la :"+i);
                }
                else
                {
                    caracter = Character.toLowerCase(caracter);
                    System.out.println("Caracter con minuscula: "+caracter);
                    
                }
                sub2string += caracter;
            }
            System.out.println("Nueva cadena: "+sub2string);
            
            System.out.println("------------------------");
            System.out.println("Ahora vamos a invertir la cadena anterior ");
            String  sub2inver = "";
            for (int i= sub2.length()-1; i >=0; i--)    
            {
                sub2inver += sub2.charAt(i);
            }
            System.out.println("La nueva cadena es: "+sub2inver);
        }
    }
}
