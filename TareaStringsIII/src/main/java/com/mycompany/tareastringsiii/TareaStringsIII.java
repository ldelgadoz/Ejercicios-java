/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareastringsiii;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TareaStringsIII {

    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        
        String direccion;
        System.out.println("Introduce tu dirección de correo");
        direccion = datos.next();
        boolean tienemayus = true;
        if (!direccion.contains("@"))
        {
            System.out.println("La direccion no contiene un @");
        }
        else
        {
            if(direccion.indexOf("@") != direccion.lastIndexOf("@"))
            {
                System.out.println("La dirección tiene mas de un @");
            }
            else
            {
                if(direccion.charAt(direccion.length() - 1) != '.')
                {
                    System.out.println("La direccion no acaba con un .");
                }
                else
                {
                    if(direccion.length()<20)
                    {
                        System.out.println("La direccion es muy corta");
                    }
                    else
                    {
                        if (!direccion.equals(direccion.toLowerCase())) 
                        {
                            System.out.println("El correo debe estar en minúsculas");
                        }
                        else
                        {
                            System.out.println("El correo es valido");
                        }
                    }
                }
            }
        }
        
    }
}
