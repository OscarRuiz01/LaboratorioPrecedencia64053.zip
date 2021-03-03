/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioprecedencia64053.zip;

import java.util.Scanner;

/**
 *
 * @author OscarRuiz
 */
public class LaboratorioPrecedencia64053Zip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Primera parte > Precedencia de Operaciones
        double x = 9 + 10 / 2 * 6 % 2;
        System.out.println("El valor de x es :" + x);
        
        //El resultado ahora es completamente diferente al anterior, gracias 
        //a que hemos utilizado paréntesis para alterar la precedencia de los 
        //operadores: todas las operaciones que se encuentren dentro de unos 
        //paréntesis se evalúan antes de aquellas que se encuentran fuera.
        x=(9 + 10 / 2) * (6 % 2);
        System.out.println("El nuevo valor de x es : " + x);
        
        // segunda parte - Ejercicios 
        Scanner leer = new Scanner (System.in);
        
        x = 9 / 2 * 2;
        System.out.println("x = 9 / 2 * 2 ");
        System.out.println("¿Cual es el valor dex x? : ");
        leer.nextLine();
        System.out.println("El valor de x es : " + x);
        boolean b = (6 * 6 > (5 + 10) + 20);
        System.out.println("b = (6 * 6 >(5 + 10) + 20)");
        System.out.println("¿Cual es el valor de b?");
        leer.nextLine();
        System.out.println("El valor de b es : " + b);
        
        int[] arreglo = { 4 , 4 };
        int i = 1;
        arreglo[i] = i = 0;
        System.out.println("arreglo = { 4 , 4 }");
        System.out.println("arreglo[i] = i = 0");
        System.out.println("¿Que posicion del arreglo se modifico?"  + ("¿Y con que valor?"));
        leer.nextLine();
        System.out.println("El arreglo quedó así :  { " + arreglo[0] + " , " + arreglo[1] + "}");
        b = !( 2 * (3 + 3)/ 8 - 2 > 0) && (6 + (2 * 2) > (3 * 3));
        System.out.println("b = !( 2 * (3 + 3)/ 8 - 2 > 0) " + "&& (6 + (2 * 2) > (3 * 3))");
        System.out.println("¿Cuál es el valor de b? : " );
        leer.nextLine();
        System.out.println("El valor de b es : " + b);
    }
    
}
