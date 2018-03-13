/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.mysam.basejavaexamples;

import by.mysam.basejavaexamples.consolemenu.HelpDirectOperators;
import by.mysam.basejavaexamples.numberoperations.SimpleNumber;
import by.mysam.basejavaexamples.arraysoperations.ArraysOperations;
//import java.io.Exception;
import java.io.IOException;

/**
 *
 * @author SemenovaTM
 */
public class BaseJavaExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        //
        //System.out.println("HelpDirectOperators");
        //HelpDirectOperators.helpDirectOperators();
        
        //
        System.out.println("SimpleNumber");
        SimpleNumber checkNumber = new SimpleNumber(14);
        System.out.print("Check (isPrime): "+checkNumber.getNumber()+"-");
        System.out.println(checkNumber.findPrime());
        //String str = String.format("%03d",checkNumber.getNumber());
        System.out.printf("%03d",checkNumber.getNumber());
        System.out.println();
        
        //
        System.out.println("SumElementsOfArray");
        ArraysOperations array = new ArraysOperations(new int[] {1,2,3,4,5,6,7,8,9,10});
        //System.out.println(ArraysOperations.sumElements(new int[] {1,2,3,4,5,6,7,8,9,10}));
        System.out.println(array.getArray());
        array.printArray();
        System.out.println();
        System.out.println(array.sumElements());
        

    }

}
