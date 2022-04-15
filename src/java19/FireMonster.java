package java19;/*Welcome to my show !

@author: NgKhanh
Date: 4/15/2022
Time: 10:49 PM

ProjectName: JavaBasic1*/

public class FireMonster extends Monster {
    private String name;
    public FireMonster(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "FireMonster{" +
                "name='" + name + '\'' +
                '}';
    }

    public String attack(){
        return "Attack with Fire!";
    }

    @Override
    public String getName(){
        return name;
    }
}
