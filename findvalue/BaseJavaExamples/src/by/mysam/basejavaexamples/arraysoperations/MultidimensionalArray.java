/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.mysam.basejavaexamples.arraysoperations;

/**
 *
 * @author SemenovaTM
 */
public class MultidimensionalArray {
        public static int sumElements(int[][] array){
        int sum = 0;
        for(int elements[] : array) 
            for(int element : elements)sum +=element;
        return sum;
    }
    
}
