
package matrices2;

import java.util.Random;
import java.util.Scanner;

public class Matrices2 {

    public static void main(String[] args) {
    Scanner leer= new Scanner ( System.in);
    Random ra= new Random();
    int m=0, na;
     int [][] matriz= matriz= new int [5][3];
        for (int i = 0; i <5; i++) {
            for (int j = 0; j <3; j++) {
            na=ra.nextInt(50);
            matriz[i][j]=na;
            }
        }
        for (int i = 0; i <5; i++) {
            for (int j = 0; j <3; j++) {
                System.out.print("|"+matriz[i][j]+"|");
            if (matriz[i][j]>m) {
                m=matriz[i][j];
            }}System.out.println("");
        }System.out.println("El numero mayor es "+m);
 
    }
}
