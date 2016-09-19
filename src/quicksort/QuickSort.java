/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.InputMismatchException;
import java.util.Scanner;
import static quicksort.metodosquickSort.sc;


/**
 *
 * @author ASUS
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v, i, e, a;
        i=0;
        Scanner sc = new Scanner(System.in); //Scanner
        System.out.println("Introduzca el número de elementos");
        v = sc.nextInt(); //Variable que almacena lo que introduce el scanner
        int x[]= new int[v]; //crea el arreglo
        while(i!=v){ //mientras el contador i no llegue al valor de v
        System.out.println("Introduzca el elemento #"+(i+1)+" y presione enter"); //pide los elementos del arreglo
        e=sc.nextInt(); //los almacena en la variable e
        x[i]=e; //los introduce al arreglo
        i++; //i incrementa
            }
        
        System.out.println("Elementos capturados");
        metodosquickSort.mostrarVector(x);
        
        metodosquickSort.MQSort(x);
        System.out.println("Elementos ordenados");
        metodosquickSort.mostrarVector(x);
        
    
    }
    
}
