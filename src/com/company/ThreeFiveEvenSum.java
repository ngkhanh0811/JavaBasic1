package com.company;

public class ThreeFiveEvenSum {
    public static void main(String[] args) {
        int lowerbound = 1, upperbound = 1000;
        int sumEven1 = 0;
        int sumEven2 = 0;
        int number = lowerbound;
        while (number <= upperbound) {
            if (number % 3 == 0 || number % 5 == 0 || number % 7 == 0) {
                sumEven1 += number;
            } else if (number % 15 == 0 || number % 21 == 0 || number % 35 == 0 || number % 105 == 0) {
                sumEven2 += number;
            }
            number++;
            System.out.println("The sum of even numbers from " + lowerbound + " to " + upperbound + " is " + (sumEven1 - sumEven2));
        }
    }
}
