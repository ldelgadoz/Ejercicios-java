
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DIT-MAÑANA
 */
public class Matrices1 {
    public static void main(String[] args) {
        //crear una matriz de 4 filas y 5 columnas y rellenar las celdas con números aleatorios 
        Random rand = new Random();
        
        int [][] a = new int[4][5];
        for (int i = 0; i<a.length; i++){
            for (int j=0; j<a[i].length;j++){
                a[i][j] = rand.nextInt(1,5);
            }
        }
                for (int i = 0; i<a.length; i++){
            for (int j=0; j<a[i].length;j++){
                System.out.print(a[i][j]+"\n");
            }
        }
        
    }
}
