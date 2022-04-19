package exam.ex2;/*Welcome to my show !

@author: NgKhanh
Date: 4/19/2022
Time: 8:35 AM

ProjectName: JavaBasic1*/

public class Flight {
    private int number;
    private String destination;

    public Flight(){
        number = 0;
        destination = "Empty";
    }

    public Flight(int number, String destination){
        this.number = number;
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public int getNumber(){
        return number;
    }

    public void display(){
        System.out.println(this.number + ", " +this.destination);
    }
}
