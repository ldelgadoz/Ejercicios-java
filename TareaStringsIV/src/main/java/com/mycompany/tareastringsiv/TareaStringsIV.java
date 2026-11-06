/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareastringsiv;

import java.util.Scanner;

/**
 *
 * @author DIT-MAÑANA
 */
public class TareaStringsIV {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        System.out.println("Introduce una frase de al menos 25 caracteres");
        String frase = datos.nextLine();
        int contador = 0;
        int contador2 = 0;
        int a= 0,e= 0,i2= 0,o= 0,u = 0;
        if (frase.length()>=25)
        {
            for (int i = 0; i<frase.length(); i++)
            {
                char caracter = frase.charAt(i);

                if (caracter == 'a'|| caracter == 'A')
                {
                    a+=1;
                    contador++;
                }
                else if (caracter == 'e' || caracter == 'E')
                {
                    e+=1;
                    contador++;
                }
                else if (caracter == 'i'|| caracter == 'I')
                {
                    i2 += 1;
                    contador++;
                }
                else if (caracter == 'o' || caracter == 'O')
                {
                    o+=1;
                    contador++;
                }
                else if (caracter == 'u'|| caracter == 'U')
                {
                    u += 1;
                    contador++;
                }  
            }
            System.out.println("El numero de vocales que aparece es: " + contador);
            
            if (a>0)contador2++;
            if (e>0)contador2++;
            if (i2>0)contador2++;
            if (o>0)contador2++;
            if (u>0)contador2++;
            
            System.out.println("Este es el numero de vocales diferentes: "+contador2);
            
            
        }
        else
        {
            System.out.println("El numero de caracteres es inferior a 25");
        }
        
        String direccion;
        System.out.println("Introduzca la dirección de correo");
        direccion = datos.next();
        int posicion = direccion.indexOf('@');
        if (posicion != -1)
        {
            String servidor = direccion.substring(posicion);
            if (servidor.equals("@Digitechfp.com"))
            {
                System.out.println("el servidor es correcto");
            }
            else 
            {
                System.out.println("el servidor no es correcto");
            }
        }
        else
        {
            System.out.println("El correo no tiene un @");
        }
        
        System.out.println("--------------");
        String nombre;
        String nombreu;
        System.out.println("Introduzca su nombre; ");
        nombre = datos.next();
        System.out.println("Introduzca su nombre de usuario: ");
        nombreu = datos.next();
        
boolean todoMinusculas = true;
        boolean esAlterno = true;

        int cantA = 0, cantE = 0, cantI = 0, cantO = 0, cantU = 0;

        for (int i = 0; i < nombre.length(); i++) {
            char x = nombre.charAt(i);

            if (!(x >= 'a' && x <= 'z')) {
                todoMinusculas = false;
            }

            if (i % 2 == 0) {
                if (!(x >= 'a' && x <= 'z')) {
                    esAlterno = false;
                }
            } else {
                if (!(x >= 'A' && x <= 'Z')) {
                    esAlterno = false;
                }
            }

            if (x == 'a' || x == 'A') cantA++;
            else if (x == 'e' || x == 'E') cantE++;
            else if (x == 'i' || x == 'I') cantI++;
            else if (x == 'o' || x == 'O') cantO++;
            else if (x == 'u' || x == 'U') cantU++;
        }

        System.out.println("\n--- RESULTADOS NOMBRE ---");
        System.out.println("¿Está todo en minúsculas?: " + todoMinusculas);
        System.out.println("¿Alterna minúsculas y mayúsculas?: " + esAlterno);

        System.out.println("Vocales repetidas en el nombre:");
        if (cantA > 1) System.out.println(" - 'a' se repite " + cantA + " veces");
        if (cantE > 1) System.out.println(" - 'e' se repite " + cantE + " veces");
        if (cantI > 1) System.out.println(" - 'i' se repite " + cantI + " veces");
        if (cantO > 1) System.out.println(" - 'o' se repite " + cantO + " veces");
        if (cantU > 1) System.out.println(" - 'u' se repite " + cantU + " veces");

        int mayusculas = 0;
        int separadoresPrimeraMitad = 0;
        int mitad = nombreu.length() / 2;

        for (int i = 0; i < nombreu.length(); i++) {
            char x = nombreu.charAt(i);

            if (x >= 'A' && x <= 'Z') {
                mayusculas++;
            }

            if (i < mitad) {
                if (x == '-' || x == '_' || x == '.') {
                    separadoresPrimeraMitad++;
                }
            }
        }

        System.out.println("\n--- RESULTADOS USUARIO ---");
        System.out.println("¿La mitad de caracteres son mayúsculas?: " + (mayusculas == mitad));
        System.out.println("Separadores en la primera mitad: " + separadoresPrimeraMitad);

        System.out.println("Consonantes repetidas:");
        for (char c = 'a'; c <= 'z'; c++) {
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                int contador3 = 0;

                for (int i = 0; i < nombreu.length(); i++) {
                    char x = nombreu.charAt(i);

                    if (x >= 'A' && x <= 'Z') {
                        x = (char) (x + 32);
                    }

                    if (x == c) {
                        contador3++;
                    }
                }

                if (contador3 > 1) {
                    System.out.println(" - '" + c + "' se repite " + contador3 + " veces");
                }
            }
        }
    }
}
