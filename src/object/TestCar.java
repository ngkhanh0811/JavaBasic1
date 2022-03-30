package object;

public class TestCar {
    public static void main(String[] args){
        Car c1 = new Car(811, 41,822,200);
        System.out.println("The plateNumber is: "+ c1.getPlateNumber());
        System.out.println("The xLocation is: "+ c1.getxLocation());
        System.out.println("The yLocation is: "+ c1.getyLocation());
        System.out.println("The speed is: "+ c1.getSpeed());

        Car c2 = new Car(811, 52,902);
        System.out.println("The plateNumber is: "+ c2.getPlateNumber());
        System.out.println("The xLocation is: "+ c2.getxLocation());
        System.out.println("The yLocation is: "+ c2.getyLocation());
        System.out.println("The speed is: "+ c2.getSpeed());

        Car c3 = new Car(1251, 124);
        System.out.println("The plateNumber is: "+ c3.getPlateNumber());
        System.out.println("The xLocation is: "+ c3.getxLocation());
        System.out.println("The yLocation is: "+ c3.getyLocation());
        System.out.println("The speed is: "+ c3.getSpeed());

        Car c4 = new Car(475);
        System.out.println("The plateNumber is: "+ c4.getPlateNumber());
        System.out.println("The xLocation is: "+ c4.getxLocation());
        System.out.println("The yLocation is: "+ c4.getyLocation());
        System.out.println("The speed is: "+ c4.getSpeed());
    }
}
