package java16.ex3;/*Welcome to my show !

@author: NgKhanh
Date: 4/12/2022
Time: 10:32 AM

ProjectName: JavaBasic1*/

public class Person {
    private String name;
    private String address;
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
