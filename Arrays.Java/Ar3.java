
package ar3;

import java.util.Scanner;

public class Ar3 {

    public static void main(String[] args) {
    Scanner leer= new Scanner(System.in);
        char [] A;
        A= new char[26];
        char [] A2;
        A2= new char[26];
        int p;
        for (int i = 0; i <26; i++) {
            A[i]=(char)('A'+i);
            
        }System.out.println("Ingrese la posicion");
        p= leer.nextInt();
        for (int i = 0; i <26; i++) {
            if (i==p){
                A2[0]=A[i];}
            }
            
        }
        
    }
    

