
package main;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
     
        
        Scanner entrada = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        
        
        try {
            System.out.println("Ingrese un numero: ");
             n1 = entrada.nextInt();
            System.out.println("Ingrese un numero: ");
             n2 = entrada.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("No se puede ingresar letras");
        }
        operaciones op = new operaciones();
        try{
        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1, n2);
        op.dividir(n1, n2);

        op.mostrarResultados();
        }catch(ArithmeticException ex ){
            System.out.println("No se puede dividir entre cero ");
        }
        
    }
 
}
