package java18;/*Welcome to my show !

@author: NgKhanh
Date: 4/13/2022
Time: 11:46 PM

ProjectName: JavaBasic1*/

public class TestMonster {
    public static void main(String[] args) {
        Monster f1 = new FireMonster("a1f1");
        System.out.println(f1.attack());

        Monster w1 = new WaterMonster("a1w1");
        System.out.println(w1.attack());

        Monster s1 = new StoneMonster("a1s1");
        System.out.println(s1.attack());

        Monster m1 = new Monster("a1m1");
        System.out.println(m1.attack());
    }
}
