/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matrices4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DIT-MAÑANA
 */
public class M2 {
    public static void main(String[] args) {
        /*2. Crear dos matrices de nxn y sumar sus valores, los resultados se deben almacenar en otra
        matriz. Los valores y la longitud, seran insertados por el usuario. Mostrar las matrices
        originales y el resultado*/
        
        Scanner datos = new Scanner(System.in);
        Random rnd = new Random();
        
        System.out.print("Introduce un numero para tu arreglo: ");
        int n = datos.nextInt();
        int [][] a = new int[n][n];
        int [][] b = new int[n][n];
        int [][] r = new int[n][n];
        
        System.out.println("Generamos datos primer arreglo");
        for (int i = 0; i <a.length;i++){
            for (int j = 0; j< a[i].length;j++){
                System.out.print("Introduce datos: ");
                int datoss = datos.nextInt();
                a[i][j] = datoss;
                System.out.print(a[i][j]+"\t");
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Generamos datos segundo arreglo");
        for (int i = 0; i <b.length;i++){
            for (int j = 0; j< b[i].length;j++){
                System.out.print("Introduce datos: ");
                int datoss = datos.nextInt();
                b[i][j] = datoss;
                System.out.print(b[i][j]+"\t");
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Sumamos los valores");
        
        for (int i = 0;i<r.length;i++){
            for(int j = 0; j<r[i].length;j++){
                r[i][j] = (a[i][j]+b[i][j]);
                System.out.print(r[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
}
