/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylists;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DIT-MAÑANA
 */
public class AL2 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        ArrayList<String> animales = new ArrayList<>();
        String opcion;
        
        do{
            System.out.println("Introduzca nombres de animales (Escriba salir para salir): ");
            opcion = datos.nextLine();
            if (opcion.equalsIgnoreCase("Salir")){
               
            }
            else{
                animales.add(opcion);
            }
            
        }while(!opcion.equalsIgnoreCase("Salir"));
        System.out.println("Estos son tus animales");
        for (int i = 0; i< animales.size();i++){
            System.out.println(animales.get(i));
        }
        
    }
}
