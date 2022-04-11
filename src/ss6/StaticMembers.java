package ss6;
/*Welcome to my show !

@author: NgKhanh
Date: 4/10/2022
Time: 7:20 PM

ProjectName: JavaBasic1*/

public class StaticMembers {
    public static int staticCounter = 0;
    int instanceCounter = 0;
    static {
        System.out.println("I am a static block");
    }
    public static void staticMethod(){
        System.out.println("I am a static method");
    }
    public void displayCount(){
        staticCounter++;
        instanceCounter++;
        System.out.println("Static counter is:"+staticCounter);
        System.out.println("Instance counter is:"+instanceCounter);
    }

    public static void main(String[] args) {
        System.out.println("I am the main method");
        StaticMembers.staticMethod();
        StaticMembers objStatic1 = new StaticMembers();
        objStatic1.displayCount();
        StaticMembers objStatic2 = new StaticMembers();
        objStatic1.displayCount();
    }
}
