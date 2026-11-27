/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrices.irregulares;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DIT-MAÑANA
 */

public class MatricesIrregulares {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        Random rnd = new Random();
        
        System.out.print("Introduce el nombre de la mina: ");
        String nombre = datos.nextLine();
        System.out.print("Introduce la cantidad de galerias: ");
        int galerias = datos.nextInt();
        datos.nextLine();
        
        int [][] minas = new int [galerias][];
        
        for (int i = 0; i < galerias; i++) {
            minas[i] = new int [rnd.nextInt(3, 16)];
            for (int j = 0; j < minas[i].length; j++) {
                minas[i][j] = rnd.nextInt(10, 501);
            }
        }
        
        System.out.println("\nMina: " + nombre);

        for (int i = 0; i < minas.length; i++) {
            System.out.print("Galeria " + (i + 1) + ": ");
            for (int cristales : minas[i]) {
                System.out.print(cristales + " ");
            }
            System.out.println(); 
        }
        
        System.out.println("\n--- ESTADISTICAS POR GALERIA ---");
        for (int i = 0; i < minas.length; i++) {
            int suma = 0;
            int max = minas[i][0];
            int min = minas[i][0];

            for (int cristales : minas[i]) {
                suma += cristales;
                if (cristales > max) max = cristales;
                if (cristales < min) min = cristales;
            }

            double media = (double) suma / minas[i].length;

            System.out.println("Galeria " + (i + 1) + ":");
            System.out.println("  Suma total: " + suma);
            System.out.println("  Media: " + media);
            System.out.println("  Cristal mas grande: " + max);
            System.out.println("  Cristal mas pequeño: " + min);
        }

        System.out.print("\nIntroduce una palabra clave: ");
        String palabraClave = datos.nextLine();

        System.out.println("\n--- INSPECCION ---");
        for (int i = 0; i < palabraClave.length(); i++) {
            char letra = palabraClave.charAt(i);
            int codigoASCII = (int) letra;
            int indiceGaleria = (codigoASCII % galerias) + 1;
            System.out.println("La letra '" + letra + "' inspecciona la galeria " + indiceGaleria);
        }

        int mejorGaleria = 0;
        double maxBeneficio = -1;

        for (int i = 0; i < minas.length; i++) {
            int suma = 0;
            for (int cristales : minas[i]) {
                suma += cristales;
            }
            double beneficio = suma * Math.log(minas[i].length);
            if (beneficio > maxBeneficio) {
                maxBeneficio = beneficio;
                mejorGaleria = i + 1;
            }
        }

        System.out.println("\n--- GALERIA MAS RENTABLE ---");
        System.out.println("La galeria mas rentable es la " + mejorGaleria + " con un beneficio de: " + maxBeneficio);

    }
}