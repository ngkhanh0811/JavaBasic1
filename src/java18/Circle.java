package java18;/*Welcome to my show !

@author: NgKhanh
Date: 4/13/2022
Time: 11:44 PM

ProjectName: JavaBasic1*/

public class Circle {
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public String toString(){
        return "Circle[radius=" + radius + "]";
    }
}
