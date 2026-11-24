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
public class M3 {
    public static void main(String[] args) {
      Scanner datos = new Scanner(System.in);
      Random rnd = new Random();
      
      int [][] a = new int [4][4];
      
      int opcion;
      boolean completado = false;
      do{
          System.out.println("==== MENU ====");
          System.out.println("1. Rellenar matriz de numeros");
          System.out.println("2. Sumar fila");
          System.out.println("3. Sumar columna");
          System.out.println("4. Sumar diagonal principal");
          System.out.println("5. Sumar la diagonal inversa");
          System.out.println("6. Media");
          System.out.println("0. Salir");
          
          System.out.print("Introduce una opción: ");
          opcion = datos.nextInt();
          
          if (opcion == 1){
              int numero;
              System.out.println("A continuación se te pediran los numeros (Son un total de 16)");
              for (int i = 0;  i< a.length;i++){
                  for (int j = 0; j<a[i].length; j++){
                      System.out.print("Introduce un numero: ");
                      numero = datos.nextInt();
                      a[i][j] = numero;
                  }
              }
              System.out.println("Matriz generada, gracias");
              completado = true;
          }
          else if (opcion == 2 && completado){
              int fila;
              int suma = 0;
              System.out.print("Introduzca la fila que quiere sumar(0-4): ");
              fila = datos.nextInt();
              if (fila <0 || fila > a.length){
                  System.out.println("Esa fila no es valida");
              }
              else{
                   for (int i = 0; i < a[fila].length; i++) {
                        suma += a[fila][i];
                    }
                   System.out.println("La suma de la fila es: "+suma);
              }
             

              
          }
          else if (opcion == 3 && completado){
              int columna;
              int suma = 0;
              System.out.print("Introduzca una columna: ");
              columna = datos.nextInt();
              if (columna <0 || columna>=a[0].length){
                  System.out.println("La columna no es valida");
              }
              else{
                  for (int i = 0; i<a.length;i++){
                      suma += a[i][columna];
                  }
                  System.out.println("La suma de la columna es: "+suma);
              }
          }
          else if (opcion == 4 && completado) {
                int suma = 0;
                for (int i = 0; i < a.length; i++) {
                    suma += a[i][i];
                }

                System.out.println("La suma de la diagonal principal es: " + suma);
          }
          else if (opcion == 5 && completado) {
                int suma = 0;

                for (int i = 0; i < a.length; i++) {
                    suma += a[i][a.length - 1 - i];
                }

                System.out.println("La suma de la diagonal inversa es: " + suma);
          }
          else if (opcion == 6 && completado) {
              int suma = 0;
              int numerosTotales = 16;
              for(int i = 0; i<a.length;i++){
                  for (int j=0; j<a[i].length;j++){
                      suma += a[i][j];
                  }
              }
              System.out.println("La media es de: "+(suma/numerosTotales));
          }
          else{
            if ( opcion <=6 && !completado){
               System.out.println("No puede acceder a las demas opciones sin completar la primera");
            }
            else if(opcion == 0){
                System.out.println("Hasta pronto");
            }
            else{
                System.out.println("Eso no es una opcion");
            }
          }
      }
      while(opcion != 0);
        
    }
    
}
