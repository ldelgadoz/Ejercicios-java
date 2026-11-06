/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicaif;

import java.util.Scanner;

/**
 *
 * @author DIT-MAÑANA
 */
public class PracticaIF {

    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        //pedimos las variables 
        int n1,n2,n3;
        int mayor;
        int menor;
        int suma;
        int multi;
        
        System.out.println("Escriba el primer valor: ");
        n1 = datos.nextInt();
        System.out.println("Escriba el segundo valor: ");
        n2 = datos.nextInt();
        System.out.println("Escriba el tercer valor: ");
        n3 = datos.nextInt();
        mayor = n1;
        menor = n1;
        if (n2 > mayor)
        {
            mayor = n2;
          
            
        }
        if (n3 > mayor)
        {
           mayor = n3;
                
        }

        System.out.println("El mayor de los tres es: "+mayor);
        
        if (n2 < menor )
        {
            menor = n2;
          
            
        }
        if (n3 < menor)
        {
           menor = n3;
                
        }

        System.out.println("El menor de los tres es: "+menor);
        
       suma = mayor + n3;
       System.out.println("Al mayor le sumamos n3: "+ suma );
       multi = menor * n3;
       System.out.println("Al menor le multiplicamo n3: "+multi);
       
       
       ///////////////////////////////////////////////////////////
       
       int n4,n5,n6,n7;
       int mayor2;
       int menor2;
       int suma2;
       int multi2;
       
       System.out.println("Escriba el valor del primer numero");
       n4 = datos.nextInt();
       System.out.println("Escriba el valor del segundo numero");
       n5 = datos.nextInt();
       System.out.println("Escriba el valor del tercero numero");
       n6 = datos.nextInt();
       System.out.println("Escriba el valor del cuarto numero");
       n7 = datos.nextInt();
       
       mayor2 = n4;
       if (n5 > mayor2 )
       {
           mayor2 = n5;
       }
       if(n6 > mayor2)
       {
           mayor2 = n6;
       }       
       if(n7 > mayor2)
       {
           mayor2 = n7;
       }

       System.out.println("El mayor es: "+mayor2);
       
       // ahora con el menor
       
        menor2 = n4;
       if (n5 < menor2 )
       {
           menor2 = n5;
       }
       if(n6 < menor2)
       {
           menor2 = n6;
       }       
       if(n7 < menor2)
       {
           menor2 = n7;
       }

       System.out.println("El menor es: "+menor2);
       
       //suma y multiplicación
       
       suma2 = mayor2 + n5;
       System.out.println("Al mayor le sumamos n5: "+ suma2 );
       multi2 = menor2 * n4;
       System.out.println("Al menor le multiplicamo n4: "+multi2);
    }
}
