package Interface;/*Welcome to my show !

@author: NgKhanh
Date: 4/15/2022
Time: 11:03 PM

ProjectName: JavaBasic1*/

public class TestMovable {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(1,2);
        System.out.println(m1);
        m1.moveUp();
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);
    }
}
