
package main;


public class operaciones {
  int suma;
  int resta;
  int multiplicacion;
  int division;
  
  
 public void sumar (int n1, int n2){
     suma= n1 + n2;
 }
 
 public void restar (int n1, int n2){
     resta = n1 - n2;
 }
  
 public void multiplicar(int n1, int n2 ){
     multiplicacion = n1 * n2;
 }
 
 public void dividir (int n1, int n2){
     division = n1 / n2;
 }
 
 
 
 public void mostrarResultados(){
    System.out.println("El resulltado de la suma es:"+suma);
    System.out.println("El resulltado de la resta es:"+resta);
    System.out.println("El resulltado de la multiplicacion es:"+multiplicacion);
    System.out.println("El resulltado de la division es:"+division);
 }
}
