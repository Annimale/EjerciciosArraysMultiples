/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivamar
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        
        int[][]datos = new int [5][7];
        
        
        //BUCLE PARA ASIGNAR VALORES CON RANDOM
        for (int i = 0; i < datos.length; i++) {//AQUI ENTRAMOS EN LA PRIMERA FILA
            for (int j = 0; j <datos[i].length ; j++) {// AQUI RECORREMOS LA FILA COMO TAL//ESTOS DOS BUCLES SON SIMPLEMENTE PARA ASIGNAR LOS VALORES CON RANDOM
                datos[i][j]= (int) (Math.random()*35+0);
                
               
            }
            
        }
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.println("Visualizamos la matriz COMPLETA: en la fila "+i+" y columna: "+j+" tenemos el valor :  "+datos[i][j]);
                
            }
            
        }
        System.out.println("************************************");
        for (int i = 4; i < datos.length; i++) {// INDICAMOS EN LA i LA POSICION QUE QUEREMOS SOLAMENTE IMPRIMIR
            for (int j = 0; j < datos[i].length; j++) {
                System.out.println("Visualizamos la fila 5 completa: "+datos[i][j]);
                
            }
            
        }
        System.out.println("************************************");
        System.out.println("ANTES DE ASIGNAR");
        System.out.println("Visualizamos el elemento de la cuarta fila y tercera columna: "+datos[3][2]);
        System.out.println("Visualizamos el elemento de la quinta fila y tercera columna: "+datos[4][2]);
        System.out.println("DESPUES DE ASIGNAR");
        datos[3][2]=datos[4][2] && datos[4][2]=datos[3][2];
       // datos[4][2]=datos[3][2];
        System.out.println("Visualizamos el elemento de la cuarta fila y tercera columna DESPUES DE SER ASIGNADO: "+datos[3][2]);
        //System.out.println("Visualizamos el elemento de la quinta fila y tercera columna DESPUES DE SER ASIGNADO: "+datos[4][2]);
       
            
            
        

    }
    
}


//int matriz[][] = new int[(int) (Math.random()*9+1)][(int) (Math.random()*9+1)];
//ESTA SERÍA OTRA FORMA DE HACERLO