package Interface;/*Welcome to my show !

@author: NgKhanh
Date: 4/15/2022
Time: 10:57 PM

ProjectName: JavaBasic1*/

public class Triangle implements Shape {
    private double length;
    private double width;
    public Triangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public double getArea(){
        return length * width;
    }
}
