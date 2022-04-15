package java19;/*Welcome to my show !

@author: NgKhanh
Date: 4/14/2022
Time: 11:57 AM

ProjectName: JavaBasic1*/

public class TestShape{
    public static void main(String[] args) {
        Shape s1 = new Rectangle("Blue",4,5);
        System.out.println(s1);
        System.out.println("Area is "+s1.getArea());

        Shape s2 = new Triangle("Red",6,7);
        System.out.println(s2);
        System.out.println("Area is: "+s2.getArea());
    }
}
