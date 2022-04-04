package Java11;

import java.security.PublicKey;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double r) {
        radius = r;
        color = "red";
    }

    public Circle(double r, String c) {
        radius = r;
        color = c;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getCircumference(){
        return 2*radius*Math.PI;
    }

    void setRadius() {
        System.out.println("Radius is: " + getRadius());
    }

    void setColor() {
        System.out.println("Color is: " + getColor());
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(5.5, "yellow");
        c1.setColor();
        c1.setRadius();
        System.out.println("The area is: "+c1.getArea());
        System.out.println("ToString is: "+c1.toString());
        System.out.println("The Circumference is: "+c1.getCircumference());

        Circle c2 = new Circle();
        c2.setColor();
        c2.setRadius();
        System.out.println("The area is: "+c2.getArea());
        System.out.println("ToString is: "+c2.toString());
        System.out.println("The Circumference is: "+c2.getCircumference());

        Circle c3 = new Circle(4.0);
        c3.setColor();
        c3.setRadius();
        System.out.println("The area is: "+c3.getArea());
        System.out.println("ToString is: "+c3.toString());
        System.out.println("The Circumference is: "+c3.getCircumference());
    }
}
