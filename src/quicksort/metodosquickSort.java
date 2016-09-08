/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.Vector;

/**
 *
 * @author ASUS
 */
public class metodosquickSort {
    
    
    public static void mostrarVector(Vector v){ 
    for (int i=0; i<v.size(); i++){ //Recorre el vector e imprime sus elementos
        System.out.print(" "+v.elementAt(i));
        }
    }
    
    public static void ordenar(Vector v){
     int centro= (v.size()/2)-1; //calcula la posición central del vector
     int pivote = (int)v.elementAt(centro);
     int aux= pivote;
        for (int i=0; i < v.size(); i++){
            if(pivote > (int)v.elementAt(i)){
                
                v.insertElementAt((int)v.elementAt(i), aux+1);
                aux++;
            }
            
            if(pivote < (int)v.elementAt(i)){
                
                v.insertElementAt((int)v.elementAt(i), aux-1);
                aux--;
            }
            
            
        }
     
        
    }
    
   
    
    
}

