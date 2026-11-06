/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareamathii;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author DIT-MAÑANA
 */
public class TareaMathII {

    public static void main(String[] args) {
        Scanner datos=new Scanner (System.in);
        
        int tiempo;
        String continuar;
        
        
        do{
            System.out.println("Introduce el valor del segundo:");
            tiempo = datos.nextInt();
            int minuto;
            minuto = tiempo/60;
            System.out.println("Estas en el minuto: "+Math.floor(minuto));
            System.out.println("¿Desea continuar? s/n ?:");
            continuar = datos.next();
            
 
        }
        while(continuar.equalsIgnoreCase("s"));
        System.out.println("Gracias");
        
        ////////////////////////////////////////2
        ///
        ///ENUNCIADO
        ///Muestra por pantalla un numero aleatorio, el valor absoluto de un numero, el redondeo clasico, la potencia y el valor absoluto de dos numeros en notacion cientifica.
        ///EXPLICACION
        ///El ejercicio define las variables, realiza las operaciones pertinentes y printecea los resultados.
        int x;
        double rand,y,z;
        float max;
        rand = Math.random();
        x = Math.abs( -123 );
        y = Math.round( 123.567 );
        z = Math.pow( 2,4 );
        max = Math.max( (float)1e10,(float)3e9 );

        System.out.println( rand );
        System.out.println( x );
        System.out.println( y );
        System.out.println( z );
        System.out.println( max );
        
        ////////////////////////////////////////////3
        ///ENUNCIADO
        ///Diseña una funcion que calcule el numero de euler lo que se podria hacer con un System.out.println(Math.E); lo hace asi.
        BigDecimal e;
        BigDecimal factor;
        e = new BigDecimal( "1" ).setScale( 300,BigDecimal.ROUND_DOWN );
        factor = new BigDecimal( "1" ).setScale( 300,BigDecimal.ROUND_DOWN );
        // Se obtiene la expresión del paréntesis de la fórmula
        factor = factor.divide( new BigDecimal( 200 ),BigDecimal.ROUND_DOWN );
        factor = factor.add( new BigDecimal( 1 ) );
        // Se multiplica la expresión para obtener la potencia adecuada
        for( int i=1; i < 200; i++ )
        e = e.multiply( factor );
        System.out.println( e );
        
    } 
    
        
    }

