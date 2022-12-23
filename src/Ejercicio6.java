/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author skril
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        
        float [][]notasAlu=new float[22][4];
        float valorMax1=notasAlu[0][0];
        float valorMax2=notasAlu[0][0];
        float valorMax3=notasAlu[0][0];
        float mediAlumno=0;
        float totalMod1=0;
        float totalMod2=0;
        float totalMod3=0;
        float alumnosApro1=0;
        float alumnosApro2=0;
        float alumnosApro3=0;
        
        
        System.out.println("Asignamos notas aleatorias de tipo float comprendidas desde 0 hasta 10 a cada alumno y modulo y lo visualizamos");// EN ESTE BUCLE ADEMAS DE ASIGNAR LOS VALORES SACAMOS EL MAXIMO Y SACREMOS LA MEDIA TAMBIEN
        
        System.out.println("\n");
        System.out.println("    BIO          MAT          LEG       NOTA MEDIA ALUMNO");
        for (int i = 0; i < notasAlu.length-3; i++) {
            for (int j = 0; j < notasAlu[i].length-1; j++) {
                
                notasAlu[i][j]=(float) (Math.random()*10+0);// ASIGNACION DE VALORES ALEATORIOS
                
                mediAlumno= (notasAlu[i][0]+notasAlu[i][1]+notasAlu[i][2])/3;//ASIGNACION DE LO QUE ES LA MEDIA DEL ALUMNO
               
                
                
                //mediaMod1=mediaMod1/20; ESTA SERÍA OTRA FORMA DE HACERLO, LUEGO DIVIENDO EL RESULTADO DE LA SUMA /20
                
                if(valorMax1<notasAlu[i][0]){// CONDICION PARA SABER LA NOTA MAXIMA DEL PRIMER MODULO
                    valorMax1=notasAlu[i][0];
                }
                 if(valorMax2<notasAlu[i][1]){// CONDICION PARA SABER LA NOTA MAXIMA DEL SEGUNDO MODULO
                    valorMax2=notasAlu[i][1];
                }
                 if(valorMax3<notasAlu[i][2]){// CONDICION PARA SABER LA NOTA MAXIMA DEL TERCER MODULO
                    valorMax3=notasAlu[i][2];
                }
                 
                 
                System.out.print("| "+notasAlu[i][j]+" |");
                
            }
           System.out.print("| "+mediAlumno+" |");
            System.out.println();
        }
        
        for (int i = 0; i < notasAlu.length-3; i++) {
                totalMod1+=notasAlu[i][0];//FALTARÍA LUEGO EN EL SOUT DIVIDIRLO ENTRE 20 YA QUE SOLO ESTAMOS SUMANDO TODAS LAS NOTAS DEL MODULO AQUI
                totalMod2=notasAlu[i][1]+totalMod2;
                totalMod3=notasAlu[i][2]+totalMod3;
            
        }
        
        for (int i = 20; i < notasAlu.length-1; i++) { //BUCLE PARA LA NOTA MAXIMA DEL PRIMER MODULO
            for (int j = 0; j < notasAlu[i].length-3; j++) {//PONEMOS QUE J SEA 0 HASTA LA POSICIÓN -3 QUE ES EL 0 DE J YA QUE VA DESDE 0, 1, 2, 3 ENTONCES SI LE DECIMOS -3 SE PONDRÁ EN EL 0
               
                
                notasAlu[20][0]=valorMax1;
                System.out.print("BIO "+notasAlu[20][0]);
                
            }
                       
        }
        
         for (int i = 20; i < notasAlu.length-1; i++) { //BUCLE PARA ASIGNAR LA NOTA MAXIMA DEL SEGUNDO MODULO
            for (int j = 1; j < notasAlu[i].length-2; j++) {//PONEMOS QUE J SEA 0 HASTA LA POSICIÓN -3 QUE ES EL 0 DE J YA QUE VA DESDE 0, 1, 2, 3 ENTONCES SI LE DECIMOS -3 SE PONDRÁ EN EL 0
                notasAlu[20][1]=valorMax2;
                System.out.print("  MAT: "+notasAlu[20][1]);
                
            }
                      
        }
         for (int i = 20; i < notasAlu.length-1; i++) { //BUCLE PARA ASIGNAR LA NOTA MAXIMA DEL SEGUNDO MODULO
            for (int j = 2; j < notasAlu[i].length-1; j++) {//PONEMOS QUE J SEA 0 HASTA LA POSICIÓN -3 QUE ES EL 0 DE J YA QUE VA DESDE 0, 1, 2, 3 ENTONCES SI LE DECIMOS -3 SE PONDRÁ EN EL 0
                notasAlu[20][2]=valorMax3;
                System.out.print("  LEG:"+notasAlu[20][2]);
                
            }
                      
        }
        System.out.println("\nMED: "+(totalMod1/20)+" MED: "+totalMod2/20+" MED: "+totalMod3/20);
        
        
        
    }
    
}
