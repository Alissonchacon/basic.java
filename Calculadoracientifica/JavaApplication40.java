
package javaapplication40;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.tan;
import java.util.Scanner;

public class JavaApplication40 {

    public static void main(String[] args) {
   Scanner leer= new Scanner (System.in);
   
        System.out.println("CALCULADORA CIENTIFICA");
        System.out.println("");
        System.out.println("|1| SUMA ");
        System.out.println("|2| RESTAR");
        System.out.println("|3| MULTIPLICAR");
        System.out.println("|4| DIVIDIR");
        System.out.println("|5| RAIZ CUADRADA");
        System.out.println("|6| PORCENTAJE");
        System.out.println("|7| SENO");
        System.out.println("|8| COSENO");
        System.out.println("|9| TANGENTE");
        System.out.println("|10| COTANGENTE");
        System.out.println("|11| COSECANTE ");
        System.out.println("|12| SECANTE");
        System.out.println("|13| CUANTO VALE PI");
        
        int opcion;
        float porcentaje, n1, n2,operacion;
        
        System.out.println("SELECCIONE LA OPERACION DESEA REALIZAR");
        opcion= leer.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Ingrese el primer valor");
                n1= leer.nextFloat();
                System.out.println("Ingrese el segundo valor");
                n2= leer.nextFloat();
                operacion=n1+n2;
                System.out.println("El resultado de la operacion es "+ operacion);
                break;
                case 2:
                System.out.println("Ingrese el primer valor");
                n1= leer.nextFloat();
                System.out.println("Ingrese el segundo valor");
                n2= leer.nextFloat();
                operacion=n1-n2;
                System.out.println("El resultado de la operacion es "+ operacion);
                break;
                case 3:
                System.out.println("Ingrese el primer valor");
                n1= leer.nextFloat();
                System.out.println("Ingrese el segundo valor");
                n2= leer.nextFloat();
                operacion=n1*n2;
                System.out.println("El resultado de la operacion es "+ operacion);
                break;
                case 4:
                System.out.println("Ingrese el primer valor");
                n1= leer.nextFloat();
                System.out.println("Ingrese el segundo valor");
                n2= leer.nextFloat();
                operacion=n1/n2;
                System.out.println("El resultado de la operacion es "+ operacion);
                break;
                case 5:
                System.out.println("Ingrese el numero al que le desea sacar la raiz cuadrada");
                n1= leer.nextFloat();
                operacion=(float) Math.sqrt(n1);
                System.out.println("El resultado de la operacion es "+ operacion);
                break;
                case 6:
                System.out.println("Ingrese el primer valor");
                n1= leer.nextInt();
                System.out.println("Ingrese el numero de porcentaje");
                porcentaje=leer.nextFloat();
                operacion=(n1*porcentaje)/100;
                System.out.println("El porcentaje es "+ operacion);
                break;
                case 7:
                System.out.println("Ingrese el  angulo al que le desea sacar el seno");
                n1=leer.nextFloat();
                operacion= (float) sin(Math.toRadians(n1));
                System.out.println("El seno de el angulo es "+ operacion);
                break;
                case 8:
                System.out.println("Ingrese el  angulo al que le desea sacar el coseno");
                n1=leer.nextFloat();
                operacion= (float) cos(Math.toRadians(n1));
                System.out.println("El coseno de el angulo es "+ operacion);
                break;
                case 9:
                System.out.println("Ingrese el  angulo al que le desea sacar el tangente");
                n1=leer.nextFloat();
                operacion= (float) tan(Math.toRadians(n1));
                System.out.println("La tangente de el angulo es "+ operacion);
                break;
                case 10:
                System.out.println("Ingrese el  angulo al que le desea sacar el cotangente");
                n1=leer.nextFloat();
                operacion=1/((float) tan(Math.toRadians(n1)));
                System.out.println("La cotangente de el angulo es "+ operacion);
                break;
                case 11:
                System.out.println("Ingrese el  angulo al que le desea sacar el cosecante");
                n1=leer.nextFloat();
                operacion=1/((float) sin(Math.toRadians(n1)));
                System.out.println("La cosecante de el angulo es "+ operacion);
                break;
                case 12:
                System.out.println("Ingrese el  angulo al que le desea sacar el secante");
                n1=leer.nextFloat();
                operacion=1/(float) cos(Math.toRadians(n1));
                System.out.println("El secante de el angulo es "+ operacion);    
                break;
                case 13:
                operacion=(float) (Math.PI);
                System.out.println("El resultado de la operacion es "+operacion);
                break;
                default:
                System.err.println("ERROR: LA OPCION NO EXISTE");
                break;
        }   
    }
}
