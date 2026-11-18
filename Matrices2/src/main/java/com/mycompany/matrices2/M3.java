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
public class M3 {
    public static void main(String[] args) {
        /*3. Se pide por pantalla al usuario, el número de filas de nuestra matriz.
        -Preguntamos. ¿Deseas que todas las filas tengan el mismo número de celdas?
        SI, se pide por pantalla el número de celdas, y se rellenan con números aleatorios,
        entre 0-10
        NO, se pide fila por fila el número de celdas, y se rellenan con números aleatorios,
        entre1-5
        -Preguntamos: ¿Deseas imprimir la matriz?
        SI, me muestran todos los datos de la matriz
        NO, finaliza la aplicación
        */
        
        Scanner datos = new Scanner(System.in);
        Random rnd = new Random();
        int c;
        System.out.println("Cuantos numeros de filas quieres en la matriz?");
        int f = datos.nextInt();
        System.out.println("Deseas que todas las filas tengan el mismo numero de celdas?: ");
        String op = datos.next();
        int[][] m = new int[f][];
        if (op.equalsIgnoreCase("si")){
            System.out.println("Introduzca el numero de celdas: ");
             c = datos.nextInt();
            
            for (int i = 0; i<m.length;i++){
                m[i] = new int[c];
                for (int j = 0; j< m[i].length; j++){
                   int r = rnd.nextInt(0,11);
                   m[i][j] = r;
                }
            }
        }
        else if (op.equalsIgnoreCase("no")){
            
            for (int i = 0; i<m.length; i++){
                System.out.println("Introduce el numero de celdas de las filas aportadas anteriormente: ");
                c = datos.nextInt();
                m[i] = new int[c];
                for(int j = 0; j<m[i].length;j++){
                   int r2 = rnd.nextInt(1,6);
                   m[i][j] = r2;
                }
                
                
                
            }
        }
        System.out.println("Quieres imprimir la matriz?: ");
        String imprimir = datos.next();
        if (imprimir.equalsIgnoreCase("si")){
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    System.out.print(m[i][j] + "\t");
                }
                System.out.println();
        }
        }    
        else
        {
            System.out.println("Hasta pronto");
        }
    }
    
}
