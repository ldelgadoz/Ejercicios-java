/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listas2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DIT-MAÑANA
 */
public class Listas2 {

    public static void main(String[] args) {
     Scanner datos = new Scanner(System.in);
     ArrayList<Integer> nums = new ArrayList<>();
     int opcion;
     int cantidad = 0;
     
             do{
            System.out.println("Introduzca numeros ");
            opcion = datos.nextInt();
            if (opcion == 99){
               
            }
            else{
                nums.add(opcion);
                cantidad += 1;
            }
            
        }while(opcion != 99);
        System.out.println("Estos son los valores leidos: "+cantidad);
        System.out.println("Estos son tus numeros");
        for (int i = 0; i< nums.size();i++){
            System.out.println(nums.get(i));
        }
        
        
    }
}
