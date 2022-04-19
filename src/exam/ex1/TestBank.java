package exam.ex1;/*Welcome to my show !

@author: NgKhanh
Date: 4/19/2022
Time: 8:33 AM

ProjectName: JavaBasic1*/

public class TestBank {
    public static void main(String[] args) {
        Bank b1 = new Bank(1000,12);
        System.out.println("Monthly interest is: " + b1.calculateInterest());
    }
}
