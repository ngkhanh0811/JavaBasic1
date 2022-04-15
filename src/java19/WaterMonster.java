package java19;/*Welcome to my show !

@author: NgKhanh
Date: 4/15/2022
Time: 10:43 PM

ProjectName: JavaBasic1*/

public class WaterMonster extends Monster {
    private String name;
    public WaterMonster(String name){
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "WaterMonster{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String attack() {
        return "Attack with Water!";
    }
}
