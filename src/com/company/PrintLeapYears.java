package com.company;

public class PrintLeapYears {
    public static void main(String[] args){
        int count = 0;
        int firstYear = 999;
        int lastYear = 2010;
        int Year = firstYear;
        while (Year<=lastYear) {
            if (Year%4==0) {
                count++;
            }
            Year++;
        }
        System.out.println("There are " + count + " years is LeapYears");
    }
}
