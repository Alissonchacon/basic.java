/*.Desarrollar  un  programa  que  dada  una  matriz  3*4  con  números aleatorios,
imprimir de la matriz sólo lo siguiente:-La  primera fila-La segunda columna-La tercera fila
 */
package matriz3;

import java.util.Random;
import java.util.Scanner;

public class Matriz3 {

    public static void main(String[] args) {
    Scanner leer= new Scanner( System.in);
    Random ra= new Random();
    int na;
    int [][]matriz= matriz= new int [3][4];
    
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <4; j++) {
             na=ra.nextInt(100);
             matriz[i][j]=na;
            }    
        }System.out.println("MATRIZ");
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <4; j++) {
                System.out.print("|"+matriz[i][j]+"|");
            }System.out.println("");
            }
            System.out.println("PRIMERA FILA");
            for (int i = 0; i <3; i++) {
            for (int j = 0; j <4; j++) {
                if(matriz[i][j]==matriz[0][j]){
                System.out.print("|"+matriz[0][j]+"|");
            }}
        }System.out.println("");
            System.out.println("SEGUNDA COLUMNA");
            for (int i = 0; i <3; i++) {
            for (int j = 0; j <4; j++) {
                if(matriz[i][j]==matriz[i][1]){
                System.out.println("|"+matriz[i][1]+"|");
            }}
        }System.out.println("");
        System.out.println("TERCERA FILA");
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <4; j++) {
                if(matriz[i][j]==matriz[2][j]){
                System.out.print("|"+matriz[2][j]+"|");
            }}
        }System.out.println("");
    }
}

