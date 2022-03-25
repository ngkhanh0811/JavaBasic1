package com.company;

public class CircleComputation {
    public static void main(String[] args){
        double radius, area, circumference;
        final double PI = 3.14;
        radius = 1.2;
        circumference = radius * PI * 2.0;
        area = radius * PI;
        System.out.print("The radius is ");
        System.out.println(radius);
        System.out.print("The area is ");
        System.out.println(area);
        System.out.print("The circumference is ");
        System.out.println(circumference);
    }
}
