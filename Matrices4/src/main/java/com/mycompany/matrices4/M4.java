/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matrices4;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class M4 {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        boolean[] usado = new boolean[10];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num;
                do {
                    num = (int) (Math.random() * 9) + 1;
                } while (usado[num]);

                usado[num] = true;
                a[i][j] = num;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    }
    
