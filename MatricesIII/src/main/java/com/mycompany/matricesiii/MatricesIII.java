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
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio"};
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
                int ventas = 0;
                int mejorTienda = 0;
                
                for (int i=0; i< tiendas.length; i++){
                    int contador = 0;
                    for (int j = 0; j< tiendas[i].length;j++){
                        contador += tiendas[i][j];
                    }
                    if (contador > ventas){
                        ventas = contador;
                        mejorTienda = i;
                    }
                    
                }
                
                int menorventas = 0;
                int peormes = 0;
                for (int i=0; i<tiendas[0].length;i++){
                    int sumames = 0;
                    for (int j = 0; j<tiendas.length;j++){
                        sumames += tiendas[j][i];
                        
                    }
                     if (i == 0 || sumames <menorventas){
                         menorventas = sumames;
                         peormes = i;
                     }
                   
                }
                System.out.println("MEJOR TIENDA Y PEOR MES");
                System.out.println("Mejor tienda: Tienda " + (mejorTienda + 1) + " con " + ventas + "$");
                System.out.println("Peor mes: " + meses[peormes] + " con " + menorventas + "$");
                        
                
            }
            else if (opcion == 6){
                int ventamax = tiendas[0][0];
                int ventamin = tiendas[0][0];
                int tiendaMax = 0, mesMax = 0;
                int tiendaMin = 0, mesMin = 0;

                for (int i = 0; i < tiendas.length; i++) {
                    for (int j = 0; j < tiendas[i].length; j++) {

                        if (tiendas[i][j] > ventamax) {
                            ventamax = tiendas[i][j];
                            tiendaMax = i;
                            mesMax = j;
                        }

                        if (tiendas[i][j] < ventamin) {
                            ventamin = tiendas[i][j];
                            tiendaMin = i;
                            mesMin = j;
                        }

                    }
                }
                System.out.println("VENTA MÁXIMA Y MÍNIMA");
                System.out.println("Venta máxima: " + ventamax + "$ (Tienda " + (tiendaMax + 1) + " en " + meses[mesMax] + ")");
                System.out.println("Venta mínima: " + ventamin + "$ (Tienda " + (tiendaMin + 1) + " en " + meses[mesMin] + ")");
            }
            else if (opcion == 7) {
                int sumaTotal = 0;
                int totalCeldas = tiendas.length * tiendas[0].length; 
                for (int i = 0; i < tiendas.length; i++) {
                    for (int j = 0; j < tiendas[i].length; j++) {
                        sumaTotal += tiendas[i][j];
                    }
                }
                double media = (double) sumaTotal / totalCeldas;
                int contadorEncimaMedia = 0;
                for (int i = 0; i < tiendas.length; i++) {
                    for (int j = 0; j < tiendas[i].length; j++) {
                        if (tiendas[i][j] > media) {
                            contadorEncimaMedia++;
                        }
                    }
                }
                System.out.println("=== MEDIA GENERAL Y CELDAS POR ENCIMA DE LA MEDIA ===");
                System.out.println("Venta media general: " + media + "$");
                System.out.println("Celdas que superan la media: " + contadorEncimaMedia);
            }
            else if (opcion == 0){
                System.out.println("Hasta pronto");
            }
            else{
                System.out.println("Eso no es una opción");
            }
        }while (opcion != 0);
    }
}
