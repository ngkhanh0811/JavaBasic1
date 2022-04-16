package Test.Abstract;/*Welcome to my show !

@author: NgKhanh
Date: 4/16/2022
Time: 2:28 PM

ProjectName: JavaBasic1*/

public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    public void greets(){
        System.out.println("Woof");
    }

    @Override
    public String getName(){
        return super.getName();
    }

    public void greets(Dog another){
        System.out.println("Wooooof!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + super.getName() + '\'' +
                '}';
    }
}
