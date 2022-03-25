package com.company;

public class CylinderComputation {
    public static void main(String[] args){
        double radius, height, surfaceArea, baseArea, volume, PI;
        PI = 3.14;
        height = 2.0;
        radius = 4.0;
        surfaceArea = PI * radius;
        baseArea = 2 * radius * PI * height;
        volume = radius * radius * PI * height;
        System.out.print("The surfaceArea is ");
        System.out.println(surfaceArea);
        System.out.print("The baseArea is ");
        System.out.println(baseArea);
        System.out.print("The volume is ");
        System.out.println(volume);
    }
}
