/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clasestring;

import java.util.Scanner;

/**
 *
 * @author DIT-MAÑANA
 */
public class ClaseString {

    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        //creamos objeto clase string
        String nombre;
        
        System.out.println("Introduce algo: ");
        nombre = datos.next();
        
        //trabajo con equals
        if (nombre.equals("hola"))
        {
            System.out.println("HOla");
        }
        else
        {
            System.out.println("No");
        }
        
        //para mostrar num caracteres de cadena se usa el len
        
        int ncaracteres;
        ncaracteres = nombre.length();
        System.out.println("Tu cadena tiene: "+ncaracteres+" Caracteres ");
        
        //mostramos el caracter de una posicion
        System.out.println(nombre.charAt(0));
        
        String subcadena;
        subcadena=nombre.substring(0,5);
        System.out.println("La subcadena muestra: "+subcadena);
        //buscamos si aparece un caracter
        if(nomre.indexOf("@")<0)
        {
            System.out.println("El caracter no aparece en la cadena");
        }
        else
        {
            System.out.println("Si aparece");
        }
        
        //convertir en mayusculas
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.toUpperCase());
        //para espacios trim
        String nombres= "buenos dias";
        
        //aplicar trim
        System.out.println(nombres.trim());
        
    }
}
