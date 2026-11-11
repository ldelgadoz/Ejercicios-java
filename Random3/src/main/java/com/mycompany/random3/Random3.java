/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.random3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author reman
 */
public class Random3 {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        Random random = new Random();
        int min = 1;
        int max = 100;
        String respuesta;

        do {
            int numero = random.nextInt((max - min) + 1) + min;
            boolean acertado = false;
            int i = 0;

            System.out.println("\nEmpieza el juego. Tienes 7 intentos, tienes que adivinar un número del 1 al 100.");

            while (i < 7 && !acertado) {
                System.out.print("Introduce un número del uno al cien: ");
                int ns = datos.nextInt();

                if (ns == numero && i == 0) {
                    acertado = true;
                    System.out.println("¡INCREÍBLE! Lo acertaste a la primera.");
                } else if (ns == numero) {
                    acertado = true;
                    System.out.println("¡Correcto! Has ganado en " + (i + 1) + " intentos.");
                } else {
                    if (ns > numero) {
                        System.out.println("Demasiado alto");
                    } else if (ns < numero) {
                        System.out.println("Demasiado bajo");
                    }
                    i++;
                }
            }

            if (!acertado) {
                System.out.println("Has perdido. El número era: " + numero);
            }

            System.out.print("¿Quieres volver a jugar? (s/n): ");
            respuesta = datos.next();

        } while (respuesta.equalsIgnoreCase("s"));

        System.out.println("¡Gracias por jugar!");
    }
}
