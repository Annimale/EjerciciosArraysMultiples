/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivamar
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        int[] vectorV=new int[50];
        int[] vectorP=new int[20];
        int [][] matriz=new int [50][20];
        
        for (int i = 0; i < vectorV.length; i++) {
            vectorV[i]=(int) (Math.random()*9+1);
            
        }
        for (int i = 0; i < vectorP.length; i++) {
            vectorP[i]=(int) (Math.random()*9+1);
            
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]= vectorV[i]*vectorP[j];//Aqui lo que hacemos es asignarlo a i de matriz el vectorV y a j el vectorP entonces se multiplican
                
            }
            
        }
        
        for (int i = 0; i < vectorV.length; i++) {
            System.out.print("| "+vectorV[i]+" |");
            
        }
        System.out.println("\n*****************************************");
        
        for (int i = 0; i < vectorP.length; i++) {
            System.out.print("| "+vectorP[i]+" |");
            
        }
        System.out.println("\n*******************************************");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
            System.out.print("| "+matriz[i][j]+" |");
            
            
        }
            
            System.out.println();   
     }
            
        }
        
        
    }
    

