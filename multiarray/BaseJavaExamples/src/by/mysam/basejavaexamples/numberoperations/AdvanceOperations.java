/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.mysam.basejavaexamples.numberoperations;

/**
 *
 * @author SemenovaTM
 */
public class AdvanceOperations {
    public static int averageNumbers(int firstNumber, int secondNumber){
        //for firstNumber < secondNumber
        while(++firstNumber < --secondNumber) ;
        return firstNumber;
    }
    
    public static int booleanToNumber(boolean b){
        return b ? 1 : 0;        
    }
    
    public static void oneCheck(int number){
        if(number !=0 && 10/number >2){
            System.out.println("number не нуль");
        }else{
           System.out.println("не выполняется деление на нуль"); 
        }
    }
    
    public static void useWhile(int number){
        do{
            System.out.print(" | ");
            System.out.printf("%03d", number);            
        }while(--number > 0);
        System.out.print(" | ");
    }
}
