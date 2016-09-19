/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author ASUS
 */
public class metodosquickSort {
    static Scanner sc = new Scanner(System.in);
    static int [] vector;
    
    

     public static void mostrarVector(int[] v){ 
    
     for (int i=0; i<v.length; i++){ //Recorre el vector e imprime sus elementos
        
        System.out.print("|"+v[i]+"|");
        
        }
    System.out.println("");
 }
    
    public static void MQSort(int [] v) {
        ordenar(v, 0, v.length-1);
    }
    
    public static void ordenar(int[] v, int izq, int der){
        int pivote=v[izq]; // tomamos primer elemento como pivote
  int i=izq; // i realiza la búsqueda de izquierda a derecha
  int j=der; // j realiza la búsqueda de derecha a izquierda
  int aux;
 
  while(i<j){            // mientras no se crucen las búsquedas
     while(v[i]<=pivote && i<j) i++; // busca elemento mayor que pivote
     while(v[j]>pivote) j--;         // busca elemento menor que pivote
     if (i<j) {                      // si no se han cruzado                      
         aux= v[i];                  // los intercambia
         v[i]=v[j];
         v[j]=aux;
     }
   }
   v[izq]=v[j]; // se coloca el pivote en su lugar de forma que tendremos
   v[j]=pivote; // los menores a su izquierda y los mayores a su derecha
   if(izq<j-1)
      ordenar(v,izq,j-1); // ordenamos subarray izquierdo
   if(j+1 <der)
      ordenar(v,j+1,der); // ordenamos subarray derecho
    }   
    
   
    
    
}

