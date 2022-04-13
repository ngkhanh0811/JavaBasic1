package java18;/*Welcome to my show !

@author: NgKhanh
Date: 4/13/2022
Time: 11:45 PM

ProjectName: JavaBasic1*/

public class Shape {
    private String color;

    public Shape(String color){
        this.color = color;
    }

    @Override
    public String toString(){
        return "Shape[color=" + color + "]";
    }

    public double getArea(){
        System.err.println("Shape unknown! Cannot compute area!");
        return 0;
    }
}