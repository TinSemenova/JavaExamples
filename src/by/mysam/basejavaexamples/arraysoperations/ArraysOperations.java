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
public class ArraysOperations {
    private int size;
    private int[] array;
    
    public ArraysOperations(int size){
        this.size = size;
    }
    public ArraysOperations(int[] array){
        this.size = array.length;
        this.array = array;
    }
    public static int sumElements(int[] array){
        int sum = 0;
        for(int element : array) sum +=element;
        return sum;
    }

    public int sumElements(){
        int sum = 0;
        for(int element : array) sum +=element;
        return sum;
    }
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void printArray() {
        for(int element : array) System.out.print(element+" ");;
    }    
}
