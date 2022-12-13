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
        int aux1=0;
        int aux2=0;
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
        aux1=datos[3][2];//UTILIZAMOS UNA VARIABLE AUXILIAR PARA GUARDAR EL VALOR
        datos[3][2]=datos[4][2];
        datos[4][2]=aux1;// LE ASIGNAMOS EL VALOR LUEGO
        
        // && datos[4][2]=datos[3][2];
       // datos[4][2]=datos[3][2];
        System.out.println("Visualizamos el elemento de la cuarta fila y tercera columna DESPUES DE SER ASIGNADO: "+datos[3][2]);
        System.out.println("Visualizamos el elemento de la quinta fila y tercera columna DESPUES DE SER ASIGNADO: "+datos[4][2]);
        System.out.println("****************");
        System.out.println("PRIMERA COLUMNA (COLUMNA 0) ANTES DE ASIGNAR");
        for (int i = 0; i < datos.length; i++) {
            System.out.println(datos[i][0]); //BLOQUEAMOS LA POSICION DE j PARA COGER EL PRIMER VALOR DE CADA FILA
            
        }
        System.out.println("CUARTA COLUMNA (COLUMNA 3) ANTES DE ASIGNAR");
        for (int i = 0; i < datos.length; i++) {
            System.out.println(datos[i][3]);
            
        }
        
        System.out.println("ASIGNAMOS A aux2=datos[i][0] Y LUEGO ASIGNAMOS A datos[i][0]=datos[i][3]");
        for (int i = 0; i < datos.length; i++) { // Y LUEGO VOLVEMOS A ASIGNAR A datos[i][3]=aux2; que son los valores de datos[i][0]
        aux2=datos[i][0];
        datos[i][0]=datos[i][3];
        datos[i][3]=aux2; 
            
        }
        
        
        System.out.println("PRIMERA COLUMNA (COLUMNA 0) DESPUES DE ASIGNAR");
        for (int i = 0; i < datos.length; i++) {
            
            System.out.println(datos[i][0]); 
            
        }
        System.out.println("CUARTA COLUMNA (COLUMNA 3) DESPUES DE ASIGNAR");
        for (int i = 0; i < datos.length; i++) {
            
            System.out.println(datos[i][3]); 
            
        }
            
            
        }
        
            
            
        

    }
    



//int matriz[][] = new int[(int) (Math.random()*9+1)][(int) (Math.random()*9+1)];
//ESTA SERÍA OTRA FORMA DE HACERLO