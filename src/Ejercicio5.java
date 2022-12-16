/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivamar
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        
        int[][] a=new int[100][2];
        int[][] b=new int[50][2];
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]= (int)(Math.random()*1000+1);
            }
            
        }
        
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j]=(int)(Math.random()*9+1);                
                
                
            }
            
        }
        System.out.println("Nº de Producto       Cantidad  Precio   Importe");
        System.out.println("-------------------------------------------------");
        
        
        
    }
    
}
