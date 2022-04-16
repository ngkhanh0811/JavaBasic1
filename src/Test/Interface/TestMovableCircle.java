package Test.Interface;/*Welcome to my show !

@author: NgKhanh
Date: 4/16/2022
Time: 3:05 PM

ProjectName: JavaBasic1*/

public class TestMovableCircle {
    public static void main(String[] args) {
        MovableCircle mc1 = new MovableCircle(4,0,0,1,1);
        System.out.println(mc1);
        mc1.moveUp();
        System.out.println(mc1);
        mc1.moveDown();
        System.out.println(mc1);
        mc1.moveRight();
        System.out.println(mc1);
        mc1.moveLeft();
        System.out.println(mc1);
    }
}
