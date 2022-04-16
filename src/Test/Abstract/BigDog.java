package Test.Abstract;/*Welcome to my show !

@author: NgKhanh
Date: 4/16/2022
Time: 2:29 PM

ProjectName: JavaBasic1*/

public class BigDog extends Dog {
    public BigDog(String name){
        super(name);
    }

    public void greets(){
        System.out.println("Wooow");
    }

    public void greets(Dog another){
        System.out.println("Woooooow!");
    }

    public void greets(BigDog another){
        System.out.println("Wooooooooooooooooooooow!");
    }
}
