package java19;/*Welcome to my show !

@author: NgKhanh
Date: 4/15/2022
Time: 10:47 PM

ProjectName: JavaBasic1*/

public class StoneMonster extends Monster {
    private String name;
    public StoneMonster(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "StoneMonster{" +
                "name='" + name + '\'' +
                '}';
    }

    public String attack(){
        return "Attack with Stone!";
    }

    @Override
    public String getName(){
        return name;
    }
}
