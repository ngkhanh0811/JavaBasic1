package Test.Interface;/*Welcome to my show !

@author: NgKhanh
Date: 4/16/2022
Time: 3:07 PM

ProjectName: JavaBasic1*/

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint m1 = new MovablePoint(1,1,1,1);
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);
        m1.moveUp();
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);
    }
}
