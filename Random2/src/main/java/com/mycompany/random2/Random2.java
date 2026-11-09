/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.random2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author reman
 */
public class Random2 {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        Random rand =  new Random();
        int opcion;
        String continuar;
        
        do{
            System.out.println("---- GENERADOR CONTRASEÑAS ----");
            System.out.println("1- Generar contraseña");
            System.out.println("2- Salir");
            
            System.out.println();
            System.out.print("Introduce una opcion: ");
            opcion = datos.nextInt();
            System.out.println();
            
            if (opcion == 1)
            {
                int longitud;
                String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*";
                int ncaracteres = caracteres.length();
                String contraseña = "";
                
                
                System.out.print("Introduce una longitud: ");
                longitud = datos.nextInt();
                System.out.println();
                Boolean valida = false;
                
                do
                {
                    contraseña = "";
                   for (int i =0; i<longitud; i++)
                    {
                        int ialeatorio = rand.nextInt(ncaracteres);
                        char caractereA = caracteres.charAt(ialeatorio);
                        contraseña = contraseña + caractereA;
                    }

                    Boolean Mayuscula = false;
                    Boolean Minuscula = false;
                    Boolean Numero = false;
                    Boolean CaracterE = false;
                    
                    for (int i2 = 0; i2 < contraseña.length();i2++)
                    {
                        char c = contraseña.charAt(i2);
                        if (Character.isUpperCase(c))
                        {
                            Mayuscula = true;
                        }
                        else if(Character.isLowerCase(c))
                        {
                            Minuscula = true;
                        }
                        else if(Character.isDigit(c))
                        {
                            Numero = true;
                        }
                        else
                        {
                            CaracterE = true;
                        }
                    }
                    if (Mayuscula && Minuscula && Numero && CaracterE)
                    {
                        valida = true;
                    }
                    else
                    {
                        valida = false;
                    }
                    
                }
                while(valida = false);
                System.out.println("Aqui tienes tu contraseña de "+caracteres);
                System.out.println(contraseña);
            }
            else if (opcion == 2)
            {
                System.out.println("Hasta pronto");
            }
            else
            {
                System.out.println("Eso no es una opcion");
            }
            
            
        }
        while(opcion != 2);
                
        
        
    }
}
