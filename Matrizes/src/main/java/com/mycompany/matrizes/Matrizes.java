/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrizes;

import java.util.Arrays;

/**
 *
 * @author DIT-MAÑANA
 */
public class Matrizes {

    public static void main(String[] args) {
        
        int[][] matriz = new int[3][4];
        
        //asignamos valor a matriz vacia
        matriz [0][0] = 23;
        matriz [0][1] = 25;

        //creamos la matriz con 
        int[][] misnumeros = {{1,2,3,},{4,5,6},{7,8,9}};
        
        //Creamos matriz string
        
        String[][] matrizS ={{"Sergio","raul"},{"Pepe","Isra",}};
        
        //Creamos matriz y la llenamos con un bucle
        
        int[][] a = new int [3][3]; 
        
        for (int i = 0; i< a.length; i++)
        {
            for(int j = 0; j<a[i].length;j++)
            {
                a[i][j] = i+j;
            }
        }
        for(int i=0; i<a.length;i++)
        {
            for(int j = 0; j<a[i].length; j++)
            {
                System.out.println(a[i][j]+"\n");
            }
        }
        //imprimir valores de matriz
        
        
        
    }
}
