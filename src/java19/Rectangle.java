package java19;/*Welcome to my show !

@author: NgKhanh
Date: 4/14/2022
Time: 11:58 AM

ProjectName: JavaBasic1*/

public class Rectangle extends Shape {
    private int length, width;

    public Rectangle(String color, int length, int width){
        super(color);
        this.length = length;
        this.width = width;
    }
    @Override
    public String toString(){
        return "Rectangle[length=" + length + ",width=" + width + "," + super.toString() + "]";
    }

    @Override
    public double getArea(){
        return length*width;
    }
}
