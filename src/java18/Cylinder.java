package java18;/*Welcome to my show !

@author: NgKhanh
Date: 4/13/2022
Time: 11:44 PM

ProjectName: JavaBasic1*/

public class Cylinder extends Circle {
    private double height;
    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public double getVolume(){
        return super.getArea() * height;
    }

    @Override
    public double getArea(){
        return 2.0 * Math.PI * getRadius() * height;
    }

    @Override
    public String toString(){
        return "Cylinder[heigt=" + height + "," + super.toString() + "]";
    }

    public static void main(String[] args) {
        Circle c1 = new Cylinder(2,4);
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
        System.out.println(c1.toString());
    }
}
