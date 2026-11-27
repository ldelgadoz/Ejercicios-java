/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraylists;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DIT-MAÑANA
 */
public class ArrayLists {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        ArrayList<String> frutas = new ArrayList<>();
        //añadimos elementos 
        frutas.add("Manzana");
        frutas.add("peras");
        frutas.add("Platano");
        frutas.add("Cereza");
        
        //imprimimos primer elemento
        
        System.out.println(frutas.get(0));
        
        //mostramos el numero total de elementos
        
        System.out.println(frutas);
        
        //Eliminamos un valor
        
        frutas.remove("peras");
        
        //Creamos Lista de nums
        
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0; i<5;i++){
            System.out.println("Introduce nums: ");
            int n = datos.nextInt();
            nums.add(n);
        }
        
        for (int i = 0; i<nums.size();i++){
            System.out.println(nums.get(i));
        }
        
        
    }
}
