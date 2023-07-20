package vectores;

import java.util.Scanner;

public class Vectores {

    public static void main(String[] args) {
    Scanner leer= new Scanner (System.in);
        float[] peso;
        peso= new float [5];
        float promedio=0;
        int a=0;
        int l=0;
        
        for (int i = 0; i <5; i++) {
            System.out.println("Ingrese el peso");
            peso[i]= leer.nextFloat();
        }System.out.println("PESO DE LAS PERSONAS");
        for (int i = 0; i <5; i++) {
            System.out.println(peso[i]);
            promedio=promedio+peso[i];
        }
       promedio=promedio/5;
        System.out.println("El promedio es "+promedio);
        for (int i = 0; i <5; i++) {
         
            if (peso[i]>promedio){
                a++;
            }else if(peso[i]<promedio){
                l++;
            } 
        }System.out.println("Cantidad de personas por encima del promedio "+a);
        System.out.println("Cantidad de personas por debajo del promedio "+ l);
    }
}
            

