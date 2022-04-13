package java18;/*Welcome to my show !

@author: NgKhanh
Date: 4/13/2022
Time: 11:45 PM

ProjectName: JavaBasic1*/

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Shape("red");
        System.out.println(s1);
        System.out.println("Area is: "+s1.getArea());

        Shape s2 = new Shape("blue");
        System.out.println(s2);
        System.out.println("Area is: "+s2.getArea());

        Shape s3 = new Shape("green");
        System.out.println(s3);
        System.out.println("Area is "+s3.getArea());
    }
}
