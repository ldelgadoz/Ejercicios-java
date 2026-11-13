/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays2;

import java.util.Scanner;

/**
 *
 * @author DIT-MAÑANA
 */
public class Arrays2 {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i< numeros.length; i++)
        {
            numeros[i] = i+1;
        }
        for (int i = numeros.length-1; i>=0;i--)
            System.out.println(numeros[i]);
    
     //2
    int posiciones;
    System.out.println("Cuantos numeros de posiciones quieres en tu array");
    posiciones = datos.nextInt();
    int[] longitud = new int[posiciones];
    
    System.out.println("Cuantos numeros de posiciones quieres en tu segundo array");
    posiciones = datos.nextInt();
    int[] longitud2 = new int [posiciones];
    for (int i = 0; i<longitud2.length; i++)
    {
        longitud2[i] = i+1;
    }
    
    int [] array3 = new int[longitud.length + longitud2.length];
    
    for (int i = 0; i<longitud.length;i++)
    {
        array3[i] = longitud[i];
    }
    
    for (int i = 0; i<longitud2.length;i++)
    {
        array3[longitud.length+i] = longitud2[i];
    }
    
    for (int i = 0; i<array3.length; i++)
    {
        System.out.println(array3[i]);
    }
    
    //3
    
    char [] caracteres = new char[6];
    caracteres[0] = 'a';
    caracteres[1] = 'e';
    caracteres[2] = 'r';
    caracteres[3] = 't';
    caracteres[4] = 'y';
    caracteres[5] = 'u';
    
    int[] numeros2 = new int[6];
    for (int i = 0; i< numeros2.length;i++)
    {
        numeros2[i] = i+1;
    }
    
    String [] array4 = new String[caracteres.length+numeros2.length];
    for (int i = 0; i<caracteres.length;i++)
    {
        array4[i] = String.valueOf(caracteres[i]);
    }
    for (int i = 0; i<numeros2.length; i++)
    {
        array4[caracteres.length+i] = String.valueOf(numeros2[i]);
    }
    
    for (int i = 0; i< array4.length;i++)
    {
        System.out.println(array4[i]);
    }
    
    //4
    int [] numeros3 = new int[57];
    int pares = 0;
    int impares = 0;
    for (int i = 0; i < numeros3.length;i++)
    {
        numeros3[i] = i+1;
        if (numeros3[i]%2 == 0)
        {
            pares += 1;
        }
        else
        {
            impares +=1;
        }    
    }
    System.out.println("Celdas pares: "+pares);
    System.out.println("Celdas impares: "+impares);
    
    //5
    float[]notas = new float[6];
    
    
for (int i = 0; i < notas.length; i++) {
            float nota;
            System.out.println("Introduce las notas solo se acepta 1 por peticion: ");
            nota = datos.nextFloat();
            notas[i] = nota;
        }
        
        float media;
        float total = 0;
        for (int i = 0; i < notas.length; i++) {
            total += notas[i];
        }
        media = total / notas.length;
        System.out.println("Tu media total es de:" + media);
        
        if (media < 5) {
            System.out.println("La nota es suspensa");
        }
        else if (media <= 6.5f) {
            System.out.println("La nota es bien");
        }
        else if (media <= 8.5f) {
            System.out.println("La nota es notable");
        }
        else {
            System.out.println("La nota es sobresaliente");
        }
               
    
    
    
            
    
    
    
    
        
     
        
        
        
        
        
        
        
        
    }
    
   
    
}
