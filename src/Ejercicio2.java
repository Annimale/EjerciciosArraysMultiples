/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivamar
 */
public class Ejercicio2 {
    public static void main(String[] args) {
    int suma=0;
    int[][]datos = new int [7][5];
    int[][]datos2 = new int [7][7];
    
    
    for (int i = 0; i < datos.length; i++) {//BUCLE PARA ASIGNAR VALORES ALEATORIOS
            for (int j = 0; j <datos[i].length ; j++) {
                datos[i][j]= (int) (Math.random()*9+0);
                System.out.print("| "+datos[i][j]+" |");
            }
            System.out.println();
        }
        System.out.println("***************************");
    
        for (int i = 0; i < datos.length; i++) { //BUCLE P
            for (int j = 0; j < datos[i].length; j++) {
                datos2[i][j]=datos[i][j];
                
            }
            
        }
    for (int i = 0; i < datos.length; i++) {// BUCLE PARA ASIGNAR LA SUMA DE CADA FILA A LA SEXTA COLUMNA
            for (int j = 0; j < datos[i].length; j++) {
                suma=datos2[i][j]+suma;
                
                //System.out.print("| "+datos2[i][j]+" |");
            }
            datos2[i][5]=suma;
            suma=0;// ESTE RESET LO HACEMOS PARA QUE NO ME VAYA SUMANDO LAS FILAS ANTERIORES, SOLO FILA POR FILA
           
        }
    
    
    for (int i = 0; i < datos2.length; i++) {//BUCLE PARA ASIGNAR VALORES ALEATORIOS
            for (int j = 0; j <datos2[i].length ; j++) {
                
               // System.out.print("| "+datos2[i][j]+" |");
            }
            //System.out.println();
        }
    for (int i = 0; i < datos.length; i++) {// BUCLE PARA ASIGNAR LA SUMA DE CADA FILA A LA SEPTIMA COLUMNA
            for (int j = 0; j < datos[i].length; j++) {
                datos2[i][6]=datos2[i][5]/5;
                
                
            }
           
           
        }
        for (int i = 0; i < datos2.length; i++) {
            for (int j = 0; j < datos2[i].length; j++) {
                System.out.print("| "+datos2[i][j]+" |");
                
            }
            System.out.println();
        }
    
}
}
