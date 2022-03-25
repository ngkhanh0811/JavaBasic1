package com.company;

public class RunningNumberMod7Sum {
    public static void main(String[] args){
        int lowerbound = 1;
        int upperbound = 1000;
        int sum = 0;
        int number = lowerbound;
        number -=1;
        while (number <= upperbound){
            sum += number;
            number += 7;
        }
        System.out.println("The sum from " + lowerbound + " to " + upperbound + " is " + sum);
    }
}
