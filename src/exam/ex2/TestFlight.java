package exam.ex2;/*Welcome to my show !

@author: NgKhanh
Date: 4/19/2022
Time: 8:49 AM

ProjectName: JavaBasic1*/

public class TestFlight {
    public static void main(String[] args) {
        Flight f1 = new Flight();
        f1.display();
        System.out.println("Destination of Flight is: " + f1.getDestination());
        System.out.println("Number of Flight is: " + f1.getNumber());

        Flight f2 = new Flight(1,"American");
        f2.display();
        System.out.println("Destination of Flight is: " + f2.getDestination());
        System.out.println("Number of Flight is: " + f2.getNumber());
    }
}
