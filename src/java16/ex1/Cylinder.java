package java16.ex1;/*Welcome to my show !

@author: NgKhanh
Date: 4/10/2022
Time: 8:57 PM

ProjectName: JavaBasic1*/

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
        super();
        this.height = 1.0;
        System.out.println("Constructed a Cylinder with Cylinder()");
    }
    public Cylinder(double height){
        super();
        this.height=height;
        System.out.println("Constructed a Cylinder with Cylinder(height)");
    }
    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(radius, height)");
    }

    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(radius, height, color");
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    @Override
    public String toString() {
        return "This is a Cylinder";
    }
}
