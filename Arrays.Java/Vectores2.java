
package vectores2;

import java.util.Scanner;

public class Vectores2 {

    public static void main(String[] args) {
        Scanner leer= new Scanner ( System.in);
        String name;
        System.out.println("Digite una palabra");
        name=leer.next();
        int tamano=name.length();
    char[] palabra;
    palabra= new char [tamano];
   
        for (int i = 0; i <tamano; i++) {
        palabra[i]=name.charAt(i);
            
            }
        for (int i = 0; i <tamano; i++) {
            System.out.println(palabra[i]);
        }
    }
}

    
