/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *. Generar en cuadrado Latino de orden N. (Un cuadrado Latino de
orden N es una matriz cuadrada en la que la primera fila contiene los N
primeros números naturales, en orden, y cada una de las siguientes
filas contiene la rotación de la fila anterior un lugar a la derecha.
1 2 3 4 5
5 1 2 3 4
4 5 1 2 3
3 4 5 1 2
2 3 4 5 1
 * @author ivamar
 */
public class Ejercicio4 {
    public static void main(String[] args) {
     int orden=5;  
     int[][] cLatino=new int[orden][orden];
     
     
     //Generar en cuadrado Latino de orden N. (un cuadrado Latino de orden N es una matriz cuadrada en la que la primera fila 
     // contiene los N primer numeros naturales, en orden, y cada una de las siguientes filas contiene la rotación del a fila anterior un lugar a la derecha
     
        for (int i = 0; i < cLatino.length; i++) {
            for (int j = 0; j < cLatino[i].length; j++) {
                if(i==0){
                    cLatino[i][j]=j+1;
                }else{
                    if(j==0){
                    cLatino[i][j]=cLatino[i-1][cLatino[i].length-1];
                    }else{
                        cLatino[i][j]=cLatino[i-1][j-1];
                    }
                }
            }
            
           }
        System.out.println("Toda la matriz:  ");
        for (int[] cLatino1: cLatino) {
            for (int j = 0; j < cLatino.length; j++) {
                System.out.print(" | ");
                System.out.print(cLatino1[j]);
                System.out.print(" | ");
                
            }
            System.out.println();
            
        }
        
    }
        
        
        
    }

