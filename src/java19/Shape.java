package java19;/*Welcome to my show !

@author: NgKhanh
Date: 4/14/2022
Time: 10:29 AM

ProjectName: JavaBasic1*/

abstract public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape[color=" + color + "]";
    }

    abstract public double getArea();
}
