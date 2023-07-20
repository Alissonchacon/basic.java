package vectores1;

import java.util.Scanner;

public class Vectores1 {

    public static void main(String[] args) {
    Scanner leer= new Scanner ( System.in);
    float [] A;
    A= new float[10];
    float [] B;
    B= new float[10];
    float promedio=0, promedio1=0, promedio2=0;
    int a;
        for (int i = 0; i < 10; i++) {
            System.out.println("NOTAS Grupo A");
            A[i]=leer.nextFloat();
            promedio1=promedio1+A[i];
            
        } promedio1=promedio1/10;
        System.out.println("PROMEDIO GRUPO A "+ promedio1);
        for (int i = 0; i < 10; i++) {
            System.out.println("NOTAS Grupo B");
            B[i]=leer.nextFloat();
            promedio2=promedio2+B[i];
        }
            promedio2=promedio2/10;
            System.out.println("PROMEDIO GRUPO B "+ promedio);
            promedio=promedio1+promedio2/2;
            System.out.println("PROMEDIO GENERAL  "+promedio);

            if (promedio1>promedio2)  {  
                    System.out.println("El grupo con mejor promedio es el GRUPO A");
            }else if (promedio2>promedio1){
                System.out.println("El grupo con mejor promedio es el GRUPO B");
            }  
        }
    }   

