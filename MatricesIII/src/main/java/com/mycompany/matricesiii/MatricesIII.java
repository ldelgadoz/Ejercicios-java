/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matricesiii;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MatricesIII {

    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
        Random rnd = new Random();
        int opcion;
        int [][] tiendas = new int[4][6];
        do{
            System.out.println("==== VENTAS TRIMESTRALES ===");
            System.out.println("1. Rellenar matriz con datos nuevos");
            System.out.println("2. Mostrar matriz");
            System.out.println("3. Totales por tienda");
            System.out.println("4. totales por mes");
            System.out.println("5. Mejor tienda y peor mes");
            System.out.println("6. Ventas maximas y minimas ");
            System.out.println("7. Media general");
            System.out.println("0. Salir");
            System.out.print("Introduce una opción: ");
            opcion = datos.nextInt();
            
            if (opcion == 1){
                System.out.println("Se procedera a llenar la matriz con nuevos datos");
                for(int i = 0; i< tiendas.length; i++){
                    System.out.println();
                    for (int j = 0; j<tiendas[i].length; j++){
                        int random = rnd.nextInt(1000,5001);
                        tiendas[i][j] = random;
                        System.out.print(tiendas[i][j]+"\t");              
                    }
                    System.out.println(); 
                }
                System.out.println("Matriz generada");
                
            }
            else if (opcion == 2){
                for(int i = 0; i<tiendas.length; i++){
                    System.out.println("MATRIZ");
                    for (int j = 0; j< tiendas[i].length; j++){
                        System.out.print(tiendas[i][j]+"\t");
                    }
                 System.out.println();
                }    
            }
            else if (opcion == 3){
                System.out.println("VENTAS TOTALES CADA TIENDA");
                for (int i = 0; i< tiendas.length; i++){
                    int total = 0;
                    for (int j = 0; j<tiendas[i].length; j++){
                        total += tiendas[i][j];
                    }
                      System.out.println("Tienda "+i+" "+total+"$");  
                }
            }
            else if (opcion == 4){
                String [] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio"};
                System.out.println("VENTAS TOTALES POR MES");
                for (int i = 0; i<tiendas[0].length;i++){
                    int total = 0;
                    for (int j = 0; j<tiendas.length; j++){
                        total += tiendas[j][i];
                       
                    }
                    System.out.println(meses[i]+": "+total+"$");
                }         
            }
            else if (opcion == 5){
                
                
            }
        }while (opcion != 0);
    }
}
