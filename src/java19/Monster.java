package java19;/*Welcome to my show !

@author: NgKhanh
Date: 4/15/2022
Time: 10:32 PM

ProjectName: JavaBasic1*/

abstract public class Monster {
    private String name;

    public Monster(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                '}';
    }

    abstract public String attack();
    abstract public String getName();
}
