package java16.ex1;/*Welcome to my show !

@author: NgKhanh
Date: 4/10/2022
Time: 8:57 PM

ProjectName: JavaBasic1*/

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder();
        System.out.println("Radius is: " + cy1.getRadius());
        System.out.println("Color is: " + cy1.getColor());
        System.out.println("Area is: " + cy1.getArea());
        System.out.println("Height is: " + cy1.getHeight());

        Cylinder cy2 = new Cylinder(2.0, 3.2);
        System.out.println("Radius is: " + cy2.getRadius());
        System.out.println("Color is: " + cy2.getColor());
        System.out.println("Area is: " + cy2.getArea());
        System.out.println("Height is: " + cy2.getHeight());

        Cylinder cy3 = new Cylinder(2.0, 3.2, "Yellow");
        System.out.println("Radius is: " + cy3.getRadius());
        System.out.println("Color is: " + cy3.getColor());
        System.out.println("Area is: " + cy3.getArea());
        System.out.println("Height is: " + cy3.getHeight());

        Cylinder cy4 = new Cylinder(2.0);
        System.out.println("Radius is: " + cy4.getRadius());
        System.out.println("Color is: " + cy4.getColor());
        System.out.println("Area is: " + cy4.getArea());
        System.out.println("Height is: " + cy4.getHeight());
    }
}
