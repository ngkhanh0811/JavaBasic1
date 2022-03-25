package com.company;

public class RectangleComputation {
    public static void main(String[] args){
        double lenght, width, area, perimeter;
        lenght = 2.0;
        width = 4.0;
        perimeter = (lenght + width) * 2.0;
        area = lenght * width;
        System.out.print("The area is ");
        System.out.println(area);
        System.out.print("The perimeter is ");
        System.out.println(perimeter);
    }
}
