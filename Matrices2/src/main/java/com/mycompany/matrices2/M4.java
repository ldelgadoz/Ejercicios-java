/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matrices2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class M4 {
    public static void main(String[] args) {
        
        /*4. Se crea una matriz que pide que implementemos el software para una máquina
        expendedora de golosinas.
        Cada golosina tiene un nombre y un precio 
        También tendrán una cantidad inicial, que en principio será de 10.
        Tendremos un pequeño menú con las siguientes opciones:
        -¿Quieres pedir golosina?: pedirá la posición de la golosina que quiera. Esta máquina tiene
        golosinas en cada posición, identificados por su fila y columna, que será lo que introduzca el
        usuario al pedir una golosina, por ejemplo si el usuario teclea 20 significa que está pidiendo la
        golosina que está en la fila 2 columna 0.
        Cuando no haya más golosinas se le indicará al usuario. Solo puede pedir una golosina.
        -¿Quieres mostrar golosina?: mostrara todas las golosinas disponibles. Mostrará el código que
        debe introducir el usuario, el nombre y el precio. La cantidad no se mostrará.
        -¿Quieres guardar los datos de golosinas?. Te pedirá una password, que es 12345, y se elegira
        la posición donde guardar la golosina y la cantidad.
        -¿Quires salir del programa? sale del programa
        */
        Scanner datos = new Scanner(System.in);
        String[][] nombresGolosinas = {
         {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
         {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
         {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
         {"Lacasitos", "Crunch", "Milkybar", "KitKat"}
        };
        double[][] precio = {
         {1.1, 0.8, 1.5, 0.9},
         {1.8, 1, 1.2, 1},
         {1.8, 1.3, 1.2, 0.8},
         {1.5, 1.1, 1.1, 1.1}
        };
        
        int[][] cantidad = {
          {10, 10, 10, 10},
          {10, 10, 10, 10},
          {10, 10, 10, 10},
          {10, 10, 10, 10}
        };
        
        int opcion;
        boolean hapedido = false;
        do{
            System.out.println("--MAQUINA CHUCHES--");
            System.out.println("1- Pedir golosinas");
            System.out.println("2- Mostrar golosinas");
            System.out.println("3- Guardar datos de golosinas");
            System.out.println("4- Salir");
            System.out.print("Introduce una opcion: ");
            opcion = datos.nextInt();
            
            if (opcion == 1){
                if(!hapedido){
                    System.out.print("Introduce la fila (0-3): ");
                    int fila = datos.nextInt();
                    System.out.print("Introduce la columna (0-3): ");
                    int columna = datos.nextInt();
                
                    if (fila >= 0 && fila < nombresGolosinas.length && columna >= 0 && columna < nombresGolosinas[0].length){
                        if(cantidad[fila][columna]>0){
                            cantidad[fila][columna]-= 1;
                            System.out.println("Usted ha pedido: "+nombresGolosinas[fila][columna]);
                            hapedido = true;
                        }      
                        else{
                        System.out.println("No queda mas "+nombresGolosinas[fila][columna]+" Lo siento");
                    }
                }
                    else{
                        System.out.println("La posicion no es valida");
                    }
                }
                else{
                    System.out.println("Usted ya ha pedido");
                }
            }
            else if(opcion ==2){
                for (int i = 0; i<nombresGolosinas.length;i++){
                    System.out.println();
                    System.out.print("Fila "+i+"\t");
                    System.out.println();
                    for(int j = 0; j< nombresGolosinas[i].length;j++){
                        System.out.print("Columna "+j+" : "+nombresGolosinas[i][j]+" "+precio[i][j]+"$"+"\t");
                        
                        }
                        
                    }
                    
                }
            else if(opcion == 3){
                String Password = "12345";
                String Pw;
                System.out.print("Introduce la contraseña: ");
                Pw = datos.next();
               
                if(Pw.equals("12345")){
                    System.out.print("Introduce la fila (0-3): ");
                    int fila = datos.nextInt();
                    System.out.print("Introduce la columna (0-3): ");
                    int columna = datos.nextInt();
                    if ((fila >= 0 && fila < nombresGolosinas.length && columna >= 0 && columna < nombresGolosinas[0].length)){
                        int nuevacantidad;
                        System.out.println("Inroduce la nueva cantidad;");
                        nuevacantidad = datos.nextInt();
                        cantidad[fila][columna] = nuevacantidad;
                    }
                    else{
                        System.out.println("Posicion no valida");
                    }
                }
                else{
                    System.out.println("La contraseña es incorrecta");
                }
            }
            else if (opcion == 4){
                System.out.println("Gracias hasta pronto");
            }
            }
            while(opcion != 4);
    }
    
}
