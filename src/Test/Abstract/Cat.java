package Test.Abstract;/*Welcome to my show !

@author: NgKhanh
Date: 4/16/2022
Time: 2:27 PM

ProjectName: JavaBasic1*/

public class Cat extends Animal {
    public Cat(String name){
        super(name);
    }

    public void greets(){
        System.out.println("Meow");
    }

    @Override
    public String getName(){
        return super.getName();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + super.getName() + '\'' +
                '}';
    }
}
