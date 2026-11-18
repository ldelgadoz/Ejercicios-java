/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrices1;

/**
 *
 * @author DIT-MAÑANA
 */
public class Matrices1 {

    public static void main(String[] args) {
        int[][]numeros= new int[][]{{3,4,5,78},
            {0,0,0,0},
            {1,1,1,1},
            {6,6,6,-1}};
        
        int mayor = numeros[0][0];
        int menor = numeros[0][0];
        
        for (int i=0; i<numeros.length;i++){
            for (int j=0; j<numeros[i].length; j++){
                if (numeros[i][j] > mayor){
                    mayor = numeros[i][j];
                    
                }
                if (numeros[i][j]< menor){
                    menor = numeros[i][j];
                }
                
            }
        }
        System.out.println(mayor);
        System.out.println(menor);
        
        //imprimimos valores
        System.out.println("Primera columna");
        for (int i =0; i<numeros[0].length;i++){
            System.out.print(numeros[0][i]+"\n");
        }
        System.out.println("Ultima");
        
        for(int i =0; i<numeros[3].length;i++){
            System.out.print(numeros[3][i]+"\n");
        }
        

    }
}
