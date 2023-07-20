
package ar5;

import java.util.Scanner;

public class AR5 {

    public static void main(String[] args) {
    Scanner leer= new Scanner(System.in);
    
    float []notas;
    notas= new float [10];
    String [] nombre;
    nombre = new String[10];
    String [] r;
    r= new String[10];
    
        for (int i = 0; i <10; i++) {
            System.out.println("Ingrese el nombre del estudiante");
            nombre[i]=leer.next();
            System.out.println("Ingrese la nota");
            notas[i]=leer.nextInt();
          if (notas[i]>=0 && notas[i]<=4.99){
             r[i]="SUSPENSO"; 
          }else if (notas[i]>=5 && notas[i]<=6.99){
             r[i]="BIEN";
          }else if (notas[i]>=7 && notas[i]<=8.99){
             r[i]="NOTABLE";
          }else if (notas[i]>=9 && notas[i]<=10){
             r[i]="SOBRESALIENTE";
          }
        }for (int i = 0; i < 10; i++) {
         System.out.println(nombre[i]+"|"+notas[i]+"|"+r[i]);
        
        }
    }
}
    
    

