
package ar4;

import java.util.Random;
import java.util.Scanner;

public class AR4 {

    public static void main(String[] args) {
    Scanner leer= new Scanner (System.in);
    Random numeror=new Random();
    
    int []A;
    int numr;
    int tamano;
    int ud, nf, a=0;
    int []A2;
    
        System.out.println("Digite el tamaño del array");
        tamano= leer.nextInt();
        System.out.println("Digite el numero en el que quiere que termine los numeros del nuevo arreglo");
        ud= leer.nextInt();
        A= new int[tamano];
        A2= new int [tamano];
        for (int i = 0; i <tamano; i++) {
            numr=numeror.nextInt(300);
            A[i]=numr;
            nf=A[i]%10;
            
            if (nf==ud) {
            A2[a]=A[i];
            a++;
            }
           System.out.print("|"+A[i]+"|"); 
        }
        System.out.println("");
        System.out.println("Arreglo con los numeros que terminan en "+ud);
        for (int i = 0; i <a; i++) {
            System.out.print("|"+A2[i]+"|");
        }
    }
}