package java19;/*Welcome to my show !

@author: NgKhanh
Date: 4/15/2022
Time: 10:32 PM

ProjectName: JavaBasic1*/

public class TestMonster {
    public static void main(String[] args) {
        Monster m1 = new WaterMonster("w1");
        System.out.println(m1);
        System.out.println(m1.attack());

        Monster m2 = new FireMonster("f1");
        System.out.println(m2);
        System.out.println(m2.attack());

        Monster m3 = new StoneMonster("s1");
        System.out.println(m3);
        System.out.println(m3.attack());
    }
}
