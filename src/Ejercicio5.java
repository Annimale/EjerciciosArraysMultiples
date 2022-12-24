/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author ivamar
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        
        int[][] a=new int[100][2];
        int[][] b=new int[50][2];
        int[][] total=new int[51][4];
        int numProducto=0;
        int presupuesto=0;
        
        System.out.println("VISUALIZAMOS PRIMERA MATRIZ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
              a[i][0]=numProducto;// Asiganmos a la primera columna que vaya desde 0 hasta 100 para poner el numero de producto
              a[i][1]=(int)(Math.random()*100+1);// y la segunda columna como es precio tenga un rango de hasta 100.    PRECIO
              System.out.print("| "+a[i][j]+" |");
             
            }
             numProducto++;//Este ++ tiene que estar fuera de los otros bulces porque sino sumaría de dos en dos ya que hay dos columnas.
            System.out.println();
        }
        System.out.println("*******************");
        
        System.out.println("VISUALIZAMOS SEGUNDA MATRIZ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][0]=a[i][0];
                b[i][1]=(int)(Math.random()*50);//CANTIDAD
                 System.out.print("| "+b[i][j]+" |");
            }
             System.out.println();
        }
        System.out.println("--------------------------------------LISTADO FINAL---------------------------");
       System.out.println("Nº de Producto       Cantidad  Precio   Importe");
       System.out.println("-------------------------------------------------");
        for (int i = 0; i <total.length-1 ; i++) {//Le pongo el -1 porque quiero que me vaya hasta la 49 solo
            for (int j = 0; j < total[i].length; j++) {
                
                total[i][0]=b[i][0];
                total[i][1]=b[i][1];
                total[i][2]=a[i][1];
                total[i][3]=b[i][1]*a[i][1];
                
                System.out.print("| "+total[i][j]+" |");
            }
            System.out.println();
        }
        
        for (int i = 0; i < total.length-1; i++) {//Ponemos length -1 porque solo queremos que vaya hasta la i=49  (empieza desde 0 hasta 49) 
            for (int j = 0; j < total[i].length; j++) {
                presupuesto= total[i][3] + presupuesto;// Esto es para sumar toda la columna de importe
                
            }
            
        }
        total[50][1]=presupuesto;
        System.out.println("EL PRESUPUESTO TOTAL ES DE:   "+total[50][1]);
    }
}
    

