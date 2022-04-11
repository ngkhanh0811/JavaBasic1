package java16.ex2;/*Welcome to my show !

@author: NgKhanh
Date: 4/10/2022
Time: 9:24 PM

ProjectName: JavaBasic1*/

public class TestPoint2DPoint3D {
    public static void main(String[] args) {
        Point2D p2a = new Point2D(3,4);
        System.out.println(p2a);
        Point2D p2b = new Point2D();
        System.out.println(p2b);
        Point3D p3a = new Point3D(1,2,3);
        System.out.println(p3a);
        Point3D p3b = new Point3D();
        System.out.println(p3b);
        p2a.setX(1);
        p2a.setY(2);
        System.out.println(p2a);
        p2b.setX(4);
        p2b.setY(5);
        System.out.println(p2b);
        p3a.setX(1);
        p3a.setY(2);
        p3a.setZ(3);
        System.out.println(p3a);
    }
}
