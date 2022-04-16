package Test.Abstract;/*Welcome to my show !

@author: NgKhanh
Date: 4/16/2022
Time: 2:30 PM

ProjectName: JavaBasic1*/

public class TestAnimal {
    public static void main(String[] args) {
        Animal a1 = new Cat("Kien1");
        System.out.println(a1);
        a1.greets();

        Animal a2 = new Dog("Kien2");
        System.out.println(a2);
        a2.greets();

        Animal a3 = new BigDog("Kien3");
        System.out.println(a3);
        a3.greets();
    }
}
