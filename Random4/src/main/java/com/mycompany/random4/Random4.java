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
// ESTADISTICAS
        int vida = 100;
        int comida = 30;
        int agua = 30;

        // ESTADISTICAS PARA EL FINAL
        int diasSobrevividos = 0;
        int totalComidaEncontrada = 0;
        int totalAguaEncontrada = 0;
        
        int maxComidaDia = 0;
        int diaMaxComida = 1;
        
        int maxAguaDia = 0;
        int diaMaxAgua = 1;
        
        int diasSinComida = 0;
        int diasSinAgua = 0;
        
        int vidaMinima = vida;

        System.out.println("Sobrevive 30 dias, Empieza el juego...");

        for (int i = 1; i <= 30; i++) {
            int comidaEN = random.nextInt(20 - 0 + 1) + 0;
            int aguaEN = random.nextInt(15 - 0 + 1) + 0;
            int dañosufrido = random.nextInt(10 - 0 + 1) + 0;

            totalComidaEncontrada += comidaEN;
            totalAguaEncontrada += aguaEN;

            if (comidaEN == 0) diasSinComida++;
            if (aguaEN == 0) diasSinAgua++;

            if (comidaEN > maxComidaDia) {
                maxComidaDia = comidaEN;
                diaMaxComida = i;
            }
            if (aguaEN > maxAguaDia) {
                maxAguaDia = aguaEN;
                diaMaxAgua = i;
            }

            System.out.println("--- DIA " + i + " ---");
            System.out.println("STATS");
            System.out.println("VIDA:" + vida);
            System.out.println("AGUA:" + agua);
            System.out.println("COMIDA:" + comida);
            System.out.println("Sales en busca de agua y comida...");
            System.out.println("--------------------------------");
            System.out.println("Comida encontrada = " + comidaEN);
            System.out.println("Agua encontrada = " + aguaEN); // Corregido texto de comida por agua

            if (dañosufrido > 0) {
                System.out.println("Te han atacado, has sufrido este daño:" + dañosufrido);
                vida -= dañosufrido;
                System.out.println("Estos son tus puntos de vida:" + vida);
            }

            System.out.println("-----------------------------");
            System.out.println("El dia " + i + " ha pasado.");
            System.out.println("Si has encontrado recursos se te suman");
            
            comida += comidaEN;
            agua += aguaEN;
            System.out.println("COMIDA: " + comida);
            System.out.println("AGUA: " + agua);

            System.out.println("--FINAL DEL DIA SE CONSUMIRA LO BASICO--");
            comida -= 4;
            agua -= 3;

            if (comida <= 0) {
                comida = 0;
                System.out.println("Tu comida esta en 0 sufres daño");
                vida -= 5;
            }
            if (agua <= 0) {
                agua = 0;
                System.out.println("Tienes 0 puntos de agua, pierdes 10 de vida");
                vida -= 10;
            }

            if (vida < vidaMinima) {
                vidaMinima = vida;
            }

            if (vida <= 0) {
                vida = 0;
                diasSobrevividos = i;
                System.out.println("Has muerto, has durado hasta el dia: " + i);
                break;
            }

            diasSobrevividos = i;
        }

        System.out.println("==========================================");
        System.out.println("          ESTADÍSTICAS FINALES            ");
        System.out.println("==========================================");
        System.out.println("Días sobrevividos: " + diasSobrevividos);
        System.out.println("Cantidad total de comida encontrada: " + totalComidaEncontrada);
        System.out.println("Cantidad total de agua encontrada: " + totalAguaEncontrada);
        System.out.println("Día con más comida encontrada: Día " + diaMaxComida + " (" + maxComidaDia + " unidades)");
        System.out.println("Día con más agua encontrada: Día " + diaMaxAgua + " (" + maxAguaDia + " unidades)");
        System.out.println("Número de días sin encontrar comida: " + diasSinComida);
        System.out.println("Número de días sin encontrar agua: " + diasSinAgua);
        System.out.println("Vida mínima registrada: " + vidaMinima);
        System.out.println("Resultado: " + (vida > 0 ? "¡HA SOBREVIVIDO A LA AVENTURA!" : "HA MUERTO"));
    }
}
        
        
    

