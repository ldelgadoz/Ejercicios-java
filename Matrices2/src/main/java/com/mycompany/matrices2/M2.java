/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matrices2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DIT-MAÑANA
 */
public class M2 {
    public static void main(String[] args) {
    //2.Crear una matriz de 5 filas y n columnas (se pide al usuario). Rellenarlo con números
    //aleatorios entre 10 y 1000. Buscar si aparece el número 10 en los valores de las celdas y
    //cuantas veces.
        Scanner datos = new Scanner (System.in);
        Random rnd = new Random();
        
        System.out.println("Cuantos numeros de columnas quieres?: ");
        int n = datos.nextInt();
        int p;
        int [][] m = new int[5][n];
        int contador = 0;
        for (int i = 0; i<m.length;i++){
            for (int j = 0;j<m[i].length;j++){
                int r = rnd.nextInt(10,1001);
                m[i][j] = r;
                System.out.print(m[i][j]+"\n");
                if (m[i][j] == 10){
                    contador += 1;
                    System.out.println("10 Encontrado");
                }
                
            }
        }
        System.out.println("Han salido un total de: "+contador+" 10");
        
        
    }
    
}
