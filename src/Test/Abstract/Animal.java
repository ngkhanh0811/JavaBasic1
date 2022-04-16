package Test.Abstract;/*Welcome to my show !

@author: NgKhanh
Date: 4/16/2022
Time: 2:26 PM

ProjectName: JavaBasic1*/

abstract public class Animal {
    private String name;
    public Animal(String name){
        this.name = name;
    }

    abstract public void greets();
    public String getName(){
        return name;
    };
}
