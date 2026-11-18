/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrices2;

/**
 *
 * @author DIT-MAÑANA
 */
public class Matrices2 {

    public static void main(String[] args) {
        //1.Crear una matriz de 9×9 con los números del 1 al 9. Mostrar por pantalla, tal como aparece en la matriz.
        int [][] m = new int [9][9];
        for (int i = 0; i<m.length;i++){
            for (int j =0; j<m[i].length;j++){
                m[i][j] = i+j;
                System.out.println(m[i][j]);
            }
        }
    }
}
