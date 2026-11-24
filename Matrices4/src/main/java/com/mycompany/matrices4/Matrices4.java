/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrices4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DIT-MAÑANA
 */
public class Matrices4 {

    public static void main(String[] args) {
        /*1. Crear una matriz de 5 filas y n columnas (se pide al usuario). Rellenarlo con números
        aleatorios entre 0 y 10*/
        Scanner datos = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("Introduzca el numero de columnas de tu array: ");
        int n = datos.nextInt();
        int [][] a = new int[5][n];
        for (int i = 0; i<a.length; i++){
            for(int j = 0; j< a[i].length;j++){
                a[i][j] = rnd.nextInt(0,11);
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
