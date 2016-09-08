/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.Scanner;
import java.util.Vector;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número de elementos");
        v = sc.nextInt(); //almacena el número de elementos en variable v
        Vector x= new Vector(v); //crea un vector de tamaño v

        while(i!=v){ //se ejecuta hasta llenar el vector
        System.out.println("Introduzca el elemento #"+(i+1)+" y presione enter"); //pide el número de elementos
        e=sc.nextInt();
        x.addElement(e);
        i++;
            }
        System.out.println("Elementos capturados");
        metodosquickSort.mostrarVector(x);
        System.out.println("Elementos capturados");
        metodosquickSort.ordenar(x);
        metodosquickSort.mostrarVector(x);
        
    
    }
    
}
