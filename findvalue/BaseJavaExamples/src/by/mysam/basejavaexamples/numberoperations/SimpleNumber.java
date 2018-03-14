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
public class SimpleNumber {
    private int number;
    
    public SimpleNumber(int number){
        this.number = number;
    }
    public boolean findPrime(){
        boolean isPrime;
        if(number < 2) isPrime = false;
        else isPrime = true;
        for(int i=2;i<=number/i;i++){
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
