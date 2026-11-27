/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraylists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DIT-MAÑANA
 */
public class AL3 {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        Random rnd = new Random();
        ArrayList<String> nomb = new ArrayList<>();
        int opcion;
        
        do{
            System.out.println("===MENU===");
            System.out.println("1. Agregar Nombres.");
            System.out.println("2. Modificar nombre");
            System.out.println("3. Borrar Nombres.");
            System.out.println("4. Visualizar un Nombre");
            System.out.println("5. Visualizar todos Nombres.");
            System.out.println("6. Salir");
            
            System.out.print("Introduce una opcion: ");
            opcion = datos.nextInt();
            datos.nextLine();
            
            if (opcion == 1){
                System.out.print("Cuantos nombres quieres añadir?: ");
                int cantidad = datos.nextInt();
                
                for (int i = 0; i<cantidad+1;i++){
                    System.out.print("Introduce los nombres de uno en uno: ");
                    String nombres = datos.nextLine();
                    nomb.add(nombres);
                }
            }
            else if (opcion == 2){
                System.out.println("¿Que nombre quieres modificar?: ");
                String nombreViejo = datos.nextLine();
                int posicion = nomb.indexOf(nombreViejo);
                if (nomb.contains(nombreViejo)){
                    System.out.print("Introduce el nuevo nombre: ");
                    String nombreN = datos.nextLine();
                    nomb.set(posicion, nombreN);
                    System.out.println("Se ha modificado el nombre");
                }
                else{
                    System.out.println("Ese nombre no esta en el array");
                }
  
            }
            else if (opcion == 3){
                 System.out.print("¿Que nombre quieres borrar?: ");
                String nombreViejo = datos.nextLine();
                int posicion = nomb.indexOf(nombreViejo);
                if (nomb.contains(nombreViejo)){
                    nomb.remove(posicion);
                    System.out.println("Se ha borrado el nombre");
                }
                else{
                    System.out.println("Ese nombre no esta en el array");
                }
                
            }
            else if (opcion == 4){
                System.out.print("Que posicion quieres visualizar?: ");
                int posicion = datos.nextInt();
                System.out.println(nomb.get(posicion));
            }
            else if (opcion == 5){
                for (int i = 0; i< nomb.size();i++){
                    System.out.println(nomb.get(i));
                }
            }
            else if (opcion == 6){
                System.out.println("Hasta luego");
            }
            else{
                System.out.println("ESO NO ES UNA OPCIÓN");
            }
        }while (opcion != 6);
        
        
    }
    
}
