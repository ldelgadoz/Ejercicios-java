/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodosarrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MetodosArrays {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        
        int [] lista = new int[7];
        lista[0] = 1045;
        lista[1] = 2001;
        lista[2] = 1500;
        lista[3] = 1100;
        lista[4] = 987;
        lista[5] = 1750;
        lista[6] = 3000;
        System.out.println("Contenido inicial: "+Arrays.toString(lista));
        
        System.out.println("Ordenamos los productos por codigo: ");
        Arrays.sort(lista);
        System.out.println(Arrays.toString(lista));
        
       int [] nuevos ={3100,3200,3300};
       int longitud = lista.length;
       
       lista = Arrays.copyOf(lista, longitud+nuevos.length);
       Arrays.fill(lista, longitud,lista.length,0);     
       for (int i = 0; i<nuevos.length; i++)
       {
           lista[longitud+i] = nuevos[i];
       }
       System.out.println("Inventario Ampliado: " + Arrays.toString(lista));
        
        int[]  inventarioBackup = Arrays.copyOf(lista, lista.length);
        
        if (Arrays.equals(lista, inventarioBackup))
        {
            System.out.println("Los inventarios son identicos");
        }
        else
        {
            System.out.println("Los inventarios han cambiado");
        }
        System.out.println("Introduzca el codigo a buscar: " );
        int opcion = datos.nextInt();
        int posicion = Arrays.binarySearch(lista, opcion);
        if (posicion>=0)
        {
            System.out.println("El producto con codigo "+opcion+" encontrado en la posicion "+posicion);
        }
        

        
    }   
        
}
