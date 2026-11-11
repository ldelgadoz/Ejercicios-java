/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.random4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Random4 {

    public static void main(String[] args) {
        //1
        Scanner datos=new Scanner (System.in);
        Random random = new Random();
        
        int min = -10;
        int max = 10;
        int x;
        int y;
        int puntos = 0;
        
        double distancia;
        String opcion;
        do
        {
            System.out.println("Quieres tirar el dardo? s/n: ");
            opcion = datos.next();
            if (opcion.equals("s"))
            {
                x = random.nextInt((max-min+1)+min);
                y = random.nextInt((max-min+1)+min);
                distancia = Math.sqrt((x*x)+ (y*y));
                if (distancia <=2)
                {
                    System.out.println("Ha ganado 100 puntos");
                    puntos += 100;
                }
                else if (distancia >2 && distancia <= 5)
                {
                    System.out.println("Ha ganado 50 puntos");
                    puntos += 50;
                }
                else if (distancia>5 && distancia <=8)
                {
                    System.out.println("Ha ganado 20 puntos");
                    puntos += 20;
                }
                else
                {
                    System.out.println("Ha ganado 0 puntos");
                    puntos ++;
                }
                
            }
            else if (opcion.equals("n"))
            {
                System.out.println("Hasta pronto");
            }
            else
            {
                System.out.println("Eso no es una opcion");
            }
        }
        while (opcion.equals("s"));
        System.out.println("Esta ha sido su puntuacion de todas las tiradas;"+ puntos);
        
        //2
        
        min = 1;
        max = 500;
        int numeros = random.nextInt(max-min +1)+min;
        
        
        for (int i = 1; i<6 ;i++)
        {
            int apuesta = random.nextInt((max-min +1)+min);
            System.out.println("La banca: jugador numero"+i+"Haga su apuesta");
            System.out.println("Jugador"+i+": Apuesto al "+ apuesta);
            
            System.out.println("---NO VA MAS---");
            System.out.println("Para jugador"+i);
            System.out.println("Su apuesta:"+apuesta);
            int diferencia = Math.abs(apuesta - numeros);
            System.out.println("La diferencia respecto al objetivo es de: "+diferencia);
            System.out.println("El porcentaje de erorr es del: "+(diferencia *100.0)/numeros);
            if (diferencia == 0)
            {
                System.out.println("¡PLENO!");
            }
            else if (diferencia >=1 && diferencia <=10)
            {
                System.out.println("Excelente");
            }
            else if (diferencia >=11 && diferencia <=25)
            {
                System.out.println("Muy bien");
            }
            else if (diferencia >=26 && diferencia <=50)
            {
                System.out.println("Bien");
            }
            else
            {
                System.out.println("Lejos");
            }
            
        }
        
        //3
    }
}
