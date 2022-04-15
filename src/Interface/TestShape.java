package Interface;/*Welcome to my show !

@author: NgKhanh
Date: 4/15/2022
Time: 10:58 PM

ProjectName: JavaBasic1*/

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(4,5);
        System.out.println(s1);
        System.out.println(s1.getArea());

        Shape s2 = new Triangle(10,11);
        System.out.println(s2);
        System.out.println(s2.getArea());
    }
}
