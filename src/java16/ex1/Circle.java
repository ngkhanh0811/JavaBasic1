package java16.ex1;/*Welcome to my show !

@author: NgKhanh
Date: 4/10/2022
Time: 8:56 PM

ProjectName: JavaBasic1*/

public class Circle {
    private double radius;
    private String color;
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius){
        this.radius = radius;
        color = "Red";
    }

    public Circle(){
        radius = 1.0;
        color = "Red";
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
}
