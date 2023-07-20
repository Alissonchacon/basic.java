
package matrices1;

import java.util.Random;
import java.util.Scanner;

public class Matrices1 {

    public static void main(String[] args) {
    Scanner leer= new Scanner (System.in);
    Random ra= new Random();
    int f, c, n;
        System.out.println("Ingrese numero de filas");
        f=leer.nextInt();
        System.out.println("Ingrese numero de columnas");
        c=leer.nextInt();
        
    int [][]matriz1= matriz1= new int[f][c]; 
    int [][]matriz2= matriz2= new int[f][c]; 
    int [][]matriz3= matriz3= new int[f][c]; 
    
        for (int i = 0; i <f; i++) {
            for (int j = 0; j <c; j++) {
            n=ra.nextInt(50);
            matriz1[i][j]=n*2+2;
            }
        }
        for (int i = 0; i <f; i++) {
            for (int j = 0; j <c; j++) {
            n=ra.nextInt(25);
            matriz2[i][j]=n*2+1;
            }
        }
        for (int i = 0; i <f; i++) {
            for (int j = 0; j <c; j++) {
            matriz3[i][j]=matriz1[i][j]+matriz2[i][j];
        }
        }System.out.println("MATRIZ|1|");
        for (int i = 0; i <f; i++) {
            for (int j = 0; j <c; j++) {
                System.out.print("|"+matriz1[i][j]+"|");
            }
            System.out.println("");   
        }System.out.println("MATRIZ|2|");
        for (int i = 0; i <f; i++) {
            for (int j = 0; j <c; j++) {
                System.out.print("|"+matriz2[i][j]+"|");
            }System.out.println("");
        }System.out.println("MATRIZ|3|");
        for (int i = 0; i <f; i++) {
            for (int j = 0; j <c; j++) {
                System.out.print("|"+matriz3[i][j]+"|");
            }System.out.println("");
        }
    }
}

    