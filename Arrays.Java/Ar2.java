
package ar2;

import java.util.Scanner;

public class Ar2 {

    public static void main(String[] args) {
     Scanner leer= new Scanner(System.in);
        char [] A;
        A= new char[26];
        char [] A2;
        A2= new char[26];
        int p;
        int a=0;
        for (int i = 0; i <A.length; i++) {
            A[i]=(char)('A'+i);
            
        }
        do{
        System.out.println("Ingrese la posicion");
        p= leer.nextInt();
        for (int i = 0; i <26; i++) {
        if (i==p){
            A2[a]=A[i];
        a++;}
        }
        }while(p>=0 && p<=26);
        if(p==50){
        System.err.println("ERROR, inserte otro numero");
        }else if(p==-1){
        System.err.println("Salir");
            }
        System.out.println("Cadena de caracteres");
            for (int i = 0; i <a; i++) {
                System.out.print(A2[i]);
            
        }
    }
}
        
    
    
    

